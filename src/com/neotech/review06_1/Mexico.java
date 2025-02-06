package com.neotech.review06_1;

import com.neotech.review06.USA;

public class Mexico {

	public static void main(String[] args) {
		USA us = new USA();

		System.out.println("Accessing the variables from inside Mexico");

		System.out.println("public -> " + us.bestSchool);

		// private, protected & default variables CANNOT be accessed from Mexico
		// System.out.println("default -> " + us.state);
		// System.out.println("protected -> " + us.mainState);
		// System.out.println("private -> " + us.capitalCity);

		System.out.println("--------------------------------");

		System.out.println("Accessing the methods from inside Mexico");
		us.attendNeoTech();
		
		// us.playNBA(); is protected
		// us.selectPresident(); is private
	}

}
