package com.converter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping ("home")
    public String home () {
        return "home";
    }

    @PostMapping
    public ModelAndView login () {
        if (true) {
            ModelAndView modelAndView = new ModelAndView("errorLogin");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("userDetails");

            return modelAndView;
        }
    }
}
