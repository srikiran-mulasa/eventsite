/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.dao;

import org.springframework.jdbc.core.ResultSetExtractor;
import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.dao.DataAccessException;

/**
 *
 * @author HP
 */
public class ContactExtractor implements ResultSetExtractor<Contact>{
    
    public Contact extractData(ResultSet resultSet)throws SQLException,
            DataAccessException {
        Contact contact = new Contact();
        //System.out.println("Hai this is contactextractor :" + (resultSet.getString(2)) + (resultSet.getString(2))  );
        System.out.println("Hai this is contactextractor :");
        contact.setMedianame(resultSet.getString(2));  //THIS WILL REFER TO MEDIA DROPDOWN
        contact.setContacttypename(resultSet.getString(2)); //THIS WILL REFER TO CONTACTTYPE DROPDOWN
        
//         System.out.println("My COnfirmation for mediavalues is : "
//                 + contact.getMedianame() + resultSet.getString("MEDIA_NAME") );
//        System.out.println("My confirmation for contacttype values is : " 
//                + contact.getContacttypename() + resultSet.getString("CTYPE_NAME"));
        
        
        
        
//        contact.setLname(resultSet.getString(6));
//        contact.setContactEmail(resultSet.getString(7));
//        contact.setEventDisplay(resultSet.getString(4));
//        contact.setMediaId(resultSet.getInt(1));
//        contact.setMediaName(resultSet.getString(2));
        return contact;
    }
}
