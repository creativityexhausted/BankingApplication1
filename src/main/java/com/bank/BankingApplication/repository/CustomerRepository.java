package com.bank.BankingApplication.repository;

import com.bank.BankingApplication.RowMapper.CustomerRowMapper;
import com.bank.BankingApplication.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class CustomerRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Customer> getAllCustomers()
    {
        String sql="SELECT * FROM customer";
        return jdbcTemplate.query(sql,new CustomerRowMapper());
    }

    public void addCustomer(Customer customer)
    {
        String sql="INSERT INTO customer (customer_id,customer_name,email,mobile_number) VALUES(?,?,?,?)";
        jdbcTemplate.update(sql,customer.getCustomerId(),customer.getCustomerName(),customer.getEmail(),customer.getMobileNo());

    }
    public void updateCustomer(int customerId, Customer customer)
    {
        String sql="UPDATE customer SET customer_name=?, email=?, mobile_number=? WHERE customer_id=?";
        jdbcTemplate.update(sql,customer.getCustomerName(),customer.getEmail(),customer.getMobileNo(),customerId);
    }
    public void deleteCustomer(int customerId)
    {
        String sql="DELETE FROM customer WHERE customer_id=?";
        jdbcTemplate.update(sql,customerId);
    }
}
