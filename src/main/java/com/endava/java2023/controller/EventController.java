package com.endava.java2023.controller;

import com.endava.java2023.repository.OrderRepository;
import com.endava.java2023.repository.modelDBO.Order;
import com.endava.java2023.service.EventServiceImp;
import com.endava.java2023.service.modelDTO.EventDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EventController {


    @Autowired
    EventServiceImp eventService;

    @RequestMapping(value = "/orders",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.GET)
    public List<EventDto> getOrders(){
        return eventService.getEvents();
    }

    @RequestMapping("/order/find/{resource}")
    public EventDto getOrder(@PathVariable int resource){
        return eventService.getEvent(resource);
    }
}
