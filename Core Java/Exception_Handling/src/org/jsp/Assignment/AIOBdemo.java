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
