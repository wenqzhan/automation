package com.pageObject.matrix;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.JsonObject;

public class LoginPage extends JsonObject {

    public static String matrixLoginUrl = "http://10.187.144.60:8080/user/login";
    public static String matrix = "http://10.187.144.60:8080/";

    public final static String d1="新matrix登录页面用户名输入框";
    private final static String i1="username";

    public final static String d2="新matrix登录页面密码输入框";
    private final static String i2="password";

    public final static String d3="新matrix登录页面登录失败提示";
    private final static String x3="//div[@class='ant-notification-notice-message']";

    public final static String d4="新matrix登录页面登录按钮";
    private final static String x4="//button[@type='submit']";

    public final static String d5="新matrix登录页面登录失败详细说明";
    private final static String x5="//div[@class='ant-notification-notice-description']";

    //public final static String d5="ddddddd";
    //private final static String x5="//*[name()=\"svg\" and @data-icon='caret-down']";

    //*[name()="svg" and @data-icon='caret-down']

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
                JsonObject.setJsonObject(d4,x4);
                break;
            case d5:
                JsonObject.setJsonObject(d5,x5);
                break;
            //case d5:
                //JsonObject.setJsonObject(d5,x5);
                //break;
        }


        return jsonObject;
    }



}
