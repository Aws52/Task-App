package com.aws.task.mapper;

import com.aws.task.domain.CreateTaskRequest;
import com.aws.task.domain.dto.CreateTaskRequestDto;
import com.aws.task.domain.dto.TaskDto;
import com.aws.task.domain.entity.Task;

public interface TaskMapper {

    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

    TaskDto toDto(Task task);

}
