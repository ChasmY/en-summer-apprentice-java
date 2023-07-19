package com.endava.java2023.repository;

import com.endava.java2023.repository.model.Customer;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CustomerRepository {
    private List<Customer> customers;

    public CustomerRepository(){
        System.out.println("Creating AccountRepo");
        customers = new ArrayList<>();
        customers.add(new Customer(123, "a", "31232"));
        customers.add(new Customer(124, "b", "eaqwe"));
    }
    public List<Customer> getCustomers(){
        return customers;
    }

    public Customer getCustomer(int customerId){
        Optional<Customer> customer = customers.stream().filter(a-> customerId == a.getCustomerId()).findFirst();
        if(customer.isPresent()){
            return customer.get();
        }
        return null;
    }
}
