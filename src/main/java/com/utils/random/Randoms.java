package com.utils.random;

import com.utils.log.LoggerController;

import java.util.Random;

public class Randoms {


    private final static LoggerController log = LoggerController.getLogger(Randoms.class);
    public static long getRandomNum(int length){
        long num = 0;
        num = (long) (Math.random() * Math.pow(10,length));
        //String description = String.valueOf(randomPageNum);
        log.info("生成随机数" + num + "位数:" +length);
        return num;
    }

/*
* [min,max]
* */
    public static int getRandomNum(int min,int max){
        int num = 0;
        Random random = new Random();
        num = random.nextInt(max-min+1)+min;

        log.info("生成区间随机数" + num + ",区间"+min+","+max);
        return num;
    }

    public static String getRandomStr(int length){
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i <length ; i++) {
            String charOrNum = random.nextInt(2)%2 == 0?"char":"randomPageNum";
            if(charOrNum.equals("char")){
                int tmp = random.nextInt(2)%2 ==0?65:97;
                str.append((char) (random.nextInt(26) + tmp));
            }else if (charOrNum.equals("randomPageNum")){
                str.append(String.valueOf(random.nextInt(10)));
            }
        }
        log.info("生成随机字符" + str + "位数:" +length);
        return str.toString();
    }






//    @Test
//    public void test(){
//        System.out.println(getRandomNum(10));
//        System.out.println(getRandomNum(10,30));
//        System.out.println(getRandomStr(10));
        //System.out.println(dateFormat(ZH_DATE_FORMAT));
        //createFolder("E:\\fdff\\1");
        //deleteDirectory("E:\\fdff");
//    }


}
