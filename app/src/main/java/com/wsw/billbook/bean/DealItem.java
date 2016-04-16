package com.wsw.billbook.bean;

import java.util.Calendar;

/**
 * 列表显示的交易
 * Created by wsw on 2016/3/27.
 */
public class DealItem {
    private PayEvent payEvent;  //交易事件,是支出还是收入
    private Calendar date; //时间
    private double money; //金额

    public PayEvent getPayEvent() {
        return payEvent;
    }

    public void setPayEvent(PayEvent payEvent) {
        this.payEvent = payEvent;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
