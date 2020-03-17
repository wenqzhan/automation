package com.misc.matrix;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class manageObject {
    private static WebDriver driver = null;

    public static By loginPageCaptchaImage = By.id("j_captchacode_img");
    //    登录页面验证码图片
    public static By loginPageUserNameInput = By.id("j_username");
    //     登录页面用户名输入框
    public static By loginPagePasswordInput = By.id("j_password");
    //    登录页面密码输入框
    public static By loginPageCaptchaInput = By.id("j_captchacode");
    //    登录页面验证码框
    public static By loginPageFailedInfo = By.xpath("//*[@class=\"login-valid-text\"]/div");
//    登录页面登录异常提示文本框

/////////////     以上内容是登录页面元素

    public static By configButton = By.xpath("//*[@id=\"app-header-body\"]//i[@title=\"设置\"]");
//    上方头部设置按钮（退出登录左边的那个）
    public static By configViewElements = By.xpath("//*[@id=\"app-configview-targetEl\"]//label");
// 返回点击菜单设置后带出的一系列label标签，比如“左侧菜单”label
    public static String zuoCeCaiDan = "左侧菜单";

/////////////     以上内容是右上方设置


    public static By appTopMenu = By.id("app-topmenu-innerCt");
//    正上方导航栏

/////////////     以上内容是正上方顶部导航栏

    public static By appLeftMenuSearchInput = By.xpath("//*[@id=\"_jewestview-body\"]//input[@placeholder=\"Search...\"]");
//    页面左侧导航栏中的搜索框
    public static By appLeftMenuButtons = By.xpath("//*[@id=\"_jewestview-body\"]//span[@class=\"text\"]");
//     页面左侧导航栏所有按钮
    public static String huiYiHuoDongShengQin = "会议活动申请";

/////////////     以上内容是左侧导航栏

    public static WebElement locateElementFromElements(WebDriver driver,By elements,String text) throws NoSuchElementException {
        WebElement element = null;
//        实例化element
        List<WebElement> es = locateElements(driver,elements);
        for (WebElement e:es
        ) {
            if(e.getText().equals(text)){
                element = e;
                break;
            }
        }
//        获取所有的元素，逐个过滤
        if(element==null){
            throw new NoSuchElementException(text+"元素无法定位");
        }
//         如果无法找到元素，抛出错误
        return element;
//        返回元素
    }
/////////////     以上方法用来从复数元素中定位单个元素


    public static void clickOnHideButton(WebDriver driver,WebElement element)
    {
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
    }
//  点击被遮挡元素的方法

    public static WebElement locateElement(WebDriver driver,final By by){
        return locateElement(driver,by,10);
    }


    public static WebElement locateElement(WebDriver driver,final By by,int timeOutInSeconds){
        WebElement webElement = null;
        try {
            webElement = new WebDriverWait(driver,timeOutInSeconds).until(new ExpectedCondition<WebElement>() {
                public WebElement apply(WebDriver driver){
                    return driver.findElement(by);
                }
            });
        }catch (Exception e){
            throw new NoSuchElementException("元素："+by+"查找超时");
        }
        return  webElement;
    }


    public static List<WebElement> locateElements(WebDriver driver,final By by){

        return locateElements(driver,by,10);
    }

    public static List<WebElement> locateElements(WebDriver driver,final By by,int timeOutInSeconds){
       List<WebElement> webElements = null;
       try {
           webElements = new WebDriverWait(driver,timeOutInSeconds).until(new ExpectedCondition<List<WebElement>>() {
               public List<WebElement> apply(WebDriver driver){
                   return driver.findElements(by);
               }
           });
       } catch (Exception e){
           throw new NoSuchElementException("元素："+by+"查找超时");
       }
       return webElements;

    }





    public static String matrixLoginUrl = "http://10.189.101.32:8080/";
    public static String remoteUrl = "http://183.134.65.23:589/";
//    测试环境首页

}
