package com.jsp.Stack;

import java.util.Stack;

public class PalindromeChecking {
	public static boolean isPalindrome(String s) {
		char ch[] = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<ch.length;i++) {
			stack.push(ch[i]);
		}
		
		System.out.println("Traversing the stack ");
	    for(int i=0; i<ch.length;i++) {
	    	if(ch[i] != stack.pop()) {
	    		return false;
	    	}	
	    }
	   return true;
	}
	public static void main(String[] args) {
		String s ="ablba";
		if(PalindromeChecking.isPalindrome(s)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
		
		
	}
}
