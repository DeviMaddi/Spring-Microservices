package com.example.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controller {

    
    
    

    @GetMapping("/myshopping/{price}")
    public String getMethodName(@PathVariable double price) {
        RestTemplate rest = new RestTemplate();
        String URL = "http://service/orderservicr/" + "{price}";
        Map<String, String> params = new HashMap<>();
        params.put("id", String.valueOf(price));
        return rest.getForObject(URL, String.class, params);
    }
    
}
