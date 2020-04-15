package com.actions.matrix.orgCust;

import com.driver.$;
import com.pageObject.matrix.orgCust.AssignCust;
import com.utils.json.JsonObject;
import com.utils.log.LoggerController;
import com.utils.num.IntMisc;

public class AssignCustAction extends $ {
    private final static LoggerController log = LoggerController.getLogger(AssignCustAction.class);

    public static void getTable() {
        jsonObject = AssignCust.getJson(AssignCust.d11);
        $.findElements(jsonObject);
        $.getTableHeader();
        //定位表头,获取表头中的所有文字,存到tableContent中
        jsonObject = AssignCust.getJson(AssignCust.d10);
        //System.out.println(jsonObject);
        $.findElements(jsonObject);
        $.getTableBody();
        //定位表体,获取表体中的所有问题,存到tableContent中
        //System.out.println(elements2.size()+"1111111111");
        //System.out.println("-----------------");
        //PrintList.printList(tableContent);
        //System.out.println("*****************");
    }

    public static void getLastPageTable() {
        findElement(AssignCust.getJson(AssignCust.d14));
        getText();//获取第几页,保存到text里
        maxPageNum = IntMisc.getMaxPageNum(text);
        click();
        findElement(AssignCust.getJson(AssignCust.d17));//定位菊花
        if (isNotDisplayed(jsonObject)) {//如果数据加载的那个菊花不显示了,说明已经加载好
            getTable();
        }

    }


    public static void getRandomPageTable() {
        findElement(AssignCust.getJson(AssignCust.d14));
        getText();//获取第几页,保存到text里
        randomPageNum = IntMisc.getRandomPageNum(text);
        findElement(AssignCust.getJson(AssignCust.d15));
        sendKeys("" + randomPageNum);
        findElement(AssignCust.getJson(AssignCust.d28));
        click();//点一下页面其他元素,会开始查询
        findElement(AssignCust.getJson(AssignCust.d17));//定位菊花
        if (isNotDisplayed(jsonObject)) {//如果数据加载的那个菊花不显示了,说明已经加载好
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


        jsonObject = AssignCust.getJson(AssignCust.d17);
        $.findElement(jsonObject);
        if ($.isNotDisplayed(jsonObject)) {//如果数据加载的那个菊花不显示了,说明已经加载好
            jsonObject = AssignCust.getJson(AssignCust.d10);
            //System.out.println(jsonObject);
            $.findElements(jsonObject);
            $.getTableBody();
        }

    }


}
