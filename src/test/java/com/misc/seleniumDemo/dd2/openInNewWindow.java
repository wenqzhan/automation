package com.misc.seleniumDemo.dd2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class openInNewWindow {


    WebDriver driver;

    @Test
    public void openInNewWindow() throws InterruptedException {
        String handle1 = driver.getWindowHandle();
//        获取窗口1的句柄
        String handle2 = "";
//        窗口2句柄
        driver.manage().window().maximize();
        //        窗口最大化
        WebElement openInNewWindow = driver.findElement(By.xpath("//*[@id=\"open\"]/a"));
//        窗口1定位打开新窗口的元素
        openInNewWindow.click();
//      点击元素
        for (String handles : driver.getWindowHandles()
             ) {
//            高级for循环,先得到所有的句柄,过滤每个句柄
            if (handles.equals(handle1))
                continue;
//            如果句柄值与窗口1句柄值相等,不执行下面的内容,继续循环
//            此方法适合只有两个窗口的情况
            handle2 = handles;
//            得到窗口2句柄
        }

        driver.switchTo().window(handle2);
//          切换到窗口2
        Thread.sleep(3000);

        driver.findElement(By.id("user")).sendKeys("jjjjj");
//      定位元素,框内输入文字
        Thread.sleep(3000);
        driver.close();
//        关闭窗口2
        driver.switchTo().window(handle1);
//        返回窗口1
        Thread.sleep(3000);
        driver.findElement(By.id("user")).sendKeys("jjjjj");
//      定位元素,框内输入文字


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
