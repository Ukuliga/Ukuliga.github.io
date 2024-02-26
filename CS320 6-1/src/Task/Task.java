/*
File: Task.java
Author: Paul Stephan
Version: 1.0
Date: February 13, 2024

Description:
This class represents a task with details such as ID, name, and description.
*/

package Task;

public class Task {
	
	// Attributes of the Task class
	private String id;
	private String name;
	private String description;
	
	// Constructor to initialize the task object with id, name, and description
	public Task(String id, String name, String description) {
		// Validation checks for the input parameters
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid id");
		}
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid Name");
		}
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		// Assign values to attributes
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	// Getter method for retrieving the task ID
	public String getId() {
		return id;
	}
	
	// Getter method for retrieving the task name
	public String getName() {
		return name;
	}
	
	// Setter method for updating the task name
	public void setName(String name) {
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid Name");
		}
		this.name = name;
	}
	
	// Getter method for retrieving the task description
	public String getDescription() {
		return description;
	}
	
	// Setter method for updating the task description
	public void setDescription(String description) {
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		this.description = description;
	}
}
