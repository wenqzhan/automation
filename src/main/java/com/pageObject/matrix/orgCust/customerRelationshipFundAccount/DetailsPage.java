package com.pageObject.matrix.orgCust.customerRelationshipFundAccount;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.commonObject.CommonObject;
import com.utils.json.JsonObject;

public class DetailsPage extends JsonObject { //客户关系资金账号详细页面

    public static String matrixCustomerRelationshipFundAccountDetailsPage =
            "http://10.187.144.60:8080/orgcust/customerRelationshipFundAccount/detailsPage";

    public final static String d1 = "客户关系资金账号-详细页-柜台客户代码输入框";
    private final static String x1 = getXpath("input", "柜台客户代码");

    public final static String d2 = "客户关系资金账号-详细页-关系类型输入框";
    private final static String x2 = getXpath("span", "关系类型");///////////////////

    public final static String d3 = "客户关系资金账号-详细页-客户类型输入框";
    private final static String x3 = getXpath("span", "客户类型");////////////////

    public final static String d3_1 = "客户关系资金账号-详细页-客户类型输入框-特殊处理";
    private final static String x3_1 = getXpath("div", "客户类型");////////////////

    public final static String d4 = "客户关系资金账号-详细页-归属机构输入框";
    private final static String x4 = getXpath("input", "归属机构");

    public final static String d5 = "客户关系资金账号-详细页-账户类型输入框";
    private final static String x5 = getXpath("span", "账户类型");/////////////////

    public final static String d6 = "客户关系资金账号-详细页-开户日期输入框";
    private final static String x6 = getXpath("input", "开户日期");

    public final static String d7 = "客户关系资金账号-详细页-生效日期输入框";
    private final static String x7 = getXpath("input", "生效日期");

    public final static String d8 = "客户关系资金账号-详细页-保存按钮";
    private final static String x8 = "//span[1=1 and contains(text(),\"保存\")]";

    public final static String d9 = "客户关系资金账号-详细页-返回按钮";
    private final static String x9 = "//span[1=1 and contains(text(),\"返回\")]";

    public final static String d10 = "客户关系资金账号-详细页-li-开发关系";
    private final static String x10 = getXpath("li", "开发关系");

    public final static String d11 = "客户关系资金账号-详细页-li-维护关系";
    private final static String x11 = getXpath("li", "维护关系");

    public final static String d12 = "客户关系资金账号-详细页-li-新增开发";
    private final static String x12 = getXpath("li", "新增开发");

    public final static String d13 = "客户关系资金账号-详细页-li-核心服务";
    private final static String x13 = getXpath("li", "核心服务");

    public final static String d14 = "客户关系资金账号-详细页-li-存量开发";
    private final static String x14 = getXpath("li", "存量开发");

    public final static String d15 = "客户关系资金账号-详细页-li-二次开发";
    private final static String x15 = getXpath("li", "二次开发");

    public final static String d16 = "客户关系资金账号-详细页-li-重点服务";
    private final static String x16 = getXpath("li", "重点服务");

    public final static String d17 = "客户关系资金账号-详细页-li-存量新增信用开发";
    private final static String x17 = getXpath("li", "存量新增信用开发");


    public final static String d18 = "客户关系资金账号-详细页-li-存量新增约定式购";
    private final static String x18 = getXpath("li", "存量新增约定式购");

    public final static String d19 = "客户关系资金账号-详细页-li-期权开发";
    private final static String x19 = getXpath("li", "期权开发");

    public final static String d20 = "客户关系资金账号-详细页-li-期权继承";
    private final static String x20 = getXpath("li", "期权继承");

    public final static String d21 = "客户关系资金账号-详细页-li-投顾签约服务";
    private final static String x21 = getXpath("li", "投顾签约服务");

    public final static String d22 = "客户关系资金账号-详细页-li-个人";
    private final static String x22 = getXpath("li", "个人");

    public final static String d23 = "客户关系资金账号-详细页-li-机构";
    private final static String x23 = getXpath("li", "机构");

    public final static String d24 = "客户关系资金账号-详细页-li-产品";
    private final static String x24 = getXpath("li", "产品");

    public final static String d25 = "客户关系资金账号-详细页-li-席位";
    private final static String x25 = getXpath("li", "席位");

    public final static String d26 = "客户关系资金账号-详细页-li-普通";
    private final static String x26 = getXpath("li", "普通");

    public final static String d27 = "客户关系资金账号-详细页-li-信用";
    private final static String x27 = getXpath("li", "信用");

    public final static String d28 = "客户关系资金账号-详细页-li-期权";
    private final static String x28 = getXpath("li", "期权");

    public final static String d29 = "客户关系资金账号-详细页-li-股质专用";
    private final static String x29 = getXpath("li", "股质专用");


    //label[1=1 and contains(text(),"柜台客户代码")]/../following-sibling::*//input[1]

//label/../following-sibling::*//div/span[@title]


    //label/../following-sibling::*//li/span[@title] 这个需要先点一下 上面的才会出来
//li/span[1=1 and @title='开发关系' ]

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
            case d27:
                JsonObject.setJsonObject(d27, x27);
                break;
            case d28:
                JsonObject.setJsonObject(d28, x28);
                break;
            case d29:
                JsonObject.setJsonObject(d29, x29);
                break;
            case d3_1:
                JsonObject.setJsonObject(d3_1, x3_1);
                break;

        }

        return jsonObject;

    }


    public static String getXpath(String label, String str) {
        String string = "";
        if (label.equals("input")) {

            string = string + ("//label[1=1 and contains(text(),\"");
            string = string + (str);
            string = string + ("\")]/../following-sibling::*//input[1]");
        } else if (label.equals("span")) {
            string = string + ("//label[1=1 and contains(text(),\"");
            string = string + (str);
            string = string + ("\")]/../following-sibling::*//div/span[@title][1]");
        } else if (label.equals("li")) {
            string = "//li/span[1=1 and @title='";
            string = string + (str);
            string = string + "']";
        } else if (label.equals("div")) {
            string = string + ("//label[1=1 and contains(text(),\"");
            string = string + (str);
            string = string + ("\")]/../following-sibling::*//div[@title][1]");
        }
        //label[1=1 and contains(text(),"客户类型")]/../following-sibling::*//div[@title][1]

        return string;

//li/span[1=1 and @title='开发关系' ]
        //label[1=1 and contains(text(),"关系类型")]/../following-sibling::*//div/span[@title][1]
    }


}
