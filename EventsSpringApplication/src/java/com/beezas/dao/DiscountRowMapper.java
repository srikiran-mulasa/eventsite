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
 * @author venkatesh
 */
 
public class DiscountRowMapper implements RowMapper<Discount> {

    @Override
    public Discount mapRow(ResultSet resultSet, int line) throws SQLException {
        DiscountExtractor discountExtractor = new DiscountExtractor();
        return discountExtractor.extractData(resultSet);
    }
    
}
