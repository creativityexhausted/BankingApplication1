package com.bank.BankingApplication.model;

public class Customer {
    private Integer customerId;
    private String customerName;
    private String email;
    private String mobileNo;
    public Customer()
    {

    }
    public Customer(Integer customerId, String customerName, String email, String mobileNo) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}

