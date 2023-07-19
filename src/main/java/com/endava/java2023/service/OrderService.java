package com.endava.java2023.service;

import com.endava.java2023.repository.model.Orders;

import java.util.List;

public interface OrderService {

    public Orders getOrder(int OrdersId);
    public List<Orders> getOrders();
}
