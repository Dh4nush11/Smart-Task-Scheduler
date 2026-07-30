package com.dhanush.scheduler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.dhanush.scheduler.entity.User;
import com.dhanush.scheduler.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/login")
    public String loginPage(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @GetMapping("/register")
    public String registerPage(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user){
        service.register(user);
        return "redirect:/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password){

        User user = service.login(email,password);

        if(user != null){
            return "redirect:/dashboard";
        }

        return "redirect:/login?error";
    }

}
