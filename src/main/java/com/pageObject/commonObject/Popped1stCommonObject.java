package com.pageObject.commonObject;

public class Popped1stCommonObject {

    private final static String p = "//div[@tabindex]";

    private final static String cross = "//i[1=1 and contains(@class,'close-circle')]";

    private final static String arrow = "//i[1=1 and contains(@class,'arrow')]";

    private final static String search = "/following-sibling::*//i[1=1 and contains(@class,'')]";

    public final static String d9P = "通用-第一浮层-表格-table";
    private final static String x9P = p + CommonObject.getXpath(CommonObject.d9);

    public final static String d10P = "通用-第一浮层-表格表体rows-tr";
    private final static String x10P = p + CommonObject.getXpath(CommonObject.d10);


    public final static String d10PSelected = "通用-第一浮层-表格表体rows-selected-tr";
    private final static String x10PSelected = p + CommonObject.getXpath(CommonObject.d10Selected);

    public final static String d10PNotSelected = "通用-第一浮层-表格表体rows-not selected-tr";
    private final static String x10PNotSelected = p + CommonObject.getXpath(CommonObject.d10NotSelected);


    public final static String d11P = "通用-第一浮层-表格表头row下的th col-th";
    private final static String x11P = p + CommonObject.getXpath(CommonObject.d11);

    public final static String d31P = "通用-第一浮层-表格表头-多选框-th";
    private final static String x31P = p + CommonObject.getXpath(CommonObject.d31);

    public final static String d12P = "通用-第一浮层-表格下方翻页按钮-上一页-li";
    private final static String x12P = p + CommonObject.getXpath(CommonObject.d12);

    public final static String d13P = "通用-第一浮层-表格下方翻页按钮-下一页-li";
    private final static String x13P = p + CommonObject.getXpath(CommonObject.d13);

    public final static String d14P = "通用-第一浮层-表格下方翻页按钮-下一页前的按钮,可以看出共多少页-a";
    private final static String x14P = p + CommonObject.getXpath(CommonObject.d14);

    public final static String d15P = "通用-第一浮层-表格下方跳页输入框-input";
    private final static String x15P = p + CommonObject.getXpath(CommonObject.d15);

    public final static String d16P = "通用-第一浮层-表格下方跳页输入框左边的跳至两个字-div";
    private final static String x16P = p + CommonObject.getXpath(CommonObject.d16);

    public final static String d18P = "通用-第一浮层-条/页-div";
    private final static String x18P = p + CommonObject.getXpath(CommonObject.d18);

    public final static String d18Pl5 = "通用-第一浮层-条/页-5 条/页-li";
    private final static String x18Pl5 = p + CommonObject.getXpath(CommonObject.d18l5);

    public final static String d18Pl10 = "通用-第一浮层-条/页-10 条/页-li";
    private final static String x18Pl10 = p + CommonObject.getXpath(CommonObject.d18l10);

    public final static String d18Pl20 = "通用-第一浮层-条/页-20 条/页-li";
    private final static String x18Pl20 = p + CommonObject.getXpath(CommonObject.d18l20);

    public final static String d18Pl30 = "通用-第一浮层-条/页-30 条/页-li";
    private final static String x18Pl30 = p + CommonObject.getXpath(CommonObject.d18l30);


    public final static String d28P = "通用-第一浮层-表头多选框-input";
    private final static String x28P = p + CommonObject.getXpath(CommonObject.d28);


//    public final static String $d1="通用-表格表体rows-第$行)";
//    private final static String $x1=get$String()


    public static String getStringP() {
        return p;
    }

    public static String getP$X3(String label) {
        return getP$X3(label,"div");
    }

    public static String getP$X3(String label, String tag) {

        //div[@tabindex]//label[1=1 and contains(text(),"开发类型")]/../following-sibling::div[1]
        String xpath = "";
        if (tag.equals("div")) {
            xpath = getStringP() + CommonObject.get$X3(label);
        } else {
            xpath = getStringP() + CommonObject.get$X3(label)+"//"+tag;
        }

        return xpath;
    }

    public static String getP$D3(String label) {
        return getP$D3(label,"div");
    }

    public static String getP$D3(String label, String tag) {
        //通用-第一浮层-表格表体-第1行
        String description = "通用-第一浮层-选择:";
        description = description + label;
        description = description + "-"+tag;

        return description;
    }


    public static String get$X1P(String num) {
        //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key]
        String xpath = "//div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][";
        xpath = xpath + num;
        xpath = xpath + "]";

        return xpath;
    }

    public static String get$D1P(String num) {
        //通用-表格表体-第1行
        String description = "通用-第一浮层-表格表体-第";
        description = description + num;
        description = description + "行";

        return description;
    }


    public static String get$Xli(String label){
        //div[@tabindex]//li[1=1 and contains(text(),"个人")]
        String xpath = "";
        xpath = getStringP() +CommonObject.get$Xli(label) ;
        return xpath;
    }


    public static String get$Dli(String label) {
        //通用-OA账号-li
        String description = "通用-第一浮层";
        description = description + label;
        description = description + "-li";

        return description;
    }


    public static String getArrow(String xpath){
        return xpath + arrow;
    }

    public static String getCross(String xpath){
        return xpath + cross;
    }

    public static String getSearch(String xpath){
        return xpath + search;
    }


    public static String getXpath(String description) {
        String str = "";
        switch (description) {
            case d9P:
                str = x9P;
                break;
            case d10P:
                str = x10P;
                break;
            case d11P:
                str = x11P;
                break;
            case d12P:
                str = x12P;
                break;
            case d13P:
                str = x13P;
                break;
            case d14P:
                str = x14P;
                break;
            case d15P:
                str = x15P;
                break;
            case d16P:
                str = x16P;
                break;
            case d18P:
                str = x18P;
                break;
            case d28P:
                str = x28P;
                break;
            case d18Pl5:
                str = x18Pl5;
                break;
            case d18Pl10:
                str = x18Pl10;
                break;
            case d18Pl20:
                str = x18Pl20;
                break;
            case d18Pl30:
                str = x18Pl30;
                break;
            case d10PSelected:
                str = x10PSelected;
                break;
            case d10PNotSelected:
                str = x10PNotSelected;
                break;
            case d31P:
                str = x31P;
                break;
        }
        return str;

    }


}
