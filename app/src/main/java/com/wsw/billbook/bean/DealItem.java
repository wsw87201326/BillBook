package com.wsw.billbook.bean;

import java.util.Date;

/**
 * 列表显示的交易
 * Created by wsw on 2016/3/27.
 */
public class DealItem {
    private PayEvent payEvent;  //交易事件,是支出还是收入
    private Date time; //时间
    private double money; //金额

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public PayEvent getPayEvent() {
        return payEvent;
    }

    public void setPayEvent(PayEvent payEvent) {
        this.payEvent = payEvent;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
