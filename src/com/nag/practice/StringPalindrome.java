package com.rtech.interview.prep;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Please input a String:");
        String inputStr = sc.next();
        String reversedStr="";
        
        for(int i = inputStr.length()-1; i>=0; i--) { // 4 3 2 1 0
        	reversedStr = reversedStr + inputStr.charAt(i);  // G GR GRA GRAR GRARG
        }
        
        System.out.println(reversedStr);
        
        if(inputStr.equals(reversedStr)) {
        	System.out.println("The given String '"+inputStr+"' is a palindrome.");
        } else {
        	System.out.println("The given String '"+inputStr+"' is not a palindrome.");
        }
        
        sc.close();
	}

}
