package com.wsw.billbook.utile;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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

    public static String getWeekTime(Calendar cal){
        String result;
        SimpleDateFormat df = new SimpleDateFormat("MM月dd日");
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); //获取本周一的日期
        result = df.format(cal.getTime()) + "-";

        //这种输出的是上个星期周日的日期，因为老外那边把周日当成第一天
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        //增加一个星期，才是我们中国人理解的本周日的日期
        cal.add(Calendar.WEEK_OF_YEAR, 1);

        result += df.format(cal.getTime());

        return result;
    }

    public static String getMouthTime(Calendar cal) {
        String result;
        SimpleDateFormat df = new SimpleDateFormat("MM月dd日");
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH)); //获取本周一的日期
        result = df.format(cal.getTime()) + "-";
        cal.set(Calendar.DAY_OF_MONTH,cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        result += df.format(cal.getTime());
        return result;
    }
}
