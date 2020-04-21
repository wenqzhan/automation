package com.demostration;

import com.actions.OpenBrowserAction;
import com.actions.matrix.LoginAction;
import com.actions.matrix.orgCust.CustomerRelationshipFundAccountAction;
import com.actions.matrix.orgCust.customerRelationshipFundAccount.DetailsPageAction;
import com.driver.$;
import com.pageObject.matrix.orgCust.CustomerRelationshipFundAccount;
import com.pageObject.matrix.orgCust.customerRelationshipFundAccount.DetailsPage;
import com.utils.jdbc.JDBC;
import com.utils.list.ListMisc;
import com.utils.poi.Excel;
import com.utils.random.Randoms;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class OpenBrowserDemo1 extends $ {
    @Test//客户关系资金账号
    public void openTest() throws InterruptedException {
        LoginAction.login();
        //LoginAction.login2();
        $.get("http://10.187.144.60:8080/orgcust/customerRelationshipFundAccount");

        CustomerRelationshipFundAccountAction.getTable();//获取第一页表格内容
        jsonObject = CustomerRelationshipFundAccount.getJson(CustomerRelationshipFundAccount.d11);
        $.findElement(jsonObject);
        String str = $.getText();//查询出一共有几页
        int num = Integer.valueOf(str);
        for (int i = 2; i <=num ; i++) {
            CustomerRelationshipFundAccountAction.getTable(i);
        }//获取从第二页到最后页的表格内容

//        System.out.println("************************************");
//        PrintList.printList(tableContent);
//        System.out.println("************************************");


        List<List<String>> list1 = tableContent;





        jsonObject = CustomerRelationshipFundAccount.getJson(CustomerRelationshipFundAccount.d5);
        $.findElement(jsonObject);
        $.click();//导出报表

        jsonObject = CustomerRelationshipFundAccount.getJson(CustomerRelationshipFundAccount.d7);
        $.findElement(jsonObject);
        String s = $.getInputValue();
        System.out.println(s);//获取导出报表的文件名

        jsonObject = CustomerRelationshipFundAccount.getJson(CustomerRelationshipFundAccount.d6);
        $.findElement(jsonObject);
        $.click();//点击确认导出

        String path = "D:\\ChromeDownload\\"+s+".xls";
        System.out.println(path);
        String pwd = "999999";


        List<List<String>> list3 = new ArrayList<>();
        String sql="select rownum      as 编号,\n" +
                "       fund_gtkhdm as 柜台客户代码,\n" +
                "       \n" +
                "       nvl((select dictionaryitem_itemname\n" +
                "             from JE_CORE_DICTIONARYITEM\n" +
                "            where dictionaryitem_dictionary_id =\n" +
                "                 \n" +
                "                  (select je_core_dictionary_id\n" +
                "                     from JE_CORE_DICTIONARY\n" +
                "                    where DICTIONARY_DDNAME = '资金账号客户详细关系')\n" +
                "              and dictionaryitem_itemcode = fund_gxxxlx),\n" +
                "           fund_gxxxlx) as 关系类型,\n" +
                "       \n" +
                "       nvl((select dictionaryitem_itemname\n" +
                "             from JE_CORE_DICTIONARYITEM\n" +
                "            where dictionaryitem_dictionary_id =\n" +
                "                 \n" +
                "                  (select je_core_dictionary_id\n" +
                "                     from JE_CORE_DICTIONARY\n" +
                "                    where DICTIONARY_DDNAME = '资金账号客户类型')\n" +
                "              and dictionaryitem_itemcode = fund_khlx),\n" +
                "           fund_khlx) as 客户类型,\n" +
                "       \n" +
                "       fund_gsjg as 归属机构,\n" +
                "       \n" +
                "       nvl((select dictionaryitem_itemname\n" +
                "             from JE_CORE_DICTIONARYITEM\n" +
                "            where dictionaryitem_dictionary_id =\n" +
                "                 \n" +
                "                  (select je_core_dictionary_id\n" +
                "                     from JE_CORE_DICTIONARY\n" +
                "                    where DICTIONARY_DDNAME = '账户类型')\n" +
                "              and dictionaryitem_itemcode = fund_zhlx),\n" +
                "           fund_zhlx) as 账户类型,\n" +
                "       \n" +
                "       fund_khrq as 开户日期,\n" +
                "       fund_sxrq as 生效日期\n" +
                "  from CUST_USER_FUND";

        list3= JDBC.getResultToList(sql);//获得sql结果

        //Thread.sleep(5000);//下载可能需要一点时间





        boolean flag = ListMisc.isEqual(list1,list3);//判断网页上的内容和数据库内容是否相符


        List<List<String>> list2 =Excel.getExcel(path, pwd);//获取excel中的数据

        flag =flag&ListMisc.isEqual(list1,list2);//判断网页上内容和导出表格是否相符

        System.out.println(flag);


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


        $.get("http://10.187.144.60:8080/orgcust/customerRelationshipFundAccount");

        //$.getWindowHandles(10);

        //description = $.getText();

        jsonObject = CustomerRelationshipFundAccount.get$Json("last()");
        $.findElement(jsonObject);
//        String
                str = element.getAttribute("data-row-key");//查询出一页最多有多少条

        int num1 = Randoms.getRandomNum(1, Integer.valueOf(str));
        str = String.valueOf(num1);//获取随机数

        //System.out.println(description);
        CustomerRelationshipFundAccountAction.getInfo(str);//获得表头和一行数据(表格信息)
        //System.out.println(description);
        jsonObject = CustomerRelationshipFundAccount.get$Json(str);//定位到随机到的那一行
        //System.out.println(jsonObject);
        $.findElement(jsonObject);
        $.doubleClick();//双击进入详细

        jsonObject = DetailsPage.getJson(DetailsPage.d8);
        $.findElement(jsonObject);//定位到保存按钮说明页面加载完毕

        List<String> list = DetailsPageAction.getInfo();//获取页面详细信息

        boolean flag1 = DetailsPageAction.isEqual(tableContent, list);
        System.out.println(flag1);//详细信息和表格信息对比


        jsonObject = DetailsPage.getJson(DetailsPage.d3);
        try {
            $.findElement(jsonObject, 2,false);//定位客户类型
        } catch (Exception e) {//因为数据库中这个类型字段既存了code又存了name,导致前端可能会找不到报错
            jsonObject = DetailsPage.getJson(DetailsPage.d3_1);
            $.findElement(jsonObject);//异常处理
        }
        $.click();

        jsonObject = DetailsPage.getJson(DetailsPage.d25);
        $.findElement(jsonObject);
        $.click();//点击席位

        jsonObject = DetailsPage.getJson(DetailsPage.d8);
        $.findElement(jsonObject);//定位到保存按钮
        $.click();

        list = DetailsPageAction.getInfo();//获取页面详细信息

        jsonObject = DetailsPage.getJson(DetailsPage.d9);
        $.findElement(jsonObject);
        $.click();//返回上一页

        jsonObject = CustomerRelationshipFundAccount.getJson(CustomerRelationshipFundAccount.d9);
        $.findElement(jsonObject);//定位到这个说明加载完毕

        CustomerRelationshipFundAccountAction.getInfo(str);//获取表格信息

        flag1 = DetailsPageAction.isEqual(tableContent, list);
        System.out.println(flag1);//详细信息和表格对比


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
