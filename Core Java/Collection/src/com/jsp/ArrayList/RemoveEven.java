package com.jsp.ArrayList;

import java.util.ArrayList;

public class RemoveEven {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		System.out.println(al);
		for(int i=0; i<al.size();i++) {
			if(al.get(i) %2 == 0)
				al.remove(i);
		}
//		for(Integer a : al) {
//			if(a%2 == 0)
//				al.remove(a);
//		}
		System.out.println("Elements without even number "+ al);
	}
}
