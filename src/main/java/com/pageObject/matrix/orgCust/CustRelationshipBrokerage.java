package com.pageObject.matrix.orgCust;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.commonObject.CommonObject;
import com.utils.json.JsonObject;

public class CustRelationshipBrokerage extends JsonObject { //客户关系经纪业务

    public static String custRelationshipBrokerage =
            "http://10.187.144.60:8080/orgcust/custRelationshipBrokerage";

    public final static String d1 = "客户关系经纪业务-查询按钮";
    private final static String x1 = CommonObject.getXpath(CommonObject.d3);

    public final static String d2 = "客户关系经纪业务-重置按钮";
    private final static String x2 = CommonObject.getXpath(CommonObject.d4);

    public final static String d3 = "客户关系经纪业务-报表导出按钮";
    private final static String x3 = CommonObject.getXpath(CommonObject.d6);

    public final static String d4 = "客户关系经纪业务-报表导出确认按钮";
    private final static String x4 = CommonObject.getXpath(CommonObject.d7);

    public final static String d5 = "客户关系经纪业务-报表导出文件名输入框";
    private final static String x5 = CommonObject.getXpath(CommonObject.d8);

    public final static String d6 = "客户关系经纪业务-表格";
    private final static String x6 = CommonObject.getXpath(CommonObject.d9);

    public final static String d7 = "客户关系经纪业务-表格表体rows";
    private final static String x7 = CommonObject.getXpath(CommonObject.d10);

    public final static String d8 = "客户关系经纪业务-表格表头row下的th col";
    private final static String x8 = CommonObject.getXpath(CommonObject.d11);

    public final static String d9 = "客户关系经纪业务-表格下方翻页按钮-下一页前的按钮,可以看出共多少页";
    private final static String x9 = CommonObject.getXpath(CommonObject.d14);

    public final static String d10 = "客户关系经纪业务-表格下方跳页输入框";
    private final static String x10 = CommonObject.getXpath(CommonObject.d15);

    public final static String d11 = "客户关系经纪业务-表格下方跳页输入框左边的跳至两个字";
    private final static String x11 = CommonObject.getXpath(CommonObject.d16);

    public final static String d12 = "客户关系经纪业务-查询条件展开收起按钮";
    private final static String x12 = CommonObject.getXpath(CommonObject.d5);

    public final static String d13 = "客户关系经纪业务-表格下方翻页按钮-上一页";
    private final static String x13 = CommonObject.getXpath(CommonObject.d12);

    public final static String d14 = "客户关系经纪业务-表格下方翻页按钮-下一页";
    private final static String x14 = CommonObject.getXpath(CommonObject.d13);


    public final static String d17 = "客户关系经纪业务-数据加载(转菊花)";
    private final static String x17 = CommonObject.getXpath(CommonObject.d17);

    public final static String d18 = "客户关系经纪业务-条/页";
    private final static String x18 = CommonObject.getXpath(CommonObject.d18);


    public final static String d19 = "客户关系经纪业务-客户柜台代码查询框";
    private final static String x19 = CommonObject.getXpath(CommonObject.d19);


    public final static String d20 = "客户关系经纪业务-账户名称查询框";
    private final static String x20 = CommonObject.getXpath(CommonObject.d20);

    public final static String d21 = "客户关系经纪业务-资金账号查询框";
    private final static String x21 = CommonObject.getXpath(CommonObject.d21);

    public final static String d22 = "客户关系经纪业务-账户类型查询选择框";/////
    private final static String x22 = CommonObject.getXpath(CommonObject.d22);

    public final static String d23 = "客户关系经纪业务-归属机构查询框";
    private final static String x23 = CommonObject.getXpath(CommonObject.d23);

    public final static String d24 = "客户关系经纪业务-开发类型查询选择框";/////
    private final static String x24 = CommonObject.getXpath(CommonObject.d24);

    public final static String d25 = "客户关系经纪业务-经纪业务关系类型查询选择框";////
    private final static String x25 = CommonObject.getXpath(CommonObject.d25);

    public final static String d26 = "客户关系经纪业务-登记人查询框";
    private final static String x26 = CommonObject.getXpath(CommonObject.d26);


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
            case d17:
                JsonObject.setJsonObject(d17, x17);
                break;
            case d18:
                JsonObject.setJsonObject(d18, x18);
                break;
            case d19:
                JsonObject.setJsonObject(d19, x19);
                break;
            case d20:
                JsonObject.setJsonObject(d20, x20);
                break;
            case d21:
                JsonObject.setJsonObject(d21, x21);
                break;
            case d22:
                JsonObject.setJsonObject(d22, x22);
                break;
            case d23:
                JsonObject.setJsonObject(d23, x23);
                break;
            case d24:
                JsonObject.setJsonObject(d24, x24);
                break;
            case d25:
                JsonObject.setJsonObject(d25, x25);
                break;
            case d26:
                JsonObject.setJsonObject(d26, x26);
                break;

        }

        return jsonObject;

    }


    private static String get$D1(String num) {
        return CommonObject.get$D1(num).replace("通用", "客户关系经纪业务");
    }

    private static String get$X1(String num) {
        return CommonObject.get$X1(num);
    }

    public static JSONObject get$Json(String num) {
        JsonObject.setJsonObject(get$D1(num), get$X1(num));
        return jsonObject;
    }


}
