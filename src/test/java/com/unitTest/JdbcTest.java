package com.unitTest;
import com.utils.jdbc.JDBC;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.actions.matrix.orgCust.OrgCustListAction;

import com.utils.print.PrintList;


public class JdbcTest
{
    static String driverClass="oracle.jdbc.driver.OracleDriver"; //oracle的驱动
    static String url="jdbc:oracle:thin:@10.189.101.32:1521:JEPLUSDB";  //连接oracle路径方式 “”gfs“”是要建立连接的数据库名 1521端口
    static String user="g_matrix";   //user是数据库的用户名
    static String password="g_matrix";  //用户登录密码


    @Test
    public void teeeee() throws SQLException, ClassNotFoundException {
        String[] a = JDBC.getPagination(3,30);
        for(String s:a){
            System.out.println(s);
        }
    }



    @Test
    public void sdfsdf(){
        String sql = "select cust_name from (select * from cust_info order by dbms_random.value) where rownum=1";
        System.out.println(OrgCustListAction.getSqlResultStr(sql));
    }


    @Test
    public void teeeee2() throws SQLException, ClassNotFoundException {
        String sql="delete from mr_cm_activity where activity_name = '质量控制组合规跨墙定制服务申请2020-10-22' and sy_createtime = '2020-10-22 10:10:10'";


        JDBC.exec(sql);
    }




    public static void getconn() throws SQLException, ClassNotFoundException {  //为了方便下面的讲解，这里专门建立了一个用于数据库连接的一个方法
        Connection connection=null;


            //首先建立驱动
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //驱动成功后进行连接
            connection=DriverManager.getConnection(url, user, password);

            System.out.println("连接成功");

        String sql="select * from (select * from cust_info order by dbms_random.value) where rownum=1 ";


        Statement cs = connection.createStatement();

        ResultSet rs = cs.executeQuery(sql);
        ResultSetMetaData rsmd = rs.getMetaData();
        int colCount = rsmd.getColumnCount();
        System.out.println(colCount);
        //System.out.println(rsmd.getColumnName(0));
        for (int i = 1; i <=colCount ; i++) {
            System.out.println(rsmd.getColumnName(i));

        }

        while(rs.next()){
            for (int i = 1; i <=colCount ; i++) {
                String a=rs.getString(i);

                //String b=rs.getString(2);

                System.out.println(a+"-------");

            }


        }

        rs.close();

        cs.close();

        connection.close();


        //return connection; //返回一个连接


    }



    @Test
    public void testss(){
        List<List<String>> list = new ArrayList<>();
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
                " from MR_CM_CUSTHISTORY";

            list=JDBC.getResultToList(sql);

        System.out.println("**********************");
        PrintList.printList(list);
    }



    @Test
    public void teststst(){
        String sql = "select cust_name from (select * from cust_info order by dbms_random.value) where rownum=1";
        String a = OrgCustListAction.getSqlResultStr(sql);
        System.out.println();
        System.out.println(a);
        System.out.println("______________");
        a = OrgCustListAction.getSqlResultStr(sql);
        System.out.println();
        System.out.println(a);
        System.out.println("______________");
        a = OrgCustListAction.getSqlResultStr(sql);
        System.out.println();
        System.out.println(a);
        System.out.println("______________");
    }


    @Test
    public void sggsg(){

        System.out.println(JDBC.getWhereLike("客户名称","上海重阳战略投资有限公司"));

    }

}
