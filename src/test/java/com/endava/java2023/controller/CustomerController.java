package com.endava.java2023.controller;

import com.endava.java2023.repository.CustomerRepository;
import com.endava.java2023.repository.model.Customer;
import com.endava.java2023.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

public class CustomerController {

    private CustomerService customerService;

    @GetMapping("/api/account/{customerId}")
    public ResponseEntity<?> getCustomer(@PathVariable int customerId){
        if(customerService.getCustomer(customerId) != null)
            return new ResponseEntity<>(customerService.getCustomer(customerId), HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/api/accounts")
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }
}
