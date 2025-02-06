package com.neotech.review07;

// Base/Super/Parent class
public class Animal {
	String name;
	int legs;

	public Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}

	public void sleep() {
		System.out.println("All animals sleep");
	}

	public void displayInfo() {
		System.out.println(name + " has " + legs + " legs");
	}

}

// Derived/Sub/Child class
class Wolf extends Animal {

	Wolf(String name, int legs) {
		super(name, legs);
	}

}

class Fox extends Animal {
	String furColor;

	Fox(String name, int legs, String furColor) {
		super(name, legs);
		this.furColor = furColor;
	}
}

class Bear extends Animal {

	Bear(String name, int legs) {
		super(name, legs);
	}

	public void roar() {
		System.out.println("All bears roar");
	}

}
