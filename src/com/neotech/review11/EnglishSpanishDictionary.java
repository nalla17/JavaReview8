package com.neotech.review11;

import java.util.*;
import java.util.Map.Entry;

public class EnglishSpanishDictionary {

	public static void main(String[] args) {

		Map<String, String> dictionary = new TreeMap<>();
		dictionary.put("house", "casa");
		dictionary.put("donkey", "burro");
		dictionary.put("flag", "bandera");
		dictionary.put("cat", "gato");
		dictionary.put("banner", "bandera");

		System.out.println("map -> " + dictionary);

		// Set -> No duplicates
		// List -> Insertion order is preserved

//		Set<String> englishWords = dictionary.keySet();
//		System.out.println("keys -> " + englishWords);
//
//		Collection<String> spanishWords = dictionary.values();
//		System.out.println("values -> " + spanishWords);

		Set<Entry<String, String>> entries = dictionary.entrySet();
		System.out.println("entries -> " + entries);

		System.out.println("--------------------------------");

		// enhanced/advanced/for-each loop
		for (Entry<String, String> pair : entries) {
			// System.out.println(pair);

			String k = pair.getKey();
			String v = pair.getValue();
			System.out.println(k + " -> " + v);
		}

		System.out.println("--------------------------------");

		// TASK - Only for good students
		// Iterate the Entries and print by using iterator

		Iterator<Entry<String, String>> it = entries.iterator();
		while (it.hasNext()) {
			Entry<String, String> pair = it.next();
			System.out.println(pair.getKey() + " $ " + pair.getValue());
		}
	}
}
