package org.rascalmpl.library.experiments.Compiler.RVM.Interpreter.Instructions;

import org.rascalmpl.library.experiments.Compiler.RVM.Interpreter.CodeBlock;
import org.rascalmpl.library.experiments.Compiler.RVM.ToJVM.BytecodeGenerator;

public class Println extends Instruction {
	
	int arity;
	
	public Println(CodeBlock cb, int arity){
		super(cb, Opcode.PRINTLN);
		this.arity = arity;
	}
	
	public String toString() { return "PRINTLN " + arity; }
	
	public void generate(){
		codeblock.addCode1(opcode.getOpcode(), arity);
	}

	public void generateByteCode(BytecodeGenerator codeEmittor, boolean debug){
		if (debug)
			codeEmittor.emitDebugCall(opcode.name());
		codeEmittor.emitDebugCall(opcode.name());
	}
}
