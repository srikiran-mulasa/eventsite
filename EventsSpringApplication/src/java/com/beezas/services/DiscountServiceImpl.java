/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.services;

import com.beezas.dao.Discount;
import com.beezas.dao.DiscountDao;
import com.beezas.dao.TicketType;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author venkatesh
 */
@Service("discountServices")
public class DiscountServiceImpl implements DiscountService{
    
    @Autowired
    DiscountDao discountDao;
    
    @Override
    public void save(Discount discount){
        discountDao.save(discount);
    }
    @Override
     public List<Discount> getDiscountList(){
         return discountDao.getDiscountList();
     }
    @Override
     public List<TicketType>getTickettype(){
         return discountDao.getTickettype();
     }
}
