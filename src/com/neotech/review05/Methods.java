package com.neotech.review05;

public class Methods {

	void sayWelcome() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}

	void sayWelcomeWithNumber(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}

	void sayGreeting(String greeting) {
		for (int i = 1; i <= 5; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}

	void sayGreetingWithNumber(String greeting, int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Methods m = new Methods();
		m.sayWelcome();
		m.sayWelcomeWithNumber(3);
		m.sayWelcomeWithNumber(7);

		// Compile-time Error: The method accepts only integers, not String
		// m.sayWelcomeWithNumber("Two");

		m.sayGreeting("Pershendetje");
		m.sayGreeting("Hola");
		System.out.println("--------------------------------");

		m.sayGreetingWithNumber("Ciao", 3);
		m.sayGreetingWithNumber("Bonjour", 4);

		// Compile-time error
		// You have to provide2 parameters -> String & int
		// m.sayGreetingWithNumber("Salam");

		// Terminology -> invoke/call/execute a method
	}

}
