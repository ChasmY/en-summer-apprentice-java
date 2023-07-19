package com.endava.java2023.repository.modelDBO;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EventTypes")
public class EventType implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventTypeId;

    @Column(name = "name", unique = true)
    private String name;

    public int getEventTypeId() {
        return eventTypeId;
    }

    public String getName() {
        return name;
    }

    public EventType(){}
}
