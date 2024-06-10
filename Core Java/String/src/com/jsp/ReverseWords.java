/*
 * How to reverse words in a sentence without using a library method?
 * 
 */
package com.jsp;

public class ReverseWords {
	public static String reverseWord(String s) {
		String temp ="";
		int end = s.length()-1;
		for(int i=0;i<s.length();i++ ) {
			temp+=s.charAt(end);
			end--;
		}
	return temp;
		
	}
	public static void main(String[] args) {
		String name ="you";
		System.out.println("The reverse word of "+ name+ "is --> "+ ReverseWords.reverseWord("You"));
	}
}
