package com.hdoan.controller;

import com.hdoan.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        User user1 = new User("code", "zosh", "codewithzosh@gmail.com", "12345");
        User user2 = new User("raam", "arora", "raam@gmail.com", "12345");
        users.add(user1);
        users.add(user2);
        return users;
    }

}
