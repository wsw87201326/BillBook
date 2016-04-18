package com.wsw.billbook.utile;

import java.text.DecimalFormat;

/**
 * Create By :wsw
 * 2016-04-16 11:20
 */
public class TransformUtil {

    public static String doubleTrans(double num) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(num);
    }

    public static String moneyShowTrans(double num) {
        if (num > 0) {
            return "+" + doubleTrans(num);
        } else {
            return doubleTrans(num);
        }
    }

}
