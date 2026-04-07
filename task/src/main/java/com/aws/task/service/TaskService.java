package com.aws.task.service;

import java.util.List;
import java.util.UUID;

import com.aws.task.domain.CreateTaskRequest;
import com.aws.task.domain.UpdateTaskRequest;
import com.aws.task.domain.entity.Task;

public interface TaskService {

    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();

    Task updateTask(UUID taskId, UpdateTaskRequest request);

    void deleteTask(UUID taskId);

}
