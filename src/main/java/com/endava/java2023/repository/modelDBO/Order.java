package com.endava.java2023.repository.modelDBO;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "Orders")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int orderId;




    @ManyToOne(fetch=FetchType.LAZY)
    @JsonManagedReference
    @JoinColumn(name = "customerId", referencedColumnName = "id")
    private Customer customer;


    @ManyToOne(fetch=FetchType.LAZY)
    @JsonManagedReference
    @JoinColumn(name = "ticketCategoryId")
    private TicketCategory ticketCategory;


    @Column(name = "numberOfTickets")
    private int numberOfTickets;

    @Column(name = "orderedAt")
    private LocalDateTime orderedAt;

    @Column(name = "totalPrice")
    private float totalPrice;

    public Order(){}

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomerId() {return customer;}

    public TicketCategory getTicketCategoryId() {return ticketCategory;}

    public int getNumberOfTickets() {return numberOfTickets;}

    public LocalDateTime getOrderedAt() {return orderedAt;}

    public float getTotalPrice() {return totalPrice;}
}


