package com.endava.java2023.service;

import com.endava.java2023.repository.EventRepository;
import com.endava.java2023.service.mapper.EventToEventDtoMapper;
import com.endava.java2023.service.modelDTO.EventDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImp implements EventService {

    @Autowired
    private EventRepository eventsRepository;


    @Autowired
    public EventServiceImp(EventRepository eventsRepo){
        this.eventsRepository = eventsRepo;
        System.out.println(eventsRepository);
        System.out.println("Creating event service");
    }


    @Override
    public EventDto getEvent(String name) {
         return EventToEventDtoMapper.convert(eventsRepository.findByEventName(name));

    }

    @Override
    public List<EventDto> getEvents() {
        return eventsRepository.findAll().stream().map(EventToEventDtoMapper::convert).collect(Collectors.toList());
    }

    @Override
    public List<EventDto> getEventByVenueIdAndEventType(int venueId, String name) {
        return eventsRepository.findEventsByVenue_VenueIdAndEventType_Name(venueId, name).stream().map(EventToEventDtoMapper::convert).collect(Collectors.toList());
    }


}
