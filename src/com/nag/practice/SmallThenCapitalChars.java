package com.rtech.java;

public class SmallThenCapitalChars {

	public static void main(String[] args) {
		String input = "heLLoRTech";
		
		System.out.println(traverseString(input));

	}

	private static String traverseString(String input) {
		String small ="";
		String caps ="";
		
		for(int i=0;i<input.length(); i++) {
			String str = String.valueOf(input.charAt(i));
			if(str.hashCode() > 96) {
				small += str;
			} else {
				caps += str;
			}
		}
		
		input = small.concat(caps);
		
		return input;
	}

}
