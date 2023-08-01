package com.endava.java2023.service.modelDTO;

import com.endava.java2023.repository.modelDBO.EventType;
import com.endava.java2023.repository.modelDBO.TicketCategory;
import com.endava.java2023.repository.modelDBO.Venue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;

@JsonSerialize
public class EventDto {
    private int id;

    private Venue venue;

    private EventType eventType;

    private String eventName;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String description;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventDto (int id, Venue venue, EventType eventType, String eventName, LocalDateTime startDate
            , LocalDateTime endDate, String description) {
        this.id = id;
        this.venue = venue;
        this.eventType = eventType;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    //de lucrat pe mai tarziu la constructor il intrebam pe daniel in alta zi

}
