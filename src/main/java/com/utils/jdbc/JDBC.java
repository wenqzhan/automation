package com.utils.jdbc;

import com.utils.log.LoggerController;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC {
    private final static LoggerController log = LoggerController.getLogger(JDBC.class);
    static String driverClass = "oracle.jdbc.driver.OracleDriver"; //oracle的驱动
    static String url = "jdbc:oracle:thin:@10.189.101.32:1521:JEPLUSDB";  //连接oracle路径方式 “”gfs“”是要建立连接的数据库名 1521端口
    static String user = "g_matrix";   //user是数据库的用户名
    static String password = "g_matrix";  //用户登录密码

    public static ResultSet getResultSet(String sql) throws SQLException, ClassNotFoundException {  //为了方便下面的讲解，这里专门建立了一个用于数据库连接的一个方法
        Connection connection = null;

        //首先建立驱动
        Class.forName(driverClass);

        //驱动成功后进行连接
        connection = DriverManager.getConnection(url, user, password);

        log.info("数据库连接成功");

        //String sql="select * from (select * from cust_info order by dbms_random.value) where rownum=1 ";


        Statement cs = connection.createStatement();

        ResultSet rs = cs.executeQuery(sql);
        log.info(sql);
        ResultSetMetaData rsmd = rs.getMetaData();
        int colCount = rsmd.getColumnCount();
        System.out.println(("colCount:" + colCount));
        //System.out.println(rsmd.getColumnName(0));
        for (int i = 1; i <= colCount; i++) {
            System.out.print(rsmd.getColumnName(i) + "\t");

        }
        System.out.print("\n");

        while (rs.next()) {
            for (int i = 1; i <= colCount; i++) {
                String a = rs.getString(i);

                //String b=rs.getString(2);

                System.out.print(a + "\t");

            }
            System.out.println();

        }

        rs.close();

        cs.close();

        connection.close();


        //return connection; //返回一个连接
        return rs;

    }


    public static void exec(String sql) {
        try {
            Connection connection = null;

            //首先建立驱动
            Class.forName(driverClass);
            //驱动成功后进行连接
            connection = DriverManager.getConnection(url, user, password);
            log.info("数据库连接成功");
            //String sql="select * from (select * from cust_info order by dbms_random.value) where rownum=1 ";

            Statement cs = connection.createStatement();

            ResultSet rs = cs.executeQuery(sql);
            log.info(sql);
            log.info("已执行上方sql");

            rs.close();

            cs.close();

            connection.close();
        } catch (SQLException e) {
            log.error("SQLException");
        } catch (ClassNotFoundException e) {
            log.error("ClassNotFoundException after sql");
        }


    }


    public static List<List<String>> getResultToList(String sql) {
        return getResultToList(sql, true);//默认去掉多余空格
    }


    public static List<List<String>> getResultToList(String sql, boolean flag) {  //为了方便下面的讲解，这里专门建立了一个用于数据库连接的一个方法

        List<List<String>> list = new ArrayList<>();
        try {
            Connection connection = null;

            //首先建立驱动
            Class.forName(driverClass);
            //驱动成功后进行连接
            connection = DriverManager.getConnection(url, user, password);
            log.info("数据库连接成功");
            //String sql="select * from (select * from cust_info order by dbms_random.value) where rownum=1 ";
            Statement cs = connection.createStatement();
            ResultSet rs = cs.executeQuery(sql);
            log.info(sql);
            log.info("已执行上方sql");
            ResultSetMetaData rsmd = rs.getMetaData();
            int colCount = rsmd.getColumnCount();
            //System.out.println(colCount);
            //System.out.println(rsmd.getColumnName(0));
            List<String> strings = new ArrayList<>();
            for (int i = 1; i <= colCount; i++) {
                String str = rsmd.getColumnName(i);
                if (i == 1) {
                    str = "No.";
                }
                System.out.print(str + "\t");
                strings.add(str);
            }
            System.out.println();
            list.add(strings);

            while (rs.next()) {
                List<String> strings1 = new ArrayList<>();
                for (int i = 1; i <= colCount; i++) {


                    String a = rs.getString(i);
                    if (a == null) {
                        a = "";
                    }

                    String str;
                    String ntr;
                    if (flag) {
                        str = a.replaceAll("\\s{1,}", " ");
                        ntr = ("A" + str).trim().substring(1);
                        //String b=rs.getString(2);
                    } else {
//                        description=a;
                        ntr = a;
                    }

                    System.out.print(ntr + "\t");
                    strings1.add(ntr);
                }
                System.out.println();
                list.add(strings1);
            }

            rs.close();

            cs.close();

            connection.close();
        } catch (SQLException e) {
            log.error("SQLException");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            log.error("ClassNotFoundException after sql");
            e.printStackTrace();
        }

        //return connection; //返回一个连接
        return list;

    }

    /**
     * 根据传入的sql语句获得查询结果,这里实现的是sql查询结果第一行第一个
     *
     * @param sql sql语句
     * @return description
     */
    public static String getSqlResultStr(String sql) {
        List<List<String>> list = new ArrayList<>();
        String str = "";
        //String sql = "select cust_name from (select * from cust_info order by dbms_random.value) where rownum=1";

        list = JDBC.getResultToList(sql);


        str = list.get(1).get(0);

        return str;
    }


    /**
     * 根据传入的sql语句获得查询结果,这里实现的是sql查询结果第一行第一个
     *
     * @param sql sql语句
     * @return randomPageNum
     */
    public static int getSqlResultNum(String sql) {
        List<List<String>> list = new ArrayList<>();
        int num;

        list = JDBC.getResultToList(sql);

        num = Integer.valueOf(list.get(1).get(0));
        return num;
    }

    public static String[] getPagination(int pageNum, int itemPerPage) {

        String[] pagination = new String[2];

        int a = pageNum*itemPerPage+1;
        int b = (pageNum-1)*itemPerPage;
        pagination[0] = " and rownum < " + a;
        pagination[1] = " and row_id > " + b;

        int min = (pageNum - 1) * itemPerPage + 1;
        int max = pageNum * itemPerPage;

        //String pagination = " and (编号 >= " + min + " and 编号 <= " + max + " )";

        return pagination;
    }


    public static String getWhere(String column, String value) {

        String where = "";
        where = where + " and ";
        where = where + column + " = ";
        where = where + "'" + value + "'";
        return where;
    }


    public static String getWhereLike(String column, String value) {

        String whereLike = "";
        whereLike = whereLike + " and ";
        whereLike = whereLike + column + " like ";
        whereLike = whereLike + "'%" + value + "%'";
        return whereLike;
    }



}
