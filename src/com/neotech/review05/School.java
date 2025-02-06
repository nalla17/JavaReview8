package com.neotech.review05;

public class School {

	public static void main(String[] args) {

		// School s1 = new School();

		Student student1 = new Student();
		student1.name = "Easter";
		student1.studentNr = 297;
		student1.gradeLevel = 9;
		
		Student student2 = new Student();
		student2.name = "Volkan";
		student2.studentNr = 560;
		student2.gradeLevel = 5;
		
		Teacher teacher1 = new Teacher();
		teacher1.name = "Sabah";
		teacher1.salary = 130000;
		teacher1.subject = "Java";
		
		// Re-assigning the subject
		teacher1.subject = "Selenium";
		
		System.out.println("--------------------------------");
		System.out.println("Let's call the methods");
		System.out.println("--------------------------------");

		student1.study();
		student1.sleep();
		
		student2.study();
		
		System.out.println("--------------------------------");

		teacher1.teach();
		teacher1.yellAtStudent("Everest");
	}

}
