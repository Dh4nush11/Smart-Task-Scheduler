package com.dhanush.scheduler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.dhanush.scheduler.entity.Task;
import com.dhanush.scheduler.service.TaskService;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping
    public String viewTasks(Model model){

        model.addAttribute("tasks",service.getAllTasks());

        return "tasks";
    }

    @GetMapping("/new")
    public String addTask(Model model){

        model.addAttribute("task",new Task());

        return "create-task";
    }

    @PostMapping("/save")
    public String saveTask(@ModelAttribute Task task){

        service.saveTask(task);

        return "redirect:/tasks";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){

        service.deleteTask(id);

        return "redirect:/tasks";
    }

}
