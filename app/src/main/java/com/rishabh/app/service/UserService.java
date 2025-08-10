package com.rishabh.app.service;

import com.rishabh.app.model.UserType;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    UserType addUser(UserType user);
}
