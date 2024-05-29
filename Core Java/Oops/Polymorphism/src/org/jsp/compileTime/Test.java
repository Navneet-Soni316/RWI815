package org.jsp.compileTime;

public class Test {
	public static void main(String[] args) {
		DemoCompileTime dct = new DemoCompileTime();
		System.out.println(dct.sum(20, 2));
		System.out.println(dct.sum(1, 34, 7));
	}
}
