/*
 * 
 * How to check if String is Palindrome?
 */

package com.jsp;

public class Palindrome {
	public static boolean isPalindrome(String s) {
		int start =0;
		int end = s.length()-1;
		while(start<=end) {
			if(s.charAt(start)!=s.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s = "appap";
		System.out.println("The string is Palendrome -- > "+Palindrome.isPalindrome(s));
	
	}
}
