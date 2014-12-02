/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.controllers;

import com.beezas.dao.Discount;
import com.beezas.services.DiscountService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author venkatesh
 */
@Controller

public class DiscountController {
    
    @Autowired
    DiscountService discountService;
   List<Discount> discountList;
    @RequestMapping("/register")
    public ModelAndView registerDiscount(@ModelAttribute Discount discount) {
//        List<String> minquantitylist = new ArrayList<String>();
//        minquantitylist.add(">=");
//        minquantitylist.add("==");
//        minquantitylist.add(">");
//       
//        List<String> maxquantitylist = new ArrayList<String>();
//        maxquantitylist.add("<=");
//        maxquantitylist.add("==");
//        maxquantitylist.add("<");
//        
         List<String> percentageList = new ArrayList<String>();
         percentageList.add("Amount");
         percentageList.add("Percentage");
         discountList = discountService.getDiscountList();
         System.out.println("dddd"+discountList);
        Map<String, List> map = new HashMap<String, List>();
        map.put("discountList", discountList);
        map.put("parcentageList",percentageList);
        return new ModelAndView("discount","map", map);
    }/*new*/
 
@RequestMapping(value="/save",method = RequestMethod.POST)  
 public ModelAndView inserData(@ModelAttribute Discount discount) {  
  
      discountService.save(discount);
      discountList = discountService.getDiscountList();
      System.out.println("dddd"+discountList);
  return new ModelAndView("discount", "discountList", discountList);  
  
  
 } 
 @ModelAttribute("tickettype")
 public Collection populateTickettype(){
return discountService.getTickettype();
}
}
