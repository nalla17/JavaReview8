package com.neotech.review04;

import java.util.Scanner;

public class Scanner_2DArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("How many rows do you want in the array?");
		int rows = scan.nextInt();

		System.out.println("How many columns do you want in the array?");
		int cols = scan.nextInt();

		// Create the array (String[][] names)
		String[][] names = new String[rows][cols];

		// Fill the array
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {
				System.out.println("Please enter a name:");
				names[i][j] = scan.next();
			}

		}

		System.out.println("--------------------------------");

		// Print the array
		// I will print using enhanced/advanced for loop
		for (String[] row : names) {

			for (String name : row) {
				System.out.print(name + " ");
			}

			System.out.println();
		}

	}

}
