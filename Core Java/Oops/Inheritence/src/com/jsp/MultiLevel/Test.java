package com.jsp.MultiLevel;

public class Test {
	public static void main(String[] args) {
		SubChild s = new SubChild();
		s.fullName();
		System.out.println("Parent property --> "+s.city);
		System.out.println("GrandParent property --> "+ s.location);
	}
}
