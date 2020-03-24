package com.actions.matrix;

import com.driver.$;
import com.pageobject.matrix.LoginPage;
import com.pageobject.matrix.TopNavigator;

public class MatrixLoginAction extends $ {

    public static void login(){
        $.get(LoginPage.matrixLoginUrl);
        jsonObject = LoginPage.getJson(LoginPage.d1);
        $.findElement(jsonObject);
        $.clear();
        $.sendKeys("999999");

        jsonObject = LoginPage.getJson(LoginPage.d2);
        $.findElement(jsonObject);
        $.clear();
        $.sendKeys("gtja@123456");

        jsonObject = LoginPage.getJson(LoginPage.d4);
        $.findElement(jsonObject);
        $.click();

        jsonObject = TopNavigator.getJson(TopNavigator.d2);
        $.findElement(jsonObject);
        //$.click();

        jsonObject = TopNavigator.getJson(TopNavigator.d4);
        $.findElement(jsonObject);
        $.click();

        jsonObject = TopNavigator.getJson(TopNavigator.d6);
        $.findElement(jsonObject);
        $.click();

    }


}
