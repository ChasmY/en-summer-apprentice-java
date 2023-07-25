package com.endava.java2023.service;

import com.endava.java2023.repository.modelDBO.NewOrder;
import com.endava.java2023.repository.modelDBO.Order;
//import com.endava.java2023.service.modelDTO.CustomOrderDto;
import com.endava.java2023.service.modelDTO.OrderDto;

import java.util.List;

public interface OrderService {

    public OrderDto getOrder(int OrdersId);
    public List<OrderDto> getOrders();

    public OrderDto postOrder(NewOrder newOrder);
    public OrderDto createOrder(OrderDto orderDto);

}
