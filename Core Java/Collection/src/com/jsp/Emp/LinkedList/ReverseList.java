package com.jsp.Emp.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseList {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.addFirst(34);
		ll.addLast(89);
		ll.add(1, 67);
		ll.add(29);
		System.out.print( ll+" ");
		Collections.reverse(ll); // to reverse the list
		System.out.println();
		System.out.print(ll+" ");
	}
}
