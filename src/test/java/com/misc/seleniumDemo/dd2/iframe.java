package com.misc.seleniumDemo.dd2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframe {

    WebDriver driver;

    @Test
    public void iframeTest() throws InterruptedException {

        driver.manage().window().maximize();
        //        窗口最大化
        WebElement iframe = driver.findElement(By.tagName("iframe"));
//        用tagName定位iframe
        Thread.sleep(2000);
        driver.switchTo().frame(iframe);
//        控制权交给iframe
        driver.findElement(By.linkText("baidu")).click();
//       用linktext定位iframe中的百度链接,并单击
        driver.switchTo().defaultContent();
//        切换到iframe外
        Thread.sleep(2000);
//        必要的sleep,否则报错找不到元素
        driver.findElement(By.linkText("登陆界面")).click();
//        定位连接并单击


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
