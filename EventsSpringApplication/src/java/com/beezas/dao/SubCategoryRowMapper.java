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
 * @author RaviJyothi
 */
public class SubCategoryRowMapper implements RowMapper<User>{
    @Override  
 public User mapRow(ResultSet resultSet, int line) throws SQLException {  
  CategoryExtractor categoryExtractor = new CategoryExtractor();  
  return categoryExtractor.extractData(resultSet);  
 }  
}
