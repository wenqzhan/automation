package com.demostration.steps;
import com.driver.$;
import com.actions.OpenBrowserAction;
import com.utils.log.LoggerController;
import io.cucumber.java.zh_cn.*;
import org.openqa.selenium.By;

public class MyStepdefs {//我用"火狐"打开"百度"

    final static LoggerController log = LoggerController.getLogger(MyStepdefs.class);

//    @当("^我用\"(.*?)\"打开\"(.*?)\"$")
//    public void open(String browser, String website) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        if(browser.equals("火狐")){
//            OpenBrowserAction.open("firefox");
//        }
//        if(website.equals("百度")){
//            $.get("https://www.baidu.com");
//        }
//        log.info("我用"+browser+"打开了"+website);
//        //throw new PendingException();
//    }

    @并且("^我在搜索框里搜索\"(.*?)\"$")
    public void search(String str) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        $.findElement(By.id("kw")).clear();
        $.findElement(By.id("kw")).sendKeys(str);
        $.findElement(By.id("su")).click();
        log.info("搜索了"+str);
        //throw new PendingException();
    }

    @假如("^可以正常搜索$")
    public void isValid() throws InterruptedException {
        Thread.sleep(3000);
        log.info("do sth do sth do sth");
    }

    @假如("^关闭驱动$")
    public void end(){
        $.quit();
        log.info("endend");
    }
}
