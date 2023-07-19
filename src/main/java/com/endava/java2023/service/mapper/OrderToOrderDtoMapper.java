package com.endava.java2023.service.mapper;

import com.endava.java2023.repository.modelDBO.Order;
import com.endava.java2023.service.modelDTO.OrderDto;

public class OrderToOrderDtoMapper {

    public static OrderDto convert(Order order){

        return new OrderDto(order.getOrderId(), order.getCustomerId(), order.getTicketCategoryId(), order.getNumberOfTickets()
        ,order.getOrderedAt(), order.getTotalPrice());
    }

}
