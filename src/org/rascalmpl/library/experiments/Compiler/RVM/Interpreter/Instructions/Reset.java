package org.rascalmpl.library.experiments.Compiler.RVM.Interpreter.Instructions;

import org.rascalmpl.library.experiments.Compiler.RVM.Interpreter.CodeBlock;
import org.rascalmpl.library.experiments.Compiler.RVM.Interpreter.Generator;

public class Reset extends Instruction {
	
	public Reset(CodeBlock ins) {
		super(ins, Opcode.RESET);
	}
	public void generate(Generator codeEmittor, boolean dcode){
		codeEmittor.emitCall("insnRESET");
		codeblock.addCode0(opcode.getOpcode());
	}
}