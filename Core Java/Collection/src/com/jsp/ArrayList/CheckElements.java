package com.jsp.ArrayList;

import java.util.ArrayList;

public class CheckElements {
public static void main(String[] args) {
	ArrayList<Integer > al = new ArrayList<>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(33);
	System.out.println(al.contains(33));
}
}
