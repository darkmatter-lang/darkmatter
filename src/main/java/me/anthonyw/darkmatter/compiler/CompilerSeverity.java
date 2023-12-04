package me.anthonyw.darkmatter.compiler;

import me.anthonyw.darkmatter.cli.AnsiColor;

public enum CompilerSeverity {
	
	/**
	 * Helpful suggestions.
	 */
	NOTE(AnsiColor.CYAN_BRIGHT),
	
	/**
	 * Warning messages, including basic optimization checks.
	 */
	WARN(AnsiColor.YELLOW_BRIGHT),
	
	/**
	 * Error messages, requires review, compilation halted.
	 */
	ERROR(AnsiColor.RED_BRIGHT);
	
	private final String cliColor;
	
	private CompilerSeverity(final String redBright) {
		this.cliColor = redBright;
	}
	
	public String getAnsiColor() {
		return cliColor;
	}
	
}
