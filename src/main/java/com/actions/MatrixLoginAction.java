package com.actions;

import com.alibaba.fastjson.JSONObject;
import com.driver.$;
import com.pageObject.LoginPage;
import org.openqa.selenium.By;

public class MatrixLoginAction extends $ {

    public static void login(){
        $.get("http://10.189.101.32/login.html");
        jsonObject = LoginPage.getJson(LoginPage.d1);
        $.findElement(jsonObject);
        $.clear();
        $.sendKeys("029527");
        jsonObject = LoginPage.getJson(LoginPage.d2);

        $.findElement(jsonObject);
        $.clear();
        $.sendKeys("gtja@2020");

        jsonObject = LoginPage.getJson(LoginPage.d4);
        $.findElement(jsonObject);
        $.click();
    }


}
