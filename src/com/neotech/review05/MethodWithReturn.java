package com.neotech.review05;

public class MethodWithReturn {

	public static void main(String[] args) {

		String name = "Carolina";
		int numOfChars = name.length();
		System.out.println("The length of the string is -> " + numOfChars);

		MethodWithReturn m = new MethodWithReturn();
		boolean res = m.isOdd(7);
		System.out.println("Is 7 odd? " + res);

		boolean res2 = m.isOdd(12);
		System.out.println("Is 12 odd? " + res2);

		boolean res3 = m.isOddEnhanced(12341234);
		System.out.println("Is 12341234 odd? " + res3);

	}

	// If this one is confusing, it's OK, don't worry :)
	// Divide the number by 2 (modulus)
	// if the result is equal to 1 -> return true
	// otherwise -> return false
	boolean isOddEnhanced(int num) {
		return num % 2 == 1;
	}

	boolean isOdd(int num) {
		boolean result;

		if (num % 2 == 1) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

}
