package com.diet.appmeal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private String saluti = "Sono la tua prima applicazione web";

    @GetMapping("/") // root webapp
    public String getWelcome(Model model) {
        model.addAttribute("intestazione", "Benvenuti");
        model.addAttribute("saluti", saluti);

        return "index";
    }
}
