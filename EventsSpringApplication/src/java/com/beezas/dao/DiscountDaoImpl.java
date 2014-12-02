/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author venkatesh
 */
@Repository("discountDao")
public class DiscountDaoImpl implements DiscountDao {

    //private JdbcTemplate jdbcTemplate;
    
    JdbcTemplate   jdbcTemplate;
    @Autowired
    DataSource dataSource;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    
    
    
    
    public DiscountDaoImpl(){
        
    }

    public DiscountDaoImpl(DataSource dataSource) {
       jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(Discount discount) {
        jdbcTemplate = new JdbcTemplate(dataSource);
//        if (discount.getId() > 0) {
//
//            // update
//            String sql = "UPDATE discount SET id=?, ticket_type=?, min_quntity=?, min_ticket=?,max_quntity,max_ticket=?,discount_percentage=?"
//                    + "discount_amount=?  WHERE id=?";
//
//            jdbcTemplate.update(sql, new Object[]{discount.getTickettype(), discount.getMinticket(),
//                discount.getMaxquntity(), discount.getMaxticket(), discount.getDiscountamount(), discount.getDiscountpercentage(), discount.getId()});
//        } else {
            // insert
        
            String sql = "INSERT INTO discount(MIN_TICKET,MAX_TICKET,DISCOUNT_AMOUNT,DISCOUNT_PERCENTAGE)"+" VALUES (?,?,?,?)";
            jdbcTemplate.update(sql, new Object[]{discount.getMinticket(),discount.getMaxticket(), discount.getDiscountamount(), discount.getDiscountpercentage()});
        
            
    }

    
      
     
    public List<Discount>getDiscountList(){
        List discountList = new ArrayList();
         
  
  String sql = "select * from discount";  
    jdbcTemplate = new JdbcTemplate(dataSource);
 
  discountList = jdbcTemplate.query(sql, new DiscountRowMapper());
        System.out.println("bbbbbbb"+discountList);

  return  discountList;  
    }
     
     public List<TicketType>getTickettype(){
         
        List tcicketList= new ArrayList();
        String sql = "select ticket_type from ticket";
        jdbcTemplate = new JdbcTemplate(dataSource); 
        tcicketList =   jdbcTemplate.query(sql, new TicketTypeRowMapper());
        
        System.out.println("hai" +tcicketList);
         return tcicketList;
     }

}
