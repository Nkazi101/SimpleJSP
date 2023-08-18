package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.Employees;
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

@GetMapping("/employees")
public String displayEmployees(Model model){
    List<Employees> employees = Arrays.asList(
        new Employees("Victoria"),
        new Employees("Mustafa"),
        new Employees("Gadiel")
        );

        model.addAttribute("employees", employees);

        return "employeelist";
}


}
