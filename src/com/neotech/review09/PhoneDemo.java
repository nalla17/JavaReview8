package com.neotech.review09;

public class PhoneDemo {

	public static void main(String[] args) {

		Phone p = new Phone("S23454", "Samsung", "Pass@123");
		p.displayInfo();

		// Not able to access the password from this class
		// p.password = "NewPassword";

		String serial = p.getSerialNumber("Pass@123");
		System.out.println("The serial number is -> " + serial);

		p.setSerialNumber("S999");
		p.displayInfo(); // Did NOT change

		p.setSerialNumber("Trump@1");
		p.displayInfo(); // Changed

		System.out.println("--------------------------------");

		System.out.println("The brand is -> " + p.getBrand());

		// We cannot change the brand
		// because there is NO setter method
		// p.setBrand("Apple");

		// Password is hidden. No Getter or Setter is provided

		// HW only for Nuray
		// Create a Setter method for the password
		// Provide the old and the new password
		// Password will be modified ONLY if the old password is correct

	}

}
