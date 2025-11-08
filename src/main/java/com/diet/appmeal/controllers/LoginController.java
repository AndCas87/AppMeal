package com.diet.appmeal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

@GetMapping("/login")
public String getLogin(Model model) {
    return "login";
}

@PostMappinging("/login")
public String goToWelcomePage(@RequestParam String name,@RequestParam String password,ModelMap map) {
    return "login";
}


}
