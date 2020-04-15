package com.pageObject.matrix.newPage;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.JsonObject;

public class PanoramicView extends JsonObject {

    public final static String d1="PanoramicView里的下箭头,定位了就说明打开了页面";
    private final static String x1="//i[1=1 and contains(@class,'el-icon-arrow-down')]";


    public static JSONObject getJson(String description) {
        switch (description) {
            case d1:
                JsonObject.setJsonObject(d1,x1);
                break;
        }
        return jsonObject;
    }

}
