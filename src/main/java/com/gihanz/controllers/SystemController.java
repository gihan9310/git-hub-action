package com.gihanz.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("")
@RestController
@CrossOrigin
public class SystemController {

    @GetMapping
    public String  welcomeMessage(){

        return "Welcome to jenkins !.";
    }
}
