package com.softwaredevone.todolist.persistence.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String description;
	private LocalDateTime createdDate;
	private LocalDateTime eta;
	private Boolean finished;
	private TaskStatus taskStatus;

	public Task() {		
	}
	
	public Task(Long id, String title, String description, LocalDateTime createdDate, LocalDateTime eta,
			Boolean finished, TaskStatus taskStatus) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.createdDate = createdDate;
		this.eta = eta;
		this.finished = finished;
		this.taskStatus = taskStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getEta() {
		return eta;
	}

	public void setEta(LocalDateTime eta) {
		this.eta = eta;
	}

	public Boolean getFinished() {
		return finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}

	public TaskStatus getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(TaskStatus taskStatus) {
		this.taskStatus = taskStatus;
	}
	
}


