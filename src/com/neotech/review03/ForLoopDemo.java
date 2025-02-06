package com.neotech.review03;

public class ForLoopDemo {

	// I want to celebrate my son's birthdays from 11 to 20 (Use for loop)
	// but not 13th birthday, because we are scared
	// Let's use for loop

	public static void main(String[] args) {

		// 1st iteration -> 1. initialization; 2. check the condition
		// Next iterations -> 1. incrementing; 2. check the condition

		for (int age = 11; age <= 20; age++) {

			if (age == 13) {
				continue;
			}

			System.out.println("Happy Birthday! You are " + age + " years old!");
		}

	}

}
