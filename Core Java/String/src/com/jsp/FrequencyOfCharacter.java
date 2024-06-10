/*
 * How to count the occurrence of a given character in String
 */

package com.jsp;

public class FrequencyOfCharacter {
	public static void  countFrequency(String s ) {
		int arr[] = new int[26];
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i) >='A' && s.charAt(i)<='Z') {
				arr[s.charAt(i)-65]++;
			}
			else {
				arr[s.charAt(i) -97]++;
			}
			
		} 
		for(int i = 0; i<arr.length ;i++) {
				if(arr[i]!=0)
					System.out.println((char) (i+65) + " --> "+arr[i]);	
	}
		
}
	public static void main(String[] args) {
		FrequencyOfCharacter.countFrequency("NavneetSoni");
	}
}
