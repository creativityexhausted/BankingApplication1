package com.bank.BankingApplication.RowMapper;

import com.bank.BankingApplication.model.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRowMapper implements RowMapper<Customer> {
    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        Customer customer=new Customer();
        customer.setCustomerId(rs.getInt("customer_id"));
        customer.setCustomerName((rs.getString("customer_name")));
        customer.setEmail(rs.getString("email"));
        customer.setMobileNo(rs.getString("mobile_number"));
        return customer;
    }
}
