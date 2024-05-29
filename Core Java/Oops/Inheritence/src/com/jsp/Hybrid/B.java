package com.jsp.Hybrid;

public interface B {
	int second = 89;
	public boolean isEven(int num);
	public static String introB() {
		return "Hello from Interface B";
	}
	public default void play() {
		System.out.println("Play cricket");
		
	}
}
