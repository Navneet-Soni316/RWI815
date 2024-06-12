package com.jsp.ArrayList;

import java.util.List;
import java.util.Stack;

public class StackDem {
	public static void main(String[] args) {
		Stack<Object> l = new Stack<>();
		l.push("Orange");
		l.push("bhai");
		l.push(123);
		l.push("bhaisab");
		System.out.println(l.peek());
		System.out.println(l.pop());
		System.out.println(l);
		System.out.println(l.search("bhai"));
		System.out.println(l.empty());
		
		
	}
}
