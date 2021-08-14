package com.stackroute.controller;

import org.springframework.web.bind.annotation.*;

/**
 * RestController annotation is used to create Restful web services using Spring MVC
 */
@RestController

/**
 * RequestMapping annotation maps HTTP requests to handler methods
 */
@RequestMapping(value = "/api/v1")
public class ServiceController {

    @GetMapping("/home")
    public String getMessage() {
        return "Welcome to Service App.";

    }
}