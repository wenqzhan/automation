package com.seleniumModified.utils;

import com.seleniumModified.utils.log.LoggerController;
import org.testng.annotations.Test;

import java.util.Random;

public class Utils {


    final static LoggerController log = LoggerController.getLogger(Utils.class);
    public static String getRandomNum(int length){
        long num = 0;
        num = (long) (Math.random() * Math.pow(10,length));
        String str = String.valueOf(num);
        log.info("生成随机数" + str + "位数:" +length);
        return str;
    }

/*
* [min,max]
* */
    public static String getRandomNum(int min,int max){
        int num = 0;
        Random random = new Random();
        num = random.nextInt(max-min+1)+min;
        String str = String.valueOf(num);
        log.info("生成区间随机数" + str + "区间"+min+","+max);
        return str;
    }

    public static String getRandomStr(int length){
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i <length ; i++) {
            String charOrNum = random.nextInt(2)%2 == 0?"char":"num";
            if(charOrNum.equals("char")){
                int tmp = random.nextInt(2)%2 ==0?65:97;
                str.append((char) (random.nextInt(26) + tmp));
            }else if (charOrNum.equals("num")){
                str.append(String.valueOf(random.nextInt(10)));
            }
        }
        log.info("生成随机字符" + str + "位数:" +length);
        return str.toString();
    }






    @Test
    public void test(){
        System.out.println(getRandomNum(10));
        System.out.println(getRandomNum(10,30));
        System.out.println(getRandomStr(10));
        //System.out.println(dateFormat(ZH_DATE_FORMAT));
        //createFolder("E:\\fdff\\1");
        //deleteDirectory("E:\\fdff");
    }


}
