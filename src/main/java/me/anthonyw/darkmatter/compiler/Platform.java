package me.anthonyw.darkmatter.compiler;

public enum Platform {
	
	/**
	 * Universal OS
	 * 
	 * https://github.com/universalos-io
	 */
	UNIVERSAL_OS("universalos"),
	
	/**
	 * GNU/Linux
	 * 
	 * https://www.gnu.org/gnu/linux-and-gnu.en.html
	 * https://kernel.org/
	 * https://en.wikipedia.org/wiki/Linux
	 */
	LINUX("linux"),
	
	/**
	 * Apple MacOS (XNU/Darwin)
	 * 
	 * https://www.apple.com/macos/
	 * https://en.wikipedia.org/wiki/MacOS
	 */
	MAC_OS("darwin"),
	
	/**
	 * Microsoft Windows
	 * 
	 * https://www.microsoft.com/en-us/windows/
	 * https://en.wikipedia.org/wiki/Microsoft_Windows
	 */
	WINDOWS("windows"),
	
	/**
	 * FreeBSD
	 * 
	 * https://www.freebsd.org/
	 * https://en.wikipedia.org/wiki/FreeBSD
	 */
	FREEBSD("freebsd");
	
	private final String identifier;
	
	private Platform(final String identifier) {
		this.identifier = identifier;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
}
