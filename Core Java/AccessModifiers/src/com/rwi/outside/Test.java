package com.rwi.outside;

import com.rwi.one.Modifiers;

public class Test {
public static void main(String[] args) {
	System.out.print("Accessing the public modifier outside the package --> ");
	Modifiers.start();
	System.out.println();
	System.out.print("Accessing protected modifier outside the package--> ");
	System.out.println("Not allowed");
	System.out.println();
	System.out.print("Accessing default modifier outside the package --> ");
	System.out.println("Not allowed");
	System.out.println();
	System.out.print("Accessing private modifier outside the package --> ");
	System.out.println("Not allowed ");
}
}
