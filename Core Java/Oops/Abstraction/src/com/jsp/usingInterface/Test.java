package com.jsp.usingInterface;

public class Test implements Vehicle {

	@Override
	public String vehicleType() {
		return "four wheeler";
	}
	public static void main(String[] args) {
		Test v = new Test();
		System.out.println("Implemented the functionality for vehicleType() --> "+ v.vehicleType());
		System.out.println("Inherited variable --> " + v.a);
		System.out.println("Inherited default method --> "+ v.vehiclePriceRange()); //default methods of interface are inherited by child
		Vehicle.ride();  // static method of interface  can't be inherited 

	}

}
