package com.pageObject.matrix.orgCust;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.commonObject.CommonObject;
import com.utils.json.JsonObject;

public class AssignCust extends JsonObject { //客户维护分配


    public static String assignCust =
            "http://10.187.144.60:8080/orgcust/assigncust";


    public final static String d1 = "客户维护分配-OA账号查询框-input";
    private final static String x1 = CommonObject.getXpath(CommonObject.d1);

    public final static String d2 = "客户维护分配-客户名称查询框-input";
    private final static String x2 = CommonObject.getXpath(CommonObject.d2);

    public final static String d27 = "客户维护分配-客户经理查询框-input";
    private final static String x27 = CommonObject.getXpath(CommonObject.d27);

    public final static String d3 = "客户维护分配-查询按钮-span";
    private final static String x3 = CommonObject.getXpath(CommonObject.d3);

    public final static String d4 = "客户维护分配-重置按钮-span";
    private final static String x4 = CommonObject.getXpath(CommonObject.d4);

    public final static String d5 = "客户维护分配-查询条件展开收起按钮-a";
    private final static String x5 = CommonObject.getXpath(CommonObject.d5);

    public final static String dd1 = "客户维护分配-客户分配按钮-span";
    private final static String xx1 = "//span[1=1 and contains(text(),\"客户分配\")]";

    public final static String dd2 = "客户维护分配-历史记录按钮-span";
    private final static String xx2 = "//span[1=1 and contains(text(),\"历史记录\")]";

    public final static String d9 = "客户维护分配-表格-table";
    private final static String x9 = CommonObject.getXpath(CommonObject.d9);

    public final static String d10 = "客户维护分配-表格表体rows-tr";
    private final static String x10 = CommonObject.getXpath(CommonObject.d10);


    public final static String d10Selected = "客户维护分配-表格表体rows-selected";
    private final static String x10Selected = CommonObject.getXpath(CommonObject.d10Selected);

    public final static String d10NotSelected = "客户维护分配-表格表体rows-not selected";
    private final static String x10NotSelected = CommonObject.getXpath(CommonObject.d10NotSelected);


    public final static String d11 = "客户维护分配-表格表头row下的th col-th";
    private final static String x11 = CommonObject.getXpath(CommonObject.d11);

    public final static String d31 = "客户维护分配-表格表头-多选框";
    private final static String x31 = CommonObject.getXpath(CommonObject.d31);


    public final static String d12 = "客户维护分配-表格下方翻页按钮-上一页-li";
    private final static String x12 = CommonObject.getXpath(CommonObject.d12);

    public final static String d13 = "客户维护分配-表格下方翻页按钮-下一页-li";
    private final static String x13 = CommonObject.getXpath(CommonObject.d13);

    public final static String d14 = "客户维护分配-表格下方翻页按钮-下一页前的按钮,可以看出共多少页-a";
    private final static String x14 = CommonObject.getXpath(CommonObject.d14);

    public final static String d15 = "客户维护分配-表格下方跳页输入框-input";
    private final static String x15 = CommonObject.getXpath(CommonObject.d15);

    public final static String d16 = "客户维护分配-表格下方跳页输入框左边的跳至两个字-div";
    private final static String x16 = CommonObject.getXpath(CommonObject.d16);

    public final static String d17 = "客户维护分配-数据加载(转菊花)-span";
    private final static String x17 = CommonObject.getXpath(CommonObject.d17);

    public final static String d18 = "客户维护分配-条/页-div";
    private final static String x18 = CommonObject.getXpath(CommonObject.d18);

    public final static String d18l5 = "客户维护分配-条/页-5 条/页-li";
    private final static String x18l5 = CommonObject.getXpath(CommonObject.d18l5);

    public final static String d18l10 = "客户维护分配-条/页-10 条/页-li";
    private final static String x18l10 = CommonObject.getXpath(CommonObject.d18l10);

    public final static String d18l20 = "客户维护分配-条/页-20 条/页-li";
    private final static String x18l20 = CommonObject.getXpath(CommonObject.d18l20);

    public final static String d18l30 = "客户维护分配-条/页-30 条/页-li";
    private final static String x18l30 = CommonObject.getXpath(CommonObject.d18l30);


    public final static String d28 = "客户维护分配-表头多选框-input";
    private final static String x28 = CommonObject.getXpath(CommonObject.d28);

    public final static String d29 = "客户维护分配-通用-确定按钮-span";
    private final static String x29 = CommonObject.getXpath(CommonObject.d29);

    public final static String d30 = "客户维护分配-通用-关闭按钮-span";
    private final static String x30 = CommonObject.getXpath(CommonObject.d30);


    public final static String dd2Pd9t = "客户维护分配-客户维护历史-表格-table";
    private final static String dd2Px9t = CommonObject.getXpath(CommonObject.d9P);

    public final static String dd2Pd10t = "客户维护分配-客户维护历史-表格表体rows-tr";
    private final static String dd2Px10t = CommonObject.getXpath(CommonObject.d10P);

    public final static String dd2Pd10tSelected = "客户维护分配-客户维护历史-表格表体rows-selected";
    private final static String dd2Px10tSelected = CommonObject.getXpath(CommonObject.d10PSelected);

    public final static String dd2Pd10tNotSelected = "客户维护分配-客户维护历史-表格表体rows-not selected";
    private final static String dd2Px10tNotSelected = CommonObject.getXpath(CommonObject.d10PNotSelected);


    public final static String dd2Pd11t = "客户维护分配-客户维护历史-表格表头row下的th col-th";
    private final static String dd2Px11t = CommonObject.getXpath(CommonObject.d11P);

    public final static String dd2Pd31t = "客户维护分配-客户维护历史-表格表头-多选框";
    private final static String dd2Px31t = CommonObject.getXpath(CommonObject.d31P);

    public final static String dd2Pd12t = "客户维护分配-客户维护历史-表格下方翻页按钮-上一页-li";
    private final static String dd2Px12t = CommonObject.getXpath(CommonObject.d12P);

    public final static String dd2Pd13t = "客户维护分配-客户维护历史-表格下方翻页按钮-下一页-li";
    private final static String dd2Px13t = CommonObject.getXpath(CommonObject.d13P);

    public final static String dd2Pd14t = "客户维护分配-客户维护历史-表格下方翻页按钮-下一页前的按钮,可以看出共多少页-a";
    private final static String dd2Px14t = CommonObject.getXpath(CommonObject.d14P);

    public final static String dd2Pd15t = "客户维护分配-客户维护历史-表格下方跳页输入框-input";
    private final static String dd2Px15t = CommonObject.getXpath(CommonObject.d15P);

    public final static String dd2Pd16t = "客户维护分配-客户维护历史-表格下方跳页输入框左边的跳至两个字-div";
    private final static String dd2Px16t = CommonObject.getXpath(CommonObject.d16P);

    public final static String dd2Pd18t = "客户维护分配-客户维护历史-条/页-div";
    private final static String dd2Px18t = CommonObject.getXpath(CommonObject.d18P);

    public final static String dd2Pd18tl5 = "客户维护分配-客户维护历史-条/页-5 条/页-li";
    private final static String dd2Px18tl5 = CommonObject.getXpath(CommonObject.d18Pl5);

    public final static String dd2Pd18tl10 = "客户维护分配-客户维护历史-条/页-10 条/页-li";
    private final static String dd2Px18tl10 = CommonObject.getXpath(CommonObject.d18Pl10);

    public final static String dd2Pd18tl20 = "客户维护分配-客户维护历史-条/页-20 条/页-li";
    private final static String dd2Px18tl20 = CommonObject.getXpath(CommonObject.d18Pl20);

    public final static String dd2Pd18tl30 = "客户维护分配-客户维护历史-条/页-30 条/页-li";
    private final static String dd2Px18tl30 = CommonObject.getXpath(CommonObject.d18Pl30);


    public final static String dd2Pd28t = "客户维护分配-客户维护历史-表头多选框-input";
    private final static String dd2Px28t = CommonObject.getXpath(CommonObject.d28P);

    private final static String t = CommonObject.getStringP();

    public final static String dd1Pdd1 = "客户维护分配-客户分配-客户名称-textarea";
    private final static String xx1Pxx1 = t + CommonObject.get$X3("客户名称") + "//textarea";

    public final static String dd1Pdd2 = "客户维护分配-客户分配-维护类型-div";
    private final static String xx1Pxx2 = t + CommonObject.get$X3("维护类型");


    public final static String dd1Pdd2i1 = "客户维护分配-客户分配-维护类型-×-i";
    private final static String xx1Pxx2i1 = xx1Pxx2 + "//i[1=1 and contains(@class,'close-circle')]";

    public final static String dd1Pdd2i2 = "客户维护分配-客户分配-维护类型-arrow-i";
    private final static String xx1Pxx2i2 = xx1Pxx2 + "//i[1=1 and contains(@class,'arrow')]";

    public final static String dd1Pdd2l1 = "客户维护分配-客户分配-维护类型-个人-li";
    private final static String xx1Pxx2l1 = t + "//li[1=1 and contains(text(),\"个人\")]";


    public final static String dd1Pdd2l2 = "客户维护分配-客户分配-维护类型-团队-li";
    private final static String xx1Pxx2l2 = t + "//li[1=1 and contains(text(),\"团队\")]";


    //div[@tabindex]//label[1=1 and contains(text(),"维护类型")]/../following-sibling::div[1]//i[1=1 and contains(@class,'close-circle')]
    //i[1=1 and contains(@class,'close-circle')]
    public final static String dd1Pdd3 = "客户维护分配-客户分配-客户所属部门-input";
    private final static String xx1Pxx3 = t + CommonObject.get$X2("客户所属部门");

    public final static String dd1Pdd3i1 = "客户维护分配-客户分配-客户所属部门-input后的×-i";
    private final static String xx1Pxx3i1 = xx1Pxx3+ "/following-sibling::*//i[1=1 and contains(@class,'close-circle')]";


    //i[1=1 and contains(@class,'close-circle')]

    public final static String dd1Pdd3Pdd1 = "客户维护分配-客户分配-客户所属部门-部门选择输入框-input";
    private final static String xx1Pxx3Pxx1 = "//div[1=1 and contains(@class,'ant-modal-content')]//input[@placeholder]";

    //div[1=1 and contains(@class,'ant-modal-content')]//input[@placeholder]

    public final static String dd1Pdd3Pdd1dd1 = "客户维护分配-客户分配-客户所属部门-部门选择输入框-输入后项目候选-div";
    private final static String xx1Pxx3Pxx1xx1 = xx1Pxx3Pxx1 + "/following-sibling::div/div[1]";
    //div[1=1 and contains(@class,'ant-modal-content')]//input[@placeholder]/following-sibling::div/div[1]


    public final static String dd1Pdd3Pdd2 = "客户维护分配-客户分配-客户所属部门-确定按钮-span";
    private final static String xx1Pxx3Pxx2 = xx1Pxx3Pxx1 + "/../../following-sibling::*" + x29;
    //div[1=1 and contains(@class,'ant-modal-content')]//input[@placeholder]/../../following-sibling::*//span[1=1 and contains(text(),"确 定")]

    public final static String dd1Pdd3Pdd3 = "客户维护分配-客户分配-客户所属部门-关闭按钮-span";
    private final static String xx1Pxx3Pxx3 = xx1Pxx3Pxx1 + "/../../following-sibling::*" + x30;
    //div[1=1 and contains(@class,'ant-modal-content')]//input[@placeholder]/../../following-sibling::*//span[1=1 and contains(text(),"确 定")]




    public final static String dd1Pdd4 = "客户维护分配-客户分配-原因-textarea";
    private final static String xx1Pxx4 = t + CommonObject.get$X3("原因") + "//textarea";


    public final static String dd1Pdd5 = "客户维护分配-客户分配-客户维护经理-input";
    private final static String xx1Pxx5 = t + CommonObject.get$X2("客户维护经理");

    public final static String dd1Pdd5Pdd1 = "客户维护分配-客户分配-客户维护经理-员工选择界面-用户名查询框-input";
    private final static String xx1Pxx5Pxx1 = "//input[1=1 and contains(@placeholder,'输入用户名查询...')]";
    //input[1=1 and contains(@placeholder,'输入用户名查询...')]

    public final static String dd1Pdd5Pdd2 = "客户维护分配-客户分配-客户维护经理-员工选择界面-查询按钮-span";
    private final static String xx1Pxx5Pxx2 = xx1Pxx5Pxx1 + "/following-sibling::span[1]";
    //input[1=1 and contains(@placeholder,'输入用户名查询...')]/following-sibling::span[1]

    public final static String dd1Pdd5Pdd3 = "客户维护分配-客户分配-客户维护经理-员工选择-表格表体rows-tr";
    private final static String xx1Pxx5Pxx3 = CommonObject.getXpath(CommonObject.d10P);

    //CommonObject.getXpath(CommonObject.d10P);
    //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key]

    public final static String dd1Pdd5Pdd4 = "客户维护分配-客户分配-客户维护经理-员工选择-确定按钮-span";
    private final static String xx1Pxx5Pxx4 = xx1Pxx5Pxx1 +"/../../../../../../following-sibling::*" + x29;
    //input[1=1 and contains(@placeholder,'输入用户名查询...')]/../../../../../../following-sibling::*//span[text()='确 定']


    public final static String dd1Pdd5s1 = "客户维护分配-客户分配-客户维护经理input框最右边的一个按钮-span";
    private final static String xx1Pxx5s1 = xx1Pxx5 + "/following-sibling::span[1]";

    public final static String dd1Pdd6 = "客户维护分配-客户分配-团队名称-input";
    private final static String xx1Pxx6 = t + CommonObject.get$X2("团队名称");


    public final static String dd1Pdd6i1 = "客户维护分配-客户分配-团队名称input-输入框后的一个<按钮";
    private final static String xx1Pxx6i1 = xx1Pxx6 + "/following-sibling::*//i[1=1 and contains(@class,'')]";

    public final static String dd1Pdd6Pdd1 = "客户维护分配-客户分配-客户所属部门-团队名称-input";
    private final static String xx1Pxx6Pxx1 = "//div[1=1 and contains(@class,'ant-modal-content')]//input[@placeholder]";

    public final static String dd1Pdd6Pdd2 = "客户维护分配-客户分配-客户所属部门-团队名称-确定按钮-span";
    private final static String xx1Pxx6Pxx2 = xx1Pxx6Pxx1 + "/../../following-sibling::*" + x29;


    public final static String dd3 = "客户维护分配-客户分配-提示信息-span";
    private final static String xx3 = "//span[1=1 and contains(text(),\"请选择客户信息\")]";

    public final static String dd4 = "客户维护分配-历史记录-提示信息-span";
    private final static String xx4 = "//span[1=1 and contains(text(),\"条客户信息，您当前选择了\")]";


    //span[1=1 and contains(text(),"请选择客户信息")] dd3

    //span[1=1 and contains(text(),"条客户信息，您当前选择了")] dd4

    //div[@tabindex]//li[1=1 and contains(text(),"个人")]


    private static String get$DD1(String company) {
        String description="客户维护分配-客户分配-客户所属部门-选择";
        description = description +company;

        return description;
    }

    private static String get$XX1(String company) {
        String xpath="";
        xpath = xpath + xx1Pxx3Pxx1 + "/following-sibling::div/div[@title='" ;
        xpath = xpath + company;
        xpath = xpath + "']";
        return xpath;
    }



    private static String get$DD2(String company) {
        String description="客户维护分配-客户分配-客户所属部门-选择";
        description = description +company;

        return description;
    }

    private static String get$XX2(String team) {
        String xpath="";
        xpath = xpath + xx1Pxx6Pxx1 + "/../following-sibling::div/div//span[text()='" ;
        xpath = xpath + team;
        xpath = xpath + "']";
        return xpath;
    }



    public static JSONObject get$JsonCompany(String company) { //
        JsonObject.setJsonObject(get$DD1(company), get$XX1(company));
        return jsonObject;
    }

    public static JSONObject get$JsonTeam(String team) { //
        JsonObject.setJsonObject(get$DD2(team), get$XX2(team));
        return jsonObject;
    }



    //div[1=1 and contains(@class,'ant-modal-content')]//input[@placeholder]/following-sibling::div/div[@title='上海典当公司']


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


    private static String get$D1P(String num) { //表格表体-第num行的描述

        return CommonObject.get$D1P(num).replace("通用", "客户维护分配");
    }

    private static String get$X1P(String num) {//表格表体-第num行的xpath

        return CommonObject.get$X1P(num);
    }

    public static JSONObject get$Json1(String num) { //表格表体-第num行的json
        JsonObject.setJsonObject(get$D1(num), get$X1(num));
        return jsonObject;
    }

    public static JSONObject get$Json1P(String num) { //表格表体-第num行的json
        JsonObject.setJsonObject(get$D1P(num), get$X1P(num));
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
            case dd2Pd9t:
                JsonObject.setJsonObject(dd2Pd9t, dd2Px9t);
                break;
            case dd2Pd10t:
                JsonObject.setJsonObject(dd2Pd10t, dd2Px10t);
                break;
            case dd2Pd11t:
                JsonObject.setJsonObject(dd2Pd11t, dd2Px11t);
                break;
            case dd2Pd12t:
                JsonObject.setJsonObject(dd2Pd12t, dd2Px12t);
                break;
            case dd2Pd13t:
                JsonObject.setJsonObject(dd2Pd13t, dd2Px13t);
                break;
            case dd2Pd14t:
                JsonObject.setJsonObject(dd2Pd14t, dd2Px14t);
                break;
            case dd2Pd28t:
                JsonObject.setJsonObject(dd2Pd28t, dd2Px28t);
                break;
            case dd2Pd18t:
                JsonObject.setJsonObject(dd2Pd18t, dd2Px18t);
                break;
            case dd2Pd15t:
                JsonObject.setJsonObject(dd2Pd15t, dd2Px15t);
                break;
            case dd2Pd16t:
                JsonObject.setJsonObject(dd2Pd16t, dd2Px16t);
                break;
            case dd1Pdd1:
                JsonObject.setJsonObject(dd1Pdd1, xx1Pxx1);
                break;
            case dd1Pdd2:
                JsonObject.setJsonObject(dd1Pdd2, xx1Pxx2);
                break;
            case dd1Pdd3:
                JsonObject.setJsonObject(dd1Pdd3, xx1Pxx3);
                break;
            case dd1Pdd4:
                JsonObject.setJsonObject(dd1Pdd4, xx1Pxx4);
                break;
            case dd1Pdd2l1:
                JsonObject.setJsonObject(dd1Pdd2l1, xx1Pxx2l1);
                break;
            case dd1Pdd2l2:
                JsonObject.setJsonObject(dd1Pdd2l2, xx1Pxx2l2);
                break;
            case dd2Pd18tl5:
                JsonObject.setJsonObject(dd2Pd18tl5, dd2Px18tl5);
                break;
            case dd2Pd18tl10:
                JsonObject.setJsonObject(dd2Pd18tl10, dd2Px18tl10);
                break;
            case dd2Pd18tl20:
                JsonObject.setJsonObject(dd2Pd18tl20, dd2Px18tl20);
                break;
            case dd2Pd18tl30:
                JsonObject.setJsonObject(dd2Pd18tl30, dd2Px18tl30);
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
            case dd3:
                JsonObject.setJsonObject(dd3, xx3);
                break;
            case dd4:
                JsonObject.setJsonObject(dd4, xx4);
                break;
            case d10Selected:
                JsonObject.setJsonObject(d10Selected, x10Selected);
                break;
            case d10NotSelected:
                JsonObject.setJsonObject(d10NotSelected, x10NotSelected);
                break;
            case d31:
                JsonObject.setJsonObject(d31, x31);
                break;
            case dd2Pd10tSelected:
                JsonObject.setJsonObject(dd2Pd10tSelected, dd2Px10tSelected);
                break;
            case dd2Pd10tNotSelected:
                JsonObject.setJsonObject(dd2Pd10tNotSelected, dd2Px10tNotSelected);
                break;
            case dd2Pd31t:
                JsonObject.setJsonObject(dd2Pd31t, dd2Px31t);
                break;
            case dd1Pdd5:
                JsonObject.setJsonObject(dd1Pdd5, xx1Pxx5);
                break;
            case dd1Pdd6:
                JsonObject.setJsonObject(dd1Pdd6, xx1Pxx6);
                break;
            case dd1Pdd2i1:
                JsonObject.setJsonObject(dd1Pdd2i1, xx1Pxx2i1);
                break;
            case dd1Pdd2i2:
                JsonObject.setJsonObject(dd1Pdd2i2, xx1Pxx2i2);
                break;
            case dd1Pdd3Pdd1:
                JsonObject.setJsonObject(dd1Pdd3Pdd1, xx1Pxx3Pxx1);
                break;
            case dd1Pdd3Pdd1dd1:
                JsonObject.setJsonObject(dd1Pdd3Pdd1dd1, xx1Pxx3Pxx1xx1);
                break;
            case dd1Pdd3Pdd2:
                JsonObject.setJsonObject(dd1Pdd3Pdd2, xx1Pxx3Pxx2);
                break;
            case dd1Pdd3Pdd3:
                JsonObject.setJsonObject(dd1Pdd3Pdd3, xx1Pxx3Pxx3);
                break;
            case dd1Pdd3i1:
                JsonObject.setJsonObject(dd1Pdd3i1, xx1Pxx3i1);
                break;
            case dd1Pdd5s1:
                JsonObject.setJsonObject(dd1Pdd5s1, xx1Pxx5s1);
                break;
            case dd1Pdd5Pdd1:
                JsonObject.setJsonObject(dd1Pdd5Pdd1, xx1Pxx5Pxx1);
                break;
            case dd1Pdd5Pdd2:
                JsonObject.setJsonObject(dd1Pdd5Pdd2, xx1Pxx5Pxx2);
                break;
            case dd1Pdd5Pdd3:
                JsonObject.setJsonObject(dd1Pdd5Pdd3, xx1Pxx5Pxx3);
                break;
            case dd1Pdd5Pdd4:
                JsonObject.setJsonObject(dd1Pdd5Pdd4, xx1Pxx5Pxx4);
                break;
            case dd1Pdd6Pdd1:
                JsonObject.setJsonObject(dd1Pdd6Pdd1, xx1Pxx6Pxx1);
                break;
            case dd1Pdd6i1:
                JsonObject.setJsonObject(dd1Pdd6i1, xx1Pxx6i1);
                break;
            case dd1Pdd6Pdd2:
                JsonObject.setJsonObject(dd1Pdd6Pdd2, xx1Pxx6Pxx2);
                break;

        }

        return jsonObject;

    }


}
