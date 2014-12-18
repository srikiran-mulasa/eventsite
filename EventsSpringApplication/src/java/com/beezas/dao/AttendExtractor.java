/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beezas.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author RaviJyothi
 */
public class AttendExtractor {
    public User extractData(ResultSet resultSet) throws SQLException,
            DataAccessException {
        User user = new User();
       
        user.setWebAttend(resultSet.getString(1));
       
       return user;
        
    }
    
}
