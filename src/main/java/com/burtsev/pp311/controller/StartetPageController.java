package com.burtsev.pp311.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartetPageController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
