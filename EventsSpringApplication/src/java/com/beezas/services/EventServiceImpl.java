/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beezas.services;
import com.beezas.dao.EventDao;
import com.beezas.dao.SubCategory;
import com.beezas.dao.User;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author RaviJyothi
 */
@Service("eventService")
public class EventServiceImpl implements EventService{
    @Autowired
    EventDao eventDao; 
   
   /* public String getParts() {
        String part=partDao.getParts();
        return part;
    }*/
    
   
   public void insertData(User user) {  
  eventDao.insertData(user);  
 }  
   public List<User> getCategories(){
       return eventDao.getCategories();
   }
  public List<SubCategory> getSubCategories(){
       return eventDao.getSubCategories();
   }
  public List getAttendees(){
       return eventDao.getAttendees();
   }
}