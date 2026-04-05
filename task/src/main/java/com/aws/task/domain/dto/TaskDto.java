package com.aws.task.domain.dto;

import java.time.LocalDate;
import java.util.UUID;

import com.aws.task.domain.enitiy.TaskPriority;
import com.aws.task.domain.enitiy.TaskStatus;

public record TaskDto(
    UUID id,
    String title,
    String description,
    LocalDate dueDate,
    TaskPriority priority,
    TaskStatus status
) {
    
}
