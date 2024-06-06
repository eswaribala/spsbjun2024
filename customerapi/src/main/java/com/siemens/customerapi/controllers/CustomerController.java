package com.siemens.customerapi.controllers;

import com.siemens.customerapi.dtos.ResponseWrapper;
import com.siemens.customerapi.models.Customer;
import com.siemens.customerapi.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    //create customer

    @PostMapping("/v1.0")
    public ResponseEntity<ResponseWrapper> createCustomer(@RequestBody Customer customer){
        Customer customerObj=this.customerService.addCustomer(customer);
        if(customerObj!=null){
            return ResponseEntity.status(201).body(new ResponseWrapper(customerObj));
        }else{
            return ResponseEntity.status(400).body(new ResponseWrapper("Customer could not be created"));
        }

    }



}
