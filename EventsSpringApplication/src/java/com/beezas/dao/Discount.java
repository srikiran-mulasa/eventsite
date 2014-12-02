/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beezas.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author venkatesh
 */
public class Discount {
    @Autowired
    TicketType ticketType;
    private int id;
    String tickettype;
    private String minquantity;

    public String getMinquantity() {
        return minquantity;
    }

    public void setMinquantity(String minquantity) {
        this.minquantity = minquantity;
    }
    private int minticket;
    private String maxquantity;
    private int maxticket;
    private int discountamount;
    private int discountpercentage;
    private String discounttype;
    

public Discount(int id,String tickettype,String minquantity,int minticket,String maxquantity,int maxticket,int discountamount,int discountpercentage){
    this.id=id;
    this.tickettype=tickettype;
    this.minquantity=minquantity;
    this.minticket=minticket;
    this.maxquantity=maxquantity;
    this.discountamount=discountamount;
    this.discountpercentage=discountpercentage;    
    
}

    Discount(){
           
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setTickettype() {
        this.tickettype = ticketType.getTickettype();
    }

    public String getTickettype() {
        return tickettype;
    }

    


    public void setMinticket(int minticket) {
        this.minticket = minticket;
    }

    public void setMaxquantity(String maxquantity) {
        this.maxquantity = maxquantity;
    }

    public void setMaxticket(int maxticket) {
        this.maxticket = maxticket;
    }

    public void setDiscountamount(int discountamount) {
        this.discountamount = discountamount;
    }

    public void setDiscountpercentage(int discountpercentage) {
        this.discountpercentage = discountpercentage;
    }

    public void setDiscounttype(String discounttype) {
        this.discounttype = discounttype;
    }

    public int getId() {
        return id;
    }

     
    
    public int getMinticket() {
        return minticket;
    }

    public String getMaxquantity() {
        return maxquantity;
    }

    public int getMaxticket() {
        return maxticket;
    }

    public int getDiscountamount() {
        return discountamount;
    }

    public int getDiscountpercentage() {
        return discountpercentage;
    }

    public String getDiscounttype() {
        return discounttype;
    }

    @Override
    public String toString() {
        return "Discount{" + "minticket=" + minticket + ", maxticket=" + maxticket + ", discountamount=" + discountamount + ", discountpercentage=" + discountpercentage + '}';
    }
    
}
