package com.softwaredevone.todolist.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softwaredevone.todolist.persistence.entity.Task;
import com.softwaredevone.todolist.persistence.entity.TaskStatus;
import com.softwaredevone.todolist.service.TaskService;
import com.softwaredevone.todolist.service.dto.TaskInDTO;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	private final TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@GetMapping
	public List<Task> findAllTasks() {
		return this.taskService.findAllTasks();
	}
	
	@GetMapping("/status/{status}")
	public List<Task> findAllByTaskStatus(@PathVariable("status") TaskStatus status) {
		return this.taskService.findAllByTaskStatus(status);
	}
	
	@PostMapping
	public Task createTask(@RequestBody TaskInDTO taskInDto) {
		return this.taskService.createTask(taskInDto);
	}
	
	@PatchMapping("/mark_as_finished/{id}")
	public ResponseEntity<Void> markAsFinished(@PathVariable("id") Long id) {
		this.taskService.updateTaskAsFinished(id);
		return ResponseEntity.noContent().build(); //this return an HTTP state: 204
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteTask(@PathVariable("id") Long id) {
		this.taskService.deleteTask(id);
		return ResponseEntity.noContent().build(); //this return an HTTP state: 204
	}
	
}
