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

    private EventRepository eventsRepository;


    @Autowired
    public EventServiceImp(EventRepository eventsRepo){
        this.eventsRepository = eventsRepo;
        System.out.println(eventsRepository);
        System.out.println("Creating event service");
    }


    @Override
    public EventDto getEvent(int eventId) {
        return EventToEventDtoMapper.convert(eventsRepository.getEvent(eventId));
    }

    @Override
    public List<EventDto> getEvents() {
        return eventsRepository.getEvents().stream().map(EventToEventDtoMapper::convert).collect(Collectors.toList());
    }
}
