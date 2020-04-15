package com.utils.num;

import com.utils.log.LoggerController;
import com.utils.random.Randoms;

import java.util.ArrayList;
import java.util.List;

public class IntMisc {
    private final static LoggerController log = LoggerController.getLogger(IntMisc.class);

    public static int getMaxPageNum(String text){
        int a =Integer.valueOf(text);
        log.info("当前最大页数是: " + a);
        return a;
    }

    public static int getPerPageNum(String text){
        String string = text.replace("条/页","").trim();
        int a = Integer.valueOf(string);
        log.info("当前的条/页是: " + a);
        return a;
    }

    public static int getRandomPageNum(String text){
        int a = Integer.valueOf(text);
        a = Randoms.getRandomNum(2,a-1);
        log.info("随机生成的页数是第: " +a+" 页");
        return a;


    }


    public static int getRandomPerPageNum(int currentPerPageNum){
        int a = 0;
        List<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(5);
        list.add(10);
        list.add(20);

        int position=-1;
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).equals(currentPerPageNum)){
                position = i;
                break;
            }
        }

        list.remove(position);

        int random = Randoms.getRandomNum(0,list.size()-1);

        a=list.get(random);

        log.info("随机生成的条/页是: "+ a);
        return a;
    }



}
