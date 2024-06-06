package com.jsp;

public class Rectangle {
	int length=4;
	int width=3;
	public  int calculate_area() {
		return this.length*this.width;
	}
	public int calculate_perimeter() {
		return 2*(this.length+this.width);
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		System.out.println(r.calculate_area());
		System.out.println(r.calculate_perimeter());
		
	}
}
