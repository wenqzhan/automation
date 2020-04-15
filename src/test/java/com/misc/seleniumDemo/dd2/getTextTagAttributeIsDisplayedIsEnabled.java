package com.misc.seleniumDemo.dd2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class getTextTagAttributeIsDisplayedIsEnabled {


    WebDriver driver;

    //    driver 是公共的，方便test或者aftermethod使用
    @Test
    public void getTextTagAttributeIsDisplayedIsEnabled() throws InterruptedException {
        driver.get("https://www.baidu.com");
//        访问百度
        Dimension dimension = new Dimension(800, 600);
//        新建窗口大小对象，800*600
        driver.manage().window().setSize(dimension);
//        把窗口调整为指定大小
        driver.manage().window().maximize();
//        窗口最大化
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.cssSelector("a.mnav:nth-child(1)"));
//      新建元素对象,使用cssSelector定位,定位的是百度页面新闻链接
        String urlName = element.getText();
//      获取标签当中的文字
        String tagName = element.getTagName();
//      获取标签名字
        String className = element.getAttribute("class");
//      获取class的内容
        Boolean isDisplayed = element.isDisplayed();
//        判断新闻链接是否可见
        Boolean isEnabled = element.isEnabled();
//        判断新闻链接是否可以点下去

        Assert.assertEquals(urlName,"新闻");
//      断言a标签当中的文字是否符合预期
        Assert.assertEquals(tagName,"a");
//      断言标签名称是否符合预期
        Assert.assertEquals(className,"mnav");
//      断言标签中某个属性是否符合预期
        Assert.assertTrue(isDisplayed,"校验新闻链接是否可见");
        Assert.assertTrue(isEnabled,"校验新闻链接是否可点下去");
        Thread.sleep(3000);
//        网页打开后停止3秒
    }





    @BeforeMethod
    public void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "LogEventListener:\\driver\\geckodriver.exe");
//        指定驱动位置，这里使用的是绝对路径
        System.setProperty("webdriver.firefox.bin", "c:\\Program Files\\Mozilla Firefox\\firefox.exe");
//        指定浏览器的位置
        driver = new FirefoxDriver();
//        创建火狐浏览器驱动对象

//        备注*临时处理方法,如果打开的都是同一个浏览器(比如火狐),这里就可以把新建浏览器对象放到这里
    }

    @AfterMethod
    public void closeBrowser() {
//        driver.quit();
//        关闭网页驱动
    }



}
