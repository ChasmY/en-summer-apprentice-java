package com.endava.java2023.repository;

import com.endava.java2023.repository.modelDBO.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class CustomerRepository implements CrudRepository<Customer, Integer> {
    private List<Customer> customers;

    public CustomerRepository() {
        System.out.println("Creating AccountRepo");
        customers = new ArrayList<>();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomer(int customerId) {
        Optional<Customer> customer = customers.stream().filter(a -> customerId == a.getCustomerId()).findFirst();
        if (customer.isPresent()) {
            return customer.get();
        }
        return null;
    }

    @Override
    public <S extends Customer> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Customer> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Customer> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Customer> findAll() {
        return null;
    }

    @Override
    public Iterable<Customer> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Customer entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Customer> entities) {

    }

    @Override
    public void deleteAll() {

    }

    //TODO implements
}