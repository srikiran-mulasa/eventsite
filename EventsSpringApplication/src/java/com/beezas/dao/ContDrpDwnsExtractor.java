/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

/**
 *
 * @author HP
 */
public class ContDrpDwnsExtractor implements ResultSetExtractor<ContDrpDwns> {

    public ContDrpDwns extractData(ResultSet resultSet) throws SQLException,
            DataAccessException {
         ContDrpDwns drpdwns = new ContDrpDwns();
        drpdwns.setMedianame(resultSet.getString(2));
        drpdwns.setContacttype(resultSet.getString(2));
        System.out.println(" Hai this is in MediaExtractor " + " Social Media is " + drpdwns);
        return drpdwns;
    }
}
