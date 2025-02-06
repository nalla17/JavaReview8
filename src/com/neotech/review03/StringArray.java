package com.neotech.review03;

public class StringArray {

	public static void main(String[] args) {

		String[] animals = { "dog", "cat", "fish", "lion", "snake" }; // The length/size is 5

		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();

		// Advanced/Enhanced for loop (Ulku says fancy for loop :)
		for (String element : animals) {
			System.out.print(element + " ");
		}
		System.out.println();

		System.out.println("--------------------------------");
		System.out.println("Let's print the animals in reverse order");
		System.out.println("--------------------------------");

		// The index of the last element is -> (animals.length - 1)

		for (int i = animals.length - 1; i >= 0; i--) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();

		// Print the animals in reverse order using enhanced for loop
		// Not possible, because it always start from the first to the last element

	}

}
