package com.jsp;

public class Circle {
	int radius;
	final double pie= 3.14;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double calculate_area() {
		return pie*radius*radius;
	}
	
	public double calculate_circumference() {
		return 2*pie*radius;
	}
	public static void main(String[] args) {
		Circle c = new Circle(4);
		System.out.println("Area of circle --> "+c.calculate_area());
		System.out.println("Circumference  of circle --> "+c.calculate_circumference());
	}
}
