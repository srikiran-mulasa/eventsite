/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.controllers;
import com.beezas.controllers.UserDetails;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author admin
 */
@Controller("home")
@SessionAttributes("UserDetails")

public class HomeController {
    private UserDetails userDetails;
    @ModelAttribute
    public UserDetails getUserInfo() {
        return userDetails;
    }
}
