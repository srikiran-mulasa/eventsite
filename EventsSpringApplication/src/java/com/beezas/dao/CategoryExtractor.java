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
 * @author RaviJyothi
 */
public class CategoryExtractor implements ResultSetExtractor<User> {

    public User extractData(ResultSet resultSet) throws SQLException,
            DataAccessException {
        User user = new User();
        user.setSubCategoryId(resultSet.getInt(1));
        user.setSubCategoryName(resultSet.getString(2));
        user.setSubCategoryNum(resultSet.getInt(3));
        return user;
    }
}
