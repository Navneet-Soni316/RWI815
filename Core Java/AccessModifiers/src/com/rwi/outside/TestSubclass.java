package com.rwi.outside;

import com.rwi.one.Modifiers;

public class TestSubclass extends Modifiers{
	public static void main(String[] args) {
		System.out.print("Accessing the public modifier outside package by sub class --> ");
		Modifiers.start();
		System.out.println();
		System.out.print("Accessing protected modifier outside the package by sub class--> ");
		Modifiers.play();
		System.out.println();
		System.out.print("Accessing default modifier outside the package by sub class --> ");
		System.out.println("Not allowed");
		System.out.println();
		System.out.print("Accessing private modifier outside the package by sub class --> ");
		System.out.println("Not allowed");

	}
	
}
