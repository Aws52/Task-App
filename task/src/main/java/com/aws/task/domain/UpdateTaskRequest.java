package com.aws.task.domain;

import java.time.LocalDate;

import com.aws.task.domain.entity.TaskPriority;
import com.aws.task.domain.entity.TaskStatus;

public record UpdateTaskRequest(
    String title,
    String description,
    LocalDate dueDate,
    TaskStatus status,
    TaskPriority priority
) {

}
