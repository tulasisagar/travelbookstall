package com.travelbookstall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/india")
    public String india() {
        return "india";
    }

    @GetMapping("/andhra")
    public String andhra() {
        return "andhra";
    }

    @GetMapping("/anantapur")
    public String anantapur() {
        return "anantapur";
    }
}
