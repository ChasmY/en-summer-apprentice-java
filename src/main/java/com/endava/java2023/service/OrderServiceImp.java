package com.endava.java2023.service;

import com.endava.java2023.repository.OrderRepository;
import com.endava.java2023.repository.modelDBO.Order;
import com.endava.java2023.service.mapper.OrderToOrderDtoMapper;
import com.endava.java2023.service.modelDTO.OrderDto;

import java.util.List;
import java.util.stream.Collectors;

public class OrderServiceImp implements OrderService{

    private OrderRepository orderRepository;

    public OrderServiceImp(OrderRepository orderRepo){
        this.orderRepository = orderRepo;
        System.out.println(orderRepo);
        System.out.println("Creating order servce");
    }

    @Override
    public OrderDto getOrder(int ordersId) {
        return OrderToOrderDtoMapper.convert(orderRepository.getOrder(ordersId));
    }

    @Override
    public List<OrderDto> getOrders() {
        return orderRepository.getOrders().stream().map(OrderToOrderDtoMapper::convert).collect(Collectors.toList());
    }
}
