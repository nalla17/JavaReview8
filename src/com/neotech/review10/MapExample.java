package com.neotech.review10;

import java.util.*;

public class MapExample {
	// Map
	// HashMap | LinkedHashMap | TreeMap | HashTable

	public static void main(String[] args) {

		Map<Integer, String> phonebook = new HashMap<>();
		phonebook.put(91237263, "Joe Biden");
		phonebook.put(32045928, "Obama");
		phonebook.put(28198734, "Donald Trump");
		phonebook.put(92348257, "Dua Lipa");
		phonebook.put(11111111, "Obama");

		// It will replace Dua Lipa with Hasan
		phonebook.replace(92348257, "Hasan");

		// Another way to replace
		// phonebook.put(92348257, "Hasan");

		System.out.println("size -> " + phonebook.size());
		System.out.println(phonebook);

		// Map is one-directional, from the KEY to the VALUE
		// There is NO way to go from the value to the key

		String name = phonebook.get(92348257);
		System.out.println(name + " is calling...");

		name = phonebook.get(999);
		System.out.println(name + " is calling...");

		boolean containsK = phonebook.containsKey(28198734);
		System.out.println("The phonebook contains 28198734 -> " + containsK);

		boolean containsV = phonebook.containsValue("Dua Lipa");
		System.out.println("Dua Lipa is in my phonebook -> " + containsV);

		phonebook.remove(28198734); // Will remove the pair/entry from the map

		System.out.println("size -> " + phonebook.size());
		System.out.println(phonebook);

		// You CANNOT iterate the Map

		// Let's get all the KEYS and store them into a SET
		System.out.println("--------phonebook.keySet()--------");

		Set<Integer> numbers = phonebook.keySet();
		System.out.println(numbers);

		Iterator<Integer> itNums = numbers.iterator();
		while (itNums.hasNext()) {
			Integer number = itNums.next();

			// Find the name/value by using the number/key
			String personName = phonebook.get(number);
			System.out.println(number + " -> " + personName);
		}

		// Task until 2:20PM
		// Get the values and iterate them using an enhanced for loop
		// Try to get the number by using the name!!!

		// Let's get all the VALUES and store them into a COLLECTION
		System.out.println("--------phonebook.values()--------");

		Collection<String> names = phonebook.values();
		System.out.println(names);

		for (String personName : names) {
			System.out.println(personName);

			// Map is one-directional, from the KEY to the VALUE
			// There is NO way to go from the value to the key
			// phonebook.get(personName);
		}

	}

}
