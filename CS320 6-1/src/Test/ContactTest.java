/*
File: ContactTest.java
Author: Paul Stephan
Version: 1.0
Date: February 13, 2024

Description:
This class contains test cases for the Contact class. It validates the functionality and constraints of the Contact class.
*/

package Test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Contact;

class ContactTest {

	// Test case to verify the functionality of the Contact class
	@Test
	void testContactClass() {
		Contact contact = new Contact("1234", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
		assertTrue(contact.getId().equals("1234"));
		assertTrue(contact.getFirstName().equals("Paul"));
		assertTrue(contact.getLastName().equals("Stephan"));
		assertTrue(contact.getPhoneNumber().equals("5134352820"));
		assertTrue(contact.getAddress().equals("Cincinnati,OH"));
	}

	// Test case to verify if the ID length exceeds the maximum allowed length
	@Test
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
			});
	}
	
	// Test case to verify if the ID is null
	@Test
	void testIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
			});
	}
	
	// Test case to verify if the first name length exceeds the maximum allowed length
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234", "Paul Anthony Stephan", "Stephan", "5134352820" , "Cincinnati,OH");
			});
	}
	
	// Test case to verify if the first name is null
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234", null, "Stephan", "5134352820" , "Cincinnati,OH");
			});
	}
	
	// Test case to verify if the last name length exceeds the maximum allowed length
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234", "Paul", "Paul Anthony Stephan", "5134352820" , "Cincinnati,OH");
			});
	}
	
	// Test case to verify if the last name is null
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234", "Paul", null, "5134352820" , "Cincinnati,OH");
			});
	}
	
	// Test case to verify if the phone number format is valid
	@Test
	void testNumberNotTen() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234", "Paul", "Stephan", "513-435-2820" , "Cincinnati,OH");
			});
	}
	
	// Test case to verify if the phone number is null
	@Test
	void testNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234", "Paul", "Stephan", null , "Cincinnati,OH");
			});
	}
	
	// Test case to verify if the address length exceeds the maximum allowed length
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234", "Paul", "Stephan", "5134352820" , "1323 Avon Drive,Cincinnati,OH,USA,North America, Earth.");
			});
	}
	
	// Test case to verify if the address is null
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234", "Paul", "Stephan", "5134352820" ,null);
			});
	}
}
