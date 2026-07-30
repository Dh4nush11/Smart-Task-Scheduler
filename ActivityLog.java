package com.dhanush.scheduler.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ActivityLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String action;

    private LocalDateTime time;

    public ActivityLog() {
        this.time = LocalDateTime.now();
    }

    public ActivityLog(String action){
        this.action = action;
        this.time = LocalDateTime.now();
    }

    public Long getId(){ return id; }

    public String getAction(){ return action; }

    public void setAction(String action){
        this.action = action;
    }

    public LocalDateTime getTime(){
        return time;
    }

}
