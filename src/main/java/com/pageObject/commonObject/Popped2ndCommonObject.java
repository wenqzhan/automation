package com.pageObject.commonObject;

public class Popped2ndCommonObject {

    //div[1=1 and contains(@class,'ant-modal-content')]//input[1=1 and contains(@placeholder,'输入')]

    private final static String pp = "//div[1=1 and contains(@class,'ant-modal-content')]";


    public final static String d1PP = "通用-第二浮层-查询框-input";
    private final static String x1PP = pp + "//input[1=1 and contains(@placeholder,'输入')]";


    public static String get$DD1(String str) {
        String description="第二浮层-查询框输入后-选择";
        description = description +str;

        return description;
    }

    public static String get$XX1(String str,String parentXpath) {
        String xpath;
        xpath = parentXpath + "/following-sibling::div/div[@title='" ;
        xpath = xpath + str;
        xpath = xpath + "']";
        return xpath;
    }








}
