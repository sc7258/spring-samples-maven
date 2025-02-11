package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld(@RequestParam(defaultValue = "Guest") String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/hello2")
    public String helloWorld2(@RequestParam(defaultValue = "Guest") String name) {
        return "Hello, " + name + "!";
    }

}
