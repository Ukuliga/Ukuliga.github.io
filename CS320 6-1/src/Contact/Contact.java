/*
File: Contact.java
Author: Paul Stephan
Version: 1.0
Date: February 13, 2024

Description:
This class represents a contact with details such as ID, first name, last name, phone number, and address.
*/

package Contact;

public class Contact {
	
	// Instance variables
	private String id;          // Contact ID
	private String firstName;   // First name of the contact
	private String lastName;    // Last name of the contact
	private String phoneNumber; // Phone number of the contact
	private String address;     // Address of the contact
	
	// Constructor
	public Contact(String id, String firstName, String lastName, String phoneNumber, String address) {
		// Validation for id, firstName, lastName, phoneNumber, and address
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid id");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid number");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		// Initialize instance variables
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	// Getter methods
	public String getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	
	// Setter methods
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		this.lastName = lastName;
	}
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid phone Number");
		}
		this.phoneNumber = phoneNumber;
	}
	public void setAddress(String address) {
		if (address == null || address.length() != 10) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = address;
	}
}
