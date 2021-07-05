package com.example.eRegistrar.controller;

import com.example.eRegistrar.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


    @Controller
    public class HomePageController {

        @Autowired
        StudentRepository d;
        @GetMapping(value={"/","/home","/index","/eRegistrar/home"})
        public String showHomePage(){
            return "home/index";
        }

}
