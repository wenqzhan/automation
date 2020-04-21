package com.demostration;

import com.actions.OpenBrowserAction;
import com.actions.matrix.LoginAction;
import com.actions.matrix.orgCust.AssignCustAction;
import com.driver.$;
import com.pageObject.matrix.orgCust.AssignCust;
import com.utils.jdbc.JDBC;
import com.utils.list.ListMisc;
import com.utils.log.LoggerController;
import com.utils.num.IntMisc;
import com.utils.random.Randoms;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AC extends $ {
    private final static LoggerController log = LoggerController.getLogger(AC.class);
    private static String sql;
    private static String originalSql1 = "";
    private static String originalSql2 = "";
    private static String sql1 = "";
    private static String sql2 = "";
    private static String sql3 = "";
    private static String sql4 = "";
    private static String pagination[] =  new String[]{"",""};
    private static String where = "";
    private static String whereLike = "";
    private static String order = "";

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
        AssignCustAction.getSqlResultStr(sql1);//查询数据库获得数据库中存在的cust_name
        AssignCustAction.searchCustName(string);//用客户名称查询条件搜索

        where = JDBC.getWhereLike("cust_name", string);//获取where

        AssignCustAction.getPerPageNum();//获得当前页面的条/页
        pagination = JDBC.getPagination(1, perPageNum);//获得分页语句

        compareWebPageWithDatabase();//比较页面信息和数据库信息
    }

    @Test
    public static void test06() {

        AssignCustAction.getPartialSqlResultStr(sql1);//查询数据库获得数据库中存在的cust_name(部分)
        AssignCustAction.searchCustName(string);//用客户名称查询条件搜索
        whereLike = JDBC.getWhereLike("cust_name", string);//获取where
        AssignCustAction.getPerPageNum();//获得当前页面的条/页
        pagination = JDBC.getPagination(1, perPageNum);//获得分页语句
        compareWebPageWithDatabase();//比较页面信息和数据库信息
    }

    @Test
    public static void test07() {

        string = "fsdf";
        AssignCustAction.searchCustName(string);//用客户名称查询条件搜索
        whereLike = JDBC.getWhereLike("cust_name", string);//获取where
        AssignCustAction.getPerPageNum();//获得当前页面的条/页
        pagination = JDBC.getPagination(1, perPageNum);//获得分页语句
        compareWebPageWithDatabase();//比较页面信息和数据库信息
    }


    @Test
    public static void test08() {
        //get(AssignCust.assignCust);
        AssignCustAction.getSqlResultStr(sql2);//查询数据库获得数据库中存在的cust_oa
        AssignCustAction.searchOAAccount(string);//用客户oa查询条件搜索

        where = JDBC.getWhereLike("cust_oa", string);//获取where

        AssignCustAction.getPerPageNum();//获得当前页面的条/页
        pagination = JDBC.getPagination(1, perPageNum);//获得分页语句

        compareWebPageWithDatabase();//比较页面信息和数据库信息
    }

    @Test
    public static void test09() {
        AssignCustAction.getPartialSqlResultStr(sql2);//查询数据库获得数据库中存在的cust_name(部分)
        AssignCustAction.searchOAAccount(string);//用客户名称查询条件搜索
        whereLike = JDBC.getWhereLike("cust_oa", string);//获取where
        AssignCustAction.getPerPageNum();//获得当前页面的条/页
        pagination = JDBC.getPagination(1, perPageNum);//获得分页语句
        compareWebPageWithDatabase();//比较页面信息和数据库信息
    }

    @Test
    public static void test10() {
        string = "-----";
        AssignCustAction.searchOAAccount(string);//用客户名称查询条件搜索
        whereLike = JDBC.getWhereLike("cust_oa", string);//获取where
        AssignCustAction.getPerPageNum();//获得当前页面的条/页
        pagination = JDBC.getPagination(1, perPageNum);//获得分页语句
        compareWebPageWithDatabase();//比较页面信息和数据库信息
    }

    @Test
    public static void test11() {
        boolean isDisplayed = !isNotDisplayed(AssignCust.getJson(AssignCust.d27));
        System.out.println(isDisplayed + "未点击展开前");

        findElement(AssignCust.getJson(AssignCust.d5));
        click();//点击展开

        isDisplayed = !isNotDisplayed(AssignCust.getJson(AssignCust.d27), 4);
        System.out.println(isDisplayed + "点了收起后");

        findElement(AssignCust.getJson(AssignCust.d5));
        click();//点击收起

        isDisplayed = !isNotDisplayed(AssignCust.getJson(AssignCust.d27));
        System.out.println(isDisplayed + "再次点了展开后");

    }

    @Test
    public static void test12() {
        //get(AssignCust.assignCust);
        AssignCustAction.getSqlResultStr(sql3);//查询数据库获得数据库中存在的username(客户经理)
        AssignCustAction.searchCustManager(string);//用客户经理查询条件搜索

        where = JDBC.getWhereLike("username", string);//获取where

        AssignCustAction.getPerPageNum();//获得当前页面的条/页
        pagination = JDBC.getPagination(1, perPageNum);//获得分页语句

        compareWebPageWithDatabase();//比较页面信息和数据库信息
    }

    @Test
    public static void test13() {

        AssignCustAction.getPartialSqlResultStr(sql3);//查询数据库获得数据库中存在的username(客户经理)(部分)
        AssignCustAction.searchCustManager(string);//用客户经理查询条件搜索
        whereLike = JDBC.getWhereLike("username", string);//获取where
        AssignCustAction.getPerPageNum();//获得当前页面的条/页
        pagination = JDBC.getPagination(1, perPageNum);//获得分页语句
        compareWebPageWithDatabase();//比较页面信息和数据库信息
    }

    @Test
    public static void test14() {

        string = "-----";
        AssignCustAction.searchCustManager(string);//用username(客户经理)查询条件搜索
        whereLike = JDBC.getWhereLike("cust_oa", string);//获取where
        AssignCustAction.getPerPageNum();//获得当前页面的条/页
        pagination = JDBC.getPagination(1, perPageNum);//获得分页语句
        compareWebPageWithDatabase();//比较页面信息和数据库信息
    }


    @Test
    public static void test15() {
        get(AssignCust.assignCust);//刷新页面
        findElement(AssignCust.getJson(AssignCust.dd1));//找到客户分配按钮
        click();//点击
        boolean isDisplayed = true;
        try {
            findElement(AssignCust.getJson(AssignCust.dd3));
        }//应该会提示 请选择客户信息
        catch (Exception e) {
            isDisplayed = false;
        }
        System.out.println(isDisplayed);

    }

    @Test
    public static void test16() {
        get(AssignCust.assignCust);//刷新页面
        findElement(AssignCust.getJson(AssignCust.dd2));//找到客户分配按钮
        click();//点击
        boolean isDisplayed = true;
        try {
            findElement(AssignCust.getJson(AssignCust.dd4));
        }//应该会提示 请选择客户信息
        catch (Exception e) {
            isDisplayed = false;
        }
        System.out.println(isDisplayed);

    }

    @Test
    public static void test17() {
        boolean flag = true;
        findElement(AssignCust.getJson(AssignCust.d31));
        click();
        findElements(AssignCust.getJson(AssignCust.d10));
        int size1 = elements.size();//获取有多少行
        try {
            findElements(AssignCust.getJson(AssignCust.d10Selected));
            int size2 = elements.size();//获取打钩的有多少行
            if (!(size1 == size2)) {
                flag = false;
            }

        }//应该会提示 请选择客户信息
        catch (Exception e) {
            flag = false;
        }
        System.out.println(flag);
        flag = true;

        findElement(AssignCust.getJson(AssignCust.d31));
        click();

        findElements(AssignCust.getJson(AssignCust.d10));
        int size3 = elements.size();//获取有多少行
        try {
            findElements(AssignCust.getJson(AssignCust.d10NotSelected));
            int size4 = elements.size();//获取打钩的有多少行
            if (!(size3 == size4)) {
                flag = false;
            }

        }//应该会提示 请选择客户信息
        catch (Exception e) {
            flag = false;
        }
        System.out.println(flag);

    }

    @Test
    public static void test18() {
        boolean flag = true;
        findElements(AssignCust.getJson(AssignCust.d10));
        int size1 = elements.size();//获取有多少行
        int random = Randoms.getRandomNum(1,size1);
        element = elements.get(random);
        click();
        findElements(AssignCust.getJson(AssignCust.d10));
        element = elements.get(random);
        getAttribute("class");
        if(!attributeValue.contains("selected")){
            flag = false;
        }
        System.out.println(flag);
    }


    @Test
    public static void test19() {
        getRandomPageRandomLine();
        where = JDBC.getWhere("history_cust_name",string);
        doubleClick();
        AssignCustAction.getPoppedTable();//获取第一页页面信息
        AssignCustAction.getPoppedPerPageNum();//获得当前页面的条/页
        pagination = JDBC.getPagination(1, perPageNum);//获得分页语句
        comparePoppedWebPageWithDatabase();//比较页面信息和数据库信息

    }


    @Test
    public static void test20() {
        get(AssignCust.assignCust);
        getRandomPageRandomLine();
        click();
        findElements(AssignCust.getJson(AssignCust.dd1));
        click();
        findElements(AssignCust.getJson(AssignCust.dd1Pdd1));
        String custName = getTextareaValue();
        boolean flag = true;
        flag = custName.equals(string);
        System.out.println(flag);

    }
    @Test
    public static void test21() {
        test20();
        findElements(AssignCust.getJson(AssignCust.dd1Pdd2));
        click();

        boolean flag = true;
        try {
            findElements(AssignCust.getJson(AssignCust.dd1Pdd2l1));
            findElements(AssignCust.getJson(AssignCust.dd1Pdd2l2));
        }catch (Exception e){
            flag = false;
        }

        System.out.println(flag);

    }

    @Test
    public static void test22() {
        test21();
        boolean flag = true;
        findElements(AssignCust.getJson(AssignCust.dd1Pdd2l1));
        click();
        try {
            findElements(AssignCust.getJson(AssignCust.dd1Pdd5));
        }catch (Exception e){
            flag = false;
        }
        System.out.println(flag);
    }

    @Test
    public static void test23() {
        test22();
        findElements(AssignCust.getJson(AssignCust.dd1Pdd2));
        click();
        boolean flag = true;
        findElements(AssignCust.getJson(AssignCust.dd1Pdd2l2));
        click();
        try {
            findElements(AssignCust.getJson(AssignCust.dd1Pdd6));
        }catch (Exception e){
            flag = false;
        }
        System.out.println(flag);

    }

    @Test
    public static void test24() {
        test23();
        findElement(AssignCust.getJson(AssignCust.dd1Pdd2i2));
        findElement(AssignCust.getJson(AssignCust.dd1Pdd2i1));
        click();

        boolean flag1 = true;
        boolean flag2 = true;

        jsonObject = AssignCust.getJson(AssignCust.dd1Pdd6); //团队


        flag1 = isNotDisplayed(jsonObject);

        jsonObject = AssignCust.getJson(AssignCust.dd1Pdd5); //客户经理

        flag2 = isNotDisplayed(jsonObject);

        System.out.println(flag1&&flag2);
    }


    @Test
    public static void test25() {
        test24();


//        findElement(AssignCust.getJson(AssignCust.dd1Pdd3Pdd1));
//        AssignCustAction.getSqlResultStr(sql4);
//        sendKeys(sql4);
//        findElement(AssignCust.getJson(AssignCust.dd1Pdd3Pdd1dd1));
//        click();
        List<String> list1 = new ArrayList<>();

        inputRandomDept();
        list1=ListMisc.listAdd(list1,string);

        inputRandomDept();
        list1=ListMisc.listAdd(list1,string);

        inputRandomDept();
        list1=ListMisc.listAdd(list1,string);



        findElement(AssignCust.getJson(AssignCust.dd1Pdd3));
        String inputValue = getInputValue();

        String[] a =inputValue.split(",");

        List<String> list2 = Arrays.asList(a);

        boolean flag = ListMisc.isEqualAfterSorted(list1,list2);

        System.out.println(flag);


    }


    @Test
    public static void test26() {
        test25();
        findElement(AssignCust.getJson(AssignCust.dd1Pdd2));
        click();
        findElement(AssignCust.getJson(AssignCust.dd1Pdd2l1));
        click();
        findElement(AssignCust.getJson(AssignCust.dd1Pdd5));
        findElement(AssignCust.getJson(AssignCust.dd1Pdd5s1));
        click();
        findElement(AssignCust.getJson(AssignCust.dd1Pdd5Pdd1));
        sendKeys("金钊");//这里写死了,以后可以改一下
        findElement(AssignCust.getJson(AssignCust.dd1Pdd5Pdd2));
        click();
        findElement(AssignCust.get$Json1P("last()"));
        click();
        findElement(AssignCust.getJson(AssignCust.dd1Pdd5Pdd4));
        click();


        findElement(AssignCust.getJson(AssignCust.dd1Pdd5));
        //金钊
        String a = getInputValue();
        boolean flag = true;
        flag=a.equals("金钊");
        System.out.println(flag);

    }


    @Test
    public static void test27() {
        test26();
        findElement(AssignCust.getJson(AssignCust.dd1Pdd4));
        String random = Randoms.getRandomStr(Randoms.getRandomNum(5,200));
        sendKeys(random);


        findElement(AssignCust.getJson(AssignCust.dd1Pdd1));
        String custName = getTextareaValue();

        where = JDBC.getWhere("history_cust_name",custName);
        order = "order by sy_createtime desc";
        List<List<String>> list1 = getResultToList();

        findElement(AssignCust.getJson(AssignCust.d30));
        click();


        if (isNotDisplayed(AssignCust.getJson(AssignCust.d17))) {//如果数据加载的那个菊花不显示了,说明已经加载好
            where = JDBC.getWhere("history_cust_name",custName);
        }


        order = "order by sy_createtime desc";
        List<List<String>> list2 = getResultToList();

        boolean flag = true;
        flag = ListMisc.isEqual(list1,list2);
        System.out.println(flag);


    }

    @Test
    public static void test28() {
        test26();

        findElement(AssignCust.getJson(AssignCust.dd1Pdd4));
        String random = Randoms.getRandomStr(Randoms.getRandomNum(5,200));
        sendKeys(random);


        findElement(AssignCust.getJson(AssignCust.dd1Pdd1));
        String custName = getTextareaValue();

        where = JDBC.getWhere("history_cust_name",custName);
        order = "order by sy_createtime desc";
        List<List<String>> list1 = getResultToList();

        findElement(AssignCust.getJson(AssignCust.d29));
        click();

        where = JDBC.getWhere("history_cust_name",custName);
        order = "order by sy_createtime desc";
        List<List<String>> list2 = getResultToList();

        boolean flag = true;
        flag = !ListMisc.isEqual(list1,list2,false);
        System.out.println(flag);


    }

    @Test
    public static void test29() {
        test21();
        findElements(AssignCust.getJson(AssignCust.dd1Pdd2l2));
        click();
        findElements(AssignCust.getJson(AssignCust.dd1Pdd6i1));
        click();
        findElements(AssignCust.getJson(AssignCust.dd1Pdd6Pdd1));
        sendKeys("上海陆家嘴东路营业部");//这里写死了,可能可以优化
        findElements(AssignCust.get$JsonTeam("上海陆家嘴东路营业部"));
        click();
        findElements(AssignCust.getJson(AssignCust.dd1Pdd6Pdd2));
        click();
        findElement(AssignCust.getJson(AssignCust.d29));
        click();



    }


    @Test
    public static void test30() {
        test20();
        findElement(AssignCust.getJson(AssignCust.d29));
        click();
    }



        @BeforeTest
    public static void beforeTest01() {
        OpenBrowserAction.open("chrome");
        LoginAction.login();
        get(AssignCust.assignCust);//登录后跳转客户维护分配页面

//        originalSql = "select *\n" +
//                "  from (select rownum as 编号,\n" +
//                "               cust_name as 客户名称,\n" +
//                "               replace_code_with_name(cust_grade, 'MR_CM_GRADE') as 客户级别,\n" +
//                "               cust_oa as OA账号,\n" +
//                "               deptname as 客户所属部门,\n" +
//                "               username as 客户经理,\n" +
//                "               user_relation_team as 团队名称\n" +
//                "          from CUST_WH_RELATION where 1=1 ) where 1 = 1\n";


        originalSql1 = "   select * from (select rownum as row_id, tmp.* from (select  \n" +
                "               cust_name as 客户名称,\n" +
                "               replace_code_with_name(cust_grade, 'MR_CM_GRADE') as 客户级别,\n" +
                "               cust_oa as OA账号,\n" +
                "               deptname as 客户所属部门,\n" +
                "               username as 客户经理,\n" +
                "               user_relation_team as 团队名称\n" +
                "          from CUST_WH_RELATION where 1=1  ) tmp  where 2=2 ) where 3=3 ";


        originalSql2 ="\n" +
                " select * from (select rownum as row_id, tmp.* from (select  \n" +
                "               history_cust_name as 客户名称,\n" +
                "               history_manager as 客户维护经理,\n" +
                "               history_oa as OA账号,\n" +
                "               history_dept_name as 部门,\n" +
                "               history_reson as 原因\n" +
                "          from CUST_WH_HISTORY where 1=1 ) tmp  where 2=2 ) where 3=3 ";


        sql1 = "select 客户名称\n" +
                "  from (select cust_name as 客户名称\n" +
                "          from CUST_WH_RELATION\n" +
                "         where cust_name is not null\n" +
                "         order by dbms_random.value)\n" +
                " where rownum = 1";

        sql2 = "select OA账号\n" +
                "  from (select cust_oa as OA账号\n" +
                "          from CUST_WH_RELATION\n" +
                "         where cust_oa is not null\n" +
                "         order by dbms_random.value)\n" +
                " where rownum = 1";


        sql3 = "select 客户经理\n" +
                "  from (select username as 客户经理\n" +
                "          from CUST_WH_RELATION\n" +
                "         where username is not null\n" +
                "         order by dbms_random.value)\n" +
                " where rownum = 1";

        sql4 = "select 部门\n" +
                "  from (select DEPTNAME as 部门\n" +
                "          from JE_CORE_DEPARTMENT\n" +
                "         where deptname is not null and deptname in ('高级管理人员','党委办公室','总部','上海证券')\n" +
                "         order by dbms_random.value)\n" +
                " where rownum = 1\n";

    }


    private static void compareWebPageWithDatabase() {
        List<List<String>> list1 = tableContent;//把页面内容放入list里

        sql = originalSql1;//拼上分页语句

        String pagination1 = pagination[0];
        String pagination2 = pagination[1];

        sql = sql.replaceFirst("where 2=2", "where 2=2 " + pagination1);
        sql = sql.replaceFirst("where 3=3", "where 3=3 " + pagination2);

        if (!where.equals("")) {
            sql = sql.replaceFirst("where 1=1", "where 1=1 " + where + order);
        } else {
            sql = sql.replaceFirst("where 1=1", "where 1=1 " + whereLike + order);
        }


        List<List<String>> list2 = new ArrayList<>();

        list2 = JDBC.getResultToList(sql);//获得sql结果,放入list2

        boolean flag = ListMisc.isEqual(list1, list2);//判断网页上的内容和数据库内容是否相符

        sql = "";
        where = "";
        whereLike = "";
        order = "";
        pagination = new String[]{"",""};

        findElement(AssignCust.getJson(AssignCust.d4));
        click();
        System.out.println(flag);


    }


    private static List<List<String>>  getResultToList(){
        sql = originalSql2;//拼上分页语句

        String pagination1 = pagination[0];
        String pagination2 = pagination[1];

        sql = sql.replaceFirst("where 2=2", "where 2=2 " + pagination1);
        sql = sql.replaceFirst("where 3=3", "where 3=3 " + pagination2);

        if (!where.equals("")) {
            sql = sql.replaceFirst("where 1=1", "where 1=1 " + where);
        } else {
            sql = sql.replaceFirst("where 1=1", "where 1=1 " + whereLike);
        }


        List<List<String>> list2 = new ArrayList<>();

        list2 = JDBC.getResultToList(sql);//获得sql结果,放入list2

        sql = "";
        where = "";
        whereLike = "";
        pagination = new String[]{"",""};

        return  list2;
    }




    private static void comparePoppedWebPageWithDatabase() {
        List<List<String>> list1 = tableContent;//把页面内容放入list里

        sql = originalSql2;//拼上分页语句

        String pagination1 = pagination[0];
        String pagination2 = pagination[1];

        sql = sql.replaceFirst("where 2=2", "where 2=2 " + pagination1);
        sql = sql.replaceFirst("where 3=3", "where 3=3 " + pagination2);

        if (!where.equals("")) {
            sql = sql.replaceFirst("where 1=1", "where 1=1 " + where);
        } else {
            sql = sql.replaceFirst("where 1=1", "where 1=1 " + whereLike);
        }


        List<List<String>> list2 = new ArrayList<>();

        list2 = JDBC.getResultToList(sql);//获得sql结果,放入list2

        boolean flag = ListMisc.isEqual(list1, list2);//判断网页上的内容和数据库内容是否相符

        sql = "";
        where = "";
        whereLike = "";
        pagination = new String[]{"",""};

//        findElement(AssignCust.getJson(AssignCust.d4));
//        click();
        System.out.println(flag);


    }


    public static void getRandomPageRandomLine(){
        findElement(AssignCust.getJson(AssignCust.d14));
        getText();//获取第几页,保存到text里
        randomPageNum = IntMisc.getRandomPageNum(text);
        findElement(AssignCust.getJson(AssignCust.d15));
        //clear();
        sendKeys("" + randomPageNum);
        findElement(AssignCust.getJson(AssignCust.d28));
        click();//点一下页面其他元素,会开始查询
        //已上这些是用来跳转随即页
        findElements(AssignCust.getJson(AssignCust.d10));
        int size1 = elements.size();//获取有多少行
        int random = Randoms.getRandomNum(1,size1);
        element = elements.get(random);
        AssignCustAction.getInfo(""+random);//获取第N行的信息,包括表头
//        tableContent
        int a = ListMisc.getPosition(tableContent.get(0),"客户名称");
        String custName = tableContent.get(1).get(a);
        string = custName;
        System.out.println(custName);
    }


    public static void inputRandomDept(){
        findElement(AssignCust.getJson(AssignCust.dd1Pdd3));
        click();
        findElement(AssignCust.getJson(AssignCust.dd1Pdd3Pdd1));
        AssignCustAction.getSqlResultStr(sql4);
        sendKeys(string);
        findElement(AssignCust.get$JsonCompany(string));
        click();
        findElement(AssignCust.getJson(AssignCust.dd1Pdd3Pdd2));
        click();
    }


    @AfterTest
    public static void afterTest01() throws InterruptedException {

        Thread.sleep(5000);
        $.quit();
    }


}
