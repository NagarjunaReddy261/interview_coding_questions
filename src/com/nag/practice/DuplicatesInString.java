package com.rtech.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatesInString {

	public static void main(String[] args) {
		// Input String
		String input = "RTechJavaDev"; // aev -> duplicates
		
		char[] chars = input.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<chars.length; i++) {
			if(map.containsKey(chars[i])) {
				map.put(chars[i], map.get(chars[i])+1);
			}else {
				map.put(chars[i], 1);
			}
		}
		
		System.out.println("Duplicates in A String");
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() >1)
				System.out.println(entry.getKey() + " : " +entry.getValue());
		}
		
	}

}
