package com.jsp.Hybrid;

public class CommonChild extends C implements A,B {
	
	@Override
	public boolean isEven(int num) {
		return num%2==0;
	}

}
