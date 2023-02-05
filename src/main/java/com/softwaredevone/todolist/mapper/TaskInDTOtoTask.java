package com.softwaredevone.todolist.mapper;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.softwaredevone.todolist.persistence.entity.Task;
import com.softwaredevone.todolist.persistence.entity.TaskStatus;
import com.softwaredevone.todolist.service.dto.TaskInDTO;

@Component
public class TaskInDTOtoTask implements IMapper<TaskInDTO, Task> {

	@Override
	public Task map(TaskInDTO in) {
		// TODO Auto-generated method stub
		
		Task task = new Task();
		task.setTitle(in.getTitle());
		task.setDescription(in.getDescription());
		task.setCreatedDate(LocalDateTime.now());
		task.setEta(in.getEta());
		task.setFinished(false);
		task.setTaskStatus(TaskStatus.ON_TIME);
		
		return task;
	}

}
