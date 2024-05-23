package com.rwi.one;

public class Modifiers {
	public static void start() {
		System.out.println("Ferrari started");
	}
	
	protected  static void  play() {
		System.out.println("Playing Football");
		
	}
	
	static void eat() {
		System.out.println("Eating Panini");
	}
	
	private static void drink() {
		System.out.println("Drinking Brandi");
	}
	public static void main(String[] args) {
		System.out.print("Accessing public modifier within same class -->");
		Modifiers.start();
		System.out.println();
		System.out.print("Accessing protected modifier within same class -->");
		Modifiers.play();
		System.out.println();
		System.out.print("Accessing default modifier within same class -->");
		Modifiers.eat();
		System.out.println();
		System.out.print("Accessing private modifier within same class --> ");
		Modifiers.drink();
		
		
	}
}
