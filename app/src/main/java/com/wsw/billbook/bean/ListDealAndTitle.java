package com.wsw.billbook.bean;

/**
 * Created by wsw on 2016/3/29.
 */
public class ListDealAndTitle {
    private ShowType showType;
    private int day;
    private double inMoney;
    private double outMoney;
    private double money;

    public ShowType getShowType() {
        return showType;
    }

    public void setShowType(ShowType showType) {
        this.showType = showType;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
