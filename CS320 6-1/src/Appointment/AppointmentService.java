/*
File: AppointmentService.java
Author: Paul Stephan
Version: 1.0
Date: February 13, 2024

Description:
This class provides services for managing appointments. It allows adding, updating, and deleting appointments.
*/

package Appointment;

import java.util.Date;
import java.util.HashMap;

public class AppointmentService {
	
	// HashMap to store appointments
    private static HashMap<String, Appointment> appointment_map = new HashMap<String, Appointment>();
    
    // Method to add a new appointment
    public static void addAppointment(String id, Date date, String description) {
    	// Create a new appointment object
    	Appointment appointment = new Appointment(id, date, description);
    	
    	// Check if the appointment ID already exists
    	if (appointment_map.containsKey(id)) {
			throw new IllegalArgumentException("Id already exists");
		}
		
		// Add the appointment to the HashMap
		appointment_map.put(id, appointment);
		return;
    }
    
    // Method to update an existing appointment
    public static void updateAppointment(String id, Date date, String description) {
    	// Create a new appointment object
    	Appointment appointment = new Appointment(id, date, description);
    	
    	// Check if the appointment ID exists
    	if (!appointment_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exist");
		}
		
		// Update the appointment in the HashMap
		appointment_map.put(id, appointment);
    	return;
    }
    
    // Method to delete an appointment
    public static void deleteAppointment(String id) {
    	// Check if the appointment ID exists
    	if (!appointment_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exist");
		}
		
		// Remove the appointment from the HashMap
		appointment_map.remove(id);
    	return;
    }
    
    // Method to clear all appointments from memory
    public static void clearmemory() {
    	appointment_map.clear();
    	return;
    }
}
