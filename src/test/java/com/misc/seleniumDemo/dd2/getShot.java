package com.misc.seleniumDemo.dd2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;




public class getShot {

    WebDriver driver;

    //    driver 是公共的，方便test或者aftermethod使用
    @Test
    public void getShot() throws InterruptedException {
        driver.get("https://www.baidu.com");
//        访问百度
        Dimension dimension = new Dimension(800, 600);
//        新建窗口大小对象，800*600
        driver.manage().window().setSize(dimension);
//        把窗口调整为指定大小
        driver.manage().window().maximize();
//        窗口最大化
        File screenShotFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        新建文件对象,将driver强转为截图
        try{
            FileUtils.copyFile(screenShotFile,new File("D:/test.png"));
//            截图保存
        }catch(IOException e){
            e.printStackTrace();
        }
//


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
