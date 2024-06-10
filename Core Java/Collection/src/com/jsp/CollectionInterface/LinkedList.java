package com.jsp.CollectionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class LinkedList {
public static void main(String[] args) {
	System.out.println("This is a linked list");
	List ll = Arrays.asList("Helo", true, 670,"Govind");
	ListIterator res =ll.listIterator();
	while (res.hasNext()) {
		
		System.out.println(res.next());
	}	

}
}
