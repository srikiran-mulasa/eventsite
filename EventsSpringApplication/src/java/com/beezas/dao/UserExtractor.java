/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beezas.dao;

/**
 *
 * @author RaviJyothi
 */
import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class UserExtractor implements ResultSetExtractor<User> {

    public User extractData(ResultSet resultSet) throws SQLException,
            DataAccessException {
        User user = new User();
       
        user.setCategoryId(resultSet.getInt(1));
        user.setCategoryName(resultSet.getString(2));
        user.setSubCategoryId(resultSet.getInt(1));
        user.setSubCategoryName(resultSet.getString(2));
        user.setSubCategoryNum(resultSet.getInt(3));
       return user;
        
    }
    
}
