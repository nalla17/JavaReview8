package com.neotech.review07;

// Method Overloading: The name of the methods MUST be the same
// Method Signature: Method name + parameters (MUST be unique)

// Access modifier is NOT part of Method Signature
// Return type is NOT part of Method Signature
// static keyword is NOT part of Method Signature
public class Multiplication {

	public static void multiply(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(result);
	}

	// It is method overloading if this method is not static? YES
	// It is method overloading if this method is private? YES
	private static void multiply(int num1, int num2, int num3) {
		int result = num1 * num2 * num3;
		System.out.println(result);
	}

	public static void multiply(double d1, double d2) {
		double result = d1 * d2;
		System.out.println(result);
	}

	// TASK
	protected static int multiply(int[] numbers) {
		int result = 1;

		for (int num : numbers) {
			result *= num;
		}

		return result;
	}

	public static void main(String[] args) {

		Multiplication.multiply(3, 4); // We don't need to specify the class name

		// Compile time polymorphism
		// Static binding
		// Method Overloading
		multiply(2, 4, 5);

		multiply(4.5, 5.5);

		// Also invokes/executes method with 2 doubles
		// 10 will be casted to 10.0
		multiply(10, 3.5);

		int[] array = { 2, 5, 3, 7 };
		int result = multiply(array);
		System.out.println("Array multiplication result -> " + result);
	}

}
