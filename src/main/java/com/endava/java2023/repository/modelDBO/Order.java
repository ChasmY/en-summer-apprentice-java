package com.endava.java2023.repository.modelDBO;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "Orders")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId")
    private int orderId;




    @ManyToOne(fetch=FetchType.EAGER)
    @JsonManagedReference
    @JoinColumn(name = "customerId", referencedColumnName = "customerId")
    private Customer customer;


    @ManyToOne(fetch=FetchType.EAGER)
    @JsonManagedReference
    @JoinColumn(name = "ticketCategoryId")
    private TicketCategory ticketCategory;


    @Column(name = "numberOfTickets")
    private Integer numberOfTickets;

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

    public Integer getNumberOfTickets() {return numberOfTickets;}

    public LocalDateTime getOrderedAt() {return orderedAt;}

    public float getTotalPrice() {return totalPrice;}

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Order(LocalDateTime localDateTime, Integer numberOfTickets, float totalPrice,
                 Customer customer, TicketCategory ticketCategory) {
        this.customer = customer;
        this.ticketCategory = ticketCategory;
        this.numberOfTickets = numberOfTickets;
        this.orderedAt = orderedAt;
        this.totalPrice = totalPrice;
    }
}


