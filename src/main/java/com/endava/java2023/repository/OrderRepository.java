package com.endava.java2023.repository;

import com.endava.java2023.repository.modelDBO.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class OrderRepository implements CrudRepository<Order, Long> {

    private List<Order> orders;

    public OrderRepository(){
        System.out.println("Creating OrdersRepo");
        orders = new ArrayList<>();
    }

    public List<Order> getOrders(){
        return orders;
    }

    public Order getOrder(int orderId){
        Optional<Order> order = orders.stream().filter(a->orderId == a.getOrderId()).findFirst();
        if(order.isPresent())
            return order.get();
        return null;
    }

    //TODO implement-uri

    @Override
    public <S extends Order> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Order> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Order> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Order> findAll() {
        return null;
    }

    @Override
    public Iterable<Order> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Order entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Order> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
