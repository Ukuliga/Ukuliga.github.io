/*
File: TaskService.java
Author: Paul Stephan
Version: 1.0
Date: February 13, 2024

Description:
This class provides services for managing tasks. It allows adding, updating, and deleting tasks.
*/

package Task;

import java.util.HashMap;

import Task.Task;

public class TaskService {
	
	// HashMap to store tasks with their IDs as keys
    private static HashMap<String, Task> task_map = new HashMap<String, Task>();
    
    // Method to add a new task to the task map
    public static void addTask(String id, String name, String description) {
    	Task task = new Task(id, name, description); // Create a new task object
    	
    	// Check if the task ID already exists in the map
    	if(task_map.containsKey(id)) {
			throw new IllegalArgumentException("Id already exists");
		}
    	
    	// Add the task to the map
    	task_map.put(id, task);
		return;
    }
    
    // Method to delete a task from the task map
    public static void deleteTask(String id) {
    	// Check if the task ID exists in the map
    	if(!task_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exist");
		}
    	
    	// Remove the task from the map
    	task_map.remove(id);
    	return;
    }
    
    // Method to update the name of a task
    public static void setTaskName(String id, String name) {
    	// Check if the task ID exists in the map
    	if(!task_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exist");
		}
    	
    	// Update the name of the task
    	task_map.get(id).setName(name);
    	return;
    }
    
    // Method to update the description of a task
    public static void setTaskDescription(String id, String description) {
    	// Check if the task ID exists in the map
    	if(!task_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exist");
		}
    	
    	// Update the description of the task
    	task_map.get(id).setDescription(description);
    	return;
    }
    
    // Method to clear the task map (empty it)
    public static void clearMemory() {
    	task_map.clear();
    	return;
    }
}
