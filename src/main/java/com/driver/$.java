package com.driver;

import com.alibaba.fastjson.JSONObject;
import com.utils.convert.CharSequenceToString;
import com.utils.log.LoggerController;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.List;

/**
 * 对原生Driver进行扩展,以支持显示等待
 *
 * @author wenqzhan
 * @date 2020/03/17
 */
public class $ extends Driver {
    private final static LoggerController log = LoggerController.getLogger($.class);


    public static void getText() {
        try {
            text = element.getText();
            log.info("标签内文本是:" + text);
        } catch (Exception e) {
            log.error("获取标签内文本失败");
            hasException = true;
            throw e;
        }
    }


    /**
     * 清除内容
     * eg: 输入框中有内容,调用此方法后清除
     */
    public static void clear() {
        try {
            element.clear();
            log.info("clear 成功");
        } catch (Exception e) {
            log.error("clear 失败");
            hasException = true;
            throw e;
        }
    }

    /**
     * 输入内容
     *
     * @param keysToSend 需要输入的内容
     */
    public static void sendKeys(CharSequence... keysToSend) {
        try {
            element.sendKeys(keysToSend);
            log.info("输入了:" + CharSequenceToString.toString(keysToSend));
        } catch (Exception e) {
            hasException = true;
            log.error("输入 失败");
            throw e;
        }
    }


    /**
     * 定位单个网页元素,并返回一个网页元素
     *
     * @param jsonObject       json,包含元素的描述和定位方式
     * @param timeOutInSeconds 超时时间,以秒为单位
     */
    public static WebElement findElement(JSONObject jsonObject, int timeOutInSeconds) {

        str = jsonObject.getString("description");
        if (jsonObject.getString("xpath") != null) {
            by = By.xpath(jsonObject.getString("xpath"));
        } else if (jsonObject.getString("id") != null) {
            by = By.id(jsonObject.getString("id"));
        }

        log.info("即将定位元素:" + str);
        return findElement(by, timeOutInSeconds);
    }

    /**
     * 定位单个网页元素,并返回一个网页元素,默认超时时间为10秒
     *
     * @param jsonObject json,包含元素的描述和定位方式
     */
    public static WebElement findElement(JSONObject jsonObject) {

        return findElement(jsonObject, 10);
    }

    /**
     * 定位多个网页元素,并返回一个网页元素的list
     *
     * @param jsonObject       json,包含元素的描述和定位方式
     * @param timeOutInSeconds 超时时间,以秒为单位
     */
    public static List<WebElement> findElements(JSONObject jsonObject, int timeOutInSeconds) {
        str = jsonObject.getString("description");
        if (jsonObject.getString("xpath") != null) {
            by = By.xpath(jsonObject.getString("xpath"));
        } else if (jsonObject.getString("id") != null) {
            by = By.id(jsonObject.getString("id"));
        }
        log.info("即将定位元素:" + str);
        return findElements(by, timeOutInSeconds);
    }

    /**
     * 定位多个网页元素,并返回一个网页元素的list,默认超时时间为10秒
     *
     * @param jsonObject json,包含元素的描述和定位方式
     */
    public static List<WebElement> findElements(JSONObject jsonObject) {

        return findElements(jsonObject, 10);
    }


    /**
     * 定位单个网页元素,并返回一个网页元素
     *
     * @param by               定位方式
     * @param timeOutInSeconds 超时时间,以秒为单位
     */
    public static WebElement findElement(final By by, int timeOutInSeconds) {
        WebElement webElement = null;
        try {
            webElement = new WebDriverWait(driver, timeOutInSeconds).until(new ExpectedCondition<WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(by);
                }
            });
        } catch (NoSuchElementException e) {
            log.error("元素：" + by + "不存在");
            //driver.quit();
            //log.info("webDriver驱动已退出");
            hasException = true;
            throw new NoSuchElementException("元素：" + by + "不存在");
        } catch (TimeoutException e) {
            log.error("元素：" + by + "在" + timeOutInSeconds + "秒内找不到,超时");
            //driver.quit();
            //log.info("webDriver驱动已退出");
            hasException = true;
            throw new TimeoutException("元素：" + by + "在" + timeOutInSeconds + "秒内找不到,超时");
        } catch (Exception e) {
            log.error("元素：" + by + "找不到,发生了其他错误");
            //river.quit();
            //log.info("webDriver驱动已退出");
            hasException = true;
            throw new NoSuchElementException("元素：" + by + "找不到,发生了其他错误");
        }
        log.info("元素：" + by + "已定位");
        element = webElement;
        scrollIntoView();
        //页面可能没有显示元素,将元素滚动到可见的位置
        return webElement;

    }

    /**
     * 定位单个网页元素,并返回一个网页元素,默认超时时间为10秒
     *
     * @param by 定位方式
     */
    public static WebElement findElement(final By by) {
        return findElement(by, 10);
    }

    /**
     * 定位多个网页元素,并返回一个网页元素的list
     *
     * @param by               定位方式
     * @param timeOutInSeconds 超时时间,以秒为单位
     */
    public static List<WebElement> findElements(final By by, int timeOutInSeconds) {
        List<WebElement> webElements = null;
        try {
            webElements = new WebDriverWait(driver, timeOutInSeconds).until(new ExpectedCondition<List<WebElement>>() {
                public List<WebElement> apply(WebDriver driver) {
                    return driver.findElements(by);
                }
            });
        } catch (NoSuchElementException e) {
            log.error("元素(复数)：" + by + "不存在");
            //driver.quit();
            //log.info("webDriver驱动已退出");
            hasException = true;
            throw new NoSuchElementException("元素(复数)：" + by + "不存在");
        } catch (TimeoutException e) {
            log.error("元素(复数)：" + by + "在" + timeOutInSeconds + "秒内找不到,超时");
            //driver.quit();
            //log.info("webDriver驱动已退出");
            hasException = true;
            throw new TimeoutException("元素(复数)：" + by + "在" + timeOutInSeconds + "秒内找不到,超时");
        } catch (Exception e) {
            log.error("元素(复数)：" + by + "找不到,发生了其他错误");
            //river.quit();
            //log.info("webDriver驱动已退出");
            hasException = true;
            throw new NoSuchElementException("元素(复数)：" + by + "找不到,发生了其他错误");
        }
        log.info("元素(复数)：" + by + "已定位");
        elements = webElements;
        return webElements;

    }

    /**
     * 定位多个网页元素,并返回一个网页元素的list,默认超时时间为10秒
     *
     * @param by 定位方式
     */
    public static List<WebElement> findElements(final By by) {
        return findElements(by, 10);
    }

    /**
     * 驱动(浏览器)跳转网页或者访问文件
     *
     * @param s 一般为网页地址(包含协议文字http://......),或者文件地址(file:///......)
     */
    public static void get(String s) {
        try {
            driver.get(s);
            log.info("已跳转" + s);
        } catch (Exception e) {
            log.error("无法跳转" + s);
            hasException = true;
            log.error("get error");
            throw e;
        }
    }

    /**
     * 关闭驱动(关闭浏览器,并杀死驱动进程)
     */
    public static void quit() {
        log.info("关闭浏览器驱动");
        driver.quit();
        //driver = null;
    }

    /**
     * 点击元素,如果失败,尝试强制点击
     */
    public static void click() {
        try {
            element.click();
            log.info("点击成功");
        } catch (WebDriverException e) {
            log.info("点击失败,尝试强制点击");
            forceClick();

        } catch (Exception e){
            hasException = true;
            log.error("click error");
            throw e;
        }
    }


    /**
     * 强制点击(某些情况下会报StaleElementReferenceException)
     */
    public static void forceClick() {
        String xpath = "";
        int i = 1;
        // WebElement e = element;
        for (; ; i++) {
            try {
                //System.out.println(element);
                String str = element.toString();
                int strLength = str.length();
                //String xpath = "";
                for (int h = 0; h < strLength - 7; h++) {
                    if (str.substring(h, h + 7).equals("xpath: ")) {
                        xpath = str.substring(h + 7, strLength - 1).trim();
                        break;
                    }
                }
                ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
                break;
            } catch (StaleElementReferenceException e1) {
                log.info("尝试强制点击的元素的xpath是: " + xpath + ",第" + i + "次失败了");
                element = findElement(By.xpath(xpath));
//                    Thread.sleep(500);
                if (i > 3) {
                    log.error("尝试强制点击的元素的xpath是: " + xpath + ",第" + i + "次失败了");
                    hasException = true;
                    throw new StaleElementReferenceException(element + ";element is not attached to the page document");
                }
            } catch (Exception e){
                hasException = true;
                log.error("forceClick error");
                throw e;
            }
        }
        log.info("尝试强制点击的元素的xpath是: " + xpath + ",第" + i + "次成功了");
        //        try{
//            ((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
//        }catch(org.openqa.selenium.StaleElementReferenceException ex){
//            ((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
//        }

    }

    /**
     * 使用Javascript将元素滚动到可见的位置
     */
    public static void scrollIntoView() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
        } catch (Exception e) {
            hasException = true;
            log.error("scrollIntoView error");
            throw e;
        }
        moveMouseToView();
    }

    /**
     * 模拟悬停鼠标
     */
    public static void moveMouseToView() {
        try {
            action.moveToElement(element).perform();
        } catch (Exception e) {
            //hasException = true;
            log.error("moveMouseToView error");
            //throw e;
        }
        //log.info("鼠标悬停");
    }

    /**
     * 查找显示的元素
     */
    public static WebElement findDisplayedElement() {
        try {
            for (WebElement e : elements
            ) {
                if (e.isDisplayed()) {
                    element = e;
                    break;
                }
            }
        } catch (Exception e) {
            hasException = true;
            log.error("findDisplayedElement error");
            throw e;

        }
        scrollIntoView();
        return element;
    }


    /**
     * 定位倒数第一个元素
     */
    public static WebElement findLastElement() {
        try {
            if (elements.size() > 0) {
                element = elements.get(elements.size() - 1);
            } else {
                element = null;
            }
        } catch (Exception e) {
            hasException = true;
            log.error("findLastElement error");
            throw e;
        }
        scrollIntoView();
        return element;
    }

    /**
     * 定位倒数第二个元素
     */
    public static WebElement findSecondLastElement() {
        try {
            if (elements.size() > 1) {
                element = elements.get(elements.size() - 2);
            } else {
                element = null;
            }
        } catch (Exception e) {
            hasException = true;
            log.error("findSecondLastElement error");
            throw e;
        }
        scrollIntoView();
        return element;
    }

    /**
     * 模拟按下键盘某一个键并放开
     *
     * @param key 按键对应的数值
     */
    public static void pressAndRelease(int key) throws AWTException {
        Robot robot = new Robot();
        try {
            robot.keyPress(key);
            robot.keyRelease(key);
        } catch (Exception e) {
            hasException = true;
            log.error("pressAndRelease error");
            throw e;
        }
        //KeyEvent.VK_ESCAPE


    }

    /**
     * 双击
     */
    public static void doubleClick() {
        action.doubleClick(element).perform();
    }

    /**
     * 用已获得的网页元素集合通过标签中的文字定位单个网页元素,并返回一个网页元素
     *
     * @param textInTag 标签中的文字
     */
    public static WebElement findElement(String textInTag) {
        if (elements.size() > 1) {
            for (WebElement e : elements
            ) {
                if (e.getText().equals(textInTag)) {
                    element = e;
                    break;
                }
            }
        } else {
            element = null;
        }
        scrollIntoView();
        return element;
    }


}