package com.jsp;

public class Car {
	private double price;
	private String brand;
	public void ride() {
		System.out.println("Long Drive");
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
