package com.example.users.controller;

import com.example.users.domain.User;
import com.example.users.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @Value("${spring.datasource.username}")
    private String username;

    @RequestMapping("/user")
    public List<User> findAll(){
        System.err.println("user1" + username);
        return userMapper.findAll();
    }
}
