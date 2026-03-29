package com.example.taskmanager.service;

import com.example.taskmanager.entity.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    void addTask(Task task);

    List<Task> getAllTasks();

    Task updateTask(Task task);

    boolean deleteTaskById(Long id);

    Optional<Task> findTaskById(Long id);
}
