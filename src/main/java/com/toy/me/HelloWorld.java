package com.toy.me;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class HelloWorld {

    @GetMapping("/app")
    public String appTest() {
        return "App";
    }
}
