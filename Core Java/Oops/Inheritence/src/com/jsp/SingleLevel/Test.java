package com.jsp.SingleLevel;

public class Test {
public static void main(String[] args) {
	Child c = new Child();  // child object
	System.out.println("Child class property --> " + c.d);
	System.out.println("Parent class property --> "+ c.a);
	System.out.println("Parent class Method --> " + c.sum(3, 8));
	System.out.print("Overriden  Method --> ");
	c.play();
	System.out.println();
	System.out.print("Child class Method --> ");
	c.ride();
	
}
}
