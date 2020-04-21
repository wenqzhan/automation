package com.pageObject.commonObject;

public class EmpSelection {

    private final static String prefix = "//div[1=1 and contains(@class,'ant-modal-content')]";

    private final static String append1 = "/following-sibling::span[1]";

    //private final static String append1 = "/../../following-sibling::*";

    //private final static String append2 = "/following-sibling::div/div";


    public final static String dES32 = "通用-员工查询-左侧部门查询框-input";
    private final static String xES32 = prefix + CommonObject.getXpath(CommonObject.d32);
    //div[1=1 and contains(@class,'ant-modal-content')]//input[1=1 and contains(@placeholder,'输入查询')]


    public final static String dES33 = "通用-员工查询-右侧用户名查询-input";
    private final static String xES33 = prefix + CommonObject.getXpath(CommonObject.d33);
    //div[1=1 and contains(@class,'ant-modal-content')]//input[1=1 and contains(@placeholder,'输入用户名')]

    public final static String dES33_1 = "通用-员工查询-右侧用户名查询-input_旁边的查询按钮-span";
    private final static String xES33_1 = prefix + CommonObject.getXpath(CommonObject.d33);

    public final static String dES10 = "通用-员工查询-表格表体rows-tr";
    private final static String xES10 = prefix + CommonObject.getXpath(CommonObject.d10);
    //div[1=1 and contains(@class,'ant-modal-content')]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key]


    /**
     * 获取员工查询-表格表体rows的xpath,支持最后一个
     *
     * @param num 第N行,如果最后一行传入-1
     */
    public static String get$xES10(int num) {
        String xpath;
        if (num > 0) {
            xpath = xES10 + "[" + num + "]";
        } else if (num == -1) {
            xpath = xES10 + "[" + "last()" + "]";
        } else {
            xpath = xES10;
        }

        return xpath;
    }

    /**
     * 获取员工查询-表格表体rows的描述,支持最后一个
     *
     * @param num 第N行,如果最后一行传入-1
     */
    public static String get$dES10(int num) {
        String a;
        String des;
        if (num > 0) {
            a = "-第" + num;
        } else if (num == -1) {
            a = "-最后行";
        } else {
            a = "error";
        }

        des = dES10.replace("-tr", a + "-tr");
        return des;
    }

    /**
     * 用员工姓名定位候选项,返回元素的xpath
     *
     * @param userName 员工姓名
     */
    public static String get$xES10(String userName) {
        String xpath;

        xpath = xES10 + "/td[text()='" + userName + "']";

        return xpath;
    }

    /**
     * 用员工姓名定位候选项,返回元素的描述
     *
     * @param userName 员工姓名
     */
    public static String get$dES10(String userName) {

        String des;

        des = dES10.replace("-tr", userName + "-tr");
        return des;
    }


}
