/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.dao;

/**
 *
 * @author venkatesh
 */
public class TicketType {
 String tickettype;
    public void setTickettype(String tickettype) {
        this.tickettype = tickettype;
    }

    public String getTickettype() {
        return tickettype;
    }
    public String toString(){
    String foo = this.tickettype;
    return foo;
    }
    
}
