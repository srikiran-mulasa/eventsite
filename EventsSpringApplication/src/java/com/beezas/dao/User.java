/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beezas.dao;

/**
 *
 * @author RaviJyothi
 */
public class User {
    private int subCategoryId;
    private String subCategoryName;
    private int subCategoryNum;
    private String title;
    private String weburl;
    private String paidEvent;
    private String privateEvent;
    private String webinar;
    private String webAttend;
    private String eventAttend;
    private String attendDescription;
    private String attend;

    public String getChk() {
        return chk;
    }

    public void setChk(String chk) {
        this.chk = chk;
    }
    private String chk;

    public String getAttendText() {
        return attendText;
    }

    public void setAttendText(String attendText) {
        this.attendText = attendText;
    }
    private String attendText;

    public String getAttend() {
        return attend;
    }

    public void setAttend(String attend) {
        this.attend = attend;
    }
    

    public String getEventAttend() {
        return eventAttend;
    }

    public void setEventAttend(String eventAttend) {
        this.eventAttend = eventAttend;
    }

    public String getAttendDescription() {
        return attendDescription;
    }

    public void setAttendDescription(String attendDescription) {
        this.attendDescription = attendDescription;
    }

    public String getWebAttend() {
        return webAttend;
    }

    public void setWebAttend(String webAttend) {
        this.webAttend = webAttend;
    }

    public String getWebinar() {
        return webinar;
    }

    public void setWebinar(String webinar) {
        this.webinar = webinar;
    }
    public int getSubCategoryNum() {
        return subCategoryNum;
    }

    public void setSubCategoryNum(int subCategoryNum) {
        this.subCategoryNum = subCategoryNum;
    }

    public int getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    } 
 private int categoryId;
    private String categoryName;
   

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
   
    public String getPaidEvent() {
        return paidEvent;
    }

    public void setPaidEvent(String paidEvent) {
        this.paidEvent = paidEvent;
    }

    public String getPrivateEvent() {
        return privateEvent;
    }

    public void setPrivateEvent(String privateEvent) {
        this.privateEvent = privateEvent;
    }
    private String eventDescription;

   
    

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWeburl() {
        return weburl;
    }

    public void setWeburl(String weburl) {
        this.weburl = weburl;
    }

    @Override
    public String toString() {
        return webAttend;
    }
    
}
