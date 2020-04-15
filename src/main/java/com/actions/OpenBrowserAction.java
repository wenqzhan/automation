package com.actions;

import com.driver.$;
import com.driver.LogEventListener;
import com.utils.log.LoggerController;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.HashMap;

/**
 * 封装打开浏览器的操作
 *
 * @author wenqzhan
 * @date 2020/03/07
 */
public class OpenBrowserAction extends $ {
    private final static LoggerController log = LoggerController.getLogger(OpenBrowserAction.class);


    public static void open(String browser) {
        if (driver == null) {
            initialise(browser);
            driver.manage().window().maximize();
            action = new Actions(driver);
        }
    }


    /**
     * 封装调用浏览器方法
     *
     * @param browser 浏览器名称
     */
    public static void initialise(String browser) {

        String path = System.getProperty("user.dir");
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", path + "\\drivers\\chromedriver.exe");
            System.out.println(path + "\\drivers\\chromedriver.exe");
            String downloadPath = "D:\\ChromeDownload";
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("download.default_directory", downloadPath);
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setExperimentalOption("prefs", hashMap);
//            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//            desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

            driver = new ChromeDriver(chromeOptions);
            log.info("实例化了一个新的" + browser);
            //属性需要进一步设置
        } else if (browser.equals("ie")) {
            driver = new InternetExplorerDriver();
            //属性需要进一步设置
        } else if (browser.equals("firefox")) {
            //System.setProperty("webdriver.firefox.marionette","D:\\ideaProject\\Selenium_Demo\\drivers\\geckodriver.exe");
            System.setProperty("webdriver.gecko.driver", path + "\\drivers\\geckodriver.exe");
            System.out.println(path + "\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            //driver =  new EventFiringWebDriver(new FirefoxDriver()).register(new LogEventListener());
            //driver.manage().window().maximize();
            log.info("实例化了一个新的" + browser);
        } else
            //System.err.print("Wrong browser name:" + browser);
            log.error("错误的浏览器名称:" + browser);
        //return  driver;
    }

}
