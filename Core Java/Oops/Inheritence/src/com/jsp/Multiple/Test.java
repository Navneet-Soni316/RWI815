package com.jsp.Multiple;

public class Test {
	public static void main(String[] args) {
		System.out.println("Parent Interface A");
		A a = new Child(); //child upcasted to parent I/f A
		System.out.println("The number is a Prime Number "+ a.isEven(35));
		System.out.println("Parent interface property --> "+ a.first);
		System.out.println("Parent interface method --> "+ A.introA());
		System.out.println("Parent Interface B");
		B b = new Child(); //child upcasted to parent I/f B
		System.out.println("The number is a Prime Number "+ b.isEven(60));
		System.out.println("Parent interface property --> "+ b.second);
		System.out.println("Parent interface method --> "+ B.introB());
		
		
	}
}
