/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beezas.services;

import com.beezas.dao.EventDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author RaviJyothi
 */
public class EventServicesImpl implements EventServices{
    @Autowired
    EventDao eventDao;
    public List createEvents(){
       List eventList = eventDao.createEvents();
       System.out.println("hello service"); 
    }
}
