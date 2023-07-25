package com.endava.java2023.controller;

import com.endava.java2023.repository.modelDBO.NewOrder;
import com.endava.java2023.service.OrderService;
import com.endava.java2023.service.modelDTO.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {


    @Autowired
    OrderService orderService;


    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }


    @RequestMapping(value = "/all",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.GET)
    public List<OrderDto> getOrders(){
        System.out.println("Request/orders");
        return orderService.getOrders();
    }

    @PostMapping(value = "/poster")
    public OrderDto postOrder(@RequestBody NewOrder newOrder){
        System.out.println("Executing post..");
        return orderService.postOrder(newOrder);
    }
}
