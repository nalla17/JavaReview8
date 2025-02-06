package com.neotech.review09;

import java.util.ArrayList;
import java.util.Iterator;

public class WrapperList {

	public static void main(String[] args) {

		// ArrayList can only store objects/classes
		// ArrayList<int> numbers = new ArrayList<>();

		ArrayList<Integer> numbers = new ArrayList<>(); // An ArrayList is being created

		boolean isEmpty = numbers.isEmpty();
		System.out.println("Is it empty? " + isEmpty);
		System.out.println("The size is -> " + numbers.size());

		numbers.add(new Integer(5)); // This is the long way
		numbers.add(9); // This is the easy way. Auto-Boxing
		numbers.add(1);
		numbers.add(6);

		System.out.println("The size is -> " + numbers.size());

		System.out.println("--------------------------------");

		boolean containts = numbers.contains(7);
		System.out.println("Does the list contain the number 7? " + containts);

//		numbers.remove(1); // remove by index
//		System.out.println(numbers);

		numbers.remove(new Integer(1)); // remove by object
		System.out.println(numbers);

		System.out.println("--------------------------------");

		System.out.println("How can we iterate the ArrayList?");

		System.out.println("1st way, using the normal for loop");

		for (int i = 0; i < numbers.size(); i++) {
			int element = numbers.get(i); // Auto-UnBoxing
			System.out.println(element);
		}

		System.out.println("2nd way, using the enhanced for loop");

		for (int element : numbers) {
			System.out.println(element);
		}

		System.out.println("3rd way, using the iterator");

		Iterator<Integer> it = numbers.iterator();

		// There are 3 methods in the Iterator
//		it.hasNext(); // This method will return true/false if there is a next element
//		it.next(); // This method will return the next element from the list
//		it.remove(); // This method will remove the current element from the list

//		System.out.println(it.next()); // It will move to the next element and get it
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next()); // Run-time Error

		while (it.hasNext()) {
			int element = it.next();
			System.out.println(element);
		}

	}

}
