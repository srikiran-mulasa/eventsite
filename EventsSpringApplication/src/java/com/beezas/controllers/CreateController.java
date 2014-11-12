/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beezas.controllers;

import com.beezas.dao.User;
import com.beezas.services.EventService;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author RaviJyothi
 */
@Controller

public class CreateController {

    @Autowired
    EventService eventService;

    @RequestMapping("/add")
    public ModelAndView getAdd(@ModelAttribute User user) {
        //model.addAttribute("user", new User());
        List<String> paidList = new ArrayList<String>();
         List<String> privateList = new ArrayList<String>();
        paidList.add("yes");
        paidList.add("no");
        privateList.add("yes");
        privateList.add("no");
        Map<String, List> map = new HashMap<String, List>();
        map.put("paidList", paidList);
         map.put("privateList", privateList);
       return new ModelAndView("createEvent", "map", map);  
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String inserData(@ModelAttribute User user) {
        if (user != null) {
            eventService.insertData(user);
        }
        return "addpage";
    }
   
  @ModelAttribute("categoryId")
public Collection populateCategories() {
return eventService.getCategories();
}
 @ModelAttribute("subCategoryNum")
public Collection populateSubCategories() {
return eventService.getSubCategories();
}
}
