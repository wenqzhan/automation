package com.unitTest;

import org.testng.annotations.Test;

public class ThreadTest {

    static int a = 1;

    public static void main(String[] args) {
        test();
    }


    public static void test(){
        int a = 0;
        //String s = String.valueOf(Thread.currentThread().getStackTrace()[3]);
        for (int i = 0; i <Thread.currentThread().getStackTrace().length ; i++) {
            if(!String.valueOf(Thread.currentThread().getStackTrace()[i]).contains("reflect")){
                System.out.print("\n"+"\t"+Thread.currentThread().getStackTrace()[i]);

            }else{break;}


        }

    }




}
