package com.misc.seleniumDemo.dd2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class action_RightClick_DoubleClick_MoveToElement_MutipleClick_DragAndDrop {


    WebDriver driver;
    Actions action;
    @Test
    public void rightClickDoubleClick() throws InterruptedException, AWTException {


        WebElement element = driver.findElement(By.xpath("//*[@id=\"link\"]/a"));
//        实例化元素对象,目标是打开百度的连接


        action.contextClick(element).perform();
//        定位到连接,右击
        Robot robot = new Robot();
//        实例化机器人对象按
        robot.keyPress(KeyEvent.VK_ESCAPE);
//        按下escape//邮件打开了菜单,这里机器人模拟键盘输入esc,关闭右击菜单
        robot.keyRelease(KeyEvent.VK_ESCAPE);
//        抬起esc,需要注意按下后需要抬起
        Thread.sleep(1000);
//        为了让演示更加明显,加入硬等待
        action.doubleClick(element).perform();
//      双击

    }


    @Test
    public void moveToElement() throws InterruptedException, AWTException {


        WebElement element = driver.findElement(By.xpath("//*[@id=\"actions\"]/input"));
//        实例化元素对象,定位action按钮
        action.moveToElement(element).perform();
//        鼠标移动到元素上,记住需要perform
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"over\"]/div")));
//      显示等待


        String string = driver.findElement(By.xpath("//*[@id=\"over\"]/div")).getText();
//        定位移动到action后出来的元素

        Assert.assertEquals(string,"Hello World!");
//      断言文字是否符合预期
    }

    @Test
    public void multipleClick() throws InterruptedException {

        WebElement element = driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
//        用id定位元素
        List<WebElement> options =element.findElements(By.tagName("option"));
//        定位element下的所有元素
        action.keyDown(Keys.SHIFT).click(options.get(0)).click(options.get(2)).keyUp(Keys.SHIFT).build().perform();
//        按下shift,单击第一个,单击第三个,弹起shift
        Thread.sleep(2000);
        action.click(options.get(0)).keyDown(Keys.CONTROL).click(options.get(3)).keyUp(Keys.CONTROL).build().perform();
    }


    @Test
    public void dragAndDrop() throws InterruptedException {

        driver.get("file:///D:/selenium_html/dragAndDrop.html");
//        打开测试页面
        WebElement target = driver.findElement(By.id("drag"));
//        定位drag目标
        WebElement destination = driver.findElement(By.xpath("/html/body/h1"));
//        定位目的地
        action.dragAndDropBy(target,500,500).perform();
//        演示如何使用坐标，移动到目的地
        Thread.sleep(2000);
//        为了让演示明显一点
        action.clickAndHold(target).moveToElement(destination).release(target).perform();
//        hold住，移动，释放 备注，是移动到目标当中（比如此类中目的地是h1标签，占了一行，结果是移动到h1标签当中）
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
        driver.manage().window().maximize();
        //        窗口最大化
        action = new Actions(driver);
//        action动作需要实例化action对象
    }

    @AfterMethod
    public void closeBrowser() {
//        driver.quit();
//        关闭网页驱动
    }




}
