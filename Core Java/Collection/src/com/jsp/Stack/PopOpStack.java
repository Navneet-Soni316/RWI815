package com.jsp.Stack;

import java.util.Stack;

public class PopOpStack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s);
		System.out.println("Performing pop operation");
		s.pop();
		s.pop();
		
		System.out.println("New stack "+ s);
		System.out.println(s.firstElement());
		System.out.println(s.lastElement());
	}
}
