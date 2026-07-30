package com.dhanush.scheduler.entity;

import jakarta.persistence.*;

@Entity
public class Dependency {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private Long taskId;

    private Long dependsOn;

    public Dependency(){}

    public Long getId(){ return id; }

    public Long getTaskId(){ return taskId; }

    public void setTaskId(Long taskId){
        this.taskId=taskId;
    }

    public Long getDependsOn(){
        return dependsOn;
    }

    public void setDependsOn(Long dependsOn){
        this.dependsOn=dependsOn;
    }

}
