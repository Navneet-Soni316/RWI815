package com.jsp.Emp.LinkedList;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
