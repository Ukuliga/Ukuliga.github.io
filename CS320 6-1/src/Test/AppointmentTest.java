/*
File: AppointmentTest.java
Author: Paul Stephan
Version: 1.0
Date: February 13, 2024

Description:
This class contains test cases for the Appointment class. It validates the functionality and constraints of the Appointment class.
*/

package Test;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Appointment.Appointment;

class AppointmentTest {
	
	// Test case to verify the functionality of the Task class
	@Test
	void testTaskClass() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2025-06-15");
		Appointment appointment = new Appointment("1234", appointmentDate, "Complete this before doing anything else.");
		assertTrue(appointment.getId().equals("1234"));
		assertTrue(appointment.getDate().equals(appointmentDate));
		assertTrue(appointment.getDescription().equals("Complete this before doing anything else."));
	}

	// Test case to verify if the ID length exceeds the maximum allowed length
	@Test
	void testIdTooLong() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2025-06-15");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678901",  appointmentDate, "Complete this before doing anything else.");
			});
	}
	
	// Test case to verify if the ID is null
	@Test
	void testIdNull() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2025-06-15");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null,  appointmentDate, "Complete this before doing anything else.");
			});
	}
	
	// Test case to verify if the appointment date is before the current date
	@Test
	void testDateTooEarly() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2021-06-15");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", appointmentDate,"Complete this before doing anything else.");
			});
	}
	
	// Test case to verify if the appointment date is null
	@Test
	void testDateNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", null,"Complete this before doing anything else.");
			});
	}
	
	// Test case to verify if the description length exceeds the maximum allowed length
	@Test
	void testDescriptionTooLong() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2025-06-15");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678901", appointmentDate,"Complete this before doing anything else. It will be necessary in order to complete the next task in the series");
			});
	}
	
	// Test case to verify if the description is null
	@Test
	void testDescriptionNull() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2025-06-15");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", appointmentDate,null);
			});
	}
}
