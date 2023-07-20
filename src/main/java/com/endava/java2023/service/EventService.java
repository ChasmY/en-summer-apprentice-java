package com.endava.java2023.service;

import com.endava.java2023.service.modelDTO.EventDto;

import java.util.List;

public interface EventService {

//    public EventDto getEvent(String name);
    public List<EventDto> getEvents();
}
