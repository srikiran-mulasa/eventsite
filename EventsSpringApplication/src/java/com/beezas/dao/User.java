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
    private String title;
    private String weburl;
    private String paidEvent;
    private String privateEvent;

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
}
