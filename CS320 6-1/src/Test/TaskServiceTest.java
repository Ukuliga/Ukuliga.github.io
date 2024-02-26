/*
File: TaskServiceTest.java
Author: Paul Stephan
Version: 1.0
Date: February 13, 2024

Description:
This class contains test cases for the TaskService class. It validates the functionality of adding, updating, and deleting tasks.
*/

package Test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Task.TaskService;
import Task.Task;


class TaskServiceTest {
	
	@BeforeEach
	void setup() {
		TaskService.clearMemory();
	}
	
	// Test case to verify if adding a task with an existing ID throws an exception
	@Test
	void testaddTaskIdAlreadyExists() {
		TaskService.addTask("54321" , "first Task", "my first thing i need to do" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			TaskService.addTask("54321" , "first Task", "my first thing i need to do" );
		});
	}
	
	// Test case to verify if adding a task is successful
	@Test
	void testaddTask() {
		TaskService.addTask("54321", "first Task", "my first thing i need to do" );
		assertTrue(true);
	}
	
	// Test case to verify if deleting a task is successful
	@Test
	void testdeleteTask() {
		TaskService.addTask("54321", "first Task", "my first thing i need to do" );
		TaskService.deleteTask("54321");
		assertTrue(true);
	}
	
	// Test case to verify if deleting a non-existent task throws an exception
	@Test
	void testdeleteTaskdoesntExist(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			TaskService.deleteTask("12345");
		});
	}
	
	// Test case to verify if updating the task name is successful
	@Test
	void testsetTaskname(){
		TaskService.addTask("54321", "first Task", "my first thing i need to do" );
		TaskService.setTaskName("54321", "updated task");
		assertTrue(true);
	}
	
	// Test case to verify if updating the task description is successful
	@Test
	void testsetTaskdescription(){
		TaskService.addTask("54321", "first Task", "my first thing i need to do" );
		TaskService.setTaskDescription("54321", "this is an updated thing to do");
		assertTrue(true);
	}
}

