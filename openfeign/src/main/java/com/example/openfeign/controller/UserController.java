package com.example.openfeign.controller;

import com.example.openfeign.domain.User;
import com.example.openfeign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/openfeign")
    public List<User> users(){
       return userService.list();
    }
}
