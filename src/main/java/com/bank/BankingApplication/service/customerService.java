package com.bank.BankingApplication.service;

import com.bank.BankingApplication.model.Customer;
import com.bank.BankingApplication.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class customerService {
    @Autowired
    private CustomerRepository customerrepository;
    public List<Customer> getCustomer()
    {
        return customerrepository.getAllCustomers();
    }
    public void addCustomer(Customer customer)
    {
        customerrepository.addCustomer(customer);
    }
    public void updateCustomer(int customerId, Customer customer)
    {
        customerrepository.updateCustomer(customerId, customer);
    }
    public void deleteCustomer(int customerId)
    {
        customerrepository.deleteCustomer(customerId);
    }
}
