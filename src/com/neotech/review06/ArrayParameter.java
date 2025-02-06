package com.neotech.review06;

import java.util.Arrays;

public class ArrayParameter {

	public static void main(String[] args) {

		int[] array = { 3, 5, 2, 6, 1 };

		// To print one element from the array, with index 1
		// System.out.println(array[1]);

		// System.out.println(array);

		String str = Arrays.toString(array);
		System.out.println(str);

		ArrayParameter ap = new ArrayParameter();

		int result = ap.largestNumber(array);
		System.out.println("The largest number in the array is -> " + result);

		result = ap.arraySum(array);
		System.out.println("The sum of the array is -> " + result);

		double d = ap.arrayAvg(array);
		System.out.println("The average of the array is -> " + d);
	}

	protected int arraySum(int[] arr) {
		int sum = 0;

		for (int el : arr) {
			sum += el;
		}

		return sum;
	}

	private double arrayAvg(int[] arr) {

		// Can I use the arraySum() method to find the sum of the array? - YES
		double sum = arraySum(arr); // up-casting - automatically

		double avg = sum / arr.length;

		return avg;
	}

	// input --> int[] (an array of numbers)
	// logic --> given an array, find the largest number
	// output --> int (the largest number)
	// visibility --> public (accessed from everywhere)
	// usage --> non-static (You need an object to execute the method)
	public int largestNumber(int[] arr) {
		int largest = arr[0];

		for (int el : arr) {
			if (el > largest) {
				largest = el;
			}
		}

		return largest;
	}

}
