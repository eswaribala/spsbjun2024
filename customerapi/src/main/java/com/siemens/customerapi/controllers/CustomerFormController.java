package com.siemens.customerapi.controllers;
import com.siemens.customerapi.models.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerFormController {

    @GetMapping("/home")
    public String load(Model model){
        model.addAttribute("customer", new Customer());
        return "home.html";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("customer") Customer customer){
        System.out.println(customer.getName().getFirstName());
        return "showcustomer.html";
    }

}
