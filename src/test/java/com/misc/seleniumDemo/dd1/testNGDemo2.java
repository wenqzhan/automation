//断言,一种校验方法. 演示了断言相同,断言不同,断言为空,断言非空,断言为真,断言为假
package com.misc.seleniumDemo.dd1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNGDemo2 {

//校验 a == a；
    @Test
    public void assertEqualTest(){
//       断言是否相等
        String a ="asdf";
        String b ="asdf1111";

        Assert.assertEquals(a,b,"a不等于b");
//      b是预期值，a是实际值


    }

    @Test
    public void assertNotEqualTest(){
//       断言是否不等
        int a = 1;
        int b = 2;

        Assert.assertNotEquals(a,b,"a不等于b");
//      b是预期值，a是实际值
//      assert 断言报错后后续代码不会执行（仅针对单个case，其他case仍会执行）

    }
    @Test
    public void assertNullTest(){
//        断言是否为空值
        String a = null;
        Assert.assertNull(a);
    }

    @Test
    public void assertNotNullTest(){
//        断言是否不为空值
        String a = "sdfsdfsdf";
        Assert.assertNotNull(a);
    }

    @Test
    public void assertTrue(){
//        断言是否为真
        boolean a = true;
        Assert.assertTrue(a);
    }

    @Test
    public void assertFalse(){
//        断言是否为假
        boolean a = true;
        Assert.assertTrue(a);
    }


}
