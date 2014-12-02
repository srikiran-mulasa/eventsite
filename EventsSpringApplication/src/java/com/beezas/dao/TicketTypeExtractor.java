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
 * @author venkatesh
 */
public class TicketTypeExtractor implements ResultSetExtractor<TicketType> {
     public TicketType extractData(ResultSet resultSet) throws SQLException,  
   DataAccessException {
    TicketType ticketType = new TicketType();  
    ticketType.setTickettype(resultSet.getString(1));
    return ticketType;
}
}