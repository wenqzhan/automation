package com.seleniumModified.action;

import com.seleniumModified.utils.log.LoggerController;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Actions extends $ {
    final static LoggerController log = LoggerController.getLogger(Actions.class);
    /*
     * 封装调用浏览器方法
     * */
    public static void open (String browser){

        String path = System.getProperty("user.dir");
        if(browser.equals("chrome")){
            driver = new ChromeDriver();
            //属性需要进一步设置
        }else if (browser.equals("ie")){
            driver = new InternetExplorerDriver();
            //属性需要进一步设置
        }else if (browser.equals("firefox")){
            //System.setProperty("webdriver.firefox.marionette","D:\\ideaProject\\Selenium_Demo\\drivers\\geckodriver.exe");
            System.setProperty("webdriver.gecko.driver",path + "\\drivers\\geckodriver.exe");
            System.out.println(path+ "\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            log.info("实例化了一个新的"+browser);
        }else
            //System.err.print("Wrong browser name:" + browser);
            log.error("错误的浏览器名称:" + browser);
       //return  driver;
    }

}
