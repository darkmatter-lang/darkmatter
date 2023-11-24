package me.anthonyw.darkmatter.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class Utils {

	private static final Gson gson;

	// Prevent instantiation
	private Utils() {}

	public static JsonObject fileToJsonObject(File file) throws IOException {
		StringBuilder sb = new StringBuilder();
		
		for (String line : Files.readAllLines(file.toPath())) {
			sb.append(line);
		}
		
		return stringToJsonObject(sb.toString());
	}
	
	public static JsonArray fileToJsonArray(File file) throws IOException {
		StringBuilder sb = new StringBuilder();
		
		for (String line : Files.readAllLines(file.toPath())) {
			sb.append(line);
		}
		
		return stringToJsonArray(sb.toString());
	}
	
	public static JsonArray stringToJsonArray(String json) throws JsonSyntaxException {
		return gson.fromJson(json, JsonArray.class);
	}
	
	public static JsonObject stringToJsonObject(String json) throws JsonSyntaxException {
		return gson.fromJson(json, JsonObject.class);
	}
	
	public static String sha1FromFile(File file) throws NoSuchAlgorithmException, IOException {
		return hashFromFile(file, "SHA-1");
	}
	
	public static String sha256FromFile(File file) throws NoSuchAlgorithmException, IOException {
		return hashFromFile(file, "SHA-256");
	}
	
	public static String sha512FromFile(File file) throws NoSuchAlgorithmException, IOException {
		return hashFromFile(file, "SHA-512");
	}
	
	private static String hashFromFile(File file, String algo) throws NoSuchAlgorithmException, IOException {
		byte[] buffer = new byte[8192];
		int count;
		MessageDigest digest = MessageDigest.getInstance(algo);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		while ((count = bis.read(buffer)) > 0) {
			digest.update(buffer, 0, count);
		}
		bis.close();

		byte[] hash = digest.digest();
		StringBuilder hexString = new StringBuilder();
        
	    for (byte b : hash) {
	        hexString.append(String.format("%02x", b));
	    }
	    return hexString.toString();
	}

	static {
		gson = new Gson();
	}

}
