package com.pageObject.matrix.orgCust;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.commonObject.CommonObject;
import com.utils.json.JsonObject;

public class AssignCust extends JsonObject { //客户维护分配


    public static String assignCust =
            "http://10.187.144.60:8080/orgcust/assigncust";


    public final static String d1 = "客户维护分配-OA账号查询框-input";
    private final static String x1 = CommonObject.getStr(CommonObject.d1);

    public final static String d2 = "客户维护分配-客户名称查询框-input";
    private final static String x2 = CommonObject.getStr(CommonObject.d2);

    public final static String d27 = "客户维护分配-客户经理查询框-input";
    private final static String x27 = CommonObject.getStr(CommonObject.d27);

    public final static String d3 = "客户维护分配-查询按钮-span";
    private final static String x3 = CommonObject.getStr(CommonObject.d3);

    public final static String d4 = "客户维护分配-重置按钮-span";
    private final static String x4 = CommonObject.getStr(CommonObject.d4);

    public final static String d5 = "客户维护分配-查询条件展开收起按钮-a";
    private final static String x5 = CommonObject.getStr(CommonObject.d5);

    public final static String dd1 = "客户维护分配-客户分配按钮-span";
    private final static String xx1 = "//span[1=1 and contains(text(),\"客户分配\")]";

    public final static String dd2 = "客户维护分配-历史记录按钮-span";
    private final static String xx2 = "//span[1=1 and contains(text(),\"历史记录\")]";

    public final static String d9 = "客户维护分配-表格-table";
    private final static String x9 = CommonObject.getStr(CommonObject.d9);

    public final static String d10 = "客户维护分配-表格表体rows-tr";
    private final static String x10 = CommonObject.getStr(CommonObject.d10);

    public final static String d11 = "客户维护分配-表格表头row下的th col-th";
    private final static String x11 = CommonObject.getStr(CommonObject.d11);

    public final static String d12 = "客户维护分配-表格下方翻页按钮-上一页-li";
    private final static String x12 = CommonObject.getStr(CommonObject.d12);

    public final static String d13 = "客户维护分配-表格下方翻页按钮-下一页-li";
    private final static String x13 = CommonObject.getStr(CommonObject.d13);

    public final static String d14 = "客户维护分配-表格下方翻页按钮-下一页前的按钮,可以看出共多少页-a";
    private final static String x14 = CommonObject.getStr(CommonObject.d14);

    public final static String d15 = "客户维护分配-表格下方跳页输入框-input";
    private final static String x15 = CommonObject.getStr(CommonObject.d15);

    public final static String d16 = "客户维护分配-表格下方跳页输入框左边的跳至两个字-div";
    private final static String x16 = CommonObject.getStr(CommonObject.d16);

    public final static String d17 = "客户维护分配-数据加载(转菊花)-span";
    private final static String x17 = CommonObject.getStr(CommonObject.d17);

    public final static String d18 = "客户维护分配-条/页-div";
    private final static String x18 = CommonObject.getStr(CommonObject.d18);

    public final static String d18l5 = "客户维护分配-条/页-5 条/页";
    private final static String x18l5 = CommonObject.getStr(CommonObject.d18l5);

    public final static String d18l10 = "客户维护分配-条/页-10 条/页";
    private final static String x18l10 = CommonObject.getStr(CommonObject.d18l10);

    public final static String d18l20 = "客户维护分配-条/页-20 条/页";
    private final static String x18l20 = CommonObject.getStr(CommonObject.d18l20);

    public final static String d18l30 = "客户维护分配-条/页-30 条/页";
    private final static String x18l30 = CommonObject.getStr(CommonObject.d18l30);


    public final static String d28 = "客户维护分配-表头多选框-input";
    private final static String x28 = CommonObject.getStr(CommonObject.d28);

    public final static String d29 = "客户维护分配-通用-确定按钮-span";
    private final static String x29 = CommonObject.getStr(CommonObject.d29);

    public final static String d30 = "客户维护分配-通用-关闭按钮-span";
    private final static String x30 = CommonObject.getStr(CommonObject.d30);


    public final static String d9t = "客户维护分配-客户维护历史-表格-table";
    private final static String x9t = CommonObject.getStr(CommonObject.d9t);

    public final static String d10t = "客户维护分配-客户维护历史-表格表体rows-tr";
    private final static String x10t = CommonObject.getStr(CommonObject.d10t);

    public final static String d11t = "客户维护分配-客户维护历史-表格表头row下的th col-th";
    private final static String x11t = CommonObject.getStr(CommonObject.d11t);

    public final static String d12t = "客户维护分配-客户维护历史-表格下方翻页按钮-上一页-li";
    private final static String x12t = CommonObject.getStr(CommonObject.d12t);

    public final static String d13t = "客户维护分配-客户维护历史-表格下方翻页按钮-下一页-li";
    private final static String x13t = CommonObject.getStr(CommonObject.d13t);

    public final static String d14t = "客户维护分配-客户维护历史-表格下方翻页按钮-下一页前的按钮,可以看出共多少页-a";
    private final static String x14t = CommonObject.getStr(CommonObject.d14t);

    public final static String d15t = "客户维护分配-客户维护历史-表格下方跳页输入框-input";
    private final static String x15t = CommonObject.getStr(CommonObject.d15t);

    public final static String d16t = "客户维护分配-客户维护历史-表格下方跳页输入框左边的跳至两个字-div";
    private final static String x16t = CommonObject.getStr(CommonObject.d16t);

    public final static String d18t = "客户维护分配-客户维护历史-条/页-div";
    private final static String x18t = CommonObject.getStr(CommonObject.d18t);

    public final static String d18tl5 = "客户维护分配-浮层-条/页-5 条/页";
    private final static String x18tl5 = CommonObject.getStr(CommonObject.d18tl5);

    public final static String d18tl10 = "通用-客户维护分配-条/页-10 条/页";
    private final static String x18tl10 = CommonObject.getStr(CommonObject.d18tl10);

    public final static String d18tl20 = "客户维护分配-浮层-条/页-20 条/页";
    private final static String x18tl20 = CommonObject.getStr(CommonObject.d18tl20);

    public final static String d18tl30 = "客户维护分配-浮层-条/页-30 条/页";
    private final static String x18tl30 = CommonObject.getStr(CommonObject.d18tl30);


    public final static String d28t = "客户维护分配-客户维护历史-表头多选框-input";
    private final static String x28t = CommonObject.getStr(CommonObject.d28t);

    private final static String t = CommonObject.getStringT();

    public final static String dd3t = "客户维护分配-客户分配-客户名称-textarea";
    private final static String xx3t = t + CommonObject.get$X3("客户名称") + "//textarea";

    public final static String dd4t = "客户维护分配-客户分配-维护类型-div";
    private final static String xx4t = t + CommonObject.get$X3("维护类型");

    public final static String dd5t = "客户维护分配-客户分配-维护类型-input";
    private final static String xx5t = t + CommonObject.get$X2("客户所属部门");

    public final static String dd6t = "客户维护分配-客户分配-原因-textarea";
    private final static String xx6t = t + CommonObject.get$X3("原因") + "//textarea";


    public final static String dd4tl1 = "客户维护分配-客户分配-维护类型-个人-li";
    private final static String xx4tl1 = t + "//li[1=1 and contains(text(),\"个人\")]";


    public final static String dd4tl2 = "客户维护分配-客户分配-维护类型-团队-li";
    private final static String xx4tl2 = t + "//li[1=1 and contains(text(),\"团队\")]";


    //div[@tabindex]//li[1=1 and contains(text(),"个人")]


    private static String get$D4(String num) { //获取选择框(有钩子的那个)的描述
        return CommonObject.get$D4(num).replace("通用", "客户维护分配");
    }

    private static String get$X4(String num) {//获取选择框(有钩子的那个)的xpath
        return CommonObject.get$X4(num);
    }


    private static String get$D1(String num) { //表格表体-第num行的描述
        return CommonObject.get$D1(num).replace("通用", "客户维护分配");
    }

    private static String get$X1(String num) {//表格表体-第num行的xpath
        return CommonObject.get$X1(num);
    }

    public static JSONObject get$Json1(String num) { //表格表体-第num行的json
        JsonObject.setJsonObject(get$D1(num), get$X1(num));
        return jsonObject;
    }


    public static JSONObject get$Json4(String num) { //获取选择框(有钩子的那个)的json
        JsonObject.setJsonObject(get$D4(num), get$X4(num));
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
            case d15:
                JsonObject.setJsonObject(d15, x15);
                break;
            case d16:
                JsonObject.setJsonObject(d16, x16);
                break;
            case dd1:
                JsonObject.setJsonObject(dd1, xx1);
                break;
            case dd2:
                JsonObject.setJsonObject(dd2, xx2);
                break;
            case d28:
                JsonObject.setJsonObject(d28, x28);
                break;
            case d27:
                JsonObject.setJsonObject(d27, x27);
                break;
            case d29:
                JsonObject.setJsonObject(d29, x29);
                break;
            case d30:
                JsonObject.setJsonObject(d30, x30);
                break;
            case d9t:
                JsonObject.setJsonObject(d9t, x9t);
                break;
            case d10t:
                JsonObject.setJsonObject(d10t, x10t);
                break;
            case d11t:
                JsonObject.setJsonObject(d11t, x11t);
                break;
            case d12t:
                JsonObject.setJsonObject(d12t, x12t);
                break;
            case d13t:
                JsonObject.setJsonObject(d13t, x13t);
                break;
            case d14t:
                JsonObject.setJsonObject(d14t, x14t);
                break;
            case d28t:
                JsonObject.setJsonObject(d28t, x28t);
                break;
            case d18t:
                JsonObject.setJsonObject(d18t, x18t);
                break;
            case d15t:
                JsonObject.setJsonObject(d15t, x15t);
                break;
            case d16t:
                JsonObject.setJsonObject(d16t, x16t);
                break;
            case dd3t:
                JsonObject.setJsonObject(dd3t, xx3t);
                break;
            case dd4t:
                JsonObject.setJsonObject(dd4t, xx4t);
                break;
            case dd5t:
                JsonObject.setJsonObject(dd5t, xx5t);
                break;
            case dd6t:
                JsonObject.setJsonObject(dd6t, xx6t);
                break;
            case dd4tl1:
                JsonObject.setJsonObject(dd4tl1, xx4tl1);
                break;
            case dd4tl2:
                JsonObject.setJsonObject(dd4tl2, xx4tl2);
                break;
            case d18tl5:
                JsonObject.setJsonObject(d18tl5, x18tl5);
                break;
            case d18tl10:
                JsonObject.setJsonObject(d18tl10, x18tl10);
                break;
            case d18tl20:
                JsonObject.setJsonObject(d18tl20, x18tl20);
                break;
            case d18tl30:
                JsonObject.setJsonObject(d18tl30, x18tl30);
                break;
            case d18l5:
                JsonObject.setJsonObject(d18l5, x18l5);
                break;
            case d18l10:
                JsonObject.setJsonObject(d18l10, x18l10);
                break;
            case d18l20:
                JsonObject.setJsonObject(d18l20, x18l20);
                break;
            case d18l30:
                JsonObject.setJsonObject(d18l30, x18l30);
                break;


        }

        return jsonObject;

    }


}
