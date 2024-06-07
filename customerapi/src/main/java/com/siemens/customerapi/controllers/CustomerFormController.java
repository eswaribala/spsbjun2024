package com.siemens.customerapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerFormController {

    @GetMapping("/home")
    public String load(){
        return "home.html";
    }

}
