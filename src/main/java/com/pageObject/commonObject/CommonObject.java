package com.pageObject.commonObject;

public class CommonObject {

    public final static String d1 = "通用-OA账号查询框";
    private final static String x1 = get$X2("OA账号");

    //label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::*[1]//input
    public final static String d2 = "通用-客户名称查询框";
    private final static String x2 = get$X2("客户名称");

    public final static String d19 = "通用-客户柜台代码查询框";
    private final static String x19 = get$X2("客户柜台代码");

    public final static String d20 = "通用-账户名称查询框";
    private final static String x20 = get$X2("账户名称");

    public final static String d21 = "通用-资金账号查询框";
    private final static String x21 = get$X2("资金账号");

    //label[1=1 and contains(text(),"开发类型")]/../following-sibling::div[1]
    public final static String d22 = "通用-账户类型查询选择框";/////
    private final static String x22 = get$X3("账户类型");/////

    public final static String d23 = "通用-归属机构查询框";
    private final static String x23 = get$X2("归属机构");

    public final static String d24 = "通用-开发类型查询选择框";/////
    private final static String x24 = get$X3("开发类型");/////

    public final static String d25 = "通用-经纪业务关系类型查询选择框";////
    private final static String x25 = get$X3("经纪业务关系类型");////

    public final static String d26 = "通用-登记人查询框";
    private final static String x26 = get$X2("登记人");

    public final static String d27 = "通用-客户经理查询框";
    private final static String x27 = get$X2("客户经理");


    public final static String d3 = "通用-查询按钮";
    private final static String x3 = "//button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),\"查询\")]";

    public final static String d4 = "通用-重置按钮";
    private final static String x4 = "//button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),\"重置\")]";

    public final static String d5 = "通用-查询条件展开收起按钮";
    private final static String x5 = "//button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),\"重置\")]/../../a";

    public final static String d6 = "通用-报表导出按钮";
    private final static String x6 = "//span[1=1 and contains(text(),\"导出\")]";


    public final static String d7 = "通用-报表导出确认按钮";
    private final static String x7 = "//span[1=1 and contains(text(),\"确认\")]";
    //span[1=1 and contains(text(),"确认")]

    public final static String d8 = "通用-报表导出文件名输入框";
    private final static String x8 = "//div[1=1 and contains(text(),\"文件名\")]/..//input";
    //div[1=1 and contains(text(),"文件名")]/..//input

    public final static String d9 = "通用-表格";
    private final static String x9 = "//table[1=1 and contains(@class,'ant-table-fixed')]";

    public final static String d10 = "通用-表格表体rows";
    private final static String x10 = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key]";

    public final static String d11 = "通用-表格表头row下的th col";
    private final static String x11 = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[not(@key='selection-column')]";

    public final static String d12 = "通用-表格下方翻页按钮-上一页";
    private final static String x12 = "//li[1=1 and contains(@title,'上一页')]";

    public final static String d13 = "通用-表格下方翻页按钮-下一页";
    private final static String x13 = "//li[1=1 and contains(@title,'下一页')]";

    public final static String d14 = "通用-表格下方翻页按钮-下一页前的按钮,可以看出共多少页";
    private final static String x14 = "//li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]/a";

    public final static String d15 = "通用-表格下方跳页输入框";
    private final static String x15 = "//div[1=1 and contains(text(),\"跳至\")]/input";

    public final static String d16 = "通用-表格下方跳页输入框左边的跳至两个字";
    private final static String x16 = "//div[1=1 and contains(text(),\"跳至\")]";


    public final static String d17 = "通用-数据加载(转菊花)";
    private final static String x17 = "//span[1=1 and contains(@class,'ant-spin-dot')]";

    public final static String d18 = "通用-条/页";
    private final static String x18 = "//div[1=1 and contains(@title,'条/页')]";

    public final static String d18l5 = "通用-条/页-5 条/页";
    private final static String x18l5 = "//li[1=1 and text()='5 条/页' ]";

    public final static String d18l10 = "通用-条/页-10 条/页";
    private final static String x18l10 = "//li[1=1 and text()='10 条/页' ]";

    public final static String d18l20 = "通用-条/页-20 条/页";
    private final static String x18l20 = "//li[1=1 and text()='20 条/页' ]";

    public final static String d18l30 = "通用-条/页-30 条/页";
    private final static String x18l30 = "//li[1=1 and text()='30 条/页' ]";

    public final static String d28 = "通用-表头多选框";
    private final static String x28 = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']//input";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']//input

    public final static String d29 = "通用-确定按钮";
    private final static String x29 = "//span[1=1 and contains(text(),\"确 定\")]";

    public final static String d30 = "通用-关闭按钮";
    private final static String x30 = "//span[1=1 and contains(text(),\"关 闭\")]";

    private final static String t = "//div[@tabindex]";

    public final static String d9t = "通用-浮层-表格";
    private final static String x9t = t+x9;

    public final static String d10t = "通用-浮层-表格表体rows";
    private final static String x10t = t+x10;

    public final static String d11t = "通用-浮层-表格表头row下的th col";
    private final static String x11t = t+x11;

    public final static String d12t = "通用-浮层-表格下方翻页按钮-上一页";
    private final static String x12t = t+x12;

    public final static String d13t = "通用-浮层-表格下方翻页按钮-下一页";
    private final static String x13t = t+x13;

    public final static String d14t = "通用-浮层-表格下方翻页按钮-下一页前的按钮,可以看出共多少页";
    private final static String x14t = t+x14;

    public final static String d15t = "通用-浮层-表格下方跳页输入框";
    private final static String x15t = t+x15;

    public final static String d16t = "通用-浮层-表格下方跳页输入框左边的跳至两个字";
    private final static String x16t = t+x16;

    public final static String d18t = "通用-浮层-条/页";
    private final static String x18t = t+x18;

    public final static String d18tl5 = "通用-浮层-条/页-5 条/页";
    private final static String x18tl5 = t+x18l5;

    public final static String d18tl10 = "通用-浮层-条/页-10 条/页";
    private final static String x18tl10 = t+x18l10;

    public final static String d18tl20 = "通用-浮层-条/页-20 条/页";
    private final static String x18tl20 = t+x18l20;

    public final static String d18tl30 = "通用-浮层-条/页-30 条/页";
    private final static String x18tl30 = t+x18l30;



    public final static String d28t = "通用-浮层-表头多选框";
    private final static String x28t = t+x28;



//    public final static String $d1="通用-表格表体rows-第$行)";
//    private final static String $x1=get$String()


    public static String getStringT(){
        return  t;
    }


    public static String get$X1(String num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][30]
        String xpath = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][";
        xpath = xpath + num;
        xpath = xpath + "]";

        return xpath;
    }

    public static String get$D1(String num) {
        //通用-表格表体-第1行
        String description = "通用-表格表体-第";
        description = description + num;
        description = description + "行";

        return description;
    }


    public static String get$X2(String label){
        //label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::*[1]//input
        String xpath = "//label[1=1 and contains(text(),\"";
        xpath = xpath + label;
        xpath = xpath + "\")]/../following-sibling::*[1]//input";
        return xpath;
    }


    public static String get$D2(String label) {
        //通用-OA账号-查询框
        String description = "通用-";
        description = description + label;
        description = description + "-查询框";

        return description;
    }


    public static String get$X3(String label){
        //label[1=1 and contains(text(),"开发类型")]/../following-sibling::div[1]
        String xpath = "//label[1=1 and contains(text(),\"";
        xpath = xpath + label;
        xpath = xpath + "\")]/../following-sibling::div[1]";
        return xpath;
    }


    public static String get$D3(String label) {
        //通用-表格表体-第1行
        String description = "通用-";
        description = description + label;
        description = description + "-选择";

        return description;
    }



    public static String get$X4(String num){
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][1]//input[1=1 and contains(@type,'checkbox') and contains(@class,'ant-checkbox-input')]
        String xpath = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][";
        xpath = xpath + num;
        xpath = xpath + "]//input[1=1 and contains(@type,'checkbox') and contains(@class,'ant-checkbox-input')]";
        return xpath;
    }
    //input[1=1 and contains(@type,'checkbox') and contains(@class,'ant-checkbox-input')]


    public static String get$D4(String num) {
        //通用-表格表体-第1行-选择框
        String description = "通用-表格表体第";
        description = description + num;
        description = description + "行-选择框(选中有钩子的那个)";

        return description;
    }



    //li[1=1 and contains(@title,'下一页')]

//span[1=1 and contains(@class,'ant-spin-dot')]

    //div[1=1 and contains(text(),"跳至")]/input

    //li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]

    //li[1=1 and contains(@title,'上一页')]


    public static String getStr(String description) {
        String str = "";
        switch (description) {
            case d1:
                str = x1;
                break;
            case d2:
                str = x2;
                break;
            case d3:
                str = x3;
                break;
            case d4:
                str = x4;
                break;
            case d5:
                str = x5;
                break;
            case d6:
                str = x6;
                break;
            case d7:
                str = x7;
                break;
            case d8:
                str = x8;
                break;
            case d9:
                str = x9;
                break;
            case d10:
                str = x10;
                break;
            case d11:
                str = x11;
                break;
            case d12:
                str = x12;
                break;
            case d13:
                str = x13;
                break;
            case d14:
                str = x14;
                break;
            case d15:
                str = x15;
                break;
            case d16:
                str = x16;
                break;
            case d17:
                str = x17;
                break;
            case d18:
                str = x18;
                break;
            case d19:
                str = x19;
                break;
            case d20:
                str = x20;
                break;
            case d21:
                str = x21;
                break;
            case d22:
                str = x22;
                break;
            case d23:
                str = x23;
                break;
            case d24:
                str = x24;
                break;
            case d25:
                str = x25;
                break;
            case d26:
                str = x26;
                break;
            case d27:
                str = x27;
                break;
            case d28:
                str = x28;
                break;
            case d29:
                str = x29;
                break;
            case d30:
                str = x30;
                break;
            case d9t:
                str = x9t;
                break;
            case d10t:
                str = x10t;
                break;
            case d11t:
                str = x11t;
                break;
            case d12t:
                str = x12t;
                break;
            case d13t:
                str = x13t;
                break;
            case d14t:
                str = x14t;
                break;
            case d15t:
                str = x15t;
                break;
            case d16t:
                str = x16t;
                break;
            case d18t:
                str = x18t;
                break;
            case d28t:
                str = x28t;
                break;
            case d18l5:
                str = x18l5;
                break;
            case d18l10:
                str = x18l10;
                break;
            case d18l20:
                str = x18l20;
                break;
            case d18l30:
                str = x18l30;
                break;
            case d18tl5:
                str = x18tl5;
                break;
            case d18tl10:
                str = x18tl10;
                break;
            case d18tl20:
                str = x18tl20;
                break;
            case d18tl30:
                str = x18tl30;
                break;

        }
        return str;

    }


}
