/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

/**
 *
 * @author yashwanth
 */
@Repository("ticketDao")
public class TicketDaoImpl implements TicketDao {

    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;

    @Override
   public void saveOrUpdate(Ticket ticket) {
      // if (ticket.getTicketType()!=null) {
         if(ticket.getId()> 0){
     
           System.out.println("update");
       // update
     //   String sql = "UPDATE ticket SET total_tickets=? WHERE ticket_type=?";
           String sql = "UPDATE tickets SET total_tickets=?, ticket_type=? WHERE ticket_id=?";
        jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(sql,ticket.getTotalTickets(),ticket.getTicketType(),ticket.getId());
        
    } else { 
          
     //   String sql = "insert into ticket" + "(ticket_type,total_tickets ) VALUES (?, ?)";
                
        String sql = "insert into tickets"
                 + "(ticket_id,ticket_type,total_tickets ) VALUES (seq_ticket_id.nextval, ?, ?)";
        jdbcTemplate = new JdbcTemplate(dataSource); // Creates an instance of JdbcTemplate and supply a data source object

        jdbcTemplate.update(sql, new Object[]{ticket.getTicketType(),
            ticket.getTotalTickets()});
           
    }
    }
    @Override
    public List<EventDates> getEventDates() {
        List eventDatesList = new ArrayList();
        String sql = "select event_date from events";
        jdbcTemplate = new JdbcTemplate(dataSource);
        eventDatesList = jdbcTemplate.query(sql, new EventDatesRowMapper());
        return eventDatesList;
    }

    @Override
    public List<Ticket> getTicketList() {
        List ticketList = new ArrayList();
     //   String sql = "select * from ticket";
           String sql = "select ticket_id,ticket_type,total_tickets from tickets";
        jdbcTemplate = new JdbcTemplate(dataSource);
        ticketList = jdbcTemplate.query(sql, new TicketRowMapper());
        System.out.println("Dao:" + ticketList);
        return ticketList;
    }

    @Override
    public void deleteTicket(int ticketId) {
       // String sql = "delete from tickets where ticket_type=?"; 
        String sql = "delete from tickets where ticket_id=?"; 
        jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(sql, ticketId);
       
    }
  
}
