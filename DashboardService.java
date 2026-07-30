package com.dhanush.scheduler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhanush.scheduler.repository.TaskRepository;

@Service
public class DashboardService {

    @Autowired
    private TaskRepository repository;

    public long totalTasks(){

        return repository.count();

    }

}
