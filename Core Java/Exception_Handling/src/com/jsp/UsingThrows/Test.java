package com.jsp.UsingThrows;

public class Test {
	public static void print(int a[] )  throws Exception {
		System.out.println(a[6]);
		System.out.println("Helo");
	}
	
public static void main(String[] args) {
	int arr[]= new int [3];
	try {
		Test.print(arr);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Guy");

}
}
