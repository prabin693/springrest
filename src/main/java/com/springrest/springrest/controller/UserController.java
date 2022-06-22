package com.springrest.springrest.controller;

import com.springrest.springrest.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    //get user
    @GetMapping("/user")
    public User getUser() {
        User user = new User();
        user.setId(1L);
        user.setName("John");
        return user;
    }

}
