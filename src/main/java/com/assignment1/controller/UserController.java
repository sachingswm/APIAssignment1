package com.assignment1.controller;

import com.assignment1.entities.User;
import com.assignment1.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/saveUser")
    public String register(@RequestBody User user)
    {
        System.out.println(user);
        userService.saveUser(new User(user.getFirstName(),user.getLastName(),user.getEmail(),bCryptPasswordEncoder.encode(user.getPassword()), user.getRole()));
        return "";
    }


}
