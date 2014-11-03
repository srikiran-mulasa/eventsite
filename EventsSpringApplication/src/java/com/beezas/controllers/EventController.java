/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beezas.controllers;

import com.beezas.services.EventServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author RaviJyothi
 */
@Controller
public class EventController {
    @Autowired
    EventServices eventservices;
    @RequestMapping("/create")
    public ModelAndView createEvents(){
        List eventList = eventservices.createEvents();
        return new ModelAndView("createEvent","event","eventList");
        
    }
}
