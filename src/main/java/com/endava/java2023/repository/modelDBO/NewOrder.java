package com.endava.java2023.repository.modelDBO;

public class NewOrder {
        Integer eventID;
        Long ticketCategoryId;
    Integer numberOfTickets;

        public Integer getEventID() {
            return eventID;
        }

        public void setEventID(Integer eventID) {
            this.eventID = eventID;
        }

        public Long getTicketCategoryId() {
            return ticketCategoryId;
        }

        public void setTicketCategoryId(Long ticketCategoryId) {
            this.ticketCategoryId = ticketCategoryId;
        }

        public Integer getNumberOfTickets() {
            return numberOfTickets;
        }

        public void setNumberOfTickets(Integer numberOfTickets) {
            this.numberOfTickets = numberOfTickets;
        }

        public NewOrder(Integer eventID, Long ticketCategoryId, Integer numberOfTickets) {
            this.eventID = eventID;
            this.ticketCategoryId = ticketCategoryId;
            this.numberOfTickets = numberOfTickets;
        }
}
