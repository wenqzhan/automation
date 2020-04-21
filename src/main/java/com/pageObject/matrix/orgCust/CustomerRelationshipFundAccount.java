package com.pageObject.matrix.orgCust;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.commonObject.CommonObject;
import com.utils.json.JsonObject;

public class CustomerRelationshipFundAccount extends JsonObject {

    public static String matrixCustomerRelationshipFundAccount = "http://10.187.144.60:8080/orgcust/customerRelationshipFundAccount";

    public final static String d1 = "客户关系资金账号-OA账号查询框";
    private final static String x1 = CommonObject.getXpath(CommonObject.d1);

    public final static String d2="客户关系资金账号-客户名称查询框";
    private final static String x2=CommonObject.getXpath(CommonObject.d2);

    public final static String d3="客户关系资金账号-查询按钮";
    private final static String x3=CommonObject.getXpath(CommonObject.d3);

    public final static String d4="客户关系资金账号-重置按钮";
    private final static String x4=CommonObject.getXpath(CommonObject.d4);

    public final static String d5="客户关系资金账号-报表导出按钮";
    private final static String x5=CommonObject.getXpath(CommonObject.d6);

    public final static String d6 = "客户关系资金账号-报表导出确认按钮";
    private final static String x6 = CommonObject.getXpath(CommonObject.d7);

    public final static String d7 = "客户关系资金账号-报表导出文件名输入框";
    private final static String x7 = CommonObject.getXpath(CommonObject.d8);

    public final static String d8 = "客户关系资金账号-表格";
    private final static String x8 = CommonObject.getXpath(CommonObject.d9);

    public final static String d9 = "客户关系资金账号-表格表体rows";
    private final static String x9 = CommonObject.getXpath(CommonObject.d10);

    public final static String d10 = "客户关系资金账号-表格表头row下的th col";
    private final static String x10 = CommonObject.getXpath(CommonObject.d11);

    public final static String d11 = "客户关系资金账号-表格下方翻页按钮-下一页前的按钮,可以看出共多少页";
    private final static String x11 = CommonObject.getXpath(CommonObject.d14);

    public final static String d12 = "客户关系资金账号-表格下方跳页输入框";
    private final static String x12 = CommonObject.getXpath(CommonObject.d15);

    public final static String d13 = "客户关系资金账号-表格下方跳页输入框左边的跳至两个字";
    private final static String x13 = CommonObject.getXpath(CommonObject.d16);




    public final static String d14 = "客户关系资金账号-数据加载(转菊花)";
    private final static String x14 = CommonObject.getXpath(CommonObject.d17);

    public final static String d15 = "客户关系资金账号-表格下方翻页按钮-下一页";
    private final static String x15 = CommonObject.getXpath(CommonObject.d13);

    public final static String d16 = "客户关系资金账号-条/页";
    private final static String x16 = CommonObject.getXpath(CommonObject.d18);

    private static String get$D1(String num){
        return CommonObject.get$D1(num).replace("通用","客户关系资金账号");
    }

    private static String get$X1(String num){
        return CommonObject.get$X1(num);
    }

    public static JSONObject  get$Json(String num){
       JsonObject.setJsonObject(get$D1(num),get$X1(num));
        return jsonObject;
    }


    public static JSONObject getJson(String description) {
        switch (description) {
            case d1:
                JsonObject.setJsonObject(d1, x1);
                break;
            case d2:
                JsonObject.setJsonObject(d2, x2);
                break;
            case d3:
                JsonObject.setJsonObject(d3, x3);
                break;
            case d4:
                JsonObject.setJsonObject(d4, x4);
                break;
            case d5:
                JsonObject.setJsonObject(d5, x5);
                break;
            case d6:
                JsonObject.setJsonObject(d6, x6);
                break;
            case d7:
                JsonObject.setJsonObject(d7, x7);
                break;
            case d8:
                JsonObject.setJsonObject(d8, x8);
                break;
            case d9:
                JsonObject.setJsonObject(d9, x9);
                break;
            case d10:
                JsonObject.setJsonObject(d10, x10);
                break;
            case d11:
                JsonObject.setJsonObject(d11, x11);
                break;
            case d12:
                JsonObject.setJsonObject(d12, x12);
                break;
            case d13:
                JsonObject.setJsonObject(d13, x13);
                break;
            case d14:
                JsonObject.setJsonObject(d14, x14);
                break;
            case d15:
                JsonObject.setJsonObject(d15, x15);
                break;
            case d16:
                JsonObject.setJsonObject(d16, x16);
                break;

        }

        return jsonObject;

    }
}
