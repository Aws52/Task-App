package com.aws.task.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aws.task.domain.enitiy.Task;

public interface TaskRepository extends JpaRepository<Task, UUID> {

}
