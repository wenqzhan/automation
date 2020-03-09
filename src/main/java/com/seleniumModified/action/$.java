package com.seleniumModified.action;

import com.seleniumModified.Driver;
import com.seleniumModified.utils.log.LoggerController;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class $ extends Driver {
    final static LoggerController log = LoggerController.getLogger($.class);

    public static WebElement findElement(final By by, int timeOutInSeconds) {
        WebElement webElement = null;
        try {
            webElement = new WebDriverWait(driver, timeOutInSeconds).until(new ExpectedCondition<WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(by);
                }
            });
        } catch (NoSuchElementException e) {
            log.error("元素：" + by + "在" + timeOutInSeconds + "秒内找不到");
            driver.quit();
            log.info("webDriver驱动已退出");
            throw new NoSuchElementException("元素：" + by + "在" + timeOutInSeconds + "秒内找不到");
        } catch (Exception e) {
            log.error("元素：" + by + "在" + timeOutInSeconds + "秒内找不到,发生了其他错误");
            throw e;
        }
        log.info("元素：" + by + "已定位");
        return webElement;

    }

    public static WebElement findElement(final By by) {
        return findElement(by, 10);
    }

    public static List<WebElement> findElements(final By by, int timeOutInSeconds) {
        List<WebElement> webElements = null;
        try {
            webElements = new WebDriverWait(driver, timeOutInSeconds).until(new ExpectedCondition<List<WebElement>>() {
                public List<WebElement> apply(WebDriver driver) {
                    return driver.findElements(by);
                }
            });
        } catch (NoSuchElementException e) {
            log.error("元素(复数)：" + by + "在" + timeOutInSeconds + "秒内找不到");
            driver.quit();
            log.info("webDriver驱动已退出");
            throw new NoSuchElementException("元素(复数)：" + by + "在" + timeOutInSeconds + "秒内找不到");
        } catch (Exception e) {
            log.error("元素：" + by + "在" + timeOutInSeconds + "秒内找不到,发生了其他错误");
            throw e;
        }
        log.info("元素(复数)：" + by + "已定位");
        return webElements;

    }

    public static List<WebElement> findElements(final By by) {
        return findElements(by, 10);
    }

    public static void get(String s) {
        try {
            driver.get(s);
            log.info("已跳转" + s);
        } catch (Exception e) {
            log.error("无法跳转" + s);
        }
    }

    public static void quit() {
        log.info("关闭浏览器驱动");
        driver.quit();

    }

}
