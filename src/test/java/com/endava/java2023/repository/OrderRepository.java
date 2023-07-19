package com.endava.java2023.repository;

import com.endava.java2023.repository.model.Events;
import com.endava.java2023.repository.model.Orders;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderRepository {

    private List<Orders> orders;

    public OrderRepository(){
        System.out.println("Creating OrdersRepo");
        orders = new ArrayList<>();
        orders.add(new Orders(222));
        orders.add(new Orders(333));
    }

    public List<Orders> getOrders(){
        return orders;
    }

    public Orders getOrder(int orderId){
        Optional<Orders> order = orders.stream().filter(a->orderId == a.getOrderId()).findFirst();
        if(order.isPresent())
            return order.get();
        return null;
    }
}
