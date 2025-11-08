package com.diet.appmeal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    private String saluti = "Sono la tua prima applicazione web";

    @GetMapping("/") // root webapp
    public String getWelcome(Model model) {
        model.addAttribute("intestazione", "Benvenuti");
        model.addAttribute("saluti", saluti);

        return "index";
    }

    @GetMapping("index") // root webapp
    public String getWelcome2(Model model,@RequestParam("name") String name) {
        model.addAttribute("intestazione", String.format( "Benvenuto %s nell'index page",name));
        model.addAttribute("saluti", saluti);

        return "index";
    }
}
