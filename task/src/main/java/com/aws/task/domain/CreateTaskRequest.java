package com.aws.task.domain;

import java.time.LocalDate;

import com.aws.task.domain.enitiy.TaskPriority;

public record CreateTaskRequest(
    String title,
    String description,
    LocalDate dueDate,
    TaskPriority priority
) {

}
