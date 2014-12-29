/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.dao;

import java.util.List;

/**
 *
 * @author yashwanth
 */
public interface TicketDao {

    public void saveOrUpdate(Ticket ticket);        // Ticket---bean====>Ticket.java

    public List<EventDates> getEventDates();

    public List<Ticket> getTicketList();

    //   public Ticket edit(String ticketType);

   
   public void deleteTicket(int ticketId);


} 

  

