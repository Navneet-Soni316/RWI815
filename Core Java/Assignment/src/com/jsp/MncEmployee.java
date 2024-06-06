package com.jsp;

public class MncEmployee {
	String name;
	Double salary;
	String position;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void promote(String new_position) {
		switch (new_position) {
		case "Intern": {
			     this.position =new_position;
			     this.salary = 0.0;
			     return;	
		
		}
		
		case "Junior Developer": {
		     this.position = new_position;
		     this.salary = 12000.0;
		     return;	
	
		}
		
		case "Associate Developer": {
		     this.position = new_position;
		     this.salary = 20000.50;
		     return;	
	
		}
		
		case "Team Lead": {
		     this.position = new_position;
		     this.salary = 25000.50;
		     return;	
	
		}
		
		case "Manager": {
		     this.position = new_position;
		     this.salary = 60000.50;
		     return;	
	
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + new_position);
		}
	}
	@Override
	public String toString() {
		return "MncEmployee [name=" + name + ", salary=" + salary + ", position=" + position + "]";
	}
	public static void main(String[] args) {
		MncEmployee mn = new MncEmployee();
		mn.setName("Raj");
		mn.setPosition("Intern");
		mn.setSalary(0.0);
		mn.promote("Associate Developer");
		System.out.println(mn);
		
	}
}
