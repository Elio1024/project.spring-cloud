package com.example.user2.controller;


import com.example.user2.domain.User;
import com.example.user2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/user")
    public List<User> findAll(){
        System.err.println("user2");
        return userMapper.findAll();
    }
}
