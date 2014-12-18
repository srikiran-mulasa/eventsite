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
 * @author RaviJyothi
 */
@Repository("eventDao")
public class EventDaoImpl implements EventDao {

    @Autowired
    DataSource dataSource;

    public void insertData(User user) {

        String sql = "insert into events"
                + "(title,paidevent,privateevent,webinar,weburl,sub_category_id,description) VALUES (?,?,?,?,?,?,?)";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(
                sql,
                new Object[]{user.getTitle(),
                    user.getPaidEvent(),
                    user.getPrivateEvent(),
                    user.getWebinar(),
                    user.getWeburl(),
                    user.getCategoryId(),
                    user.getEventDescription(),
                    //user.getWebAttend(),
                   
                     });
        
    System.out.println("get category id"+user.getSubCategoryId());

    }
   public List<User> getCategories() {  
  List categoryList = new ArrayList();  
  String sql = "select * from category";  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  categoryList = jdbcTemplate.query(sql, new UserRowMapper());  
  return categoryList;  
 }

public List<SubCategory> getSubCategories() {  
  List categoryList = new ArrayList();  
  String sql = "select * from sub_category";  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  categoryList = jdbcTemplate.query(sql, new SubCategoryRowMapper());  
  return categoryList;  
 }
 public List getAttendees() {  
  List attendeesList = new ArrayList();  
  String sql = "select * from attendees";  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  attendeesList = jdbcTemplate.query(sql, new AttendRowMapper());  
  return attendeesList;  
 }
}