/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.controllers;

import com.beezas.dao.Contact;
import com.beezas.services.ContactService;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
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

//    @Autowired
//    Contact contact;
//    @RequestMapping("/add")
//    public ModelAndView getAdd(@ModelAttribute Contact contact) {
//        List<String> eventDisplayList = new ArrayList<String>();
//        eventDisplayList.add("yes");
//        eventDisplayList.add("no");
//        Map<String, List> map = new HashMap<String, List>();
//        map.put("eventDisplayList", eventDisplayList);
//       // System.out.println(eventDisplayList);
//        return new ModelAndView("contactpage", "map", map);
    @RequestMapping("/add")
    public ModelAndView getAdd(@ModelAttribute Contact contact, Model model) {
        List<String> eventDisplayList = new ArrayList<String>();
        eventDisplayList.add("yes");
        eventDisplayList.add("no");
        Map<String, List> map = new HashMap<String, List>();
        //List<Contact> entireContactList =  contactService.getContactList();
        map.put("eventDisplayList", eventDisplayList);
        // map.put("entireContactList", entireContactList);
        System.out.println(eventDisplayList);
        List<Contact> entireContactList = contactService.getContactList();
        model.addAttribute("entireContactList", entireContactList);
        return new ModelAndView("contactpage", "map", map);
    }

//    List<Contact> entireContactList;
//    @RequestMapping("/add")
//     public ModelAndView getAdd(@ModelAttribute Contact contact,Model model) {
//         
//        List<String> eventDisplayList = new ArrayList<String>();
//        eventDisplayList.add("yes");
//        eventDisplayList.add("no");
//         
//        entireContactList = contactService.getContactList();
//        System.out.println("first it is :" + entireContactList);
//        Map<String, List> map = new HashMap<String, List>();
//        map.put("eventDisplayList", eventDisplayList);
//         map.put("entireContactList", entireContactList);
//         System.out.println("Second it is :" + eventDisplayList);
//        List<Contact> entireContactList =  contactService.getContactList();
//         model.addAttribute("entireContactList", entireContactList);
//        return new ModelAndView("contactpage", "map", map);     
//    }
    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String insertData(@ModelAttribute Contact contact, Model model) {
        contactService.insertData(contact);
        List<Contact> entireContactList = contactService.getContactList();
        model.addAttribute("entireContactList", entireContactList);
        System.out.println("In controller : " + entireContactList);
        return "contactpage";
    }

    @ModelAttribute("medianame")
    public Collection getDisplay() {
        System.out.println("Hai this is in contactcontroller" + contactService.getMediaNam());
        return contactService.getMediaNam();
    }

    @ModelAttribute("contacttype")
    public Collection getDisplayType() {
        System.out.println("Hai this is in contactcontroller" + contactService.getContactTyp());
        return contactService.getContactTyp();
    }

    @RequestMapping(value = "/deleteContact", method = RequestMethod.GET)
    public String delete(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        contactService.deleteContact(id);
        // return "redirect:/contact/add"; 
        return "redirect:/contact/add";
    }

//     @RequestMapping(value="/deleteContact", method = RequestMethod.GET)
//    public String delete(HttpServletRequest request){
//        int Id = Integer.parseInt(request.getParameter("Id"));
//        contactService.deleteContact(Id);
//      return "redirect:/contact/add"; 
//        //return new ModelAndView("redirect:/contact/add");
//    }
}
