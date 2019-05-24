package com.converter.service;

import com.converter.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    static List<User> userArray = new ArrayList<>();

    static {
        User user1 = new User();
        user1.setAccount("user1");
        user1.setAge(11);
        user1.setEmail("user1@gmail.com");
        user1.setName("user1");
        user1.setPassword("123");
        userArray.add(user1);

        User user2 = new User();
        user2.setAccount("user2");
        user2.setAge(12);
        user2.setEmail("user2@gmail.com");
        user2.setName("user2");
        user2.setPassword("123");
        userArray.add(user2);

        User user3 = new User();
        user3.setAccount("user3");
        user3.setAge(13);
        user3.setEmail("user3@gmail.com");
        user3.setName("user3");
        user3.setPassword("123");
        userArray.add(user3);
    }

    public User Login () {
        return userArray.get(0);
    }
}
