
package com.kwei.springboot.util;

import java.io.UnsupportedEncodingException;

public class SupportUtils {
	
	public static String toUTF8(String str) throws UnsupportedEncodingException {
		
		byte[] utf = new String(str.getBytes("ISO-8859-1")).getBytes("UTF-8");
		return new String(utf);
		
	}
}
