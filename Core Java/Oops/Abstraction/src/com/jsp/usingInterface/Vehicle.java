package com.jsp.usingInterface;

public interface Vehicle {
	int a=90;
	public String vehicleType();
	public static void ride() {
		System.out.println("ride some sort of vehicle");
	}
	
	public default String vehiclePriceRange() {
		System.out.print("Less than 5000000 ");
		return "permitted";
	}
}
