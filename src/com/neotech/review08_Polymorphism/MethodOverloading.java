package com.neotech.review08_Polymorphism;

// Method signature = method name + parameters
// Access modifier is NOT part of the Method signature
// Return type is NOT part of the Method signature
// Static or non-static is NOT part of the Method signature

public class MethodOverloading {

	public void calculateInterest() {

	}

	public void calculateInterest(int a) {

	}

	public void calculateInterest(String a) {

	}

	public void calculateInterest(int a, int b) {

	}

	public void calculateInterest(double a, double b) {

	}

	public void calculateInterest(double a, int b) {

	}

	public void calculateInterest(int a, double b) {

	}

	public static void main(String[] args) {

		MethodOverloading mo = new MethodOverloading();
		mo.calculateInterest("Hazal");
		mo.calculateInterest(7.5, 100000);

		// Polymorphism
		// Method Overloading
		// Compile time Polymorphism/early binding/static binding

	}

}
