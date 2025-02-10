package com.hdoan.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping
    public String homeControllerHandler(){
        return "This is home controller";
    }

    @GetMapping("/home")
    public String homeControllerHandler2(){
        return "This is home controller 2";
    }

    @GetMapping("/codewithzosh")
    public String homeControllerHandle3r(){
        return "Hello codewithzosh";
    }
    //@PutMapping
    //@PostMapping
    //@DeleteMapping

}
