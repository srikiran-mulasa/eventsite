/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.services;

import com.beezas.dao.Contact;
import com.beezas.dao.ContDrpDwns;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ContactService {

    public void insertData(Contact contact);
     
    public List<ContDrpDwns> getMediaNam();
    
    public List<ContDrpDwns> getContactTyp();
  
    public List<Contact> getContactList();
    
    public void deleteContact(int Id);
    
    
     //public void deleteData(Contact contact);
}
