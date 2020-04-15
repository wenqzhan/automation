package com.demostration;

import com.actions.OpenBrowserAction;
import com.actions.matrix.LoginAction;
import com.actions.matrix.orgCust.AssignCustAction;
import com.driver.$;
import com.pageObject.matrix.orgCust.AssignCust;
import com.utils.jdbc.JDBC;
import com.utils.list.ListMisc;
import com.utils.log.LoggerController;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AC extends $ {
    private final static LoggerController log = LoggerController.getLogger(AC.class);
    private static String sql;
    private static String originalSql;
    private static String tmpSql;
    private static String pagination;

    @Test
    public static void test01() {

        AssignCustAction.getTable();//获取第一页页面信息
        AssignCustAction.getPerPageNum();//获得当前页面的条/页
        pagination = JDBC.getPagination(1, perPageNum);//获得分页语句
        compareWebPageWithDatabase();//比较页面信息和数据库信息

    }

    @Test
    public static void test02() {

        AssignCustAction.getLastPageTable();//跳转最后一页,并获得页面信息
        AssignCustAction.getPerPageNum();//获得当前页面的条/页
        pagination = JDBC.getPagination(maxPageNum, perPageNum);//获得分页语句
        compareWebPageWithDatabase();//比较页面信息和数据库信息
    }


    @Test
    public static void test03() {
        AssignCustAction.getRandomPageTable();//随机生成N1,随机跳转第N1页,获得页面信息
        AssignCustAction.getPerPageNum();//获得当前页面的条/页
        pagination = JDBC.getPagination(randomPageNum, perPageNum);//获得分页语句
        compareWebPageWithDatabase();//比较页面信息和数据库信息
    }


    @Test
    public static void test04() {
        AssignCustAction.getRandomPerPageNum();//获取随机的条/页,N2
        AssignCustAction.changeToPerPage(randomPerPageNum);//更改为N2条/页
        AssignCustAction.getRandomPageTable();//随机生成N1,随机跳转第N1页,获得页面信息
        pagination = JDBC.getPagination(randomPageNum, randomPerPageNum);//获得分页语句
        compareWebPageWithDatabase();//比较页面信息和数据库信息
    }

    @Test
    public static void test05() {
        get(AssignCust.assignCust);

    }


    @BeforeTest
    public static void beforeTest01() {
        OpenBrowserAction.open("chrome");
        LoginAction.login();
        get(AssignCust.assignCust);//登录后跳转客户维护分配页面

        originalSql = "select *\n" +
                "  from (select rownum as 编号,\n" +
                "               cust_name as 客户名称,\n" +
                "               replace_code_with_name(cust_grade, 'MR_CM_GRADE') as 客户级别,\n" +
                "               cust_oa as OA账号,\n" +
                "               deptname as 客户所属部门,\n" +
                "               username as 客户经理,\n" +
                "               user_relation_team as 团队名称\n" +
                "          from CUST_WH_RELATION) where 1 = 1\n";


        //tmpSql =
    }





    private static void compareWebPageWithDatabase(){
        List<List<String>> list1 = tableContent;//把页面内容放入list里

        sql = originalSql + pagination;//拼上分页语句
        List<List<String>> list2 = new ArrayList<>();

        list2 = JDBC.getResultToList(sql);//获得sql结果,放入list2

        boolean flag = ListMisc.isEqual(list1, list2);//判断网页上的内容和数据库内容是否相符

        System.out.println(flag);
    }


    @AfterTest
    public static void afterTest01() throws InterruptedException {

        Thread.sleep(5000);
        $.quit();
    }


}
