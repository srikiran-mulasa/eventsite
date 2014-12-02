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
public class DiscountExtractor implements ResultSetExtractor<Discount> {

   public Discount extractData(ResultSet resultSet) throws SQLException,  
   DataAccessException {  
    
  Discount discount = new Discount();  
    
  //discount.setId(resultSet.getInt(1));  
  //discount.setTickettype(resultSet.getString(1));  
  //discount.setMinquantity(resultSet.getString("MIN_QUANTITY"));  
  discount.setMinticket(resultSet.getInt(1));  
  //discount.setMaxquantity(resultSet.getString("MAX_QUANTITY"));
  discount.setMaxticket(resultSet.getInt(2));
  discount.setDiscountamount(resultSet.getInt(3));
  discount.setDiscountpercentage(resultSet.getInt(4));
   
  return discount;  
 }  
  
}  
