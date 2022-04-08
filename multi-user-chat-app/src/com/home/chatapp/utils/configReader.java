package com.home.chatapp.utils;

import java.util.ResourceBundle;

public class configReader {
	configReader() {}
	static ResourceBundle rb=ResourceBundle.getBundle("config");
	public static String getValue(String key) {
		return rb.getString(key);
	}

}
