package com.diet.appmeal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AlimentiController {

    @GetMapping("/alimenti")
    public String getAlimenti() {
        return "alimenti";
    }
    
}
