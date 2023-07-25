package com.endava.java2023.service;

import com.endava.java2023.service.modelDTO.EventDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventService {

    public EventDto getEvent(String name);
    public List<EventDto> getEvents();

    public List<EventDto> getEventByVenueIdAndEventType(int venueId, String name);
}
