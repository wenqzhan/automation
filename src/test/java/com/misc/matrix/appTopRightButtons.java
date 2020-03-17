package com.misc.matrix;

import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.misc.matrix.manageObject.*;


public class appTopRightButtons {

    public static void changeMenuToLeft(WebDriver driver, String buttonName) throws AWTException {

        locateElement(driver,configButton).click();
//        找到设置按钮
        locateElementFromElements(driver,configViewElements,buttonName).click();
//         定位设置包含设置“左侧菜单”的一组元素并找到“左侧菜单”的元素并点击
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
//            按下回车，弹起回车，以便更换菜单风格

    }

}
