package com.spring.insurance.controllers;

import com.spring.insurance.models.User;
import com.spring.insurance.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.logging.Logger;

@Controller
public class AuthController {

    private Logger logger = Logger.getLogger(AuthController.class.getName());

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registration";  //"registration.jsp"
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {
        try {
            logger.info("Registering user: " + user.getEmail());
            userService.register(user);
//            return "redirect:/login?success";
            return "registration";
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            return "registration";
        }
    }
}
