package me.anthonyw.darkmatter.compiler;

public enum CompilerSeverity {
	
	/**
	 * Debugging messages.
	 */
	DEBUG,
	
	/**
	 * Informational messages.
	 */
	INFO,
	
	/**
	 * Warning messages, including basic optimization checks.
	 */
	WARN,
	
	/**
	 * Error messages, requires review, compilation halted.
	 */
	ERROR;
	
}
