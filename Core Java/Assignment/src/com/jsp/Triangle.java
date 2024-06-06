package com.jsp;

public class Triangle {
	int side1;
	int side2;
	int side3;
	public Triangle(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public boolean isEquilateral() {
		 if(side1==side2 &&  side2==side3) {
			 System.out.println("It is equilateral triangle");
			 return true;
		 }
		 System.out.println("It is not equilateral triangle");
			 
		 return false;
			 
	 }
	 
	 public double calculate_area() {
		 if(isEquilateral()) {
			 return (Math.sqrt(3)/4)*(side1*side1);
		 }
		return 0.5*side1*side2;
	 }
	 
	 public static void main(String[] args) {
		Triangle t = new Triangle(3, 2, 3);
		System.out.println("Area --> "+t.calculate_area());
	}
	
}
