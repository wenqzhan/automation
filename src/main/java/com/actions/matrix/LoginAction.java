package com.actions.matrix;

import com.driver.$;
import com.pageObject.matrix.LoginPage;
import com.pageObject.matrix.orgCust.OrgCustList;
import com.pageObject.matrix.navigate.TopNavigator;
import org.openqa.selenium.By;

public class LoginAction extends $ {

    private static int counter = 0;


    public static void setCounter(int num){
        counter = num;

    }

    public static void login() {
        try {
            if (counter==0){
                throw new Exception("这是第一次登陆,请无视这个异常");
            }else if (counter > 0) {
                jsonObject = TopNavigator.getJson(TopNavigator.d2);
                $.findElement(jsonObject, 5);
            }
        } catch (Exception e) {
            login1();
            counter ++;
            //$.click();

//            jsonObject = TopNavigator.getJson(TopNavigator.d4);
//            $.findElement(jsonObject);
//            $.click();

//            jsonObject = TopNavigator.getJson(TopNavigator.d6);
//            $.findElement(jsonObject);
//            $.click();
        }
    }

    public static void login1(){
        $.get(LoginPage.matrix);
        jsonObject = LoginPage.getJson(LoginPage.d1);
        $.findElement(jsonObject);
        //$.clear();
        $.sendKeys("999999");

        jsonObject = LoginPage.getJson(LoginPage.d2);
        $.findElement(jsonObject);
        //$.clear();
        $.sendKeys("gtja@123456");

        jsonObject = LoginPage.getJson(LoginPage.d4);
        $.findElement(jsonObject);
        $.click();

        jsonObject = TopNavigator.getJson(TopNavigator.d2);
        $.findElement(jsonObject);

    }

    public static void login2(){
        login1();
        $.get(OrgCustList.matrixOrgCustList);
        //$.findElements()
        jsonObject = OrgCustList.getJson(OrgCustList.d9);
        //System.out.println(jsonObject);
        $.findElements(jsonObject);
        driver.findElements(By.xpath("//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key]"));
        //driver.findElement(By.xpath("//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key]"));
    }



}
