package com.pageObject.matrix.orgCust;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.commonObject.CommonObject;
import com.utils.json.JsonObject;

public class OrgCustList extends JsonObject {

    public static String matrixOrgCustList = "http://10.187.144.60:8080/orgcust/list";

    public final static String d1="客户查询-客户名称查询框";
    private final static String x1=CommonObject.getXpath(CommonObject.d2);

    public final static String d2="客户查询-OA账号查询框";
    private final static String x2= CommonObject.getXpath(CommonObject.d1);

    public final static String d3="客户查询-客户经理查询框";
    private final static String x3="//input[1=1 and contains(@type,'text') and contains(@class,'ant-input') and not(@placeholder)]";

    public final static String d4="客户查询-请输入统一社会信用代码查询框";
    private final static String x4="//input[1=1 and contains(@placeholder,'请输入统一社会信用代码')]";

    public final static String d5="客户查询-查询按钮";
    private final static String x5=CommonObject.getXpath(CommonObject.d3);

    public final static String d6="客户查询-重置按钮";
    private final static String x6=CommonObject.getXpath(CommonObject.d4);

    public final static String d7="客户查询-查询条件展开收起按钮";
    private final static String x7=CommonObject.getXpath(CommonObject.d5);

    public final static String d8="客户查询-表格";
    private final static String x8=CommonObject.getXpath(CommonObject.d9);

    public final static String d9="客户查询-表格表体rows";
    private final static String x9=CommonObject.getXpath(CommonObject.d10);

    public final static String d10="客户查询-表格表头row下的th col";
    private final static String x10=CommonObject.getXpath(CommonObject.d11);

    public final static String d11="客户查询-表格表头rows中的超链接s";
    private final static String x11="//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key]//a";




    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]

    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key]
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
            case d7:
                JsonObject.setJsonObject(d7,x7);
                break;
            case d8:
                JsonObject.setJsonObject(d8,x8);
                break;
            case d9:
                JsonObject.setJsonObject(d9,x9);
                break;
            case d10:
                JsonObject.setJsonObject(d10,x10);
                break;
            case d11:
                JsonObject.setJsonObject(d11,x11);
                break;
            //case d5:
            //JsonObject.setJsonObject(d5,x5);
            //break;
        }

        return jsonObject;

    }
}
