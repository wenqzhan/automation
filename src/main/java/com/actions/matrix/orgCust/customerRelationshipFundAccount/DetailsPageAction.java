package com.actions.matrix.orgCust.customerRelationshipFundAccount;

import com.driver.$;
import com.pageObject.matrix.orgCust.customerRelationshipFundAccount.DetailsPage;
import com.utils.list.ListMisc;
import com.utils.log.LoggerController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DetailsPageAction extends $ { //客户关系资金账号详细页面
    private final static LoggerController log = LoggerController.getLogger(DetailsPageAction.class);

    public static List<String> getInfo() {
        List<String> list = new ArrayList<>();
        elements = $.findElements(By.xpath("//label"));
        for (WebElement el : elements) {
            //WebElement element1;
            String label = el.getAttribute("title");
            String value = "";
            try {
                element = driver.findElement(By.xpath(DetailsPage.getXpath("input", label)));
                value = $.getInputValue();
            } catch (Exception e) {
                try {
                    element = driver.findElement(By.xpath(DetailsPage.getXpath("span", label)));
                    //label/../following-sibling::*//div/span[@title][1]
                    value = $.getText();
                } catch (Exception e1) {
                    try {
                        element = driver.findElement(By.xpath(DetailsPage.getXpath("div", label)));
                        value = $.getText();
                    } catch (Exception e2) {

                        value = "空的空的空的";
                    }
                }
            }
            list.add(label + ":" + value);

        }
        for (String s:list){
            System.out.println(s);
        }
        return list;
    }


    public static boolean isEqual(List<List<String>> list1, List<String> list2) {
        boolean flag = true;
        log.info("开始比较输入的两者");
        List<String> list3 = list1.get(0);
        List<String> list4 = list1.get(1);
        for (String s : list2) {
            System.out.println(s);
            String[] strings = s.split(":");
            int position = ListMisc.getPosition(list3, strings[0]);
            if (position == -1) {
                log.error(strings[0] + ":在标题里找不到");
                flag = false;
                break;
            } else {
                if (strings[1].equals(list4.get(position))) {
                    //log.info(strings[1] + "和" + list4.get(position) + "相同");
                    continue;
                } else {
                    log.error(strings[1] + "和" + list4.get(position) + "不相同");
                    flag = false;
                    break;
                }
            }

        }
        if(flag){
            log.info("输入的两者相同");
        }
        return flag;
    }






}
