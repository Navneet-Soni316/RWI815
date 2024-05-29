package com.jsp;

public class Test {
public static void main(String[] args) {
	Car c = new Car();
	System.out.println(c.getBrand());
	System.out.println(c.getPrice());
	c.setBrand("Wagnor");
	c.setPrice(789000);
	System.out.println(c.getBrand());
	System.out.println(c.getPrice());
	c.ride();
}
}
