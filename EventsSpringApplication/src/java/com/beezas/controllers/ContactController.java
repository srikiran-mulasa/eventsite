/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.controllers;

import com.beezas.dao.Contact;
import com.beezas.services.ContactService;
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
 * @author HP
 */
@Controller
public class ContactController {

    @Autowired
    ContactService contactService;

    @RequestMapping("/add")
    public ModelAndView getAdd(@ModelAttribute Contact contact) {
        List<String> eventDisplayList = new ArrayList<String>();
        eventDisplayList.add("yes");
        eventDisplayList.add("no");
        Map<String, List> map = new HashMap<String, List>();
        map.put("eventDisplayList", eventDisplayList);
        return new ModelAndView("contactpage", "map", map);
    }
    
       @RequestMapping(value= "/save", method = RequestMethod.GET) 
    public String insertData(@ModelAttribute Contact contact) {
        contactService.insertData(contact);
        return "addpage";
    }

    @ModelAttribute("medianame")
    public Collection getDisplay() {
        System.out.println("Hai this is in contactcontroller" + contactService.getMediaNam());
        return contactService.getMediaNam();
    }
    
    @ModelAttribute("contacttypename")
    public Collection getDisplayType() {
        System.out.println("Hai this is in contactcontroller" + contactService.getContactTyp());
        return contactService.getContactTyp();
    }

}
