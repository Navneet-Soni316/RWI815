package com.jsp;

public class Employee {
	String name;
	int employee_id;
	double salary;
	
	public Employee(String name, int employee_id, double salary) {
		this.name = name;
		this.employee_id = employee_id;
		this.salary = salary;
	}
	public double calculate_bonus(double percent) {
		return (percent/100)*salary;
	}
	public static void main(String[] args) {
		Employee ee = new Employee("mahon", 17, 2000);
		System.out.println("Bonus amount --> "+ ee.calculate_bonus(20));
	}
	
}
