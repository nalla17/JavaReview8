package com.neotech.review07;

public class Person {

	// instance variables
	public String name;
	int age;
	protected int weight;
	// private char gender;

	public Person() {

	}

	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}

	public Person(String pName, int pAge, int paramWeight) {
		this(pName, pAge); // It should be the first statement
		weight = paramWeight;
	}

	public void displayInfo() {
		System.out.println("Name: " + name + " age: " + age + " weight: " + weight);
	}

}
