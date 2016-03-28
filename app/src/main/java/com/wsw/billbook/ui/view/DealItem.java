package com.wsw.billbook.ui.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.wsw.billbook.R;
import com.wsw.billbook.bean.PayEvent;

/**
 * 自定义一个显示的item
 * Created by wsw on 2016/3/27.
 */
public class DealItem extends RelativeLayout {
    View topView;
    TextView timeTv;
    View bottomView;
    TextView inMoneyTv;
    TextView outMoneyTv;
    Builder builder;

    private DealItem(Builder builder) {
        super(builder.context,null,0);
        this.builder = builder;
        initView(builder.context);
    }

    private void initView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.item_deal, this);
        topView = findViewById(R.id.top_view);
        bottomView = findViewById(R.id.bottom_view);

        timeTv = (TextView) findViewById(R.id.time_tv);
        inMoneyTv = (TextView) findViewById(R.id.in_money_tv);
        outMoneyTv = (TextView) findViewById(R.id.out_money_tv);
    }

    private void setTime(int day) {
        timeTv.setText(day);
    }

    public static Builder Builder(Context context) {
        return new Builder(context);
    }

    static class Builder {
        protected final Context context;
        protected int day;
        protected PayEvent payEvent;
        protected double money;
        protected ShowType showType;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder setTime(int day) {
            this.day = day;
            return this;
        }

        public Builder setPayEvent(PayEvent payEvent) {
            this.payEvent = payEvent;
            return this;
        }

        public Builder setMoney(double money) {
            this.money = money;
            return this;
        }

        public Builder setShowType(ShowType showType) {
            this.showType = showType;
            return this;
        }

        public DealItem build() {
            return new DealItem(this);
        }

    }

    enum ShowType {
        NORMAL, TITLE
    }

}
