package me.anthonyw.darkmatter.syntax;

public enum CompilerSeverity {
	
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
