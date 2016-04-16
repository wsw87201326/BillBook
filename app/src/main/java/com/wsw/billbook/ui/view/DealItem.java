package com.wsw.billbook.ui.view;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.wsw.billbook.R;
import com.wsw.billbook.bean.PayEvent;
import com.wsw.billbook.bean.ShowType;

import java.util.Calendar;

/**
 * 自定义一个显示的item
 * Created by wsw on 2016/3/27.
 */
public class DealItem extends RelativeLayout {

    public View topView;
    public TextView timeTv;
    public View bottomView;
    public TextView inMoneyTv;
    public TextView outMoneyTv;

    private boolean isHead = false;
    private boolean isBottom = false;
    private ShowType showType;
    private Context context;
    public DealItem(Context context) {
        this(context, null);
    }

    public DealItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DealItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        this.context = context;
        LayoutInflater.from(context).inflate(R.layout.timeline, this);
        topView = findViewById(R.id.top_view);
        bottomView = findViewById(R.id.bottom_view);

        timeTv = (TextView) findViewById(R.id.time_tv);
        inMoneyTv = (TextView) findViewById(R.id.in_money_tv);
        outMoneyTv = (TextView) findViewById(R.id.out_money_tv);
    }

    public void setShowType(ShowType showType) {
        this.showType = showType;
        changeViewShow();
    }

    private void changeViewShow() {
        switch (showType) {
            case BOTTOM://底部视图
                topView.setVisibility(VISIBLE);
                bottomView.setVisibility(GONE);
                break;
            case NORMAL://普通的视图
                topView.setVisibility(VISIBLE);
                bottomView.setVisibility(VISIBLE);
                break;
            case ONLY_ONE://只有一条消息时
                topView.setVisibility(GONE);
                bottomView.setVisibility(GONE);
                break;
            case HEAD://头部
                topView.setVisibility(GONE);
                bottomView.setVisibility(VISIBLE);
                break;
            case TITLE:
                topView.setVisibility(GONE);
                bottomView.setVisibility(VISIBLE);
                timeTv.setBackgroundColor(ContextCompat.getColor(context,R.color.colorItemTitle));
                break;

        }
    }

    public void setMoney(double money, PayEvent payEvent) {
        switch (payEvent) {
            case PAY://支出
                inMoneyTv.setVisibility(GONE);
                outMoneyTv.setVisibility(VISIBLE);
                outMoneyTv.setText(String.valueOf(money));
                break;
            case INCOME://收入
                outMoneyTv.setVisibility(GONE);
                inMoneyTv.setVisibility(VISIBLE);
                inMoneyTv.setText(String.valueOf(money));
                break;
        }
    }

    public void setTime(Calendar date) {

    }
}
