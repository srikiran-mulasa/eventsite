/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author HP
 */
public class ContDrpDwnRowMapper implements RowMapper<ContDrpDwns> {

    public ContDrpDwns mapRow(ResultSet resultSet, int line) throws SQLException {
        ContDrpDwnsExtractor drpdwnExtractor = new ContDrpDwnsExtractor();
        System.out.println("hai this is in drpdwnExtractor" + drpdwnExtractor.extractData(resultSet) );
        return drpdwnExtractor.extractData(resultSet);
    }
}
