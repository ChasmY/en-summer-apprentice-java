package com.endava.java2023.service;

import com.endava.java2023.repository.OrderRepository;
import com.endava.java2023.repository.model.Orders;

import java.util.List;

public class OrderServiceImp implements OrderService{

    private OrderRepository orderRepository;

    public OrderServiceImp(OrderRepository orderRepo){
        this.orderRepository = orderRepo;
        System.out.println(orderRepo);
        System.out.println("Creating order servce");
    }

    @Override
    public Orders getOrder(int ordersId) {
        return orderRepository.getOrder(ordersId);
    }

    @Override
    public List<Orders> getOrders() {
        return orderRepository.getOrders();
    }
}
