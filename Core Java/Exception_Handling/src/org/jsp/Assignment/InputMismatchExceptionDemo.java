/*
 * Create a Java program that prompts the user to enter an integer. Implement exception handling to catch the InputMismatchException that may occur 
 * if the input provided by the user does not match the expected type (i.e., an integer). Provide a meaningful error message for this scenario.
 * 
 */
package org.jsp.Assignment;

import java.util.Scanner;

public class InputMismatchExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		try {
			System.out.println(a);
			
		}
		catch (Exception e) {
			System.out.println("Input is supposed to be ");
			e.printStackTrace();
		}

	}
}
