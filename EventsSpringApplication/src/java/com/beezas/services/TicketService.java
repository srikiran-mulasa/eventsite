/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beezas.services;

import com.beezas.dao.Ticket;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author yashwanth
 */
public interface TicketService {

    public void saveOrUpdate(Ticket ticket);

    public Collection getEventDates();

    public void deleteTicket(int ticketId);

    public List<Ticket> getTicketList();

  //  public Ticket edit(String ticketType);

   
    
}
