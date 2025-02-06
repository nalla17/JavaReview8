package com.neotech.review03;

public class MagicDollar {
	// $$$$$
	// $$$$$
	// $$$$$
	// $$$$$

	public static void main(String[] args) {

		// 1st Silly way
		// System.out.println("$$$$$");
		// System.out.println("$$$$$");
		// System.out.println("$$$$$");
		// System.out.println("$$$$$");

		// 2nd Silly way
//		for (int i = 1; i <= 4; i++) {
//			System.out.println("$$$$$");
//		}

		// Serious way
//		for (int row = 1; row <= 4; row++) {
//
//			for (int col = 1; col <= 5; col++) {
//				System.out.print("$");
//			}
//			System.out.println();
//
//		}
		
		// Task (make some changes on pattern)
		// $$$$$
		// $   $
		// $   $
		// $$$$$

		for (int row = 1; row <= 4; row++) {

			for (int col = 1; col <= 5; col++) {

				if (row == 1 || row == 4 || col == 1 || col == 5) {
					System.out.print("$");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}

	}

}
