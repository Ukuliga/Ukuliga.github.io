/*
File: ContactService.java
Author: Paul Stephan
Version: 1.0
Date: February 13, 2024

Description:
This class provides services for managing contacts. It allows adding, updating, and deleting contacts.
*/

package Contact;

import java.util.HashMap;
import Contact.Contact;

public class ContactService {
	
	// Creating an empty HashMap to store contacts
    private static HashMap<String, Contact> contact_map = new HashMap<String, Contact>();
    
    // Method to add a new contact
    public static void addContact(String id, String firstName, String lastName, String number, String address) {
    	// Create a new Contact object
    	Contact contact = new Contact(id, firstName, lastName, number, address);
    	
    	// Check if the contact ID already exists
    	if(contact_map.containsKey(id)) {
			throw new IllegalArgumentException("Id already exists");
		}
    	
    	// Add the contact to the HashMap
    	contact_map.put(id, contact);
		return;
    }
    
    // Method to delete a contact
    public static void deleteContact(String id) {
    	// Check if the contact ID exists
    	if(!contact_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exist");
		}
    	
    	// Remove the contact from the HashMap
    	contact_map.remove(id);
    	return;
    }
    
    // Method to set the first name of a contact
    public static void setContactFirstName(String id, String name) {
    	// Check if the contact ID exists
    	if(!contact_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exist");
		}
    	
    	// Update the first name of the contact
    	contact_map.get(id).setFirstName(name);
    	return;
    }
    
    // Method to set the last name of a contact
    public static void setContactLastName(String id, String name) {
    	// Check if the contact ID exists
    	if(!contact_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exist");
		}
    	
    	// Update the last name of the contact
    	contact_map.get(id).setLastName(name);
    	return;
    }
    
    // Method to set the phone number of a contact
    public static void setContactNumber(String id, String number) {
    	// Check if the contact ID exists
    	if(!contact_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exist");
		}
    	
    	// Update the phone number of the contact
    	contact_map.get(id).setPhoneNumber(number);
    	return;
    }
    
    // Method to set the address of a contact
    public static void setContactAddress(String id, String address) {
    	// Check if the contact ID exists
    	if(!contact_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exist");
		}
    	
    	// Update the address of the contact
    	contact_map.get(id).setAddress(address);
    	return;
    }
    
    // Method to clear the contact HashMap
    public static void clearMemory() {
    	contact_map.clear();
    	return;
    }
}
