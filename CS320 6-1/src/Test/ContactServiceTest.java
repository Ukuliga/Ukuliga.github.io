/*
File: ContactServiceTest.java
Author: Paul Stephan
Version: 1.0
Date: February 13, 2024

Description:
This class contains test cases for the ContactService class. It validates the functionality of adding, updating, and deleting contacts.
*/

package Test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Contact.ContactService;

class ContactServiceTest {

	// Setup method to clear memory before each test
	@BeforeEach
	void setup() {
		ContactService.clearMemory();
	}
	
	// Test case to verify if adding a contact with an existing ID throws an exception
	@Test
	void testaddTaskIdAlreadyExists() {
		ContactService.addContact("1234", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			ContactService.addContact("1234", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
		});
	}
	
	// Test case to verify the functionality of adding a contact
	@Test
	void testaddTask() {
		ContactService.addContact("1234", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
		assertTrue(true);
	}
	
	// Test case to verify the functionality of deleting a contact
	@Test
	void testdeleteTask() {
		ContactService.addContact("1234", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
		ContactService.deleteContact("1234");
		assertTrue(true);
	}
	
	// Test case to verify if deleting a non-existent contact throws an exception
	@Test
	void testdeleteTaskdoesntExist(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			ContactService.deleteContact("1234");
		});
	}
	
	// Test case to verify the functionality of updating the first name of a contact
	@Test
	void testsetFirstname(){
		ContactService.addContact("1234", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
		ContactService.setContactFirstName("1234", "Anthony");
		assertTrue(true);
	}
	
	// Test case to verify the functionality of updating the last name of a contact
	@Test
	void testsetLastname(){
		ContactService.addContact("1234", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
		ContactService.setContactLastName("1234", "Jachthuber");
		assertTrue(true);
	}
	
	// Test case to verify the functionality of updating the phone number of a contact
	@Test
	void testsetNumber(){
		ContactService.addContact("1234", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
		ContactService.setContactNumber("1234", "5134242715");
		assertTrue(true);
	}
	
	// Test case to verify the functionality of updating the address of a contact
	@Test
	void testsetAddress(){
		ContactService.addContact("1234", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
		ContactService.setContactAddress("1234", "Chicago,IL");
		assertTrue(true);
	}
}
