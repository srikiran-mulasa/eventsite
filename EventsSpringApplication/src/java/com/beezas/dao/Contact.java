/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.dao;

/**
 *
 * @author HP
 */
public class Contact {

    private int id;
    public String medianame;
    public String contacttypename;
    private String email;
    private String eventDisplay;
    private String fname;
    private String lname;
    private int phonenumber;
    private String contactemail;

    //Getters and Setters 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContactemail() {
        return contactemail;
    }

    public void setContactemail(String contactemail) {
        this.contactemail = contactemail;
    }

    public String getMedianame() {
        return medianame;
    }

    public void setMedianame(String medianame) {
        this.medianame = medianame;
    }

    public String getContacttypename() {
        return contacttypename;
    }

    public void setContacttypename(String contacttypename) {
        this.contacttypename = contacttypename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEventDisplay() {
        return eventDisplay;
    }

    public void setEventDisplay(String eventDisplay) {
        this.eventDisplay = eventDisplay;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    @Override
    public String toString() {
        return medianame;
    }

}
