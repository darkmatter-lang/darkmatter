package me.anthonyw.darkmatter.util;

public class EnvironmentUtils {
	
	// Prevent instantiation
	private EnvironmentUtils() {}

	public static String getStringEnvFallback(String parameter, String... envName) {
		for (int i=0; i<envName.length; i++) {
			final String value = System.getenv(envName[i]);
			if (value != null) {
				return value;
			}
		}
		return parameter;
	}
	
	public static int getIntegerEnvFallback(int parameter, String... envName) throws NumberFormatException {
		for (int i=0; i<envName.length; i++) {
			final String value = System.getenv(envName[i]);
			if (value != null) {
				return Integer.parseInt(value);
			}
		}
		return parameter;
	}
	
	public static boolean getBooleanEnvFallback(boolean parameter, String... envName) {
		for (int i=0; i<envName.length; i++) {
			final String value = System.getenv(envName[i]);
			if (value != null) {
				return Boolean.parseBoolean(value);
			}
		}
		return parameter;
	}
	
}
