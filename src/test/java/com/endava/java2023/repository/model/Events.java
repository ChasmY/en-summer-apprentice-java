package com.endava.java2023.repository.model;

public class Events {

    private int eventId;

    public int getEventId(){return eventId;}

    public Events(int eventId){
        this.eventId = eventId;
        System.out.println("Event Created");
    }
}
