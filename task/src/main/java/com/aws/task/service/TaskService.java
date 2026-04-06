package com.aws.task.service;

import java.util.List;

import com.aws.task.domain.CreateTaskRequest;
import com.aws.task.domain.entity.Task;

public interface TaskService {

    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();

}
