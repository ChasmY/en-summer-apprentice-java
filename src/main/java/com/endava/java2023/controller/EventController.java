package com.endava.java2023.controller;

import com.endava.java2023.repository.EventRepository;
import com.endava.java2023.repository.OrderRepository;
import com.endava.java2023.repository.modelDBO.Order;
import com.endava.java2023.service.EventService;
import com.endava.java2023.service.EventServiceImp;
import com.endava.java2023.service.modelDTO.EventDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")

public class EventController{


    @Autowired
    EventServiceImp eventService;

    public EventController(EventServiceImp eventService){
        this.eventService = eventService;
    }
    @RequestMapping(value = "/all",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.GET)
    public List<EventDto> getEvents(){
        System.out.println("Request/events");
        return eventService.getEvents();
    }
    @GetMapping(value = "/event/{eventType}")
    public EventDto findByEventName(@PathVariable String eventType){
        System.out.println("Request event/eventType");
        return eventService.getEvent(eventType);
    }

    @GetMapping(value = "/specific")
    public List<EventDto> findByVenueIdAndEventType(@RequestParam int venueId, @RequestParam String eventType){
        System.out.println("Request event/" + venueId + ' ' + eventType);
        return eventService.getEventByVenueIdAndEventType(venueId, eventType);
    }
}
