package com.neotech.review01;

public class VariableDemo {

	// ALWAYS FORMAT YOUR CODE
	// ctrl + shift + f
	// command + shift + f

	public static void main(String[] args) {

		// Declare a variable
		String firstName;

		// System.out.println("My name is -> " + firstName);

		// Assign a value (initialize)
		firstName = "Kamela";

		System.out.println("My name is -> " + firstName);

		// Declare a variable & Assign a value
		String lastName = "Bendaj";

		int age = 25;

		System.out.println(firstName + " " + lastName + " " + age + 1);
		System.out.println(firstName + " " + lastName + " " + (age + 1));

		System.out.println(age);

		// After 5 years
		// re-assign a new value to the container
		age += 5;
		lastName = "Holland";
		
		System.out.println(firstName + " " + lastName + " " + age);


	}

}
