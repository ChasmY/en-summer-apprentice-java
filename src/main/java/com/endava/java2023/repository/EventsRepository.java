package com.endava.java2023.repository;

import com.endava.java2023.repository.model.Events;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EventsRepository {

    private List<Events> events;

    public EventsRepository(){
        System.out.println("Creating EventsRepo");
        events = new ArrayList<>();
        events.add(new Events(222));
        events.add(new Events(333));
    }

    public List<Events> getEvents() {return events;}
    public Events getEvent(int eventId){
        Optional<Events> event = events.stream().filter(a-> eventId == a.getEventId()).findFirst();
        if(event.isPresent())
            return event.get();
        return null;
    }
}
