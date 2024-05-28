package com.jsp.SingleLevel;

public class A extends B {
	
	public void play() {
		System.out.println("football");
	}
public static void main(String[] args) {
	A child= new A(); // child class object
	System.out.println(child.a);
	child.ride();
	child.play();
//	B--> Parent
//	A--> Child
	B parent_child = new A(); // upcasting child class object to parent-child object
	parent_child.ride(); 
	System.out.println("Overridden method");
	parent_child.play();  //Always overridden method is executed irrespective of object reference reference
	
	 A downcastObj = (A) parent_child;  // downcasting of parent-child object into child object
	 downcastObj.play();
	 downcastObj.ride();	
	 
}
}
