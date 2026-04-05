package com.aws.task.domain.dto;

import java.time.LocalDate;
import java.util.UUID;

import com.aws.task.domain.entity.TaskPriority;
import com.aws.task.domain.entity.TaskStatus;

public record TaskDto(
    UUID id,
    String title,
    String description,
    LocalDate dueDate,
    TaskPriority priority,
    TaskStatus status
) {
    
}
