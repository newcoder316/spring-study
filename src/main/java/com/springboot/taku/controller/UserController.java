package com.springboot.taku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.taku.user.User;

@Controller
public class UserController {
	User user1 = new User();
	
    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register";
    }
    @PostMapping("/register")
    public String RegistrationForm(User user) {
    	System.out.println(user);
    	System.out.println(user.getUsername());
    	System.out.println(user.getPassword());
    	user1.setUsername(user.getUsername());
    	user1.setPassword(user.getPassword());
        return "redirect:/success";
    }
    
    @GetMapping("/success")
    public String success() {
        return "success";
    }
    
    
    
    
    
}
