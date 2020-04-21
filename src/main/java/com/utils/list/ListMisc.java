package com.utils.list;

import com.utils.log.LoggerController;
import com.utils.string.StringMisc;
import jdk.internal.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMisc {
    private final static LoggerController log = LoggerController.getLogger(ListMisc.class);

    public static int getPosition(List<String> list, String string) {
        int a = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(string)) {
                a = i;
                break;
            }

        }
        return a;
    }

    public static boolean isEqualAfterSorted(List<String> list1, List<String> list2) {
        Collections.sort(list1);
        Collections.sort(list2);
        return isEqual1(list1, list2);
    }


    public static boolean isEqual1(List<String> list1, List<String> list2) {
        log.info("开始比较两个list");
        boolean flag = true;
        int a1 = list1.size();
        //System.out.println("a1 " + a1);
        int a2 = list2.size();
        //System.out.println("a2 " + a2);
        int a3 = (a1 > a2) ? a1 : a2;

        try {
            for (int i = 0; i < a3; i++) {
                if (StringMisc.isEqual(list1.get(i), list2.get(i)) == 0) {
                    flag = false;

                    String str1 = list1.get(i);
                    String str2 = list2.get(i);
                    log.error("[" + str1 + "]" + "和" + "[" + str2 + "]" + "不相同|" + "i是 " + i);
//                        System.out.println("i和j是 " + i + "," + j);
                    log.info(list1.get(i));
                    log.info(list2.get(i));
//                        System.out.println("**************");
                    break;
                } else if (StringMisc.isEqual(list1.get(i), list2.get(i)) == 2) {
                    String str1 = list1.get(i);
                    String str2 = list2.get(i);
                    log.info("[" + str1 + "]" + "和" + "[" + str2 + "]" + "不相同,但符合既定规则|" + "i是 " + i + ",");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            log.info("boolean isEqual error,一般是两个数组个数不一样导致的");
            flag = false;
        }

        if (flag) {
            log.info("两个List<String>相同");
        }
        return flag;
    }

    public static boolean isEqual(List<List<String>> list1, List<List<String>> list2){
        return  isEqual(list1,list2,true);
    }

    public static boolean isEqual(List<List<String>> list1, List<List<String>> list2, boolean isExceptionRecord) {
        log.info("开始比较两个list");
        boolean flag = true;
        int counter = 0;
        int a1 = list1.size();
        //System.out.println("a1 " + a1);
        int a2 = list2.size();
        //System.out.println("a2 " + a2);
        int a3 = (a1 > a2) ? a1 : a2;
        //System.out.println("a3 " + a3);
        try {
            for (int i = 0; i < a3; i++) {
                int b1 = list1.get(i).size();
                //System.out.println("b1 " + b1);
                int b2 = list2.get(i).size();
                //System.out.println("b2 " + b2);
                int b3 = (b1 > b2) ? b1 : b2;
                //System.out.println("b3 " + b3);
                for (int j = 0; j < b3; j++) {
                    if (StringMisc.isEqual(list1.get(i).get(j), list2.get(i).get(j)) == 0) {
                        //if (!(list1.get(i).get(j).equals(list2.get(i).get(j)))) {
                        flag = false;
                        String str1 = list1.get(i).get(j);
                        String str2 = list2.get(i).get(j);
                        if (isExceptionRecord) {
                            log.error("[" + str1 + "]" + "和" + "[" + str2 + "]" + "不相同|" + "i和j是 " + i + "," + j);
                        } else {
                            log.info("[" + str1 + "]" + "和" + "[" + str2 + "]" + "不相同|" + "i和j是 " + i + "," + j);
                        }
//                        System.out.println("i和j是 " + i + "," + j);
                        log.info(list1.get(i).get(j));
                        log.info(list2.get(i).get(j));
//                        System.out.println("**************");
                        counter++;
                        break;
                    } else if (StringMisc.isEqual(list1.get(i).get(j), list2.get(i).get(j)) == 2) {
                        String str1 = list1.get(i).get(j);
                        String str2 = list2.get(i).get(j);
                        log.info("[" + str1 + "]" + "和" + "[" + str2 + "]" + "不相同,但符合既定规则|" + "i和j是 " + i + "," + j);
                    }
                }

                if (counter > 0) {
                    break;
                }


            }


        } catch (Exception e) {
            e.printStackTrace();
            log.info("boolean isEqual error,一般是两个数组个数不一样导致的");
            flag = false;
        }

        if (flag) {
            log.info("两个List<List<String>>相同");
        }
        return flag;
    }

    public static List<String> listAdd(List<String> list, String string) {
        List<String> l = list;
        if (!list.contains(string)) {
            l.add(string);
        }

        return l;
    }


}
