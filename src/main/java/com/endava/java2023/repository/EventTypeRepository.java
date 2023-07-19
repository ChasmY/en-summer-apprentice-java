package com.endava.java2023.repository;

import com.endava.java2023.repository.modelDBO.Event;
import com.endava.java2023.repository.modelDBO.EventType;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EventTypeRepository implements CrudRepository<EventType, Long> {

    private List<Event> events;

    public EventTypeRepository(){
        System.out.println("Creating EventTypeRepo");
        events = new ArrayList<>();
    }

    public List<Event> getEvents() {
        return events;
    }

    //TODO implement-uri

    @Override
    public <S extends EventType> S save(S entity) {
        return null;
    }

    @Override
    public <S extends EventType> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<EventType> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<EventType> findAll() {
        return null;
    }

    @Override
    public Iterable<EventType> findAllById(Iterable<Long> longs) {
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
    public void delete(EventType entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends EventType> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
