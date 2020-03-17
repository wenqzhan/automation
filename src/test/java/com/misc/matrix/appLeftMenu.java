package com.misc.matrix;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.misc.matrix.manageObject.*;


public class appLeftMenu {



    public static void locateButtonAndNavigateTo(WebDriver driver,String buttonName) throws AWTException, InterruptedException {

        locateElement(driver,appLeftMenuSearchInput).sendKeys(buttonName);
//        找到左侧导航栏中的搜索框，搜索要点击的按钮的名称

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
//            按下回车，弹起回车

        WebElement element = locateElementFromElements(driver, appLeftMenuButtons,buttonName);
        Thread.sleep(200);
        element.click();
//        clickOnHideButton(driver,element);
//      定位左侧导航栏中所有按钮，通过按钮中的文字定位，并点击。
//       按钮可能被其父元素覆盖，无法点击，调用方法点击

    }

    public static boolean isNotLeftMenuFormat(WebDriver driver) {
        Boolean flag = true;
        try {
            locateElement(driver,appTopMenu,1);
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }




}
