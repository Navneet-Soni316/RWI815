package com.jsp.Hybrid;

import com.jsp.Hybrid.*;
;


public class Test {
	public static void main(String[] args) {
		System.out.println("Parent Interface A");
		A a = new CommonChild(); //child upcasted to parent I/f A
		System.out.println("The number is a Prime Number "+ a.isEven(35));
		System.out.println("Parent interface property --> "+ a.first);
		System.out.println("Parent interface method --> "+ A.introA());
		System.out.println("Parent Interface B");
		B b = new CommonChild(); //child upcasted to parent I/f B
		System.out.println("The number is a Prime Number "+ b.isEven(60));
		System.out.println("Parent interface property --> "+ b.second);
		System.out.println("Parent interface method --> "+ B.introB());
		System.out.println("Parent Class C");
		C c = new CommonChild(); // child upcasted to parent class C
		System.out.println("Parent class property --> "+c.third);
		System.out.println("Parent class method --> "+c.greetings());
	}
	
	
}
