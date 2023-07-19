package com.endava.java2023.repository.model;

//import org.springframework.http.HttpStatusCode;

public class Customer {

    private int customerId;

    private String name;

    private String email;

    public int getCustomerId(){
        return customerId;
    }

    public String getName() {return name;}

    public String getEmail() {return email;}

    public Customer(int customerId, String name, String email){
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        System.out.println("Account created");
    }
}
