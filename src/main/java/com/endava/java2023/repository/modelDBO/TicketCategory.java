package com.endava.java2023.repository.modelDBO;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TicketCategorys")
public class TicketCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketCategoryId;


    @ManyToOne(fetch=FetchType.LAZY)
    @JsonManagedReference
    @JoinColumn(name = "eventId")
    private Event eventId;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private float price;

    public int getTicketCategoryId() {
        return ticketCategoryId;
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
