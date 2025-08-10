package com.rishabh.app.controller;

import com.rishabh.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rishabh.app.model.UserType;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService serv;

    @PostMapping
    public UserType createUser(@RequestBody UserType user) {
        return serv.addUser(user);
    }
}
