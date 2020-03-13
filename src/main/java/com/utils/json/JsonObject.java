package com.utils.json;

import com.alibaba.fastjson.JSONObject;

public class JsonObject {
    public static JSONObject jsonObject = new JSONObject();



    public static void setJsonObect(String description,String xpathValue){
        jsonObject.put("description",description);
        jsonObject.put("xpath",xpathValue);
    }


    public static void setJsonObect(String description,String strAfterBy, String value ){
        jsonObject.put("description",description);
        jsonObject.put(strAfterBy,value);
    }




}
