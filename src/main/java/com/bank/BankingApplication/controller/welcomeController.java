package com.bank.BankingApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //notation which tells spring that it is a REST controller ie. handle hhtp request
public class welcomeController {
    @GetMapping("/welcome")
    public String welcome()
    {
        return "Welcome to HSBC Digital Banking";
    }
}
