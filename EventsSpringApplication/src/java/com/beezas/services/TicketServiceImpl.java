/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.services;

import com.beezas.dao.EventDates;
import com.beezas.dao.Ticket;
import com.beezas.dao.TicketDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yashwanth
 */
@Service("ticketService")
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketDao ticketDao;

    /**
     *
     * @param ticket
     */
    @Override
    public void saveOrUpdate(Ticket ticket) {
        ticketDao.saveOrUpdate(ticket);

    }
    

    @Override
    public List<EventDates> getEventDates() {
        return ticketDao.getEventDates();
    }

  @Override
   public List<Ticket> getTicketList(){
      
       return ticketDao.getTicketList();
   }
    @Override
    public void deleteTicket(int ticketId) {
        ticketDao.deleteTicket(ticketId);
    }

//    @Override
//    public Ticket edit(String ticketType) {
//       return ticketDao.edit(ticketType);
//    }
}   

  

