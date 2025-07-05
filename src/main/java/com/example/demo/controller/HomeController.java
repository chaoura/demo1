package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@RequestMapping ("/p1")
    public String m1(){
        return "welcome to fes";


    }
    @RequestMapping ("/p2")

    public String m2(){
        return "welcome to tanger";


    }
}
