package com.endava.java2023.repository.model;

public class Orders {

    private int orderId;

    public Orders(int orderId) {
        this.orderId = orderId;
        System.out.println("Order created");
    }

    public int getOrderId() {
        return orderId;
    }
}
