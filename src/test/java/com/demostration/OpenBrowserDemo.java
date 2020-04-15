package com.demostration;

import com.actions.matrix.LoginAction;
import com.actions.matrix.orgCust.custListManage.CustomAdjustHistoryAction;
import com.driver.$;


import com.pageObject.matrix.orgCust.custListManage.CustomAdjustHistory;
import com.utils.jdbc.JDBC;
import com.utils.list.ListMisc;
import com.utils.poi.Excel;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.actions.OpenBrowserAction;

import java.util.ArrayList;
import java.util.List;

public class OpenBrowserDemo extends $ {
    @Test
    public void openTest() throws InterruptedException {
        LoginAction.login();
        //LoginAction.login2();
        $.get("http://10.187.144.60:8080/custListMange/customAdjustHistory");

        CustomAdjustHistoryAction.getTable();//获取第一页表格内容
        jsonObject = CustomAdjustHistory.getJson(CustomAdjustHistory.d11);
        $.findElement(jsonObject);
        String str = $.getText();//查询出一共有几页
        int num = Integer.valueOf(str);
        for (int i = 2; i <=num ; i++) {
            CustomAdjustHistoryAction.getTable(i);
        }//获取从第二页到最后页的表格内容

//        System.out.println("************************************");
//        PrintList.printList(tableContent);
//        System.out.println("************************************");


        List<List<String>> list1 = tableContent;





        jsonObject = CustomAdjustHistory.getJson(CustomAdjustHistory.d5);
        $.findElement(jsonObject);
        $.click();//导出报表

        jsonObject = CustomAdjustHistory.getJson(CustomAdjustHistory.d7);
        $.findElement(jsonObject);
        String s = $.getInputValue();
        System.out.println(s);//获取导出报表的文件名

        jsonObject = CustomAdjustHistory.getJson(CustomAdjustHistory.d6);
        $.findElement(jsonObject);
        $.click();//点击确认导出

        String path = "D:\\ChromeDownload\\"+s+".xls";
        System.out.println(path);
        String pwd = "999999";


        List<List<String>> list3 = new ArrayList<>();
        String sql="select \n" +
                "rownum as 编号 ,     \n" +
                "case adju_status \n" +
                "when 'TC' then '调出'  \n" +
                "when 'TR' then '调入'\n" +
                "else adju_status end as 调整状态 , --调出 TC, 调入, TR  \n" +
                "oa_username as OA账号,\n" +
                "cust_name as 客户名称,\n" +
                "custhistory_grade_name as 客户级别,\n" +
                "case list_type\n" +
                "when '1' then '战略客户名单'\n" +
                "when '2' then '协同客户名单'\n" +
                "else list_type end  as 名单类型, ---战略客户名单 1, 协同客户名单 2\n" +
                "cust_date as 调整日期,\n" +
                "oper_username as 操作人,\n" +
                "msg as 调整理由\n" +
                " from MR_CM_CUSTHISTORY where 1=1 " ;

        list3= JDBC.getResultToList(sql);//获得sql结果

        //Thread.sleep(5000);//下载可能需要一点时间





        boolean flag = ListMisc.isEqual(list1,list3);//判断网页上的内容和数据库内容是否相符


        List<List<String>> list2 =Excel.getExcel(path, pwd);//获取excel中的数据

        flag =flag&ListMisc.isEqual(list1,list2);//判断网页上内容和导出表格是否相符

        System.out.println(flag);


        String sql1 = "select oa_username\n" +
                "  from (select *\n" +
                "          from MR_CM_CUSTHISTORY\n" +
                "         where oa_username is not null\n" +
                "         order by dbms_random.value)\n" +
                " where rownum = 1\n";

        String oaName = JDBC.getSqlResultStr(sql1);


//        $.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/form/span[1]"));
//        $.findChildElement(By.id("kw"),10);
//        $.sendKeys("ffff");
//      $.get("file:///F:/%E6%BA%90%E7%A0%81/webdriver_demo/selenium_html/index.html");
//      $.findElement(By.xpath("/html/body/div/table/tbody/tr[13]/td[2]/div[1]/input"));
//      $.forceClick();
//      $.findElement(By.xpath("/html/body/div/table/tbody/tr[13]/td[2]/div[2]/div"));
      //Thread.sleep(3000);
      //Screenshot.screenshot("7777");
      //MyAssert.assertTrue(false);

    }

    @BeforeTest
    public static void beforeTest01(){
        OpenBrowserAction.open("chrome");
    }
    @AfterTest
    public static void afterTest01() throws InterruptedException {

        Thread.sleep(5000);
        $.quit();
    }

}
