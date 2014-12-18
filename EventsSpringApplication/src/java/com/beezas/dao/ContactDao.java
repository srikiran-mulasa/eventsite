/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.dao;

import java.util.List;
/**
 *
 * @author HP
 */
public interface ContactDao {

    public void insertData(Contact contact); //this is used for inserting data
    
    //public void deleteData(int Id); //this is used for deleting data
   
    
    
    
     public List<Contact> getContactList();  //this 
    
    public List<Contact> getMediaNam(); //dropdown for medias(fb,twit,gmail,yahoo----)
    
    public List<Contact> getContactTyp();  //dropdown for contacttypes(eventorgan,mngr,sponsore) 
    

}
