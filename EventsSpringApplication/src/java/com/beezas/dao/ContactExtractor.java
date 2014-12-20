/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.dao;

import org.springframework.jdbc.core.ResultSetExtractor;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author HP
 */
public class ContactExtractor implements ResultSetExtractor<Contact> {

    public Contact extractData(ResultSet resultSet) throws SQLException, DataAccessException {
        
        Contact contact = new Contact();
        System.out.println("Hai this is contactextractor :");
        contact.setId(resultSet.getInt(1));
        contact.setMedianame(resultSet.getString(2));
        contact.setContacttypename(resultSet.getString(3));
        contact.setEmail(resultSet.getString(4));
        contact.setEventDisplay(resultSet.getString(5));
        contact.setFname(resultSet.getString(6));
        contact.setLname(resultSet.getString(7));
        contact.setContactemail(resultSet.getString(8));
        contact.setPhonenumber(resultSet.getInt(9));
        return contact;
        
    }
}
