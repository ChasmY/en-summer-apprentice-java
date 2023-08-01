package com.endava.java2023.repository;

import com.endava.java2023.repository.modelDBO.Event;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    public Event findByEventName(String name);

    public Event findByEventType_name(String name);
    
//    public List<Event> findAllByVenue_VenueIdAndEventType_Name(int VenueId, String name);

    public List<Event> findEventsByVenue_VenueIdAndEventType_Name(int venueId, String name);
    public List<Event> findAll();
}