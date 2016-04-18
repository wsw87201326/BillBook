package com.wsw.billbook.ui.view;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.wsw.billbook.R;
import com.wsw.billbook.utile.TransformUtil;

/**
 * Create By :wsw
 * 2016-04-16 10:36
 */
public class CustomTitle extends RelativeLayout {
    private Context context;

    private TextView timeTv, inMoneyTv, outMoneyTv, sumMoneyTv;

    public CustomTitle(Context context) {
        this(context, null);

    }

    public CustomTitle(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomTitle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        this.context = context;
        View view = LayoutInflater.from(context).inflate(R.layout.custom_title, this);
        timeTv = (TextView) view.findViewById(R.id.time_tv);
        inMoneyTv = (TextView) view.findViewById(R.id.in_money_tv);
        outMoneyTv = (TextView) view.findViewById(R.id.out_money_tv);
        sumMoneyTv = (TextView) view.findViewById(R.id.sum_money_tv);
    }

    public void initData(String time, double inMoney, double outMoney) {
        timeTv.setText(time);
        inMoneyTv.setText(TransformUtil.moneyShowTrans(inMoney));
        outMoneyTv.setText(TransformUtil.moneyShowTrans(-outMoney));
        setSumTv(inMoney, outMoney);
    }

    private void setSumTv(double inMoney, double outMoney) {
        double sumMoney = inMoney - outMoney;
        if (sumMoney > 0) {
            sumMoneyTv.setTextColor(ContextCompat.getColor(context, R.color.green));
        } else {
            sumMoneyTv.setTextColor(ContextCompat.getColor(context, R.color.red));
        }
        sumMoneyTv.setText(TransformUtil.moneyShowTrans(sumMoney));
    }

}
