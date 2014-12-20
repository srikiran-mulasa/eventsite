/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.beezas.dao.Contact;
import com.beezas.dao.ContactDao;
import com.beezas.dao.ContDrpDwns;

import java.util.List;

/**
 *
 * @author HP
 */
@Service("contactService")
public class ContactServiceImpl implements ContactService {

    @Autowired
    ContactDao contactDao;

    @Override
    public void insertData(Contact contact) {
        contactDao.insertData(contact);
    }

    /**
     *
     * @return
     */
    
    
    @Override
    public void deleteContact(int Id){
      contactDao.deleteContact(Id);
    }
    
    @Override
    public List<ContDrpDwns> getMediaNam() {
        return contactDao.getMediaNam();
    }
    
     @Override
    public List<ContDrpDwns> getContactTyp() {
        return contactDao.getContactTyp();
    }

    @Override
    public List<Contact> getContactList() {
        return contactDao.getContactList();
    }
}
