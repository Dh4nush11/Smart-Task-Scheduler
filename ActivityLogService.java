package com.dhanush.scheduler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhanush.scheduler.entity.ActivityLog;
import com.dhanush.scheduler.repository.ActivityLogRepository;

@Service
public class ActivityLogService {

    @Autowired
    private ActivityLogRepository repository;

    public void save(String action){

        repository.save(new ActivityLog(action));

    }

}
