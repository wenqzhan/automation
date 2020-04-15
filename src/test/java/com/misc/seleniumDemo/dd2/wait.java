package com.misc.seleniumDemo.dd2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class wait {


    WebDriver driver;

    @Test
    public void implicitlyWait() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        设置全局等待时间,一般如果用到这个,是放在beforeMethod中的.不过全局等待没有显示等待好,一般不用
        driver.manage().window().maximize();
        //        窗口最大化
        driver.findElement(By.xpath("//*[@id=\"wait\"]/input")).click();
//        定位wait按钮并点击
        String text = driver.findElement(By.xpath("//*[@id=\"display\"]/div[1]")).getText();
//        等到文字出现,获取文字内容
        Assert.assertEquals(text,"wait for display");
//         断言
    }



    @Test
    public void WebDriverWait() throws InterruptedException {


        driver.manage().window().maximize();
        //        窗口最大化
        driver.findElement(By.xpath("//*[@id=\"wait\"]/input")).click();
        //        定位wait按钮并点击
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("red")));
        String text = driver.findElement(By.xpath("//*[@id=\"display\"]/div[1]")).getText();
        //        等到文字出现,获取文字内容
        Assert.assertEquals(text,"wait for display");
//         断言
    }



    @BeforeMethod
    public void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "LogEventListener:\\driver\\geckodriver.exe");
//        指定驱动位置，这里使用的是绝对路径
        System.setProperty("webdriver.firefox.bin", "c:\\Program Files\\Mozilla Firefox\\firefox.exe");
//        指定浏览器的位置
//        driver = new FirefoxDriver();
//         创建火狐浏览器驱动对象
        driver = new ChromeDriver();

        driver.get("file:///D:/selenium_html/index.html");
//        访问测试页面

//        备注*临时处理方法,如果打开的都是同一个浏览器(比如火狐),这里就可以把新建浏览器对象放到这里
    }

    @AfterMethod
    public void closeBrowser() {
//        driver.quit();
//        关闭网页驱动
    }



}
