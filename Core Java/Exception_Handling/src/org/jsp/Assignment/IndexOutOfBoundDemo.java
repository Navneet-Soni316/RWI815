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
