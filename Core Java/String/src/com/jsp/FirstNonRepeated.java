package com.jsp;

public class FirstNonRepeated {
	public static void printFirstNonRepeatedCharacter(String s) {
		for (int i = 0; i < s.length(); i++) {
		      if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
		        System.out.println("First non-repeating character is "+ s.charAt(i));
		        break;
		      }
		    }
		    return;
	}
	public static void main(String[] args) {
		String s = "bababvbabgh";
		printFirstNonRepeatedCharacter(s);
	}
}
