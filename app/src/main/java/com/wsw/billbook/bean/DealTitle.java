package com.wsw.billbook.bean;

import java.util.Date;

/**
 * Create By :wsw
 * 2016-04-16 11:39
 */
public class DealTitle {
    private Date date;
    private double inMoney;
    private double outMoney;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getInMoney() {
        return inMoney;
    }

    public void setInMoney(double inMoney) {
        this.inMoney = inMoney;
    }

    public double getOutMoney() {
        return outMoney;
    }

    public void setOutMoney(double outMoney) {
        this.outMoney = outMoney;
    }
}
