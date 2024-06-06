package com.jsp;

public class Car {
	private String make;
	private String model;
	private long year;
	
	public Car(String make, String model, long year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public void display_info() {
		System.out.println(make);
		System.out.println(model);
		System.out.println(year);
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public static void main(String[] args) {
		Car c  = new Car("TATA", "Nano", 2008);
		c.setMake("Maruti");
		c.setModel("Omni");
		c.setYear(1990);
		c.display_info();
	}
}
