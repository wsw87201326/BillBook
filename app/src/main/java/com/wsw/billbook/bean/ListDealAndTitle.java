package com.wsw.billbook.bean;

/**
 * 数据集合类,主要是为了方便显示
 * Created by wsw on 2016/3/29.
 */
public class ListDealAndTitle {
    private ShowType showType; //只是对列表项的item起作用,title都为固定显示类型
    private ItemTitleType itemTitleType; //是title还是item
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
