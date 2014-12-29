/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.dao;

import com.beezas.dao.EventDates;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author yashwanth
 */
public class Ticket {

    @Autowired
    EventDates eventDates;

    String eDate;

    @Override
    public String toString() {
        return "Ticket{" + "eDate=" + eDate + ", ticketType=" + ticketType + ",  totalTickets=" + totalTickets + '}';
    }
    private int id;

    private String ticketType;
    private int totalTickets;

    // private String ticketDate;
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }

//    public void setTicketDate(String ticketDate){
//        this.ticketDate = ticketDate;
//    }
    public String getTicketType() {
        return ticketType;
    }

    public int getTotalTickets() {
        return totalTickets;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setEDate() {
        this.eDate = eventDates.getEventDates();
    }

    public String getEDate() {
        return eDate;
    }

}
