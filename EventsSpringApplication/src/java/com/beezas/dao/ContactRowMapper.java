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
 * @author HP
 */
public class ContactRowMapper implements RowMapper<Contact> {

    @Override
    public Contact mapRow(ResultSet resultSet, int line) throws SQLException {
        ContactExtractor contactExtractor = new ContactExtractor();
        System.out.println("hai this is in contactrowmapper " + contactExtractor.extractData(resultSet));
        return contactExtractor.extractData(resultSet);
    }

}
