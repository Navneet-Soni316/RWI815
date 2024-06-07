package com.jsp.ThrowIsARelationship;

import java.io.IOException;

public class Child extends Parent {
	public static void play() throws ArithmeticException {
		System.out.println("Hello from child class");
	}	
	public static void main(String[] args) {
		Child.play();
	}
}
