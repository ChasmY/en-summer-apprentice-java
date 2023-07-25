package com.endava.java2023.repository.modelDBO;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TicketCategory")
public class TicketCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne(fetch=FetchType.LAZY)
    @JsonManagedReference
    @JoinColumn(name = "eventId")
    private Event eventId;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private float price;

    public Integer getTicketCategoryId() {
        return id;
    }

    public Event getEventId() {
        return eventId;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public TicketCategory(){}
}
