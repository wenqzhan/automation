// 初步探讨testNG分级测试,主要介绍5个常用标签

package com.misc.seleniumDemo.dd1;

import org.testng.annotations.*;

public class testNGDemo1 {

    @BeforeTest
    public static void beforeTest01(){
        System.out.println("这是BeforeTest注解，层级高于BeforeMethod");
    }

    @BeforeMethod
    public static void beforeMethod01(){
        System.out.println("这是BeforeMethod注解,在每个method前执行");
    }

    @Test
    public static void testCase1(){
        System.out.println("这是@Test注解，case1");
    }

    @Test
    public static void testCase2(){
        System.out.println("这是@Test注解，case2");
    }

    @AfterTest
    public static void afterTest01(){
        System.out.println("这是AfterTest注解，层级高于AfterMethod");
    }

    @AfterMethod
    public static void AfterMethod01(){
        System.out.println("这是AfterMethod注解，在每个method后执行");
    }


//    测试顺序不是按照方法顺序，而是按照方法名的顺序（ascii码）
//    @BeforeTest   @BeforeMethod     @Test     @AfterTest     @AfterMethod 是常用注解
//    每一个test应该与其他case独立，不应该有互相依赖（比如test1 新建，test2 删除，正确做法是新建放入before中）
//    上面5个注解是最常用的

}
