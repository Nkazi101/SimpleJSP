package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.User;

@Controller
public class UserController {
    
    @GetMapping("/hello")
public String helloForm(Model model){
    
    model.addAttribute("user", new User());
    return "hello";
}

@PostMapping("/hello")
public String helloSubmit(@ModelAttribute User user){
    
    return "response";
}


}
