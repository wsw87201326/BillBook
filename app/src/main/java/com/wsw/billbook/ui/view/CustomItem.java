package com.wsw.billbook.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.wsw.billbook.R;
import com.wsw.billbook.bean.ShowType;
import com.wsw.billbook.utile.TransformUtil;

/**
 * 自定义一个显示的item
 * Created by wsw on 2016/3/27.
 */
public class CustomItem extends RelativeLayout {
    private static final String TAG = "CustomItem";
    private Context context;
    public static final double DEFAULT_MONEY = 0;

    public View topView;
    public TextView timeTv;
    public View bottomView;
    public LinearLayout inMoneyLayout;
    public LinearLayout outMoneyLayout;
    public TextView inMoneyTv;
    public TextView outMoneyTv;

    private boolean isHead = false;
    private boolean isBottom = false;
    private ShowType showType;

    public CustomItem(Context context) {
        this(context, null);
    }

    public CustomItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        this.context = context;
        View view = LayoutInflater.from(context).inflate(R.layout.custom_item, this);
        topView = view.findViewById(R.id.top_view);
        bottomView = view.findViewById(R.id.bottom_view);
        timeTv = (TextView) view.findViewById(R.id.time_tv);
        inMoneyTv = (TextView) view.findViewById(R.id.in_money_tv);
        outMoneyTv = (TextView) view.findViewById(R.id.out_money_tv);
        inMoneyLayout = (LinearLayout) view.findViewById(R.id.in_money_layout);
        outMoneyLayout = (LinearLayout) view.findViewById(R.id.out_money_layout);
    }

    public void initData(ShowType showType, double inComeMoney, double outComeMoney, int time) {
        setShowType(showType);
        setMoney(inComeMoney, outComeMoney);
        setTimeTv(time);
    }

    private void setShowType(ShowType showType) {
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
        }
    }

    private void setMoney(double inComeMoney, double outComeMoney) {
        Log.d(TAG,"inComeMoney:"+inComeMoney+"|outComeMoney:"+outComeMoney);
        if (inComeMoney != DEFAULT_MONEY) {//如果收入不为空,则显示
            inMoneyLayout.setVisibility(VISIBLE);
            inMoneyTv.setText(TransformUtil.moneyShowTrans(inComeMoney));
        } else {
            inMoneyLayout.setVisibility(GONE);
        }

        if (outComeMoney != DEFAULT_MONEY) {//如果支出不为空,则显示
            outMoneyLayout.setVisibility(VISIBLE);
            outMoneyTv.setText(TransformUtil.moneyShowTrans(-outComeMoney));
        } else {
            outMoneyLayout.setVisibility(GONE);
        }
    }

    private void setTimeTv(int time) {
        timeTv.setText(String.valueOf(time));
    }

}
