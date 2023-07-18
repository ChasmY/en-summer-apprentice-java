package com.endava.java2023.service;

import com.endava.java2023.repository.CustomerRepository;
import com.endava.java2023.repository.model.Customer;

import java.util.List;

//de facut interfata
public class CustomerServiceImp implements CustomerService {
    private CustomerRepository customerRepo;

    public CustomerServiceImp(CustomerRepository customerRepo){
        this.customerRepo = customerRepo;
        System.out.println(customerRepo);
        System.out.println("Creating customer service");
    }

    @Override
    public Customer getCustomer(int customerId) {
        return customerRepo.getCustomer(customerId);
    }

    @Override
    public List<Customer> getCustomers() {
        return  customerRepo.getCustomers();
    }


}
