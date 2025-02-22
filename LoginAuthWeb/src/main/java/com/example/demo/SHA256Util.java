package com.example.demo;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class SHA256Util {
	
	
	public static String hashPassword(String password) throws NoSuchAlgorithmException {
		
		MessageDigest md=MessageDigest.getInstance("SHA-256");
		byte[] hash=md.digest(password.getBytes(StandardCharsets.UTF_8));
		return Base64.getEncoder().encodeToString(hash);
		
	}
	
	
}
