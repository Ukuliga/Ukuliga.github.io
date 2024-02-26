/*
File: TaskTest.java
Author: Paul Stephan
Version: 1.0
Date: February 13, 2024

Description:
This class contains test cases for the Task class. It validates the functionality and constraints of the Task class.
*/

package Test;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Task.Task;

class TaskTest {
	
	// Test case to verify if the Task class initializes correctly
	@Test
	void testTaskClass() {
		Task task = new Task("1234", "first task", "Complete this before doing anything else.");
		assertTrue(task.getId().equals("1234"));
		assertTrue(task.getName().equals("first task"));
		assertTrue(task.getDescription().equals("Complete this before doing anything else."));
	}

	// Test case to verify if the ID length validation works
	@Test
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345678901", "first task","Complete this before doing anything else.");
			});
	}
	
	// Test case to verify if the ID null validation works
	@Test
	void testIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "first task","Complete this before doing anything else.");
			});
	}
	
	// Test case to verify if the name length validation works
	@Test
	void testNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", "first task available for this assignment","Complete this before doing anything else.");
			});
	}
	
	// Test case to verify if the name null validation works
	@Test
	void testNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", null,"Complete this before doing anything else.");
			});
	}
	
	// Test case to verify if the description length validation works
	@Test
	void testDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345678901", "first task","Complete this before doing anything else. It will be necessary in order to complete the next task in the series");
			});
	}
	
	// Test case to verify if the description null validation works
	@Test
	void testDesriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", "first task",null);
			});
	}
}
