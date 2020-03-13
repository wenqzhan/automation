package com.utils.date;
import com.utils.log.LoggerController;
import org.testng.annotations.Test;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateFormat {
    final static LoggerController log = LoggerController.getLogger(DateFormat.class);
    public static final String ZH_DATE_FORMAT="yyyy-MM-dd HH:mm:ss";
    public static final String ZN_DATE_FORMAT="yyyy年MM月dd日 HH:mm:ss";
    public static final String ZC_DATE_FORMAT="yyyy年MM月dd日";
    public static final String SHORT_DATE_FORMAT = "yy-MM-dd HH:mm";
    public static final String CHECK_LOG_FORMAT = "yyyyMMdd";
    public static final String REPORT_CSV_FORMAT = "yyyyMMdd_HHmmss";
    private static SimpleDateFormat simpleDateFormat =new SimpleDateFormat();
    public static String format(String type){
        simpleDateFormat=new SimpleDateFormat(type);
        String s=simpleDateFormat.format(new Date());
        log.info("当前时间为："+s);
        return s;
    }
    /*根据当前时间获取11位随机数*/
    public static String time(){
        long currentTime= System.currentTimeMillis()/100;
        String randomNum=String.valueOf(currentTime);
        log.info("11位的随机数为："+randomNum);
        return randomNum;
    }

    @Test
    public void test(){
        System.out.println(format(ZH_DATE_FORMAT));
        System.out.println(format(ZN_DATE_FORMAT));
        System.out.println(format(ZC_DATE_FORMAT));
        System.out.println(format(SHORT_DATE_FORMAT));
        System.out.println(format(CHECK_LOG_FORMAT));
        System.out.println(format(REPORT_CSV_FORMAT));

    }


}
