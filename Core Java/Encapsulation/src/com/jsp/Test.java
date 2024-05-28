package com.jsp;

public class Test {
public static void main(String[] args) {
	Refrigerator rf = new Refrigerator();
	System.out.println(rf.getName());
	System.out.println(rf.getProductId());
	rf.setName("Samsung");
	rf.setProductId(122);
	System.out.println(rf.getName());
	System.out.println(rf.getProductId());
}
}
