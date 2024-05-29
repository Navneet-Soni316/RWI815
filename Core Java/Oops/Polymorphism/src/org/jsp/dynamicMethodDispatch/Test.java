package org.jsp.dynamicMethodDispatch;

public class Test extends DemoRunTime {
	// method Overriding ---> Runtime Polymorphism
	@Override
	public int twoNum(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("The method of child class (overriden) executed --> "+ t.twoNum(23, 2));
		DemoRunTime drt = new DemoRunTime();
		System.out.println("The method of parent class executed --> "+ drt.twoNum(23, 2));
		DemoRunTime dc = new Test();
		System.out.println("The method of child class (overriden) executed --> "+ dc.twoNum(23, 2));	
	}
}
