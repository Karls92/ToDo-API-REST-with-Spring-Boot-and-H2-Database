package com.softwaredevone.todolist.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.softwaredevone.todolist.persistence.entity.Task;
import com.softwaredevone.todolist.persistence.entity.TaskStatus;

public interface TaskRepository extends JpaRepository<Task, Long> {
	
	public List<Task> findAllByTaskStatus(TaskStatus taskStatus);
	
	@Modifying
	@Query(value = "UPDATE TASK SET FINISHED=true WHERE ID=:id", nativeQuery = true)
	public void markTaskAsFinished(@Param("id") Long id);
}
