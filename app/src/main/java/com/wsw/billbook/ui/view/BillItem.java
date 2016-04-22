package com.wsw.billbook.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.wsw.billbook.R;
import com.wsw.billbook.utile.TransformUtil;

import java.util.Calendar;

/**
 * Create By :wsw
 * 2016-04-22 11:44
 */
public class BillItem extends RelativeLayout {

    public void setBillItemOnClickListener(BillItemOnClickListener billItemOnClickListener) {
        this.billItemOnClickListener = billItemOnClickListener;
    }

    public interface BillItemOnClickListener {
        void onClick(View v);
    }

    BillItemOnClickListener billItemOnClickListener;
    private static final int TODAY = 1;
    private static final int WEEK = 2;
    private static final int MOUTH = 3;
    private static final int YEAR = 4;

    private TextView mOutMoneyTv;
    private TextView mInMoneyTv;
    private TextView mBillItemTitleTv;
    private TextView mBillItemTimeTv;
    private ImageView mBillItemImg;

    private float mInMoney;
    private float mOutMoney;
    private int mBillStyleInt;
    Calendar calendar = Calendar.getInstance();
    private static final String yearString = "01月01日-12月31日";

    public BillItem(Context context) {
        this(context, null);
    }

    public BillItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BillItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.BillItem);
        try {
            mInMoney = a.getFloat(R.styleable.BillItem_inMoney, 0);
            mOutMoney = a.getFloat(R.styleable.BillItem_outMoney, 0);
            mBillStyleInt = a.getInt(R.styleable.BillItem_showStyle, 0);
        } finally {
            a.recycle();
        }
        initView(context);
    }

    private void initView(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_record, this);
        view.setOnClickListener(v -> {
            if (billItemOnClickListener != null) {
                billItemOnClickListener.onClick(v);
            }
        });
        mOutMoneyTv = (TextView) view.findViewById(R.id.money_out);
        mInMoneyTv = (TextView) view.findViewById(R.id.money_in);
        mBillItemTitleTv = (TextView) view.findViewById(R.id.money_out_title);
        mBillItemTimeTv = (TextView) view.findViewById(R.id.time_tv);
        mBillItemImg = (ImageView) view.findViewById(R.id.day_img);

        mOutMoneyTv.setText(String.valueOf(mOutMoney));
        mInMoneyTv.setText(String.valueOf(mInMoney));

        mBillItemImg.setImageResource(R.drawable.ic_calendar);

        switch (mBillStyleInt) {
            case TODAY:
                mBillItemTitleTv.setText("今天");
                break;
            case WEEK:
                mBillItemTitleTv.setText("本周");
                mBillItemTimeTv.setText(TransformUtil.getWeekTime(calendar));
                break;
            case MOUTH:
                mBillItemTitleTv.setText("本月");
                mBillItemTimeTv.setText(TransformUtil.getMouthTime(calendar));
                break;
            case YEAR:
                mBillItemTitleTv.setText("本年");
                mBillItemTimeTv.setText(yearString);
                break;
        }
    }

    public void initData(double outMoney, double inMoney) {
        mOutMoneyTv.setText(TransformUtil.moneyShowTrans(outMoney));
        mInMoneyTv.setText(TransformUtil.moneyShowTrans(inMoney));
    }

}
