package com.dhanush.scheduler.scheduler;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.dhanush.scheduler.repository.TaskRepository;

@Service
public class SchedulerService {

    @Autowired
    private TaskRepository repository;

    @Scheduled(fixedRate = 60000)
    public void checkDueTasks(){

        repository.findAll().forEach(task ->{

            if(task.getDueDate()!=null &&
                    task.getDueDate().equals(LocalDate.now())){

                System.out.println("Reminder : "
                        +task.getTitle()+" is due today.");

            }

        });

    }

}
