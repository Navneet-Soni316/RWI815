package com.jsp.Overloading;

public class Test {
	public int twoNumber(int a , int b) {
		return a+b;
		
	}
	public int twoNumber(int a , int b, int c) {
		return a+b+c;
		
	}
public static void main(String[] args) {
	Test t = new Test();
	System.out.println(t.twoNumber(12, 3));
	System.out.println(t.twoNumber(12, 20, 2));
}
}
