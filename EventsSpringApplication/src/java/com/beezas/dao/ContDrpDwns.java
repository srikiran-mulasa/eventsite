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
public class ContDrpDwns {

    public int mediaId;
    public String medianame;
    public int contacttypeId;
    public String contacttype;

    public int getContacttypeId() {
        return contacttypeId;
    }

    public void setContacttypeId(int contacttypeId) {
        this.contacttypeId = contacttypeId;
    }

    public String getContacttype() {
        return contacttype;
    }

    public void setContacttype(String contacttype) {
        this.contacttype = contacttype;
    }

    public int getMediaId() {
        return mediaId;
    }

    public void setMediaId(int mediaId) {
        this.mediaId = mediaId;
    }

    public String getMedianame() {
        return medianame;
    }

    public void setMedianame(String medianame) {
        this.medianame = medianame;
    }

    @Override
    public String toString() {
        String med = this.medianame;
        return med;
    }

    public String toStri() {
        String cat = this.contacttype;
        return cat;
    }

}
