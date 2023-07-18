package com.endava.java2023.service;

import com.endava.java2023.repository.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CustomerService {

    public Customer getCustomer(int customerId);


    public List<Customer> getCustomers();
}
