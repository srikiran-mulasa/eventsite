/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beezas.services;

import com.beezas.dao.User;
import java.util.List;

/**
 *
 * @author RaviJyothi
 */
    public interface EventService {
    public void insertData(User user); 
    public List getCategories();
    public List getSubCategories();
    public List getAttendees();
}
