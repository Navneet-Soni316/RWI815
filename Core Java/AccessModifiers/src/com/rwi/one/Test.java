package com.rwi.one;

public class Test {
public static void main(String[] args) {
	System.out.print("Accessing public modifier within same package ---> ");
	Modifiers.start();
	System.out.println();
	System.out.print("Accessing protected modifier within same package --> ");
	Modifiers.play();
	System.out.println();
	System.out.print("Accessing default modifier within same package --> ");
	Modifiers.eat();
	System.out.println();
	System.out.print("Accessing private modifier within same package --> ");
	System.out.println("Not allowed ");
}
}
