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
 * @author venkatesh
 */
public class TicketTypeRowMapper implements RowMapper<TicketType> {
    public TicketType mapRow(ResultSet resultSet, int line) throws SQLException {
        TicketTypeExtractor ticketTypeExtractor = new TicketTypeExtractor();
        return ticketTypeExtractor.extractData(resultSet);
    }
}
