package com.converter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping ("home")
    public String home () {
        return "home";
    }

    @PostMapping
    public String login () {
        if (false) {
            return "errorLogin";
        } else return "userDetails";
    }
}
