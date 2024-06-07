package com.jsp.TrycatchUsingFinally;

public class Demo1 {
	public void divide(int a, int b) {  //called method
		int res =a/b;    //faulty code   ---> oox2
		System.out.println(res);
	}
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		try {
			d.divide(3, 0);  //caller
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Hi bro");
		}
		
		finally {
			System.out.println("Hello Im finally block");
		}
	
	}
}
