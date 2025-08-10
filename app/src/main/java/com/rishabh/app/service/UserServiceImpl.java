package com.rishabh.app.service;

import com.rishabh.app.repo.UserRepo;
import com.rishabh.app.model.UserType;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepo repo;

    @Override
    public UserType addUser(UserType user) {
        UserType u = new UserType();
        System.out.print(user.getUserId());
        return repo.save(user);
    }
}
