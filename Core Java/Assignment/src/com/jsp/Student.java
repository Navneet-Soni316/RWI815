package com.jsp;

public class Student {
	String name;
	int age;
	String grade;
	public Student(String name, int age, String grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public boolean is_teenager() {
		if(age>=13 && age<=18) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Student s = new Student("Arun", 17, "A");
		System.out.println(s.is_teenager());
	}
}
