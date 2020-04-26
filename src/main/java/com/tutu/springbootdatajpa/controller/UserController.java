package com.tutu.springbootdatajpa.controller;

import com.tutu.springbootdatajpa.entity.User;
import com.tutu.springbootdatajpa.entity.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        User user = userRepository.findById(id).get();
        return user;
    }

    @GetMapping("/user")
    public User inserUser(User user) {
        User save = userRepository.save(user);
        return save;
    }
}
