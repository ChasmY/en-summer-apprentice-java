package com.endava.java2023.service.mapper;

import com.endava.java2023.repository.modelDBO.Order;
import com.endava.java2023.service.modelDTO.OrderDto;

public class OrderToOrderDtoMapper {

    public static OrderDto convert(Order order){
        return new OrderDto(
                order.getTicketCategoryId().getEventId().getEventId(),
                order.getOrderedAt(),
                order.getTicketCategoryId().getTicketCategoryId(),
                order.getNumberOfTickets(),
                order.getTotalPrice()
        );
    }

}
