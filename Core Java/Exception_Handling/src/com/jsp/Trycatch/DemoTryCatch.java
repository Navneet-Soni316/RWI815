package com.jsp.Trycatch;

public class DemoTryCatch {
	public static void main(String[] args) {
		int a = 9;
		int b = 0;
		String name = "Rahul";
		try {
		//	System.out.println(a/b);
			int arr[] = new int[8];
			arr[10]=89;
			System.out.println(name.charAt(7));
			
		}
		catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception\
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Array error ");
			
		}
	}
}
