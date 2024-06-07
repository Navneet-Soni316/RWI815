package com.jsp.UsingThrows;

public class NestedTry {
public static void main(String[] args) {
	String s = "Rahul";
	try {
		//System.out.println(s.charAt(10));//
		try {
			System.out.println(3/0);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
}
}
