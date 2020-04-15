//演示了如何使用 sendKeys clear 以及getText

package com.misc.seleniumDemo.dd2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class sendKeys {

    WebDriver driver;

    //    driver 是公共的，方便test或者aftermethod使用
    @Test
    public void sendKeysDemo1() throws InterruptedException {
        driver.get("https://www.baidu.com");
//        访问百度
        Dimension dimension = new Dimension(800, 600);
//        新建窗口大小对象，800*600
        driver.manage().window().setSize(dimension);
//        把窗口调整为指定大小
        driver.manage().window().maximize();
//        窗口最大化
        WebElement element = driver.findElement(By.id("kw"));
//        通过ID定位元素,这个方法最快.  定位百度页面ID为kw的元素(搜索框)
        element.sendKeys("selenium");
        //        搜索框内输入 selenium
        element.clear();
//        清除输入框内容
        element.sendKeys("selenium");
//        再次输入Selenium
        element.submit();
//        提交搜索内容
        String  urlName = driver.findElement(By.xpath("//*[@id=\"1\"]/h3/a")).getText();
//        *****获取标签当中的文本(不在标签当中的内容,无法获取)

        System.out.println(urlName);


        Thread.sleep(3000);
//        网页打开后停止3秒
    }

//

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
