package com.endava.java2023.repository;

import com.endava.java2023.repository.modelDBO.Event;
import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EventRepository implements CrudRepository<Event, Long>{

    private List<Event> events;

    public EventRepository(){
        System.out.println("Creating EventsRepo");
        events = new ArrayList<>();
    }

    public List<Event> getEvents() {return events;}
    public Event getEvent(int eventId){
        Optional<Event> event = events.stream().filter(a-> eventId == a.getEventId()).findFirst();
        if(event.isPresent())
            return event.get();
        return null;
    }

    //TODO implement-uri

    @Override
    public <S extends Event> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Event> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Event> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Event> findAll() {
        return null;
    }

    @Override
    public Iterable<Event> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Event entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Event> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
