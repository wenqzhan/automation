package com.actions.matrix.orgCust;

import com.driver.$;
import com.pageObject.matrix.orgCust.AssignCust;
import com.utils.jdbc.JDBC;
import com.utils.log.LoggerController;
import com.utils.num.IntMisc;
import com.utils.string.StringMisc;

public class AssignCustAction extends $ {
    private final static LoggerController log = LoggerController.getLogger(AssignCustAction.class);

    public static void getTable() {
        jsonObject = AssignCust.getJson(AssignCust.d11);
        $.findElements(jsonObject);
        $.getTableHeader();
        //定位表头,获取表头中的所有文字,存到tableContent中
        jsonObject = AssignCust.getJson(AssignCust.d10);
        try {
            findElement(jsonObject, 2, false);
            findElements(jsonObject);
            getTableBody();
        } catch (Exception e) {
            log.info("表格表体应该是空的");
        }
    }

    public static void getPoppedTable() {
        jsonObject = AssignCust.getJson(AssignCust.dd2Pd11t);
        $.findElements(jsonObject);
        $.getTableHeader();
        //定位表头,获取表头中的所有文字,存到tableContent中
        jsonObject = AssignCust.getJson(AssignCust.dd2Pd10t);
        try {
            findElement(jsonObject, 2, false);
            findElements(jsonObject);
            getTableBody();
        } catch (Exception e) {
            log.info("弹出的表格表体应该是空的");
        }
    }


    public static void getLastPageTable() {
        findElement(AssignCust.getJson(AssignCust.d14));
        getText();//获取第几页,保存到text里
        maxPageNum = IntMisc.getMaxPageNum(text);
        click();
        //findElement(AssignCust.getJson(AssignCust.d17));//定位菊花
        if (isNotDisplayed(AssignCust.getJson(AssignCust.d17))) {//如果数据加载的那个菊花不显示了,说明已经加载好
            getTable();
        }

    }


    public static void getRandomPageTable() {
        findElement(AssignCust.getJson(AssignCust.d14));
        getText();//获取第几页,保存到text里
        randomPageNum = IntMisc.getRandomPageNum(text);
        findElement(AssignCust.getJson(AssignCust.d15));
        //clear();
        sendKeys("" + randomPageNum);
        findElement(AssignCust.getJson(AssignCust.d28));
        click();//点一下页面其他元素,会开始查询
        //findElement(AssignCust.getJson(AssignCust.d17));//定位菊花
        if (isNotDisplayed(AssignCust.getJson(AssignCust.d17))) {//如果数据加载的那个菊花不显示了,说明已经加载好
            getTable();
        }

    }


    public static void getMaxPageNum() {
        findElement(AssignCust.getJson(AssignCust.d14));
        getText();
        maxPageNum = IntMisc.getMaxPageNum(text);
    }


    public static void getPerPageNum() {
        findElement(AssignCust.getJson(AssignCust.d18));//定位 条/页
        getText();//获取 条/页 里的文本
        perPageNum = IntMisc.getPerPageNum(text);
    }

    public static void getPoppedPerPageNum() {
        findElement(AssignCust.getJson(AssignCust.dd2Pd18t));//定位 条/页
        getText();//获取 条/页 里的文本
        perPageNum = IntMisc.getPerPageNum(text);
    }



    public static void getRandomPerPageNum() {
        getPerPageNum();
        randomPerPageNum = IntMisc.getRandomPerPageNum(perPageNum);
    }


    public static void changeToPerPage(int randomPerPageNum) {
        findElement(AssignCust.getJson(AssignCust.d18));
        click();
        switch (randomPerPageNum) {
            case 5:
                findElement(AssignCust.getJson(AssignCust.d18l5));
                break;
            case 10:
                findElement(AssignCust.getJson(AssignCust.d18l10));
                break;
            case 20:
                findElement(AssignCust.getJson(AssignCust.d18l20));
                break;
            case 30:
                findElement(AssignCust.getJson(AssignCust.d18l30));
                break;
        }
        click();


    }


    //获取表头+某一行数据
    public static void getInfo(String num) {
        jsonObject = AssignCust.getJson(AssignCust.d11);
        $.findElements(jsonObject);
        $.getTableHeader();
        //定位表头,获取表头中的所有文字,存到tableContent中
        jsonObject = AssignCust.get$Json1(num);
        $.findElements(jsonObject);
        $.getTableBody();
    }


    public static void getTable(int i) {

        jsonObject = AssignCust.getJson(AssignCust.d13);
        $.findElement(jsonObject);
        $.click();//点击下一页

//        jsonObject = CustomerRelationshipFundAccount.getJson(CustomerRelationshipFundAccount.d12);
//        $.findElements(jsonObject);
//        $.sendKeys(String.valueOf(i));
//        $.pressAndRelease(KeyEvent.VK_ENTER);

//        jsonObject = CustomerRelationshipFundAccount.getJson(CustomerRelationshipFundAccount.d13);
//        $.findElements(jsonObject);


        //jsonObject = AssignCust.getJson(AssignCust.d17);
        $.findElement(AssignCust.getJson(AssignCust.d17));
        if ($.isNotDisplayed(jsonObject)) {//如果数据加载的那个菊花不显示了,说明已经加载好
            getTable();
        }

    }


    public static String getSqlResultStr(String sql) {
        String str = JDBC.getSqlResultStr(sql);
        string = str;
        return str;
    }


    public static String getPartialSqlResultStr(String sql) {
        String str = JDBC.getSqlResultStr(sql);
        str = StringMisc.getPartialStr(str);
        string = str;
        return str;
    }


    public static void searchCustName(String custName) {
        findElement(AssignCust.getJson(AssignCust.d2));//找到客户名称输入框
        //clear();//清除已有内容
        sendKeys(custName);//根据传入的内容输入客户名称
        findElement(AssignCust.getJson(AssignCust.d3));//找到查询按钮
        click();//点击查询按钮
        //findElement(AssignCust.getJson(AssignCust.d17));//定位转菊花

        if ($.isNotDisplayed(AssignCust.getJson(AssignCust.d17))) {//如果数据加载的那个菊花不显示了,说明已经加载好
            getTable();//获取页面数据
        }

    }


    public static void searchOAAccount(String OAAccount) {
        findElement(AssignCust.getJson(AssignCust.d1));//找到客户名称输入框
        //clear();//清除已有内容
        sendKeys(OAAccount);//根据传入的内容输入客户名称
        findElement(AssignCust.getJson(AssignCust.d3));//找到查询按钮
        click();//点击查询按钮
        //findElement(AssignCust.getJson(AssignCust.d17));//定位转菊花

        if ($.isNotDisplayed(AssignCust.getJson(AssignCust.d17))) {//如果数据加载的那个菊花不显示了,说明已经加载好
            getTable();//获取页面数据
        }

    }


    public static void searchCustManager(String custManager) {

        while (true) {
            int a =0;
            try {
                a++;
                if(a>100){
                    log.error("找不到输入框,要死循环了,跳出吧");
                    break;
                }
                findElement(AssignCust.getJson(AssignCust.d27), 2, false);
                break;
            } catch (Exception e) {
                findElement(AssignCust.getJson(AssignCust.d5));
                click();//点击展开
            }
        }    //如果找不到客户经理输入框,那么可能是被折叠了,那么展开

        findElement(AssignCust.getJson(AssignCust.d27));//找到客户经理输入框
        //clear();//清除已有内容
        sendKeys(custManager);//根据传入的内容输入客户名称
        findElement(AssignCust.getJson(AssignCust.d3));//找到查询按钮
        click();//点击查询按钮
        //findElement(AssignCust.getJson(AssignCust.d17));//定位转菊花

        if ($.isNotDisplayed(AssignCust.getJson(AssignCust.d17))) {//如果数据加载的那个菊花不显示了,说明已经加载好
            getTable();//获取页面数据
        }

    }


}
