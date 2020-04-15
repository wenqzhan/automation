package com.driver;

import com.alibaba.fastjson.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
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
    //public static ListMisc<WebElement> elements1;
    //public static ListMisc<WebElement> elements2;
    public static String str;
    public static By by;
    public static JSONObject jsonObject;
    public static Actions action ;
    public static String text;
//    public static boolean hasException = false;
    public static List<String> strsInTable = new ArrayList<>();
    public static List<List<String>> tableContent = new ArrayList<>();  //第0个是表头,第1个.....是表体
    public static boolean recordFlag = true;//用于findElement, 如果flag是false,则找不到元素时记录info而不是error
    public static int randomPageNum;
    public static int perPageNum;
    public static int maxPageNum;
    public static int randomPerPageNum;


}
