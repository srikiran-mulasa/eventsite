/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beezas.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

/**
 *
 * @author yashwanth
 */
public class EventDatesExtractor implements ResultSetExtractor<EventDates>{
    
    
     public EventDates extractData(ResultSet resultSet) throws SQLException,
            DataAccessException {
        EventDates eventDates = new EventDates();
      //  ticket.setTicketDate(resultSet.getString(1));
        eventDates.setEventDates(resultSet.getString(1));
      
        System.out.println("date is :" + eventDates);
        return eventDates;
    }
}
