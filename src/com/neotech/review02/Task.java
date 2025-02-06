package com.neotech.review02;

import java.util.Scanner;

public class Task {
	// Ask the user to enter a positive number and add it to the total
	// He should enter -1 to STOP. -1 will not be added to the total

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = 0;
		int total = 0;

//		System.out.println("Please enter a positive number! To STOP enter -1");
//		num = scan.nextInt();
//
//		while (num != -1) {
//			total += num;
//
//			System.out.println("Please enter a positive number! To STOP enter -1");
//			num = scan.nextInt();
//		}
//
//		System.out.println("Total=" + total);

		System.out.println("--------------------------------");

		do {
			System.out.println("Please enter a positive number! To STOP enter -1");
			num = scan.nextInt();

			if (num != -1) {
				total += num;
			}

		} while (num != -1);

		System.out.println("Total=" + total);

	}

}
