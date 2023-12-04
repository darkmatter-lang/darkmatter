package me.anthonyw.darkmatter.compiler.jvm;

import me.anthonyw.darkmatter.compiler.Compilable;

public abstract class JvmCompilable implements Compilable {

	/**
	 * This will generate JVM byte-code.
	 * @return
	 */
	public abstract String jvmCodeGen();
	
}
