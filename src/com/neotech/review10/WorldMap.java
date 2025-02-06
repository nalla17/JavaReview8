package com.neotech.review10;

import java.util.*;

public class WorldMap {

	public static void main(String[] args) {

		Map<String, String> europe = new TreeMap<>(); // order by the key
		europe.put("Italy", "Rome");
		europe.put("Hungary", "Budapest");
		europe.put("Germany", "Berlin");
		System.out.println(europe);

		Map<String, String> africa = new LinkedHashMap<>(); // order is preserved
		africa.put("Morocco", "Rabat");
		africa.put("Congo", "Kinshasa");
		africa.put("Ethiopia", "Addis Ababa");
		System.out.println(africa);

		Map<String, String> asia = new HashMap<>(); // random order
		asia.put("Turkiye", "Ankara");
		asia.put("Uzbekistan", "Tashkent");
		asia.put("Pakistan", "Islamabad");
		System.out.println(asia);

		// HW1 iterate europe by getting the keys
		// HW2 iterate africa by getting the values

		System.out.println("--------WORLD--------");

		List<Map<String, String>> world = new ArrayList<>();
		world.add(europe);
		world.add(africa);
		world.add(asia);

		// HW for Secil
		// Create NorthAmerica and add it to the world

		System.out.println("WORLD -> " + world);
		System.out.println("SIZE -> " + world.size());

		Map<String, String> map2 = world.get(2); // get the element with index 2
		System.out.println("The object/element with index 2 is -> " + map2);

		System.out.println("--------Let's iterate the WORLD--------");

		for (Map<String, String> continent : world) {
			// System.out.println(continent);

			Set<String> countryNames = continent.keySet();

			for (String country : countryNames) {
				System.out.println(country + " -> " + continent.get(country));
			}

			System.out.println("--------");
		}

		// HW for students who are lazy
		// Iterate the WORLD using nested while loop

	}

}
