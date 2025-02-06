package com.neotech.review10;

import java.util.*;

public class SetExample {
	// Collection
	// List | Set | Queue (Three interfaces inheriting Collection)

	// ArrayList | LinkedList (Two classes implementing List Interface)
	// HashSet | LinkedHashSet | TreeSet (Three classes implementing Set Interface)

	// 1. LIST preserves the insertion order, but SET does NOT
	// 2. LIST contains duplicates, but SET contains UNIQUE objects

	public static void main(String[] args) {

		Set<String> africaLinked = new LinkedHashSet<>(); // Up-casting

		africaLinked.add("Gabon");
		africaLinked.add("Nigeria");
		africaLinked.add("Chad");
		africaLinked.add("Morocco");

		System.out.println("Size -> " + africaLinked.size());

		// It will NOT add in the SET, because it already exists!
		africaLinked.add("Chad");

		System.out.println("Size -> " + africaLinked.size());

		// Can I add with an index in a SET? NO
		// africaLinked.add(2, "Kenya");

		System.out.println("africaLinked -> " + africaLinked); // The order of insertion is preserved

		Set<String> africaHash = new HashSet<>(africaLinked); // The order is random
		System.out.println("africaHash -> " + africaHash);

		Set<String> africaTree = new TreeSet<>(africaLinked); // Alphabetical order
		System.out.println("africaTree -> " + africaTree);

		int size = africaTree.size();
		boolean contains = africaTree.contains("Kenya");
		boolean isEmpty = africaTree.isEmpty();

		boolean ableToRemove = africaTree.remove("Kenya");
		System.out.println("Was I able to remove Kenya? " + ableToRemove);

		// Note: We are NOT able to get/add/remove by index in a Set
		// africaTree.get(2);

		System.out.println("--------1st way, for loop DOES NOT work in a SET--------");
//		for (int i = 0; i < africaTree.size(); i++) {
//			africaTree.get(i);
//		}

		// Breask until 12:15PM
		// Iterate africaTree using enhanced for loop and iterator

		System.out.println("--------2nd way, using enhanced for loop--------");
		for (String country : africaTree) {
			System.out.println(country);
		}

		System.out.println("--------3rd way, using iterator--------");
		Iterator<String> itCountry = africaTree.iterator();
		while (itCountry.hasNext()) {
			String country = itCountry.next();
			System.out.println(country);
		}

	}

}
