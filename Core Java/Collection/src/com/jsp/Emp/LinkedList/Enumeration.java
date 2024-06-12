package com.jsp.Emp.LinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Enumeration {
	public static void main(String[] args) {
		List<Employee> eml = new LinkedList<>(
				Arrays.asList(new Employee(1, "Suraj", 6700.90),
						new Employee(1, "Mahon", 6700.60)));
		System.out.println(eml);
		ListIterator<Employee> i = eml.listIterator(2);
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
		System.out.println(eml.get(0));
		eml.add(2, new Employee(3, "Nanshi", 78900));
		System.out.println(eml);
//		eml.remove(2);
		System.out.println(eml);
	java.util.Enumeration<Employee>  ee =  Collections.enumeration(eml);
	while (ee.hasMoreElements()) {
		System.out.println(ee.nextElement());
	
		
	}
	}
}
