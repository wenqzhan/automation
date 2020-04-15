package com.actions.matrix.orgCust;

import com.driver.$;
import com.pageObject.matrix.orgCust.CustRelationshipBrokerage;
import com.pageObject.matrix.orgCust.CustomerRelationshipFundAccount;

public class CustRelationshipBrokerageAction extends $ {

    public static void getTable() {
        jsonObject = CustRelationshipBrokerage.getJson(CustRelationshipBrokerage.d8);
        $.findElements(jsonObject);
        $.getTableHeader();
        //定位表头,获取表头中的所有文字,存到tableContent中
        jsonObject = CustRelationshipBrokerage.getJson(CustRelationshipBrokerage.d7);
        //System.out.println(jsonObject);
        $.findElements(jsonObject);
        $.getTableBody();
        //定位表体,获取表体中的所有问题,存到tableContent中
        //System.out.println(elements2.size()+"1111111111");
        //System.out.println("-----------------");
        //PrintList.printList(tableContent);
        //System.out.println("*****************");
    }


    public static void getInfo(String num){
        jsonObject = CustRelationshipBrokerage.getJson(CustRelationshipBrokerage.d8);
        $.findElements(jsonObject);
        $.getTableHeader();
        //定位表头,获取表头中的所有文字,存到tableContent中
        jsonObject = CustRelationshipBrokerage.get$Json(num);
        $.findElements(jsonObject);
        $.getTableBody();
    }


    public static void getTable(int i) {

        jsonObject = CustRelationshipBrokerage.getJson(CustRelationshipBrokerage.d14);
        $.findElement(jsonObject);
        $.click();//点击下一页

        jsonObject = CustRelationshipBrokerage.getJson(CustRelationshipBrokerage.d17);
        $.findElement(jsonObject);
        if ($.isNotDisplayed(jsonObject)) {//如果数据加载的那个菊花不显示了,说明已经加载好
            jsonObject = CustRelationshipBrokerage.getJson(CustRelationshipBrokerage.d7);
            //System.out.println(jsonObject);
            $.findElements(jsonObject);
            $.getTableBody();
        }

    }





}
