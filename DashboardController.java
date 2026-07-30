package com.dhanush.scheduler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dhanush.scheduler.service.DashboardService;

@Controller
public class DashboardController {

    @Autowired
    DashboardService service;

    @GetMapping("/analytics")
    public String dashboard(Model model){

        model.addAttribute("totalTasks",service.totalTasks());

        return "analytics";

    }

}
