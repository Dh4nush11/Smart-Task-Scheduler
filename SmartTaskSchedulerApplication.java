package com.dhanush.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SmartTaskSchedulerApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                SmartTaskSchedulerApplication.class,
                args);

    }

}
