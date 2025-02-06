package com.neotech.review04;

public class TwoD_ArrayIntro {

	public static void main(String[] args) {

		int[][] numbers = new int[3][4]; // [rows][columns]

		// 2D-Array is an array of 1D-Arrays
		// Every element is a 1D-Array

		numbers[1][2] = 3;
		numbers[0][1] = 6;
		numbers[2][3] = 4;
		numbers[2][0] = 7;

		// re-assign a value to one element
		numbers[2][0] += 1;

		// compile-time error -> Before running the code
		// numbers[0][3] = "cat";

		// run-time error -> After running the code
		// numbers[3][1] = 5;

		int rows = numbers.length;
		System.out.println("The number of rows is -> " + rows);

		int row2Length = numbers[2].length;
		System.out.println("The length of row with index 2 is -> " + row2Length);

	}

}
