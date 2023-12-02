package me.anthonyw.darkmatter.compiler;

import me.anthonyw.darkmatter.compiler.llvm.LlvmOpCode;

public class LlvmAssembly {
	
	private final LlvmOpCode opcode;
	private final Object[] args;
	
	public LlvmAssembly(final LlvmOpCode opcode, Object...args) {
		this.opcode = opcode;
		this.args = args;
	}
	
	public LlvmOpCode getOpCode() {
		return opcode;
	}
	
	public Object[] getArgs() {
		return args;
	}
	
}
