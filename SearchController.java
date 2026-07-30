package com.dhanush.scheduler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.dhanush.scheduler.repository.TaskRepository;

@Controller
public class SearchController {

    @Autowired
    TaskRepository repository;

    @GetMapping("/search")
    public String search(@RequestParam(required=false)
                         String keyword,
                         Model model){

        model.addAttribute("tasks",
                repository.findAll());

        return "search";

    }

}
