package com.utils.print;

import java.util.List;

public class PrintList {


    public static void printList(List<List<String>> list){
        for(List<String> l:list){
            for(String s:l){
                System.out.print(s);
                System.out.print("\t");
            }
            System.out.print("\n");
        }

    }

    public static void printObject(List<List<Object>> list){
        for(List<Object> l:list){
            for(Object s:l){
                System.out.print(s);
                System.out.print("\t");
            }
            System.out.print("\n");
        }

    }




}
