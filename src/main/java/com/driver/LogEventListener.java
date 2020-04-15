package com.driver;

import com.utils.log.LoggerController;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

/**
 * 用一个类扩展web driver自带的事件监听器，可以实现许多有趣的功能。
 * 比如自动log
 * a customer event listener
 */
public class LogEventListener implements WebDriverEventListener {
    private final static LoggerController log = LoggerController.getLogger(LogEventListener.class);

    private By lastFindBy;
    private String originalValue;

    @Override
    public void beforeAlertAccept(WebDriver driver) {

    }

    @Override
    public void afterAlertAccept(WebDriver driver) {

    }

    @Override
    public void afterAlertDismiss(WebDriver driver) {

    }

    @Override
    public void beforeAlertDismiss(WebDriver driver) {

    }

    public void beforeNavigateTo(String url, WebDriver selenium){
        log.info("WebDriver navigating to:'"+url+"'");
    }

    public void beforeChangeValueOf(WebElement element, WebDriver selenium){
        originalValue = element.getAttribute("value");
    }

    public void afterChangeValueOf(WebElement element, WebDriver selenium){
        log.info("WebDriver changing value in element found "+lastFindBy+" from '"+originalValue+"' to '"+element.getAttribute("value")+"'");
    }

    public void beforeFindBy(By by, WebElement element, WebDriver selenium){
        lastFindBy = by;
        //找东西前等三秒wait 3 second for every find by
        //DriverManager.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        try {
            element = new WebDriverWait(selenium, 10).until(new ExpectedCondition<WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(by);
                }
            });
        } catch (Exception e) {
            log.error(e.toString());
        }


    }

    public void onException(Throwable error, WebDriver selenium){
        if (error.getClass().equals(NoSuchElementException.class)){
            log.error("WebDriver error: Element not found "+lastFindBy);
        } else {
            log.error("WebDriver error:"+error.toString());
        }
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> target) {

    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {

    }

    @Override
    public void beforeGetText(WebElement element, WebDriver driver) {

    }

    @Override
    public void afterGetText(WebElement element, WebDriver driver, String text) {

    }

    public void beforeNavigateBack(WebDriver selenium){}
    public void beforeNavigateForward(WebDriver selenium){}
    public void beforeClickOn(WebElement element, WebDriver selenium){}
    public void beforeScript(String script, WebDriver selenium){}
    public void afterClickOn(WebElement element, WebDriver selenium){
        String locator=element.toString().split("-> ")[1];
        log.info("WebDriver clicking on:'"+locator.substring(0, locator.length()-1)+"'");
    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        originalValue = element.getAttribute("value");
    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        log.info("WebDriver changing value in element found "+lastFindBy+" from '"+originalValue+"' to '"+element.getAttribute("value")+"'");
    }


    public void afterFindBy(By by, WebElement element, WebDriver selenium){}
    public void afterNavigateBack(WebDriver selenium){}
    public void afterNavigateForward(WebDriver selenium){}

    @Override
    public void beforeNavigateRefresh(WebDriver driver) {

    }

    @Override
    public void afterNavigateRefresh(WebDriver driver) {

    }

    public void afterNavigateTo(String url, WebDriver selenium){}
    public void afterScript(String script, WebDriver selenium){}

    @Override
    public void beforeSwitchToWindow(String windowName, WebDriver driver) {

    }

    @Override
    public void afterSwitchToWindow(String windowName, WebDriver driver) {

    }


}