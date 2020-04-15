package com.misc.seleniumDemo.dd2;

import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;


public class alert {
    WebDriver driver;
    Robot robot;

    //    driver 是公共的，方便test或者aftermethod使用
    @Test
    public void alertDemo1() throws InterruptedException {

        Dimension dimension = new Dimension(800, 600);
//        新建窗口大小对象，800*600
        driver.manage().window().setSize(dimension);
//        把窗口调整为指定大小
        driver.manage().window().maximize();
//        窗口最大化
        WebElement element = driver.findElement(By.className("alert"));
//        通过class name定位元素,需要注意class name 唯一
        element.click();
//        点击,弹出警告框
        Thread.sleep(3000);
//        为了防止点击后不及时弹出alert,先等一段时间
        Alert alert = driver.switchTo().alert();
//        驱动将控制权转移到alert,并新建alert对象
        alert.accept();
//        alert点击确认
        Thread.sleep(3000);
//        停止3秒
    }

    @Test
    public void confirmDemo1() throws InterruptedException, AWTException {

        driver.manage().window().maximize();
        //        窗口最大化
        driver.findElement(By.className("confirm")).click();
//       找到className是confirm的元素，并且点击
        Thread.sleep(3000);
//        为了防止点击后不及时弹出alert,先等一段时间
        Alert alert = driver.switchTo().alert();
//        驱动将控制权转移到alert,并新建alert对象（虽然网页上是confirm，但是还是算在alert里）
        System.out.println(alert.getText());
        alert.dismiss();
//        点击取消
        alert = driver.switchTo().alert();
        Thread.sleep(3000);
//       停止3秒
        System.out.println(alert.getText());
        robot = new Robot();
//      新建机器人对象(似乎firefox驱动有bug,第二个alert找不到)
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
//        机器人按空格键
//        alert.accept();
////        再点击确认

        Thread.sleep(3000);
//       停止3秒

    }

    @Test
    public void promptDemo1() throws InterruptedException {

        driver.manage().window().maximize();
        //        窗口最大化
        driver.findElement(By.className("prompt")).click();
//       找到className是prompt的元素，并且点击
        Thread.sleep(3000);
//        为了防止点击后不及时弹出alert,先等一段时间
        Alert alert = driver.switchTo().alert();
//        驱动将控制权转移到alert,并新建alert对象（虽然网页上是prompt，但是还是算在alert里）

        alert.sendKeys("this is a prompt");
//        输入框中输入文字
        Thread.sleep(3000);
//       停止3秒

        alert.accept();
//        再点击确认

        Thread.sleep(3000);
//       停止3秒
        alert.accept();
//        再点击确认


    }


//

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
