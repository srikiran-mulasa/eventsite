/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.dao;

/**
 *
 * @author yashwanth
 */
public class EventDates {

    private String eventDates;

    public void setEventDates(String eventDates) {
        this.eventDates = eventDates;
    }

    public String getEventDates() {
        return eventDates;
    }

   public String toString(){
    String date=this.eventDates;
    return date;
    }
}
