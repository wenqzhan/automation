package com.steps.loginTest;

import com.driver.$;
import com.actions.OpenBrowserAction;
import com.pageObject.matrix.LoginPage;
import com.pageObject.matrix.navigate.TopNavigator;
import com.utils.asserts.MyAssert;
import com.utils.log.LoggerController;
import io.cucumber.java.zh_cn.*;


public class LoginTestStepdefs extends $ {

    private final static LoggerController log = LoggerController.getLogger(LoginTestStepdefs.class);

    @当("^我用\"(.*?)\"打开\"(.*?)\"$")
    public void open(String browser, String website) throws Throwable {
        log.info("--------------测试开始-------------------");
        // Write code here that turns the phrase above into concrete actions
        if (driver == null) {
            if (browser.equals("谷歌浏览器")) {
                OpenBrowserAction.open("chrome");
            } else if (browser.equals("")) {
                OpenBrowserAction.open("firefox");
            }
        }
        if (website.equals("新matrix")) {
            $.get("http://10.187.144.60:8080/user/login");
        } else if (website.equals("百度")) {
            $.get("https://www.baidu.com");
        }
        log.info("我用" + browser + "打开了" + website);
        //throw new PendingException();
    }

    @假如("^我在登录界面用户名输入框中输入\"(.*?)\"$")
    public void inputUserName(String userName) {
        // Write code here that turns the phrase above into concrete actions
        //System.out.println("11111");
        jsonObject = LoginPage.getJson(LoginPage.d1);
        //System.out.println(jsonObject);
        $.findElement(jsonObject);
        System.out.println(element);
        $.clear();
        $.sendKeys(userName);
    }


    @同时("^我在密码框中输入\"(.*?)\"$")
    public void inputPassword(String password) {
        // Write code here that turns the phrase above into concrete actions
        jsonObject = LoginPage.getJson(LoginPage.d2);
        $.findElement(jsonObject);
        $.clear();
        $.sendKeys(password);
    }

    @当("^我点击登录按钮$")
    public void login() {
        jsonObject = LoginPage.getJson(LoginPage.d4);
        $.findElement(jsonObject);
        $.click();
    }

    @当("^成功登录$")
    public void longinSucessfully() {
        jsonObject = TopNavigator.getJson(TopNavigator.d2);
        $.findElement(jsonObject);
        //可以看到登录后才能看到的东西,那么登录成功
        //$.get("http://10.187.144.60:8080/user/login");
        jsonObject = TopNavigator.getJson(TopNavigator.d2);
        $.findElement(jsonObject);

        jsonObject = TopNavigator.getJson(TopNavigator.d4);
        $.findElement(jsonObject);
        $.click();

        jsonObject = TopNavigator.getJson(TopNavigator.d6);
        $.findElement(jsonObject);
        $.click();

        //$.click();
    }

    @当("^测试成功")
    public void testPassed() {
        log.info("test passed");
    }


    @假如("^系统有提示\"(.*?)\"$")
    public void getMessage(String message) {
        jsonObject = LoginPage.getJson(LoginPage.d3);
        $.findElement(jsonObject);
        $.getText();
        MyAssert.assertEquals(text, message);
    }

    @并且("^提示信息为\"(.*?)\"$")
    public void getDescription(String description) {
        jsonObject = LoginPage.getJson(LoginPage.d5);
        $.findElement(jsonObject);
        $.getText();
        MyAssert.assertEquals(text, description);
    }

    @当("^全部完成时退出驱动$")
    public void closeDriver(){
        $.quit();
        log.info("--------------测试结束-------------------");
    }
}
