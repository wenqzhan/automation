package com.pageObject.matrix.navigate;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.JsonObject;

public class LeftNavigator extends JsonObject {

    public final static String d1="左上角搜索框";
    private final static String x1="//input[1=1 and contains(@placeholder,'Search...')]";

    public static JSONObject getJson(String description){
        switch (description){
            case d1:
                JsonObject.setJsonObject(d1,x1);
                break;
        }
        return jsonObject;
    }



}
