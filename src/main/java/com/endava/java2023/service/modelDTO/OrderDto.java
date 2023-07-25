package com.endava.java2023.service.modelDTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;

@JsonSerialize
public class OrderDto {

    private Integer eventId;
    private LocalDateTime timeStamp;
    private Integer ticketCategory;
    private Integer numberOfTickets;
    private float totalPrice;

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(Integer ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public OrderDto(Integer eventId, LocalDateTime timeStamp,
                    Integer ticketCategory, Integer numberOfTickets, float totalPrice) {
        this.eventId = eventId;
        this.timeStamp = timeStamp;
        this.ticketCategory = ticketCategory;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }
}
