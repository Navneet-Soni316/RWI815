/*
 * Write a Java program that declares an array of integers with a fixed size.'
 *  Implement exception handling to catch the ArrayIndexOutOfBoundsException that
 *  may occur if the program tries to access an element at an index beyond the array's bounds. 
 *  Provide a suitable error message for this scenario.
 */

package org.jsp.Assignment;

public class AIOBdemo {
	public static void main(String[] args) {
		int arr[] = new int[3]; 
		try {
			System.out.println(arr[3]);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Error has occured");
			e.printStackTrace();
		}
		
	}

}
