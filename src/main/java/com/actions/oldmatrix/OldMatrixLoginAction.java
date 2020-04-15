package com.actions.oldmatrix;


import com.driver.$;
import com.pageObject.oldMatrix.OldLoginPage;

public class OldMatrixLoginAction extends $ {

    public static void login(){
        $.get(OldLoginPage.matrixLoginUrl);
        jsonObject = OldLoginPage.getJson(OldLoginPage.d1);
        $.findElement(jsonObject);
        $.clear();
        $.sendKeys("029527");
        jsonObject = OldLoginPage.getJson(OldLoginPage.d2);

        $.findElement(jsonObject);
        $.clear();
        $.sendKeys("gtja@2020");

        jsonObject = OldLoginPage.getJson(OldLoginPage.d4);
        $.findElement(jsonObject);
        $.click();
    }


}
