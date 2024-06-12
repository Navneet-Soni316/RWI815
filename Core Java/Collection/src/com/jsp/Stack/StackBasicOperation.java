package com.jsp.Stack;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Stack;

public class StackBasicOperation {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s);
	Enumeration<Integer>	ee =Collections.enumeration(s);
	System.out.println("Using enumeration");
	while(ee.hasMoreElements()) {
		System.out.println(ee.nextElement());
	}
		
		
	}
}
