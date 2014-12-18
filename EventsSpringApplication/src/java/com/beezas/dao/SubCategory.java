/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.dao;

/**
 *
 * @author RaviJyothi
 */
public class SubCategory {

    private int subCategoryId;
    private String subCategoryName;
    private int subCategoryNum;

    public int getSubCategoryNum() {
        return subCategoryNum;
    }

    public void setSubCategoryNum(int subCategoryNum) {
        this.subCategoryNum = subCategoryNum;
    }

    public int getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }
}
