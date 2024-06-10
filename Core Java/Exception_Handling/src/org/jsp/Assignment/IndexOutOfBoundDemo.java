/*
 *  Write a Java program that creates an array of integers and tries to access an element at an index that is out of bounds.
 *   
 */


package org.jsp.Assignment;

import java.util.Iterator;
import java.util.Scanner;

public class IndexOutOfBoundDemo {

	public static void main(String[] args) {
		int arr[] = new int[3]; 
		int ar[]= null;
		try {
			System.out.println(ar[3]);
		}
		catch (Exception e) {
			System.out.println("Error has occured");
			e.printStackTrace();
		}
		
	}
}
