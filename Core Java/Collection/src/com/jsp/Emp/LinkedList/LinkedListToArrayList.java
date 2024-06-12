package com.jsp.Emp.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Apple");
		ll.add("banana");
		ll.add("cherry");
		System.out.println(ll);
		ArrayList<String> al = new ArrayList<>(ll);
		System.out.println("The linkedList converted to arraylist "+ al);
	}
}
