package com.endava.java2023.repository;

import com.endava.java2023.repository.modelDBO.Event;
import com.endava.java2023.repository.modelDBO.Venue;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VenueRepository implements CrudRepository<Venue, Long> {

    private List<Venue> venues;

    public List<Venue> getVenues() {return venues;}

    public VenueRepository(){
        System.out.println("Creating VenueRepository");
        venues = new ArrayList<>();
    }

    //TODO implement-uri

    @Override
    public <S extends Venue> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Venue> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Venue> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Venue> findAll() {
        return null;
    }

    @Override
    public Iterable<Venue> findAllById(Iterable<Long> longs) {
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
    public void delete(Venue entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Venue> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
