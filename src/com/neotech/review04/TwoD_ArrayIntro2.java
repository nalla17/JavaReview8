package com.neotech.review04;

public class TwoD_ArrayIntro2 {

	public static void main(String[] args) {

		// 1D Array
		int[] num = { 5, 3, 8 };

		// 2D Array
		int[][] nums = { 
				{ 5, 2, 0 }, 
				{ 8, 1, 7 }, 
				{ 6, 9, -2 }, 
				{ 4, 2, 6 }
		};

		System.out.println(nums[2][1]);
		System.out.println(nums[0][1]); // 2
		System.out.println(nums[3][1]); // 2

		System.out.println("--------------------------------");

		// Nested enhanced for loops
		for (int[] row : nums) {

			// I will iterate the row (1D-Array) with enhanced for loop
			for (int element : row) {
				System.out.print(element + " ");
			}

			System.out.println();
		}
		
		System.out.println("--------------------------------");

		// How can I get the row with index 2
		int[] row2 = nums[2];
		for (int el : row2) {
			System.out.println(el);
		}

		System.out.println("--------------------------------");

		// Combining Enhanced for loop with Normal for loop
		for (int[] row : nums) {

			// I will iterate the row (1D-Array) with normal for loop
			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i] + " ");
			}

			System.out.println();
		}
	}

}
