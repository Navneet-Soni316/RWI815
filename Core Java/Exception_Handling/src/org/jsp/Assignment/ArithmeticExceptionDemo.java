//Develop a Java program that prompts the user to enter two integers and performs division.
//Implement exception handling to catch the ArithmeticException that may occur if the user tries to divide by zero.
//Provide appropriate error messages for both successful division and division by zero cases.

package org.jsp.Assignment;

import java.util.Scanner;

public class ArithmeticExceptionDemo {
	public static void divide(int a, int b) {
		try {
			System.out.println(a/b);
			System.err.println("Divided succesfully");
		}
		catch (ArithmeticException e) {
			
			e.printStackTrace();
			System.err.println("Unable to divide");
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first integer value");
	int a= sc.nextInt();
	System.out.println("enter the first integer value");
	int b= sc.nextInt();
	ArithmeticExceptionDemo.divide(a,b);
	
	
	
}
}
