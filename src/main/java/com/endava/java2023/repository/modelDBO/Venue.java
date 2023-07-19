package com.endava.java2023.repository.modelDBO;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Venues")
public class Venue implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int venueId;

    @Column(name = "location")
    private String location;

    @Column(name = "type")
    private String type;

    @Column(name = "capacity")
    private int capacity;

    public int getVenueId() {
        return venueId;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public Venue(){}
}
