package com.endava.java2023.service;

import com.endava.java2023.repository.EventsRepository;
import com.endava.java2023.repository.model.Events;
import com.endava.java2023.service.mapper.EventToEventDtoMapper;
import com.endava.java2023.service.modelDTO.EventDto;

import java.util.List;
import java.util.stream.Collectors;

public class EventsServiceImp implements EventsService{

    private EventsRepository eventsRepository;

    public EventsServiceImp(EventsRepository eventsRepo){
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
