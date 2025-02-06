package com.neotech.review05;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Pershendetje";

		System.out.println(str.length());

		System.out.println(str.isEmpty());

		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		System.out.println(str); // The original has NOT changed

		boolean equal = str.equals("PERSHENDETJE");
		System.out.println("equal -> " + equal);

		System.out.println(str.equalsIgnoreCase("PERSHENDETJE"));

		System.out.println("--------------------------------");

		System.out.println(str.contains("SH"));
		System.out.println(str.contains("SH".toLowerCase()));

		boolean start = str.startsWith("per");
		System.out.println(start);

		System.out.println("Does Pershendetje start with Pershendetje?");
		System.out.println(str.startsWith("Pershendetje"));

		System.out.println("Does Pershendetje end with E?");
		System.out.println(str.endsWith("E"));

		System.out.println("--------------------------------");

		String name = "Raluca" + "-" + "Popa";
		System.out.println(name);

		String name2 = "Raluca".concat("-").concat("Popa"); // Method chaining
		System.out.println(name2);

		String name3 = "Raluca".toUpperCase().concat("-").concat("Popa");
		System.out.println(name3);

		// "Raluca".length().concat("Popa"); // Compile Time error
		// 6.concat("Popa");
		"Raluca".concat("Popa").length(); // This is OK
		System.out.println("Raluca".concat("Popa").length());

		System.out.println("--------------------------------");

		String str2 = "     Harun    was    confused    ";
		System.out.println(str2.trim());
		System.out.println(str2.trim().length());

		System.out.println("--------------------------------");

		String str3 = "Nuray is very smart";
		char letter = str3.charAt(2);
		System.out.println(letter);

		System.out.println("The index of letter 'r' is -> " + str3.indexOf('r'));
		
		// Find the index of letter 'r', but start looking after index 3
		int indexOfSecondR = str3.indexOf('r', 3);
		System.out.println("indexOfSecondR -> " + indexOfSecondR);

	}

}
