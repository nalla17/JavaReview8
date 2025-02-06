package com.neotech.review10;

import java.util.*;

public class CollectionsExample {
	// Collections Framework -> All interfaces and implementations
	// Collection Interface -> Only one interface
	// Collections class -> It is a helper/utility class

	public static void main(String[] args) {

		Set<Integer> numbers = new HashSet<>(); // Up-casting
		numbers.add(52);
		numbers.add(29);
		numbers.add(73);
		numbers.add(61);
		numbers.add(30);
		numbers.add(82);

		System.out.println(numbers);

		Integer min = Collections.min(numbers);
		System.out.println("min -> " + min);

		System.out.println("max -> " + Collections.max(numbers));

		// SET cannot be sorted/ordered
		// Collections.sort(numbers);

		// LIST can be sorted/ordered
		List<Integer> numberList = new ArrayList<>(numbers);
		System.out.println("List before sorting -> " + numberList);

		Collections.sort(numberList);
		System.out.println("List after sorting -> " + numberList);

		System.out.println("--------------------------------");

		List<String> students = new LinkedList<String>();
		students.add("Easter");
		students.add("Hazal");
		students.add("Carolina");
		students.add("Atifa");
		students.add("Kamela");
		students.add("Ahmet");
		System.out.println(students);

		String first = Collections.min(students);
		System.out.println("first -> " + first);
		System.out.println("last -> " + Collections.max(students));

		Collections.sort(students);
		System.out.println(students);

		System.out.println("--------------------------------");

		int[] arr = { 5, 1, 8, 3, 9, 4 };
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

}
