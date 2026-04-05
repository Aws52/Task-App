package com.aws.task.mapper.impl;

import org.springframework.stereotype.Component;

import com.aws.task.domain.CreateTaskRequest;
import com.aws.task.domain.dto.CreateTaskRequestDto;
import com.aws.task.domain.dto.TaskDto;
import com.aws.task.domain.enitiy.Task;
import com.aws.task.mapper.TaskMapper;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public CreateTaskRequest fromDto(CreateTaskRequestDto dto) {
        return new CreateTaskRequest(
            dto.title(),
            dto.description(),
            dto.dueDate(),
            dto.priority()
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
            task.getId(),
            task.getTitle(),
            task.getDescription(),
            task.getDueDate(),
            task.getPriority(),
            task.getStatus()
        );
    }

}
