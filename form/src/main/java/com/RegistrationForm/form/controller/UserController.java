package com.RegistrationForm.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.RegistrationForm.form.model.User;
import com.RegistrationForm.form.repository.UserRepository;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public String registerUser(@RequestParam String name, @RequestParam String email) {
        // Create and save user
        User user = new User(name, email);
        userRepository.save(user);
        
        // Redirect to success page
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String showSuccessPage() {
        return "success";
    }

    @GetMapping("/")
    public String showForm() {
        return "index";
    }
}

