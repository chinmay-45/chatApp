package com.home.chatapp.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public interface passEncrypt {
	public static String encrypt(String a) throws NoSuchAlgorithmException {
		String b=null;
		MessageDigest messagedigest=MessageDigest.getInstance("MD5");
		messagedigest.update(a.getBytes());
		byte[] encrypt=messagedigest.digest();		
		StringBuffer fin=new StringBuffer();
		for(byte d :encrypt) {
			fin.append(d);
		}
		return fin.toString();
	}
	
	

}
