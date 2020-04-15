//演示了打开-关闭火狐\chrome\ie\edge 并主要演示了用火狐打开百度,跳转腾讯,前进,后退,刷新,设定窗口大小,窗口最大化,校验当前url,校验当前页面标题
package com.misc.seleniumDemo.dd1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class openWebBrowser {
    WebDriver driver;
//    driver 是公共的，方便test或者aftermethod使用
    @Test
    public void openFireFoxTest() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "LogEventListener:\\driver\\geckodriver.exe");
//        指定驱动位置，这里使用的是绝对路径
        System.setProperty("webdriver.firefox.bin", "c:\\Program Files\\Mozilla Firefox\\firefox.exe");
//        指定浏览器的位置
        driver = new FirefoxDriver();
//        创建火狐浏览器驱动对象
        driver.get("https://www.baidu.com");
//        访问百度
        Thread.sleep(3000);
//        网页打开后停止3秒
        driver.navigate().to("http://www.qq.com");
//        driver.get("http://www.qq.com");
//        访问qq
        Thread.sleep(3000);
//        网页打开后停止3秒
        driver.navigate().back();
//        回到上一个页面
        Thread.sleep(3000);
//          网页打开后停止3秒
        driver.navigate().forward();
//        前进到下一个页面
        Thread.sleep(3000);
//          网页打开后停止3秒
        driver.navigate().refresh();
//        刷新页面
        Thread.sleep(3000);
//         停止3秒
        Dimension dimension = new Dimension(800,600);
//        新建窗口大小对象，800*600
        driver.manage().window().setSize(dimension);
//        把窗口调整为指定大小
        driver.manage().window().maximize();
//        窗口最大化
        String url = driver.getCurrentUrl();
//        获取当前页面地址
        Assert.assertEquals(url,"http://www.qq.com/");
//        校验当前页面是否是qq,后者是预期值
        String title = driver.getTitle();
//        获取当前页面标题
        Assert.assertEquals(title,"腾讯首页");
//        校验当前页面标题是否是腾讯首页
//        driver.quit();
//        写在test里不太好，因为可能报错，导致关闭driver无法执行
////        关闭网页并关闭驱动 driver.close();仅关闭当前页面
    }

    @BeforeMethod
    public void openBrowser(){
//        临时处理方法,如果打开的都是同一个浏览器(比如火狐),这里就可以把新建浏览器对象放到这里
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
//        关闭网页驱动
    }

    @Test
    public void openChromeTest() {
        System.setProperty("webdriver.chrome.driver", "LogEventListener:\\driver\\chromedriver.exe");
//        指定驱动位置，这里使用的是绝对路径
        System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//        指定浏览器的位置
        WebDriver driver = new ChromeDriver();
//        创建chrome浏览器驱动对象
        driver.get("http://www.baidu.com");
//        访问百度
        driver.quit();
//        关闭网页并关闭驱动 driver.close();仅关闭当前页面
    }

    @Test
    public void openIETest() {
        System.setProperty("webdriver.ie.driver", "LogEventListener:\\driver\\IEDriverServer.exe");
//        指定驱动位置，这里使用的是绝对路径
//        System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//        指定浏览器的位置,ie 位置无需指定
//        可能需要在ie选项-安全中关闭穷保护模式
        WebDriver driver = new InternetExplorerDriver();
//        创建chrome浏览器驱动对象
        driver.get("http://www.baidu.com");
//        访问百度
        driver.quit();
//        关闭网页并关闭驱动 driver.close();仅关闭当前页面
    }

    @Test
    public void openEdgeTest() {
        System.setProperty("webdriver.edge.driver", "LogEventListener:\\driver\\MicrosoftWebDriver.exe");
//        指定驱动位置，这里使用的是绝对路径
//        System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//        指定浏览器的位置,edge位置无需指定
//
        WebDriver driver = new EdgeDriver();
//        创建chrome浏览器驱动对象
        driver.get("http://www.baidu.com");
//        访问百度
        driver.quit();
//        关闭网页并关闭驱动 driver.close();仅关闭当前页面
    }


}
