package com.jsp;

public class Animal {
	private String name ;
	private String sound;
	public void  make_sound() {
		System.out.println(this.getSound());
	}
	public Animal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public static void main(String[] args) {
		Animal animal = new Animal("Koyal", "Kuku");
		animal.make_sound();
		animal.setName("Cat");
		animal.setSound("Miua");
		animal.make_sound();
	}
	
}
