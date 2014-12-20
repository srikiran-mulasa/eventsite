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
    
    public void deleteContact(int id); //this is used for deleting data
   
    
    
    
     public List<Contact> getContactList();  //this is used for display entire contact
    
    public List<ContDrpDwns> getMediaNam(); //dropdown for medias(fb,twit,gmail,yahoo----)
    
    public List<ContDrpDwns> getContactTyp();  //dropdown for contacttypes(eventorgan,mngr,sponsore) 
    

}
