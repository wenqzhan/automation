package com.misc.seleniumDemo.dd1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class locateWebElement {

    WebDriver driver;

    //    driver 是公共的，方便test或者aftermethod使用
    @Test
    public void findElementByID() throws InterruptedException {
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
        System.out.println(element);
        element.sendKeys("双11");
//        搜索框内输入双11
        element.submit();
//        提交搜索内容
        Thread.sleep(3000);
//        网页打开后停止3秒
    }

    @Test
    public void findElementByXpath() throws InterruptedException {
        driver.get("https://www.baidu.com");
//        访问百度
        Dimension dimension = new Dimension(800, 600);
//        新建窗口大小对象，800*600
        driver.manage().window().setSize(dimension);
//        把窗口调整为指定大小
        driver.manage().window().maximize();
//        窗口最大化
        WebElement element = driver.findElement(By.xpath("//*[@id=\"kw\"]"));
//        通过ID定位元素,这个方法最快.  定位百度页面ID为kw的元素(搜索框)
        element.sendKeys("双11");
//        搜索框内输入双11
        element.submit();
//        提交搜索内容
        Thread.sleep(3000);
//        网页打开后停止3秒



    }

    @Test
    public void findElementCssSelector() throws InterruptedException {
        driver.get("https://www.baidu.com");
//        访问百度
        Dimension dimension = new Dimension(800, 600);
//        新建窗口大小对象，800*600
        driver.manage().window().setSize(dimension);
//        把窗口调整为指定大小
        driver.manage().window().maximize();
//        窗口最大化
        WebElement element = driver.findElement(By.cssSelector("#kw"));
//        通过ID定位元素,这个方法最快.  定位百度页面ID为kw的元素(搜索框)
        element.sendKeys("双11");
//        搜索框内输入双11
        element.submit();
//        提交搜索内容
        Thread.sleep(3000);
//        网页打开后停止3秒
    }



    @Test
    public void findElementByName() throws InterruptedException {
        driver.get("https://www.baidu.com");
//        访问百度
        Dimension dimension = new Dimension(800, 600);
//        新建窗口大小对象，800*600
        driver.manage().window().setSize(dimension);
//        把窗口调整为指定大小
        driver.manage().window().maximize();
//        窗口最大化
        WebElement element = driver.findElement(By.name("wd"));
//        通过name定位元素,前提是name存在且唯一(或者是从上到下第一个).  定位百度页面ID为kw的元素(搜索框)
        element.sendKeys("双11");
//        搜索框内输入双11
        element.submit();
//        提交搜索内容
        Thread.sleep(3000);
//        网页打开后停止3秒
    }

    //      WebElement element = driver.findElement(By.className("className"));
    //      通过className定位元素,但是可能会报错找不到






    @Test
    public void findElementByLinkText() throws InterruptedException {
        driver.get("https://www.baidu.com");
//        访问百度
        Dimension dimension = new Dimension(800, 600);
//        新建窗口大小对象，800*600
        driver.manage().window().setSize(dimension);
//        把窗口调整为指定大小
        driver.manage().window().maximize();
//        窗口最大化
        WebElement element = driver.findElement(By.linkText("hao123"));
//        通过标签内文本定位元素,该元素必须在a标签内,定位hao123连接的按钮
        element.click();
//        单击hao123的按钮

        Thread.sleep(3000);
//        网页打开后停止3秒
    }

    @Test
    public void findElementByPartialLinkText() throws InterruptedException {
        driver.get("https://www.baidu.com");
//        访问百度
        Dimension dimension = new Dimension(800, 600);
//        新建窗口大小对象，800*600
        driver.manage().window().setSize(dimension);
//        把窗口调整为指定大小
        driver.manage().window().maximize();
//        窗口最大化
        WebElement element = driver.findElement(By.partialLinkText("糯"));
//        通过标签内部分文本定位元素,该元素必须在a标签内,定位糯米连接的按钮
        element.click();
//        单击糯米的按钮
        Thread.sleep(3000);
//        网页打开后停止3秒
    }



    @Test
    public void findElementByTagName() throws InterruptedException {
        driver.get("https://www.baidu.com");
//        访问百度
        Dimension dimension = new Dimension(800, 600);
//        新建窗口大小对象，800*600
        driver.manage().window().setSize(dimension);
//        把窗口调整为指定大小
        driver.manage().window().maximize();
//        窗口最大化
        List<WebElement> elements = driver.findElements(By.tagName("input"));
        //           WebElement element = driver.findElement(By.tagName("tagName"));
//          通过tagName定位元素,但是非常少用,最多用在赵frame标签上,但前提是只有一个frame,而且frame一般都有ID
//        所以如果一定要用tagName定位,则需要使用findElements,返回一个WebElement的list,这里查找的是input标签
//        System.out.println("111");
//        for(int i=0;i<elements.size();i++){
//            System.out.println("111"+elements.get(i).getText());
//        }
        elements.get(7).sendKeys("双11");
//        list中第8个元素是搜索框,搜索框中输入双11;
        elements.get(8).click();
//        list中第9个元素是搜索按钮,点击搜索;
        Thread.sleep(3000);
//        网页打开后停止3秒
    }








    @BeforeMethod
    public void openBrowser() {
        //System.setProperty("webdriver.gecko.driver", "LogEventListener:\\driver\\geckodriver.exe");
//        指定驱动位置，这里使用的是绝对路径
        //System.setProperty("webdriver.firefox.bin", "c:\\Program Files\\Mozilla Firefox\\firefox.exe");
//        指定浏览器的位置
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.gecko.driver",path + "\\drivers\\geckodriver.exe");
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
