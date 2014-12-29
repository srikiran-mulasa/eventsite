/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.controllers;

import com.beezas.dao.Ticket;
import com.beezas.services.TicketService;
import java.util.Collection;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author yashwanth
 */
@Controller
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @RequestMapping("/save")
    public String saveTicket(@ModelAttribute Ticket ticket, Model model) {
        List<Ticket> ticketList = ticketService.getTicketList();
        System.out.println("controller's class:" + ticketList);
        model.addAttribute("ticketsList", ticketList);
        return "ticket";
    }

    @RequestMapping(value = "/insert")
    // @RequestMapping(value = "/insert",method=RequestMethod.POST)
    public String insert(@ModelAttribute Ticket ticket, Model model) {
        ticketService.saveOrUpdate(ticket);
        List<Ticket> ticketList = ticketService.getTicketList();
        model.addAttribute("ticketsList", ticketList);
        return "ticket";
    }
    @RequestMapping(value = "/deleteTicket", method = RequestMethod.GET)
    public String delete(HttpServletRequest request) {
  //  String ticketType = request.getParameter("id");
   int ticketId = Integer.parseInt(request.getParameter("id"));
     //   String id = request.getParameter("id");
    ticketService.deleteTicket(ticketId);
    return "redirect:/ticket/save";
    }
    
//    @RequestMapping(value = "/editTicket", method = RequestMethod.GET)
//    public String editContact(HttpServletRequest request) {
//    String ticketType = request.getParameter("ticketType");
//    ticketService.edit(ticketType);
//   // ModelAndView model = new ModelAndView("ticket");
//   // model.addObject("ticket", ticket);
// 
//    return "redirect:/ticket/save";
 
         
    @ModelAttribute("eDate")
    public Collection populateEventDates() {
        return ticketService.getEventDates();
    }
}
