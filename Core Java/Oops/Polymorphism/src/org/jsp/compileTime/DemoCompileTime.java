package org.jsp.compileTime;

public class DemoCompileTime {

	public int sum(int a, int b) {
		return a+b;
	}
	//Method -Overloading ---> Compile time Polymorphism
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
}
