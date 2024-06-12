package com.jsp.Emp.LinkedList;

import java.util.LinkedList;

public class AddingRemovingFromLL {
	public static void main(String[] args) {
		LinkedList<Object> ll = new LinkedList<>();
		ll.add("Mahon");
		ll.add("Mayank");
		ll.addFirst(78);
		ll.addLast(80);
		ll.offerFirst(90);
		System.out.println("The normal list is");
		System.out.println(ll);
		System.out.println("Removing first element");
		ll.removeFirst();
		System.out.println("Removing last element");
		ll.pollLast();
		System.out.println("New list --> "+ ll);
		

	}
}
