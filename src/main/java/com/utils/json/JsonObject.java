package com.utils.json;

import com.alibaba.fastjson.JSONObject;

public class JsonObject {
    public static JSONObject jsonObject = new JSONObject();
    public static String parentXpath;
    public static String childTagName;
    public static String childTagText;
    public static String[] containsAttributeValue;
    public static String[] notContainsAttributeValue;



    public static void setJsonObject(String description, String xpathValue){
        //jsonObject.put("description",description);
        //jsonObject.put("xpath",xpathValue);
        setJsonObject(description,"xpath",xpathValue);


    }


    public static void setJsonObject(String description, String strAfterBy, String value ){
        jsonObject.clear();
        jsonObject.put("description",description);
        jsonObject.put(strAfterBy,value);
    }




}
