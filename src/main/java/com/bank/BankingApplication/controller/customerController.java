package com.bank.BankingApplication.controller;

import com.bank.BankingApplication.model.Customer;
import com.bank.BankingApplication.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class customerController {

    @Autowired
    private customerService customerservice;

    @GetMapping("/customer")
    public List<Customer> getcustomer()
    {
        return customerservice.getCustomer();
    }
    @PostMapping("/customers")
    public String addCustomer(@RequestBody Customer customer)
    {
        customerservice.addCustomer(customer);
        return "Customer added successfully";

    }
    @PutMapping("/customers/{customerId}")
    public String updateCustomer(@PathVariable int customerId, @RequestBody Customer customer)
    {
        customerservice.updateCustomer(customerId, customer);
        return "Customer updated successfully";
    }

}
