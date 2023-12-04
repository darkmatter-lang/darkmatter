package me.anthonyw.darkmatter.compiler;

public enum Architecture {
	
	// CISC
	
	/**
	 * Modern 64-bit desktop processors.
	 * 
	 * Also known as "x86_64".
	 */
	AMD64("amd64"),
	
	/**
	 * Older generation 32-bit desktop processors.
	 */
	I386("i386"),
	
	// RISC
	
	/**
	 * Modern 64-bit embedded systems.
	 */
	ARM64("aarch64"),
	
	/**
	 * Older generation embedded systems.
	 * 
	 * Also known as "armv7h".
	 */
	ARM32("armhf");
	
	private final String identifier;
	
	private Architecture(final String identifier) {
		this.identifier = identifier;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
}
