package com.steps.orgCustSerachTest;

import com.actions.matrix.LoginAction;
import com.actions.matrix.orgCust.OrgCustListAction;
import com.driver.$;
import com.utils.jdbc.JDBC;
import com.utils.list.ListMisc;
import com.utils.log.LoggerController;
import io.cucumber.java.zh_cn.*;
import org.testng.Assert;

import java.util.List;


public class orgCustListTestStepdefs extends $ {

    private final static LoggerController log = LoggerController.getLogger(orgCustListTestStepdefs.class);


    @当("^要开始测试,设置参数$")
    public void setParame() {
        LoginAction.setCounter(0);
        log.info("--------------测试开始-------------------");
    }


    @当("^查询\"(.*?)\"\"(.*?)\"的数据$")
    public void serarch(String tableName, String hasOrHasnt) {
        String sql;
        if (tableName.equals("cust_info") && hasOrHasnt.equals("有")) {
            sql = "select cust_name from (select * from cust_info order by dbms_random.value) where rownum=1";
            String custName = OrgCustListAction.getSqlResultStr(sql);
            OrgCustListAction.searchCustName(custName);
            //从cust_info随机插一条数据取cust_name进行搜索
            //System.out.println();
        } else if (tableName.equals("cust_info") && hasOrHasnt.equals("没有")) {
            System.out.println();
        } else if (tableName.equals("search_cust") && hasOrHasnt.equals("有")) {
            sql = "select count(*) from search_cust where cust_name = '山东邦成实业有限公司'";
            int num = OrgCustListAction.getSqlResultNum(sql);
            if (num == 0) {
                String sql3 = "delete from cust_info where cust_name = '山东邦成实业有限公司'";
                JDBC.exec(sql3);
                OrgCustListAction.searchCustName("山东邦成实业有限公司");
            }

            //System.out.println();
        } else if (tableName.equals("search_cust") && hasOrHasnt.equals("没有")) {
            sql = "select count(*) from search_cust where cust_name = '山东邦成实业有限公司'";
            int num = OrgCustListAction.getSqlResultNum(sql);
            if (num >0) {
                sql = "delete from search_cust where cust_name = '山东邦成实业有限公司'";
                JDBC.exec(sql);
            }
            sql = "select count(*) from cust_info where cust_name = '山东邦成实业有限公司'";
            num = OrgCustListAction.getSqlResultNum(sql);
            if (num >0) {
                sql = "delete from cust_info where cust_name = '山东邦成实业有限公司'";
                JDBC.exec(sql);
            }
        }


        //System.out.println("1");
    }

    @假如("^直接从cust_info取值，不调工商接口$")
    public void searchFromTableNotFromInterface() {
        OrgCustListAction.getTable();
        List<String> list = tableContent.get(0);
        int a = ListMisc.getPosition(list, "客户级别");
        for (int i = 1; i < tableContent.size(); i++) {
            Assert.assertNotEquals(tableContent.get(i).get(a), "", "查询数据库中有的数据,那么客户级别肯定不是null的");
        }

        //System.out.println("2");
    }

    @那么("^通过测试$")
    public void testPassed() {

        log.info("test passed");
    }

    @假如("^调工商接口查询数据，判断search_cust中是否存在，如果存在则不插入新数据$")
    public void searchFromInterface() {

        String sql1 = "select count(*) from search_cust";
        int num1 = OrgCustListAction.getSqlResultNum(sql1);
        String sql2 = "delete from search_cust where cust_name = '山东邦成实业有限公司'";
        JDBC.exec(sql2);
        String sql3 = "delete from cust_info where cust_name = '山东邦成实业有限公司'";
        JDBC.exec(sql3);
        int num2 = OrgCustListAction.getSqlResultNum(sql1);
        log.info("num1删除前为:"+num1+";num2删除后为:"+num2);
        Assert.assertEquals(num1,num2+1);
        OrgCustListAction.searchCustName("山东邦成实业有限公司");
        num1 = OrgCustListAction.getSqlResultNum(sql1);
        log.info("num1点击后为:"+num1+";num2不变为:"+num2);
        Assert.assertEquals(num1,num2+1);
        OrgCustListAction.searchCustName("山东邦成实业有限公司");
        num2 = OrgCustListAction.getSqlResultNum(sql1);
        log.info("num1不变为:"+num1+";num2点击后为:"+num2);
        Assert.assertEquals(num1,num2);

        //山东邦成实业有限公司

        //System.out.println("3");
    }


    @假如("^存search_cust，点击360视图时在cust_info中插入数据$")
    public void click360() {
        OrgCustListAction.searchCustName("山东邦成实业有限公司");
        String sql = "select count(*) from search_cust where cust_name = '山东邦成实业有限公司'";
        int num1 = OrgCustListAction.getSqlResultNum(sql);
        Assert.assertNotEquals(num1,0);
        sql = "select count(*) from cust_info where cust_name = '山东邦成实业有限公司'";
        int num2;// = OrgCustListAction.getSqlResultNum(sql);
        //Assert.assertNotEquals(num2,0);
        //Assert.assertEquals(num1,num2);
        OrgCustListAction.clickCustName();
        num1 = OrgCustListAction.getSqlResultNum(sql);
        Assert.assertEquals(num1,1);
        num2 = OrgCustListAction.getSqlResultNum(sql);
        Assert.assertEquals(num2,1);
    }

    @当("^\"(.*?)\"查询条件查询$")
    public void serarch(String singleOrMore) {
        String sql;
        if(singleOrMore.equals("单个")){
            sql = "select ID_TYYX from (select ID_TYYX from cust_info_all where ID_TYYX is not null order by dbms_random.value ) where rownum=1";
            String certificateForUniformSocialCreditCode = OrgCustListAction.getSqlResultStr(sql);
            description = certificateForUniformSocialCreditCode;
            OrgCustListAction.searchCertificateForUniformSocialCreditCode(certificateForUniformSocialCreditCode);

        }else if(singleOrMore.equals("组合")){

        }
    }

    @假如("^查询结果正确$")
    public void searchResultIsCorrect() {
        OrgCustListAction.getTable();
        List<String> list = tableContent.get(0);
        int a = ListMisc.getPosition(list, "统一社会信用代码");
        for (int i = 1; i < tableContent.size(); i++) {
            Assert.assertNotEquals(tableContent.get(i).get(a), description, "查询的是统一社会信用代码,但是查询结果里响应表格字段值不对");
        }
    }

    @当("^数据库与返回数据比对$")
    public void compare() {
        System.out.println("7");
        //MyAssert.assertEquals("1","2");

    }


    @假如("^数据一致，数据库比对$")
    public void comparisonIsCorrect() {
        //MyAssert.assertTrue(false);
        System.out.println("8");
    }

    @当("^全部完成时退出驱动$")
    public void closeDriver() {
        $.quit();
        log.info("--------------测试结束-------------------");
    }

}
