package com.misc.seleniumDemo.dd2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class isSelected {
    WebDriver driver;

    @Test
    public void isSelected() throws InterruptedException {

        driver.manage().window().maximize();
        //        窗口最大化
       WebElement element = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[4]/td[2]/div/input[2]"));
//      用xpath定位元素 saab
       element.click();
//      单击
       Boolean isSelected1 = element.isSelected();
//      新建boolean对象,判断元素是否被选定
       element = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[5]/td[2]/div/input[4]"));
//       用xpath定位元素 audi
        element.click();
//      单击
        Boolean isSelected2 = element.isSelected();
//      新建boolean对象,判断元素是否被选定


        Assert.assertTrue(isSelected1,"判断Saab有没有被选中");
//      断言
        Assert.assertTrue(isSelected2,"判断Audi有没有被选中");
//      断言
    }





    @BeforeMethod
    public void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "LogEventListener:\\driver\\geckodriver.exe");
//        指定驱动位置，这里使用的是绝对路径
        System.setProperty("webdriver.firefox.bin", "c:\\Program Files\\Mozilla Firefox\\firefox.exe");
//        指定浏览器的位置
        driver = new FirefoxDriver();
//         创建火狐浏览器驱动对象
//        driver = new ChromeDriver();

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
