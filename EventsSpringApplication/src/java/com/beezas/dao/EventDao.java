/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beezas.dao;

import java.util.List;

/**
 *
 * @author RaviJyothi
 */
public interface EventDao {
    public void insertData(User user);  
    public List getCategories();
    public List<SubCategory> getSubCategories();
     public List getAttendees();
}
