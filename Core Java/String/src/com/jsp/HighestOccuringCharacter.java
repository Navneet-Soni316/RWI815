/**
 * How to return the highest occurred character in a String
 */

package com.jsp;

public class HighestOccuringCharacter {
	public static char  HighestOccuringChar(String s ) {
		int arr[] = new int[26];
		int highestOccuring = 0;
		char ch =' ';
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i) >='A' && s.charAt(i)<='Z') {
				arr[s.charAt(i)-65]++;
			}
			else {
				arr[s.charAt(i) -97]++;
			}
			
		} 
		for(int i = 0; i<arr.length ;i++) {
				if(arr[i]!=0) {
					if(arr[i]> highestOccuring) {
						highestOccuring =arr[i];
						ch = (char) (i+65);
					}
				}
	
	}
		return ch;
		
}
public static void main(String[] args) {
	System.out.println("The highest occuring character in string is --> "+HighestOccuringCharacter.HighestOccuringChar("heelae"));
}
}
