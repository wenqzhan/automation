package com.pageObject.matrix.navigate;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.JsonObject;

public class TopNavigator extends JsonObject {

    public final static String d1="菜单折叠按钮";
    private final static String x1="//*[name()=\"svg\" and @data-icon='menu-fold']";

    public final static String d2="顶端右上角用户名[工号]右边的下三角箭头";
    private final static String x2="//*[name()=\"svg\" and @data-icon='caret-down']";

    public final static String d3="密码修改按钮";
    private final static String x3="//span[1=1 and contains(text(),\"密码修改\")]";

    public final static String d4="退出登录按钮";
    private final static String x4="//span[1=1 and contains(text(),\"退出登录\")]";

    public final static String d5="注销提示,取消按钮";
    private final static String x5="//button[1=1 and contains(@type,'button') and contains(@class,'ant-btn')]//span[1=1 and contains(text(),\"取 消\")]";

    public final static String d6="注销提示,确定按钮";
    private final static String x6="//button[1=1 and contains(@type,'button') and contains(@class,'ant-btn')]//span[1=1 and contains(text(),\"确 定\")]";



    public static JSONObject getJson(String description){
        switch (description){
            case d1:
                JsonObject.setJsonObject(d1,x1);
                break;
            case d2:
                JsonObject.setJsonObject(d2,x2);
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
            case d6:
                JsonObject.setJsonObject(d6,x6);
                break;
        }
        return jsonObject;
    }


}
