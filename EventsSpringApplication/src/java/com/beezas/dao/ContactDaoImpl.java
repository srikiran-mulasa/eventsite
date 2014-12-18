/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.dao;

import java.util.List;
import com.beezas.dao.Contact;
import java.util.ArrayList;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author HP
 */
@Repository("contactDao")
public class ContactDaoImpl implements ContactDao {

    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;
//    @Autowired
//    Contact contact;

    @Override
    public void insertData(Contact contact) {
//        if (contact.getId() > 0) {
//            // This is for updating data
//            String sql = "UPDATE contact SET MEDIA_NAME=?, CTYPE_NAME=?, EMAIL=?, EVENT_DISPLAY=?, CONTACT_FIRST_NAME=?,"
//                    + "CONTACT_LAST_NAME=?, CONTACT_EMAIL=?, CONTACT_PHNO=? WHERE ID=?";
//            jdbcTemplate.update(sql, contact.getMedianame(), contact.getContacttypename(), contact.getEmail(),
//                    contact.getEventDisplay(), contact.getFname(), contact.getLname(), contact.getContactemail(),
//                    contact.getPhonenumber(), contact.getId());
//        } 
//        else { }
        
            //This is for inserting data
            String sql = "INSERT INTO CONTACT(ID, MEDIA_NAME, CTYPE_NAME, EMAIL, EVENT_DISPLAY, CONTACT_FIRST_NAME,"
                    + " CONTACT_LAST_NAME, CONTACT_EMAIL, CONTACT_PHNO)" + "VALUES(?,?,?,?,?,?,?,?,?)";

            jdbcTemplate = new JdbcTemplate(dataSource);
            jdbcTemplate.update(sql, new Object[]{
                contact.getId(), contact.getMedianame(), contact.getContacttypename(), contact.getEmail(), contact.getEventDisplay(),
                contact.getFname(), contact.getLname(), contact.getContactemail(), contact.getPhonenumber()
                        });
            
        }
    
    
    @Override
    public List<Contact> getMediaNam() {
        List mediaNam = new ArrayList();
        String sql = "SELECT * FROM MEDIA";
        jdbcTemplate = new JdbcTemplate(dataSource);
        mediaNam = jdbcTemplate.query(sql, new ContactRowMapper());
        System.out.println("hai these are the items present in DaoImpl(ContactDaoImpl) " + mediaNam);
        return mediaNam;
    }

    @Override
    public List<Contact> getContactTyp() {
        List mediaNam = new ArrayList();
        String sql = "SELECT * FROM CONTACTTYPE";
        jdbcTemplate = new JdbcTemplate(dataSource);
        mediaNam = jdbcTemplate.query(sql, new ContactRowMapper());
        System.out.println("hai these are the items present in DaoImpl(ContactDaoImpl) " + mediaNam);
        return mediaNam;
    }
    
    public List<Contact> getContactList() {
        List mediaNam = new ArrayList();
        String sql = "SELECT * FROM CONTACT";
        jdbcTemplate = new JdbcTemplate(dataSource);
        mediaNam = jdbcTemplate.query(sql, new ContactRowMapper());
        System.out.println("hai these are the items present in DaoImpl(ContactDaoImpl)" + mediaNam);
        return mediaNam;
    }
    
//    @Override
//    public void deleteData(int Id){
//          String sql = "DELETE FROM CONTACT WHERE ID=?"; //WE ARE USING PRIMARY-KEY(ID) FROM CONTACT TABLE
//          jdbcTemplate = new JdbcTemplate(dataSource);
//          jdbcTemplate.update(sql, Id);
//    }

   
   

}
