package com.endava.java2023.service;

import com.endava.java2023.repository.model.Events;
import com.endava.java2023.service.modelDTO.EventDto;

import java.util.List;

public interface EventsService {

    public EventDto getEvent(int eventId);
    public List<EventDto> getEvents();
}
