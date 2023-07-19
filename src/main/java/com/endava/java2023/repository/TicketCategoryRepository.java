package com.endava.java2023.repository;

import com.endava.java2023.repository.modelDBO.TicketCategory;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TicketCategoryRepository implements CrudRepository<TicketCategory, Long> {

    private List<TicketCategory> tickets;

    public List<TicketCategory> getTickets() {return tickets;}

    public TicketCategoryRepository(){
        System.out.println("Creating TicketCategoryRepository");
        tickets = new ArrayList<>();
    }

    //TODO implement-uri

    @Override
    public <S extends TicketCategory> S save(S entity) {
        return null;
    }

    @Override
    public <S extends TicketCategory> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<TicketCategory> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<TicketCategory> findAll() {
        return null;
    }

    @Override
    public Iterable<TicketCategory> findAllById(Iterable<Long> longs) {
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
    public void delete(TicketCategory entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends TicketCategory> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
