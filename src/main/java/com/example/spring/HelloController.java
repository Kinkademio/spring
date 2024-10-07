package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "I love to create Sites";
    }

    @GetMapping("/cabinet")
    public String cabinet() {
        return "U are in cabinet now!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Oh! How did you end up here? ";
    }

}