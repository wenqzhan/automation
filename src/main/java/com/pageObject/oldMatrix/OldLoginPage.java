package com.pageObject.oldMatrix;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.JsonObject;
import org.openqa.selenium.By;

public class OldLoginPage extends JsonObject {



//    public static String parentXpath;
//    public static String childTagName;
//    public static String childTagText;
//    public static String[] containsAttributeValue;
//    public static String[] notContainsAttributeValue;



    public static String matrixLoginUrl = "http://10.189.101.32:8080/";
    //public static JsonObject jsonObject= new JsonObject();
    //public static JSONObject json = new JSONObject();
    public final static String d1="登录页面用户名输入框";
    private final static String i1="j_username";

    public final static String d2="登录页面密码输入框";
    private final static String i2="j_password";

    public final static String d3="登录页面登录异常提示";
    private final static String x3="//html/body/div[3]/div/div[2]/div[2]/div/div[1]/p[contains(@style,'bloc')]";

    public final static String d4="登录页面登录按钮";
    private final static String i4="login_button";


    public static JSONObject getJson(String description){
        switch (description){
            case d1:
                JsonObject.setJsonObject(d1,"id",i1);
                break;
            case d2:
                JsonObject.setJsonObject(d2,"id",i2);
                break;
            case d3:
                JsonObject.setJsonObject(d3,x3);
                break;
            case d4:
                JsonObject.setJsonObject(d4,"id",i4);
                break;
        }


        return jsonObject;
    }



    //public static By loginPageCaptchaImageXpath = By.id("j_captchacode_img");
    //    登录页面验证码图片 验证码已废弃
  //  public static By loginPageUserNameInputXpath = By.id("j_username");
    //     登录页面用户名输入框
   // public static By loginPagePasswordInputXpath = By.id("j_password");
    //    登录页面密码输入框
    //public static By loginPageCaptchaInputXpath = By.id("j_captchacode");
    //    登录页面验证码框 验证码已废弃
   // public static By loginPageFailedInfoXpath = By.xpath("//*[@class=\"login-valid-text\"]/div");
    ///html/body/div[3]/div/div[2]/div[2]/div/div[1]/p[contains(@style,'bloc')]
//    登录页面登录异常提示文本框
/////////////     以上内容是登录页面元素

    public static By mainView = By.id("app-mainview-body");


}
