/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beezas.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author yashwanth
 */
public class TicketRowMapper implements RowMapper<Ticket>{
@Override
public Ticket mapRow(ResultSet resultSet, int line) throws SQLException {  
  TicketExtractor ticketExtractor = new TicketExtractor();  
  return ticketExtractor.extractData(resultSet);  
 }

 
}
