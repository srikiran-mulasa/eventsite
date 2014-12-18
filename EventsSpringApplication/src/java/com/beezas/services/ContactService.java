/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.services;

import com.beezas.dao.Contact;
//import com.beezas.dao.Media;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ContactService {

    public void insertData(Contact contact);
     
    public List<Contact> getMediaNam();
    
    public List<Contact> getContactTyp();
    
    /**
     *
     * @return
     */
    public List<Contact> getContactList();
    
    //public void deleteData(Contact contact);
    
    
    
    
    
    
    
    
    
    //public void deleteData(int Id);
}
