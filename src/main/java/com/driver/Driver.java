package com.driver;

import com.alibaba.fastjson.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
 * 静态化一个驱动
 * @author wenqzhan
 * @date 2020/03/10
 * */
public class Driver {
    public static WebDriver driver;
    public static WebElement element;
    public static List<WebElement> elements;
    public static String str;
    public static By by = null;
    public static JSONObject jsonObject = null;


}
