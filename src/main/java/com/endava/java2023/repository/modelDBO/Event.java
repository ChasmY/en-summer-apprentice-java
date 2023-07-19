package com.endava.java2023.repository.modelDBO;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "Events")
public class Event implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventId;

    @ManyToOne
    @JoinColumn(name = "venueId", referencedColumnName = "id")
    private Venue venue;

    @ManyToOne
    @JoinColumn(name = "eventTypeId", referencedColumnName = "id")
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

    public Event(){}
}
