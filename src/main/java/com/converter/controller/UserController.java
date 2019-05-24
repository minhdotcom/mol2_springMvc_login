package com.converter.controller;

import com.converter.model.User;
import com.converter.service.UserService;
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
        User user = UserService.Login();
        if (false) {
            ModelAndView modelAndView = new ModelAndView("errorLogin");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("userDetails");
            modelAndView.addObject(user);
            return modelAndView;
        }
    }
}
