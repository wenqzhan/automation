package com.demostration;

import com.actions.OpenBrowserAction;
import com.actions.matrix.LoginAction;
import com.actions.matrix.orgCust.CustRelationshipBrokerageAction;
import com.driver.$;
import com.pageObject.matrix.orgCust.CustRelationshipBrokerage;
import com.pageObject.matrix.orgCust.CustomerRelationshipFundAccount;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CRBD extends $ {

    @Test
    public void openTest(){
        LoginAction.login();
        $.get(CustRelationshipBrokerage.custRelationshipBrokerage);

        CustRelationshipBrokerageAction.getTable();//获取第一页表格内容
        jsonObject = CustRelationshipBrokerage.
                getJson(CustRelationshipBrokerage.d9);
        $.findElement(jsonObject);
        String str = $.getText();//查询出一共有几页
        int num = Integer.valueOf(str);
        for (int i = 2; i <=num ; i++) {
            CustRelationshipBrokerageAction.getTable(i);
        }//获取从第二页到最后页的表格内容

//        System.out.println("************************************");
//        PrintList.printList(tableContent);
//        System.out.println("************************************");


        List<List<String>> list1 = tableContent;

        jsonObject = CustRelationshipBrokerage.getJson(CustRelationshipBrokerage.d3);
        $.findElement(jsonObject);
        $.click();//导出报表

        jsonObject = CustRelationshipBrokerage.getJson(CustRelationshipBrokerage.d5);
        $.findElement(jsonObject);
        String s = $.getInputValue();
        System.out.println(s);//获取导出报表的文件名

        jsonObject = CustRelationshipBrokerage.getJson(CustRelationshipBrokerage.d4);
        $.findElement(jsonObject);
        $.click();//点击确认导出

        String path = "D:\\ChromeDownload\\"+s+".xls";
        System.out.println(path);
        String pwd = "999999";

        List<List<String>> list3 = new ArrayList<>();





    }


    @BeforeTest
    public static void beforeTest01() {
        OpenBrowserAction.open("chrome");
    }

    @AfterTest
    public static void afterTest01() throws InterruptedException {

        Thread.sleep(5000);
        $.quit();
    }



}
