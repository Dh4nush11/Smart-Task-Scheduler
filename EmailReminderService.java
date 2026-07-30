package com.dhanush.scheduler.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class EmailReminderService {

    @Scheduled(cron="0 */2 * * * *")
    public void sendReminder(){

        System.out.println("Checking reminders...");

    }

}
