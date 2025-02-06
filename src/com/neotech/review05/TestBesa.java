package com.neotech.review05;

public class TestBesa {

	public static void main(String[] args) {
		Besa b = new Besa();

		b.addTwoNumbers();
		b.addTwoNumbersThatIGive(8, 7);

		int res1 = b.addTwoNumbersAndGiveMeTheResult();

		int res2 = b.addTwoNumbersThatIGiveAndGiveMeTheResult(5, 11);

		if (res2 == 16) {
			System.out.println("Good job Besa!");
		} else {
			System.out.println("I still love you!");
		}
		
		// I can directly print the result/return of the method
		System.out.println(b.addTwoNumbersThatIGiveAndGiveMeTheResult(5, 11));
	}

}
