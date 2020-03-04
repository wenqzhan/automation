package com.demostration;

import com.seleniumModified.action.$;
import com.seleniumModified.utils.asserts.MyAssert;
import com.seleniumModified.utils.screenshot.Screenshot;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.seleniumModified.action.Actions;

public class OpenBrowserDemo {
    WebDriver driver;
    WebElement element;
    @Test
    public void openTest() {

      //driver.get("https://www.baidu.com/");
      $.get("file:///e:/selenium_html/index.html");
      $.findElement(By.xpath("/html/body/div/table/tbody/tr[13]/td[2]/div[1]/input111")).click();
      $.findElement(By.xpath("/html/body/div/table/tbody/tr[13]/td[2]/div[2]/div"));
      Screenshot.screenshot("7777");
      MyAssert.assertTrue(false);

    }

    @BeforeTest
    public static void beforeTest01(){
        Actions.open("firefox");
    }
    @AfterTest
    public static void afterTest01(){
        $.quit();
    }

}
