package com.actions.matrix.orgCust;

import com.driver.$;
import com.pageObject.matrix.orgCust.OrgCustList;
import com.pageObject.matrix.newPage.PanoramicView;
import com.utils.jdbc.JDBC;
import com.utils.log.LoggerController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrgCustListAction extends $ {
    private final static LoggerController log = LoggerController.getLogger(OrgCustListAction.class);
    private static int counter = 0;

    public static void setCounter(int num) {
        counter = num;

    }

    /**
     * 在客户查询功能中根据传入的custName查询客户
     *
     * @param custName 客户名称,可以是全名或者部分
     */
    public static void searchCustName(String custName) {
        jsonObject = OrgCustList.getJson(OrgCustList.d1);
        $.findElement(jsonObject);//定位客户名称查询框
        $.clear();//框内框内有数据,先清空
        $.sendKeys(custName);//输入客户名称
        jsonObject = OrgCustList.getJson(OrgCustList.d5);
        $.findElement(jsonObject);//定位查询按钮
        $.click();//点击查询按钮
        jsonObject = OrgCustList.getJson(OrgCustList.d9);
        $.findElements(jsonObject);
        //定位查询结果(表格的表体,定位到了说明查询有结果了.不能定位表头,因为表头一直存在)
    }

    /**
     * 获取表格内容,存到tableContent中
    * */
    public static void getTable() {
        jsonObject = OrgCustList.getJson(OrgCustList.d10);
        $.findElements(jsonObject);
        $.getTableHeader();
        //定位表头,获取表头中的所有文字,存到tableContent中
        jsonObject = OrgCustList.getJson(OrgCustList.d9);
        //System.out.println(jsonObject);
        $.findElements(jsonObject);
        $.getTableBody();
        //定位表体,获取表体中的所有问题,存到tableContent中
        //System.out.println(elements2.size()+"1111111111");
        //System.out.println("-----------------");
        //PrintList.printList(tableContent);
        //System.out.println("*****************");
    }

    /**
     * 表格中有超链接,点击表格中的超链接,这里实现的是点击表格第一行的超链接
     */
    public static void clickCustName() {
        String handle = $.getWindowHandle();//获取当前窗口的handle
        log.info("原窗口句柄是:" + handle);
        jsonObject = OrgCustList.getJson(OrgCustList.d11);
        $.findElements(jsonObject);//定位所有超链接
        element = elements.get(0);
        $.click();//点击第一个超链接,第一个就是第一行的

        for (String winHandle : $.getWindowHandles(10)) {
            if (handle.equals(winHandle)) {
                continue;
            }
            log.info("新窗口句柄是:" + winHandle);
            $.switchToWindow(winHandle);

        }
        //获取所有窗口的handle,因为只有两个窗口,所以不是原有窗口的handle就是新窗口的handle
        //使用新的handle切换到新窗口
        jsonObject = PanoramicView.getJson(PanoramicView.d1);
        $.findElement(jsonObject);
        //定位新窗口的元素,定位到了说明新窗口正常打开了
        $.close();
        //关闭新窗口,注意不是quit,quit会关闭整个驱动,close仅关闭当前窗口
        $.switchToWindow(handle);
        //用原窗口的handle切换到原窗口
    }

    /**
     * 根据传入的sql语句获得查询结果,这里实现的是sql查询结果第一行第一个
     * @param sql sql语句
     * @return description
     */
    public static String getSqlResultStr(String sql) {


        return JDBC.getSqlResultStr(sql);
    }

    /**
     * 根据传入的sql语句获得查询结果,这里实现的是sql查询结果第一行第一个
     * @param sql sql语句
     * @return randomPageNum
     */
    public static int getSqlResultNum(String sql) {

        return JDBC.getSqlResultNum(sql);
    }

    /**
     * 查询统一社会信用代码
     */
    public static void searchCertificateForUniformSocialCreditCode(String certificateForUniformSocialCreditCode) {
        jsonObject = OrgCustList.getJson(OrgCustList.d7);
        $.findElement(jsonObject);//该搜索条件是默认折叠的,需要点开
        $.click();//点击
        jsonObject = OrgCustList.getJson(OrgCustList.d4);
        $.findElement(jsonObject);//找到统一社会信用代码输入框
        $.clear();//清除已有内容
        $.sendKeys(certificateForUniformSocialCreditCode);//根据传入的内容输入
        jsonObject = OrgCustList.getJson(OrgCustList.d5);
        $.findElement(jsonObject);
        $.click();//找到搜索按钮并点击
        jsonObject = OrgCustList.getJson(OrgCustList.d9);
        $.findElements(jsonObject);
        //定位查询结果(表格的表体,定位到了说明查询有结果了.不能定位表头,因为表头一直存在)
    }


}
