package com.neotech.review07;

public class HospitalApplication {

	public static void main(String[] args) {

		Doctor d1 = new Doctor("Natalia", 150000, "RU195");
		d1.checkUp("Secil");

		// These are variables and methods of the child class
		// d1.dermId = "XYZ";
		// d1.applySkinTreatment();

		System.out.println("--------------------------------");

		// Creating a Dermatologist with NO initial information
		Dermatologist d2 = new Dermatologist();
		d2.name = "Bello";
		d2.salary = 170000;
		d2.licenceId = "NG412";
		d2.dermId = "D805";

		d2.checkUp("Ahmet");
		d2.applySkinTreatment();

		System.out.println("--------------------------------");

		// Creating a Dermatologist with 4 parameters
		Dermatologist d3 = new Dermatologist("Cadet", 200000, "HT732", "D007");
		d3.checkUp("May");
		d3.applySkinTreatment();

		System.out.println("--------------------------------");

		// Not possible, because constructors are NOT inherited
		// Dermatologist d4 = new Dermatologist("Ahmet", 165000, "TR816");

	}

}
