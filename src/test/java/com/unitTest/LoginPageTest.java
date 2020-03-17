package com.unitTest;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.matrix.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest {
    public  JSONObject jsonObject = LoginPage.getJson("登录页面登录异常提示");

    @Test
    public void testJson(){
        System.out.println(jsonObject.toJSONString());
    }


}
