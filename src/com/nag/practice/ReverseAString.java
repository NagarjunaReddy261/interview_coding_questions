package com.rtech.java;

public class ReverseAString {

	public static void main(String[] args) {
		// Input String 
		String input = "RTechJavaDev";
		String output ="";
		
		//Please do remeber when we call length() on input string it calculates the legth starting from 1
		//When we use charAt method it internally uses index. It start's from 0
		//That's reason we used input.length()-1. So, it gives actual index
		for(int i=input.length()-1; i>=0;i--) {
			output = output + input.charAt(i);
		}
		
		System.out.println("Input -> "+ input);
		System.out.println("Output -> "+ output);

	}

}
