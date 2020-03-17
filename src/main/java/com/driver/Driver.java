package com.driver;

import com.alibaba.fastjson.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

/**
 * 静态化多个变量以方便继承类直接调用静态方法
 * @author wenqzhan
 * @date 2020/03/17
 * */
public class Driver {
    public static WebDriver driver;
    public static WebElement element;
    public static List<WebElement> elements;
    public static String str;
    public static By by;
    public static JSONObject jsonObject;
    public static Actions action ;


}
