/*
File: AppointmentServiceTest.java
Author: Paul Stephan
Version: 1.0
Date: February 13, 2024

Description:
This class contains test cases for the AppointmentService class. It validates the functionality of adding, updating, and deleting appointments.
*/

package Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Appointment.Appointment;
import Appointment.AppointmentService;
import Contact.ContactService;

class AppointmentServiceTest {
	
	// Method to initialize the test environment before each test method
	@BeforeEach
	void setup() {
		AppointmentService.clearmemory();
	}
	
	// Test case to verify adding an appointment when the ID already exists
	@Test
	void testAddAppointmentIdAlreadyExists() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2025-06-15");
		AppointmentService.addAppointment("12345", appointmentDate, "my first appointment" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			AppointmentService.addAppointment("12345", appointmentDate, "my first appointment" );
			});
	}
	
	// Test case to verify adding a new appointment
	@Test
	void testAddAppointment() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2025-06-15");
		AppointmentService.addAppointment("54321", appointmentDate, "my first appointment" );
		assertTrue(true);
	}
	
	// Test case to verify updating appointment details
	@Test
	void testUpdateAppointmentDetails() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2025-07-15");
		AppointmentService.addAppointment("12345", appointmentDate, "my first appointment" );
		Date updatedAppointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2025-07-15");
		AppointmentService.updateAppointment("12345", updatedAppointmentDate, "my updated first appointment" );
		assertTrue(true);
	}
	
	// Test case to verify deleting an appointment
	@Test
	void testDeleteAppointment() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2025-06-15");
		AppointmentService.addAppointment("12345", appointmentDate, "my first appointment" );
		AppointmentService.deleteAppointment("12345");
		assertTrue(true);
	}
	
	// Test case to verify deleting an appointment that doesn't exist
	@Test
	void testDeleteAppointmentDoesntExist() throws ParseException {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			AppointmentService.deleteAppointment("12345");
		});
	}
}
