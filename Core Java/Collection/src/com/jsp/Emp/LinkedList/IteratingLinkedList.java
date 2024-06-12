package com.jsp.Emp.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratingLinkedList {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Apple");
		ll.add("banana");
		ll.add("cherry");
		Iterator<String> i = ll.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() +" ");
		}
	}
}
