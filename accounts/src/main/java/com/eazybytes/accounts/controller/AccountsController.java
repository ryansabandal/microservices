package com.eazybytes.accounts.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AccountsController {
    @GetMapping("sayHello")
    
    public String sayHello(){
        return "Hello World";
    }
}
