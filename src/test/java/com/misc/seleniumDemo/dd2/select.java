package com.misc.seleniumDemo.dd2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class select {

    WebDriver driver;

    @Test
    public void select() throws InterruptedException {
//      只有<select> </select> 才是下拉框,其他在页面上看上去像下拉框的都不是
        driver.manage().window().maximize();
        //        窗口最大化
        WebElement selectElement = driver.findElement(By.id("moreSelect"));
//        定位元素
        Select select = new Select(selectElement);
//        实例化 select
        select.selectByIndex(2);
//        选择下拉第二个,通过索引
        Thread.sleep(3000);
        select.selectByValue("huawei");
//        选择value为huawei的
        Thread.sleep(3000);
        select.selectByVisibleText("xiaomi");
//        选择页面上显示文字是xiaomi的


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
