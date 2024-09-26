package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
	
	@Value("${message}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }

}
