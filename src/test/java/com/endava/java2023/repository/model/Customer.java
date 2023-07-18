package com.endava.java2023.repository.model;

import org.springframework.http.HttpStatusCode;

public class Customer {

    private int customerId;

    public int getCustomerId(){
        return customerId;
    }

    public Customer(int customerId){
        this.customerId = customerId;
        System.out.println("Account created");
    }
}
