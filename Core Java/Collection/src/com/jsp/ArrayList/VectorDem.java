package com.jsp.ArrayList;

import java.util.Vector;

public class VectorDem {
public static void main(String[] args) {
	Vector v = new Vector<>();
	v.addElement(124);
	v.addElement("Naman");
	v.add("maya");
	System.out.println(v.capacity());
	System.out.println(v.firstElement());
	System.out.println(v.lastElement());
	System.out.println(v.elementAt(1));
	v.setElementAt("Wholesale", 0);
	System.out.println(v);
	
}
}
