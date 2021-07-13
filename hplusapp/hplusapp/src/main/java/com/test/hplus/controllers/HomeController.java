package com.test.hplus.controllers;


import com.test.hplus.beans.Login;
import com.test.hplus.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String goHome(){
        System.out.println("in home controller");
        return "index";

    }

    @GetMapping("/goToSearch")
    public String goToSearch(){
        return "search";
    }

    @GetMapping("/goToLogin")
    public String goToLogin(){
        return "login";
    }

    @GetMapping("/goToRegistration")
    public String goToRegistration(){
        return "register";
    }

    /*@ModelAttribute("newuser")
    public User getDefaultUser(){
        return new User();

    }

    @ModelAttribute("genderItems")
    public List<String> getGenderItems(){
        return Arrays.asList(new String[]{"Male","Female","Other"});

    }

    @ModelAttribute("login")
    public Login getDefaultlogin() {
        return new Login();
    }*/
}
