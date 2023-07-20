package com.endava.java2023.service.modelDTO;

import com.endava.java2023.repository.modelDBO.Customer;
import com.endava.java2023.repository.modelDBO.TicketCategory;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;

@JsonSerialize
public class OrderDto {


    private int id;


    private Customer customer;


    private TicketCategory ticketCategory;



    private int numberOfTickets;


    private LocalDateTime orderedAt;

    private float totalPrice;


    public int getId(){return id;}

    public void setId(int id){this.id = id;}

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public OrderDto(int id, Customer customer, TicketCategory ticketCategory,
                    int numberOfTickets, LocalDateTime orderedAt, float totalPrice) {
        this.id = id;
        this.customer = customer;
        this.ticketCategory = ticketCategory;
        this.numberOfTickets = numberOfTickets;
        this.orderedAt = orderedAt;
        this.totalPrice = totalPrice;
    }

    public OrderDto(){}
}
