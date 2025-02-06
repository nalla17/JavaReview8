package com.neotech.review03;

public class ArrayIntro {

	public static void main(String[] args) {

		// Funny way
		int s1 = 90;
		int s2 = 93;
		int s3 = 98;
		int s4 = 85;

		int sum = s1 + s2 + s3 + s4;
		System.out.println("The sum is -> " + sum);

		// 1st serious way
		int[] grades = new int[4];
		grades[2] = 98;
		grades[0] = 90;
		grades[3] = 85;
		grades[1] = 93;

		// int size = grades.length;

		// The size of the array is 4
		// The index of the last element is 3

		int total = 0;
		for (int i = 0; i < grades.length; i++) {
			total += grades[i];
		}

		System.out.println("The total of the array is -> " + total);

		// 2nd serious way
		int[] grades2 = { 90, 93, 98, 85 };

		int total2 = 0;

		// Get the elements from the array one by one, from the first to the last
		for (int num : grades2) {
			total2 += num;
		}

		System.out.println("The total2 of the array is -> " + total2);

	}

}
