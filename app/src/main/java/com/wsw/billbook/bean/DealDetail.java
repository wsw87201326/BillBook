package com.wsw.billbook.bean;

import java.util.Calendar;

/**
 * 交易详情
 * Created by wsw on 2016/3/27.
 */
public class DealDetail {
    private String name; //什么交易
    private double money; //金额
    private Calendar times; //时间
    private PayEvent payEvent;  //交易事件,是支出还是收入

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Calendar getTimes() {
        return times;
    }

    public void setTimes(Calendar times) {
        this.times = times;
    }

    public PayEvent getPayEvent() {
        return payEvent;
    }

    public void setPayEvent(PayEvent payEvent) {
        this.payEvent = payEvent;
    }
}
