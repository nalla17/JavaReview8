package com.neotech.review07;

public class Student {

	// instance/object variables
	String name;
	int age;

	// static/class variables
	static String school;

	// Constructor
	public Student(String name, int age) {
		this.name = name; // To distinguish between the parameter and instance variable
		this.age = age; // To distinguish between the local and instance variable
	}
	
	// instance/object method
	public void displayStudentInfo() {
		System.out.println("My name is -> " + this.name + 
				" AND my age is -> " + this.age + 
				" AND my school is -> " + Student.school);
	}

	// static/class method
	public static void main(String[] args) {

		Student.school = "NeoTech";

		// CANNOT be used without on object
		// Student.name = "Yasmin";

		// We don't have a Default Constructor
		// Student s1 = new Student();

		Student s2 = new Student("Yasmin", 20);
		s2.displayStudentInfo();
		
		Student s3 = new Student("Everest", 50);
		s3.displayStudentInfo();
		
	}

}
