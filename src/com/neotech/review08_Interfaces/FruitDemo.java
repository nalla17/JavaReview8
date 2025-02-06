package com.neotech.review08_Interfaces;

public class FruitDemo {

	public static void main(String[] args) {

		Apple a = new Apple("Red");
		a.peel();
		a.wash();

		Coconut c = new Coconut("Brown");
		c.crack();

		Fruit f = new Apple("Yellow"); // up-casting
		// f.peel();
		// f.wash();

		Apple a2 = (Apple) f; // down-casting
		a2.peel();
		a2.wash();

		// We cannot create an object from an interface
		// Peelable p = new Peelable();

		Peelable p2 = new Apple("Green"); // up-casting
		p2.peel();

		// wash() method is not defined in the Peelable interface
		// p2.wash();

		Apple a3 = (Apple) p2; // down-casting, explicitly
		a3.wash();

		// Tasks are only for good students :)

		// Task 1
		// Create an Orange class that extends Fruit and implement Peelable

		// Task 2
		// Create an array of Peelable with 3 elements, one apple and two oranges
		// Iterate the array and execute the peel() method
		// Try to execute wash() method???

	}

}
