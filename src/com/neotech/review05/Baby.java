package com.neotech.review05;

public class Baby {

	// variables/attributes/properties
	String name;
	char gender;
	int weight;
	String hairColor;

	// methods/behaviors/actions
	void talk() {
		System.out.println(name + " is talking");
	}

	void cry() {
		System.out.println(name + " is crying");
	}

	void eat() {
		System.out.println(name + " is eating");
	}
	//made some changes
	void laugh () {
		System.out.println(name + " is laughing");
	}

	void displayInformation() {
		System.out.println("My name is " + name);
		System.out.println("My gender is " + gender);
		System.out.println("My hair color is " + hairColor);
	
	}

}
