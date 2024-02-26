/*
File: Appointment.java
Author: Paul Stephan
Version: 1.0
Date: February 13, 2024

Description:
This class represents an appointment with an ID, date, and description.
*/

package Appointment;

import java.util.Date;

public class Appointment {
	
	// Instance variables
	private String id;          // Appointment ID
	private Date date;          // Appointment date
	private String description; // Appointment description
	
	// Constructor
	public Appointment(String id, Date date, String description) {
		// Validation for id, date, and description
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid id");
		}
		if (date == null) {
			throw new IllegalArgumentException("Date field NULL");
		}
		if (date.before(new Date())) {
			throw new IllegalArgumentException("Appointment date is before today");
		}
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		// Initialize instance variables
		this.id = id;
		this.date = date;
		this.description = description;
	}
	
	// Getter method for ID
	public String getId() {
		return id;
	}
	
	// Getter method for date
	public Date getDate() {
		return date;
	}
	
	// Setter method for date
	public void setDate(Date date) {
		// Validation for date
		if (date == null || date.before(new Date())) {
			throw new IllegalArgumentException("Invalid Date");
		}
		this.date = date;
	}
	
	// Getter method for description
	public String getDescription() {
		return description;
	}
	
	// Setter method for description
	public void setDescription(String Description) {
		// Validation for description
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		this.description = Description;
	}
}
