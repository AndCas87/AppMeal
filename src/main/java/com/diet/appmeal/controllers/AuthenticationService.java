package com.diet.appmeal.controllers;

import org.springframework.stereotype.Component;


@Component
public class AuthenticationService {

    public boolean auth(String user,String psw){
        
        boolean isValidUser = user.equals("Andrea");
        boolean isValidPsw = psw.endsWith("123");
        
        return isValidPsw && isValidUser; 
    }
}
