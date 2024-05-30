package com.jsp.Overriding;

public class Variant extends Brand {
	@Override
	public String name() {
		return "This is Tata's Nexa";
	}
public static void main(String[] args) {
	Variant v = new Variant();
	System.out.println(v.name());
}
	
}
