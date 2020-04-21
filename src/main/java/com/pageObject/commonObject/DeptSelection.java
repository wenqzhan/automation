package com.pageObject.commonObject;

public class DeptSelection {
    private final static String prefix = "//div[1=1 and contains(@class,'ant-modal-content')]";

    private final static String append1 = "/../../following-sibling::*";

    private final static String append2 = "/following-sibling::div/div";


    public final static String dDS32 = "通用-部门选择-查询框-input";
    private final static String xDS32 = prefix + CommonObject.getXpath(CommonObject.d32);
    //div[1=1 and contains(@class,'ant-modal-content')]//input[1=1 and contains(@placeholder,'输入查询')]

    public final static String dDS29 = "通用-部门选择-确定-span";
    private final static String xDS29 = xDS32 + append1 + CommonObject.getXpath(CommonObject.d29);
    //div[1=1 and contains(@class,'ant-modal-content')]//input[1=1 and contains(@placeholder,'输入查询')]/../../following-sibling::*//span[1=1 and contains(text(),"确 定")]

    public final static String dDS30 = "通用-部门选择-关闭-span";
    private final static String xDS30 = xDS32 + append1 + CommonObject.getXpath(CommonObject.d30);
    //div[1=1 and contains(@class,'ant-modal-content')]//input[1=1 and contains(@placeholder,'输入查询')]/../../following-sibling::*//span[1=1 and contains(text(),"关 闭")]


    public final static String dDS32_1 = "通用-部门选择-查询框-input_候选项-div";
    private final static String xDS32_1 = xDS32 + append2;
    //div[1=1 and contains(@class,'ant-modal-content')]//input[1=1 and contains(@placeholder,'输入查询')]/following-sibling::div/div
    //候选项一般有多个

    /**
     * 获取候选项里第N个元素的xpath,支持最后一个
     * @param num 第N行,如果最后一行传入-1
     */
    public static String get$xDS32_1(int num){
        String xpath;
        if(num>0){
            xpath = xDS32_1 + "[" + num + "]";
        }else if(num==-1){
            xpath = xDS32_1 + "[" + "last()" + "]";
        }else {
            xpath = xDS32_1;
        }

        return xpath;
    }

    /**
     * 获取候选项里第N个元素的描述,支持最后一个
     * @param num 第N行,如果最后一行传入-1
     */
    public static String get$dDS32_1(int num){
        String a;
        String des;
        if(num>0){
            a = "-第"+num;
        }else if(num==-1){
            a = "-最后项";
        }else {
            a = "error";
        }

        des = dDS32_1.replace("-div",a+"-div");
        return des;
    }

    /**
     * 用部门名定位候选项,返回元素的xpath
     * @param dept 部门名称
     */
    public static String get$xDS32_1(String dept){
        String xpath;

            xpath = xDS32_1 + "[@title='" + dept + "']";

        return xpath;
    }

    /**
     * 用部门名定位候选项,返回元素的描述
     * @param dept 部门名称
     */
    public static String get$dDS32_1(String dept){

        String des;

        des = dDS32_1.replace("-div",dept+"-div");
        return des;
    }





}
