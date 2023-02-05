package com.softwaredevone.todolist.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaredevone.todolist.exceptions.ToDoExceptions;
import com.softwaredevone.todolist.mapper.TaskInDTOtoTask;
import com.softwaredevone.todolist.persistence.entity.Task;
import com.softwaredevone.todolist.persistence.entity.TaskStatus;
import com.softwaredevone.todolist.persistence.repository.TaskRepository;
import com.softwaredevone.todolist.service.dto.TaskInDTO;

@Service
public class TaskService {

	private final TaskRepository repository;
	private final TaskInDTOtoTask mapper;
	
	public TaskService(TaskRepository repository, TaskInDTOtoTask mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	
	public Task createTask(TaskInDTO taskInDto) {
		Task task = mapper.map(taskInDto);
		return this.repository.save(task);
	}
	
	@Transactional
	public void updateTaskAsFinished(Long id) {
		Optional<Task> optionalTask = this.repository.findById(id);
		if(optionalTask.isEmpty()) {
			throw new ToDoExceptions("Task not found", HttpStatus.NOT_FOUND);
		}
		this.repository.markTaskAsFinished(id);
	}
	
	public void deleteTask(Long id) {
		Optional<Task> optionalTask = this.repository.findById(id);
		if(optionalTask.isEmpty()) {
			throw new ToDoExceptions("Task not found", HttpStatus.NOT_FOUND);
		}	
		this.repository.deleteById(id);
	}
	
	public List<Task> findAllTasks() {
		return this.repository.findAll();
	}
	
	public List<Task> findAllByTaskStatus(TaskStatus status) {
		return this.repository.findAllByTaskStatus(status);
	}
}
