/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Types.ROWID;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

/**
 *
 * @author yashwanth
 */
public class TicketExtractor implements ResultSetExtractor<Ticket> {

    public Ticket extractData(ResultSet resultSet) throws SQLException,
            DataAccessException {
        Ticket ticket = new Ticket();
        //  ticket.setTicketDate(resultSet.getString(1));
        ticket.setId(resultSet.getInt("ticket_id"));
        ticket.setTicketType(resultSet.getString("ticket_type"));
        ticket.setTotalTickets(resultSet.getInt("total_tickets"));
//         ticket.setId(resultSet.getInt(1));
//         ticket.setTicketType(resultSet.getString(2));
//        ticket.setTotalTickets(resultSet.getInt(3));
        
        
        System.out.println("type is :" + ticket.getTicketType());
        System.out.println("total tickets are  :" + ticket.getTotalTickets());
        return ticket;
    }
}
