package com.demostration;

import com.actions.newmatrix.NewMatrixLoginAction;
import com.driver.$;


import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.actions.OpenBrowserAction;

public class OpenBrowserDemo {
    @Test
    public void openTest() throws InterruptedException {
        //NewMatrixLoginAction.login();
        NewMatrixLoginAction.login();
      //driver.get("https://www.baidu.com/");
//      $.get("file:///F:/%E6%BA%90%E7%A0%81/webdriver_demo/selenium_html/index.html");
//      $.findElement(By.xpath("/html/body/div/table/tbody/tr[13]/td[2]/div[1]/input"));
//      $.forceClick();
//      $.findElement(By.xpath("/html/body/div/table/tbody/tr[13]/td[2]/div[2]/div"));
//      Thread.sleep(3000);
      //Screenshot.screenshot("7777");
      //MyAssert.assertTrue(false);

    }

    @BeforeTest
    public static void beforeTest01(){
        OpenBrowserAction.open("firefox");
    }
    @AfterTest
    public static void afterTest01() throws InterruptedException {

        Thread.sleep(5000);
        $.quit();
    }

}
