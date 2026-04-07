package com.aws.task.domain.dto;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;

import com.aws.task.domain.entity.TaskPriority;
import com.aws.task.domain.entity.TaskStatus;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UpdateTaskRequestDto(
    @NotBlank(message = ERROR_MESSAGE_TITLE_LENGTH)
    @Length(max = 255, message = ERROR_MESSAGE_TITLE_LENGTH)
    String title,
    @Length(max = 1000, message = ERROR_MESSAGE_DESCRIPTION_LENGTH)
    @Nullable
    String description,
    @FutureOrPresent(message = ERROR_MESSAGE_DUEDATE_FUTURE)
    @Nullable
    LocalDate dueDate,
    @NotNull(message = ERROR_MESSAGE_PRIORITY_NULL)
    TaskPriority priority,
    @NotNull(message = ERROR_MESSAGE_STATUS_NULL)
    TaskStatus status
) {
    private static final String ERROR_MESSAGE_TITLE_LENGTH = 
        "Title must be between 1 and 255 characters.";

    private static final String ERROR_MESSAGE_DESCRIPTION_LENGTH =
        "Description must be between 1 and 1000 characters.";

    private static final String ERROR_MESSAGE_DUEDATE_FUTURE = 
        "Due date must be in the present or future.";

    private static final String ERROR_MESSAGE_PRIORITY_NULL = 
        "Priority must not be null.";

    private static final String ERROR_MESSAGE_STATUS_NULL = 
        "Status must not be null.";
}
