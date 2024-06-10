/*
 * 
 * How to check if a String contains only digits? 
 */

package com.jsp;

public class ContainsOnlyDigit {
	public static boolean isContainsOnlyDigit(String s) {
		char []ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(!(ch[i]>='0' && ch[i]<='9' ))
				return false;
		}
		return true;
	}
	
public static void main(String[] args) {
	String name ="789902";
	System.out.println("The given string --> "+ ContainsOnlyDigit.isContainsOnlyDigit(name));
	
}
}
