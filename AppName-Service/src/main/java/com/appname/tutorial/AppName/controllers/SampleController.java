package com.appname.tutorial.AppName.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/home")
public class SampleController
{
    @GetMapping
    public String healthCheck(){
        return "Hello Boss";
    }
}
