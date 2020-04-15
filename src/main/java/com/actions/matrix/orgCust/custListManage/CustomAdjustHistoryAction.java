package com.actions.matrix.orgCust.custListManage;

import com.driver.$;
import com.pageObject.matrix.orgCust.OrgCustList;
import com.pageObject.matrix.orgCust.custListManage.CustomAdjustHistory;

import java.awt.event.KeyEvent;
import java.util.List;

public class CustomAdjustHistoryAction extends $ {


    public static void getTable() {
        jsonObject = CustomAdjustHistory.getJson(CustomAdjustHistory.d10);
        $.findElements(jsonObject);
        $.getTableHeader();
        //定位表头,获取表头中的所有文字,存到tableContent中
        jsonObject = CustomAdjustHistory.getJson(CustomAdjustHistory.d9);
        //System.out.println(jsonObject);
        $.findElements(jsonObject);
        $.getTableBody();
        //定位表体,获取表体中的所有问题,存到tableContent中
        //System.out.println(elements2.size()+"1111111111");
        //System.out.println("-----------------");
        //PrintList.printList(tableContent);
        //System.out.println("*****************");
    }

    public static void getTable(int i) {

        jsonObject = CustomAdjustHistory.getJson(CustomAdjustHistory.d15);
        $.findElement(jsonObject);
        $.click();//点击下一页

//        jsonObject = CustomAdjustHistory.getJson(CustomAdjustHistory.d12);
//        $.findElements(jsonObject);
//        $.sendKeys(String.valueOf(i));
//        $.pressAndRelease(KeyEvent.VK_ENTER);

//        jsonObject = CustomAdjustHistory.getJson(CustomAdjustHistory.d13);
//        $.findElements(jsonObject);


        jsonObject = CustomAdjustHistory.getJson(CustomAdjustHistory.d14);
        $.findElement(jsonObject);
        if ($.isNotDisplayed(jsonObject)) {//如果数据加载的那个菊花不显示了,说明已经加载好
            jsonObject = CustomAdjustHistory.getJson(CustomAdjustHistory.d9);
            //System.out.println(jsonObject);
            $.findElements(jsonObject);
            $.getTableBody();
        }

    }




    /**
     * 在客户查询功能中根据传入的OA查询
     *
     * @param oa 客户名称,可以是全名或者部分
     */
    public static void searchCustOA(String oa) {
        jsonObject = CustomAdjustHistory.getJson(CustomAdjustHistory.d1);
        $.findElement(jsonObject);//定位OA账号查询框
        $.clear();//框内框内有数据,先清空
        $.sendKeys(oa);//输入客户名称
        jsonObject = CustomAdjustHistory.getJson(CustomAdjustHistory.d3);
        $.findElement(jsonObject);//定位查询按钮
        $.click();//点击查询按钮
        jsonObject = CustomAdjustHistory.getJson(CustomAdjustHistory.d9);
        $.findElements(jsonObject);
        //定位查询结果(表格的表体,定位到了说明查询有结果了.不能定位表头,因为表头一直存在)
    }

    /**
     * 在客户查询功能中根据传入的OA查询
     *
     * @param custName 客户名称,可以是全名或者部分
     */
    public static void searchCustCustName(String custName) {
        jsonObject = CustomAdjustHistory.getJson(CustomAdjustHistory.d2);
        $.findElement(jsonObject);//定位客户名称查询框
        $.clear();//框内框内有数据,先清空
        $.sendKeys(custName);//输入客户名称
        jsonObject = CustomAdjustHistory.getJson(CustomAdjustHistory.d3);
        $.findElement(jsonObject);//定位查询按钮
        $.click();//点击查询按钮
        jsonObject = CustomAdjustHistory.getJson(CustomAdjustHistory.d9);
        $.findElements(jsonObject);
        //定位查询结果(表格的表体,定位到了说明查询有结果了.不能定位表头,因为表头一直存在)
    }


    public static void searchAll(List<String> strings){

    }

}
