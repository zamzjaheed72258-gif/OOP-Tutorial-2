package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello Guys";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "Gooodbye Springboot";
    }

    @GetMapping("/hi")
    public String hi() {
        return "hi Springboot";
    }
}
