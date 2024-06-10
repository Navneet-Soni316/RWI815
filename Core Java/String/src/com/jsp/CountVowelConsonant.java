/*
 * How to count a number of vowels and consonants in a String
 */

package com.jsp;

public class CountVowelConsonant {
public static void main(String[] args) {
	String name="RahulKumar";  
	char ch[] = name.toCharArray();
	int vowels=0, consonants=0;
	for(int i=0; i<ch.length;i++) {
		if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U') {
			vowels++;
		}
		else {
			consonants++;	
			
		}

	}
	
	System.out.println("The number of vowels in a String is  --> "+ vowels);
	System.out.println("The number of consonants in a String is  --> "+ consonants);
	
}
}
