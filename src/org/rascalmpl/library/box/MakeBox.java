package org.rascalmpl.library.box;

import static org.rascalmpl.interpreter.result.ResultFactory.makeResult;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.imp.pdb.facts.IConstructor;
import org.eclipse.imp.pdb.facts.ISourceLocation;
import org.eclipse.imp.pdb.facts.IString;
import org.eclipse.imp.pdb.facts.IValue;
import org.eclipse.imp.pdb.facts.io.PBFReader;
import org.eclipse.imp.pdb.facts.io.PBFWriter;
import org.eclipse.imp.pdb.facts.type.Type;
import org.eclipse.imp.pdb.facts.type.TypeStore;
import org.rascalmpl.ast.ASTFactory;
import org.rascalmpl.ast.Module;
import org.rascalmpl.interpreter.BoxEvaluator;
import org.rascalmpl.interpreter.Evaluator;
import org.rascalmpl.interpreter.env.GlobalEnvironment;
import org.rascalmpl.interpreter.env.ModuleEnvironment;
import org.rascalmpl.interpreter.result.Result;
import org.rascalmpl.library.IO;
import org.rascalmpl.parser.ASTBuilder;
import org.rascalmpl.values.ValueFactoryFactory;

public class MakeBox {

	private final String varName = "boxData";
	private final String locationIntro = "locationIntro";
	private final String locationEnd = "locationEnd";
	private final String moduleName = "moduleName";

	class Data extends ByteArrayOutputStream {
		ByteArrayInputStream get() {
			return new ByteArrayInputStream(this.buf);
		}
	}

	BoxEvaluator eval = new BoxEvaluator();

	private Evaluator commandEvaluator;
	private GlobalEnvironment heap;
	private ModuleEnvironment root;
	private Data data;
	private TypeStore ts = BoxEvaluator.getTypeStore();
	private Type adt = BoxEvaluator.getType();

	void store(IValue v, String varName) {
		Result<IValue> r = makeResult(v.getType(), v, commandEvaluator);
		root.storeVariable(varName, r);
		r.setPublic(true);
	}

	IValue fetch(String varName) {
		Result<IValue> r = root.getVariable(varName);
		return r.getValue();
	}

	private void start() {
		heap = new GlobalEnvironment();
		root = heap.addModule(new ModuleEnvironment("***makeBox***"));
		PrintWriter stderr = new PrintWriter(System.err);
		PrintWriter stdout = new PrintWriter(System.out);
		commandEvaluator = new Evaluator(ValueFactoryFactory.getValueFactory(),
				stderr, stdout, root, heap);
		// commandEvaluator
		// .addSdfSearchPathContributor(new ISdfSearchPathContributor() {
		// public List<String> contributePaths() {
		// List<String> result = new LinkedList<String>();
		// File srcDir = new File(
		// "/ufs/bertl/glt/build/rascal-fragment",
		// "installed/share/sdf-library/library");
		// result.add(srcDir.getAbsolutePath());
		// return result;
		// }
		// });
		commandEvaluator.addClassLoader(getClass().getClassLoader());
		Object ioInstance = commandEvaluator.getJavaBridge()
				.getJavaClassInstance(IO.class);
		// Set output collector.
		((IO) ioInstance).setOutputStream(new PrintStream(System.out));
	}

	private void execute(String s) {
		System.err.println("execute:" + s);
		commandEvaluator.eval(s, URI.create("box:///"));
	}

	private IValue launchRascalProgram(String resultName) {
		execute("import box::Box2Text;");
		try {
			IValue v = new PBFReader().read(ValueFactoryFactory
					.getValueFactory(), ts, adt, data.get());
			store(v, varName);
			if (resultName == null) {
				execute("main(" + varName + ");");
				return null;
			}
			execute(resultName + "=toList(" + varName + ");");
			IValue r = fetch(resultName);
			data.close();
			return r;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	private IValue launchConcreteProgram(URI uri, String s) {
		final String resultName = "c";
		if (s.equals("rsc"))
			s = "rascal"; // Exception at rascal
		execute("import box::" + s + "::Default;");
		// IString v = ValueFactoryFactory.getValueFactory().string(fileName);
		ISourceLocation v = ValueFactoryFactory.getValueFactory()
				.sourceLocation(uri);
		store(v, varName);
		String project_loc = System.getProperty("project_loc");
		String loc = project_loc
				+ "/src/"
				+ this.getClass().getCanonicalName().replace('.',
						File.separatorChar);
		File f = new File(loc);
		ISourceLocation a = ValueFactoryFactory.getValueFactory()
				.sourceLocation(
						new File(f.getParentFile(), "Start.tex").toURI());
		ISourceLocation b = ValueFactoryFactory.getValueFactory()
				.sourceLocation(new File(f.getParentFile(), "End.tex").toURI());
		store(a, locationIntro);
		store(b, locationEnd);
		System.err.println(a);
		// execute(resultName + "=toList(" + varName + ");");
		execute(resultName + "=toLatex(" + varName + "," + locationIntro + ","
				+ locationEnd + ");");
		IValue r = fetch(resultName);
		return r;
	}

	private IValue launchTemplateProgram(URI uri, String s) {
		final String resultName = "c";
		execute("import box::" + s + ";");
		// IString v = ValueFactoryFactory.getValueFactory().string(fileName);
		ISourceLocation v = ValueFactoryFactory.getValueFactory()
				.sourceLocation(uri);
		store(v, varName);
		String name = new File(uri.getPath()).getName();
		name = name.substring(0, name.lastIndexOf('.'));
		IString w = ValueFactoryFactory.getValueFactory().string(name);
		store(w, moduleName);
		execute(resultName + "=toStr(" + varName + "," + moduleName + ");");
		IValue r = fetch(resultName);
		return r;
	}

	private IValue computeBox(URI uri) {
		ModuleEnvironment currentModule = (ModuleEnvironment) commandEvaluator
				.getCurrentEnvt().getRoot();
		try {
			IConstructor moduleTree = commandEvaluator.parseModule(uri,
					currentModule);
			ASTBuilder astBuilder = new ASTBuilder(new ASTFactory());
			Module moduleAst = astBuilder.buildModule(moduleTree);
			if (moduleAst != null)
				return eval.evalRascalModule(moduleAst);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public IValue toRichTxt(URI uri) {
		start();
		try {
			IValue box = computeBox(uri);
			data = new Data();
			new PBFWriter().write(box, data, ts);
			return launchRascalProgram("c");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public IValue toTxt(URI uri) {
		start();
		int tail = uri.getPath().lastIndexOf('.');
		String s = uri.getPath().substring(tail + 1);
		// s = s.substring(0, 1).toUpperCase() + s.substring(1);
		return launchConcreteProgram(uri, s);
	}

	public IValue toSrc(URI uri) {
		start();
		int tail = uri.getPath().lastIndexOf('.');
		String s = uri.getPath().substring(tail + 1);
		s = s.substring(0, 1).toUpperCase() + s.substring(1);
		return launchTemplateProgram(uri, s);
	}

}
