/*  Write a Java program that prompts the user to enter a number in string format and converts it to an integer. Implement exception
  handling to catch the NumberFormatException that may occur if the input cannot be parsed to an integer. 
  Provide a suitable error message for this scenario./*
 * 
 */

package org.jsp.Assignment;

import java.util.Scanner;

public class NumberFormatExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number in words");
		String word = sc.next();
		try {
			System.out.println(Integer.parseInt(word));
		}
		catch (Exception e) {
			System.out.println("number format exception has occured --> ");
			e.printStackTrace();
		}
		
		
	}
}
