package com.rajat.cloudgateway.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackRestController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallbackMethod(){
        return "User service is down..!";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallbackMethod(){
        return "Department service is down..!";
    }
}
