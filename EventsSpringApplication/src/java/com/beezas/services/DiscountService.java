/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.services;

import com.beezas.dao.Discount;
import com.beezas.dao.TicketType;
import java.util.List;

/**
 *
 * @author venkatesh
 */
public interface DiscountService {
    public void save(Discount discount);
    public  List<Discount> getDiscountList();
    public List <TicketType> getTickettype();
}
