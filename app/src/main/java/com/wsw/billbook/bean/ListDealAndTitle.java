package com.wsw.billbook.bean;

/**
 * Created by wsw on 2016/3/29.
 */
public class ListDealAndTitle {
    private ShowType showType;
    private ItemTitleType itemTitleType;
    private int year;
    private int mouth;
    private int day;
    private double inMoney;
    private double outMoney;

    public ListDealAndTitle() {
    }

    public ListDealAndTitle(ShowType showType, ItemTitleType itemTitleType, int year, int mouth, int day, double inMoney, double outMoney) {
        this.showType = showType;
        this.itemTitleType = itemTitleType;
        this.year = year;
        this.mouth = mouth;
        this.day = day;
        this.inMoney = inMoney;
        this.outMoney = outMoney;
    }

    public ShowType getShowType() {
        return showType;
    }

    public void setShowType(ShowType showType) {
        this.showType = showType;
    }

    public ItemTitleType getItemTitleType() {
        return itemTitleType;
    }

    public void setItemTitleType(ItemTitleType itemTitleType) {
        this.itemTitleType = itemTitleType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
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
}
