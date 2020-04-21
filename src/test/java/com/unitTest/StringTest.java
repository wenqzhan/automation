package com.unitTest;

import com.pageObject.matrix.orgCust.customerRelationshipFundAccount.DetailsPage;
import com.utils.list.ListMisc;
import com.utils.num.IntMisc;
import com.utils.random.Randoms;
import com.utils.string.StringMisc;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class StringTest {

    @Test
    private static void demo1() {

        String s = "heiima";

        String s2 = s.replace('i', 'o');            //用o替换i

        System.out.println(s2);


        String s3 = s.replace('z', 'o');            //z不存在,保留原字符不改变

        System.out.println(s3);


        String s4 = s.replace("ei", "ao");

        System.out.println(s4);

    }


    @Test
    public static void tsetst() {
        boolean a = StringMisc.isLike("部门客户", "部门级客户");
        boolean b = StringMisc.isLike("部门客户啊啊阿凤飞飞", "部门级客户啊啊阿凤飞飞");
        boolean c = StringMisc.isLike("部门客户", "部门级客户1111");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }


    @Test
    public static void ttttats(){
        String a =DetailsPage.getXpath("li","开户日期");
        System.out.println(a);
    }

    @Test
    public static void ttttat1s(){
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();

        l1.add("111");
        l1.add("222");

        l2.add("111");
//        l2.add("22");

       boolean a = ListMisc.isEqual1(l1,l2);
        System.out.println(a);
    }



    @Test
    public static void ttttats2(){
        int a = IntMisc.getRandomPerPageNum(20);
        System.out.println(a);
         a = IntMisc.getRandomPerPageNum(20);
        System.out.println(a);
         a = IntMisc.getRandomPerPageNum(20);
        System.out.println(a);
         a = IntMisc.getRandomPerPageNum(20);
        System.out.println(a);
         a = IntMisc.getRandomPerPageNum(20);
        System.out.println(a);
    }

}
