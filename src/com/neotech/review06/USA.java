package com.neotech.review06;

public class USA {

	// Access Modifier, we define where the variable/methods can be accessed from
	public String bestSchool = "NeoTech";
	String state = "CA";
	protected String mainState = "NewYork";
	private String capitalCity = "Washington DC";

	public void attendNeoTech() {
		System.out.println("NeoTech can be attended from everywhere!");
	}

	protected void playNBA() {
		System.out.println("Only countries in the same package can join NBA!");
	}

	private void selectPresident() {
		System.out.println("The US president can only be selected within USA!");
	}

	public static void main(String[] args) {
		USA us = new USA();

		System.out.println("Accessing the variables from inside USA");

		System.out.println("public -> " + us.bestSchool);
		System.out.println("default -> " + us.state);
		System.out.println("protected -> " + us.mainState);
		System.out.println("private -> " + us.capitalCity);
		
		System.out.println("--------------------------------");

		System.out.println("Accessing the methods from inside USA");
		us.attendNeoTech();
		us.playNBA();
		us.selectPresident();
	}

}
