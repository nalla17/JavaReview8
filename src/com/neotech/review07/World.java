package com.neotech.review07;

public class World {

	public static void main(String[] args) {

		// 1st way, using the constructor with NO parameters
		Person p1 = new Person();
		p1.displayInfo();

		p1.name = "Selim";
		p1.age = 30;
		p1.weight = 175;
		// p1.gender = 'M';

		p1.displayInfo();

		System.out.println("--------------------------------");

		// 2nd way, using the constructor with TWO parameters
		Person p2 = new Person("Bushra", 25);
		p2.displayInfo();

		p2.weight = 130;
		p2.displayInfo();

		System.out.println("--------------------------------");

		// 3rd way, using the constructor with THREE parameters
		Person p3 = new Person("Lirika", 28, 135);
		p3.displayInfo();

	}

}
