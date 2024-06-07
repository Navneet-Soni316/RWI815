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
