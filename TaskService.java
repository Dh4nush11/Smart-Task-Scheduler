package com.dhanush.scheduler.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhanush.scheduler.entity.Task;
import com.dhanush.scheduler.repository.TaskRepository;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task saveTask(Task task) {
        return repository.save(task);
    }

    public Task getTaskById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
}
