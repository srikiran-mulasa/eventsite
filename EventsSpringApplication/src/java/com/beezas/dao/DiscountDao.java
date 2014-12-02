/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.dao;

import java.util.List;

/**
 *
 * @author venkatesh
 */
public interface DiscountDao {
    
    public void save(Discount discount);
    public List<Discount>getDiscountList();
    public List <TicketType>getTickettype();
    
}
