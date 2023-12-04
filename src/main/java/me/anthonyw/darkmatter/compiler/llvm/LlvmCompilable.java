package me.anthonyw.darkmatter.compiler.llvm;

import me.anthonyw.darkmatter.compiler.Compilable;

public abstract class LlvmCompilable implements Compilable {
	
	/**
	 * This will generate LLVM-IR assembly.
	 * @return
	 */
	public abstract String llvmCodeGen();
	
}
