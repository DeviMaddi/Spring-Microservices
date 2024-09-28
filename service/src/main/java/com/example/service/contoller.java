package com.example.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class contoller {
    
    @GetMapping("/orderservicr/{price}")
    public String grtPrice(@PathVariable double price){
        return "hi, the price is" + price;
    }
}
