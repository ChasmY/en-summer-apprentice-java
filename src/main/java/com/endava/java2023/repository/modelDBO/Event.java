package com.endava.java2023.repository.modelDBO;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "Events")
public class Event implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventId;

    @ManyToOne(fetch=FetchType.LAZY)
    @JsonManagedReference
    @JoinColumn(name = "venueId")
    private Venue venue;

    @ManyToOne(fetch=FetchType.LAZY)
    @JsonManagedReference
    @JoinColumn(name = "eventTypeId")
    private EventType eventType;

    @Column(name = "name")
    private String name;

    @Column(name = "startDate")
    private LocalDateTime startDate;

    @Column(name = "endDate")
    private LocalDateTime endDate;

    @Column(name = "description")
    private String description;

    public int getEventId(){return eventId;}

    public Venue getVenue() {
        return venue;
    }

    public EventType getEventTypeId() {
        return eventType;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Event(){}


}
