package com.jsp.Hierarchical;

public class Test {
public static void main(String[] args) {
	//one child of India
	Up up = new Up();
	System.out.println("Up class property --> "+ up.location);
	System.out.println("India class property -->  "+ up.continent);
	System.out.println("overriden method --> "+ up.speciality());
	
	//other child of India
	System.out.println("******************");
	Karnataka kar = new Karnataka();
	System.out.println("Karnataka class property --> "+ kar.location);
	System.out.println("India class property -->  "+ kar.continent);
	System.out.println("overriden method --> "+ kar.speciality());
	
	
	}
}
