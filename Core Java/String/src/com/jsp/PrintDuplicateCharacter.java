/*
 * 1.How to Print duplicate characters from String
 */
package com.jsp;

public class PrintDuplicateCharacter {
	public static void printDuplicate(String s) { //  s = r a h u l a r h
		int arr[] = new int[128];
		for(int i=0; i<s.length();i++) {
			arr[s.charAt(i)]++; 
			
		} 
		for(int i =0; i<arr.length ;i++) {
			if(arr[i]>=2) {
				System.out.println((char) i + " --> "+arr[i]);	
			}
			
		}
	}
	public static void main(String[] args) {
		PrintDuplicateCharacter.printDuplicate("rahularh");
	}
}
