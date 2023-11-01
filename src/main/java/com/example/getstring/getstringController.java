package com.example.getstring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class getstringController {
    @GetMapping("/")
    public String helloWorld() {
        return "Welcome to Spring Boot";
    }
}