package com.aws.task.service;

import com.aws.task.domain.CreateTaskRequest;
import com.aws.task.domain.enitiy.Task;

public interface TaskService {

    Task createTask(CreateTaskRequest request);

}
