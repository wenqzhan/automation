package com.driver;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.utils.log.LoggerController;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class Xpath {


    private final static LoggerController log = LoggerController.getLogger(Xpath.class);
    private static int i1 = 1;
    private static int i2 = 1;


    private static JSONObject jsonObject = new JSONObject();

    public static By textXpath(String parentXpath, String text) {

        return textXpath(parentXpath, "*", text);
    }

    public static By textXpath(String parentXpath, String childTag, String text) {
        By by = By.xpath(parentXpath + "//" + childTag + "[text()='" + text + "']");
        return by;
    }

    public static By partialTextXpath(String parentXpath, String childTag, String partialText) {
        return By.xpath(parentXpath + "//" + childTag + "[contains(text(),\"" + partialText + "\")" + "]");

    }

    public static By partialTextXpath(String parentXpath, String partialText) {
        return partialTextXpath(parentXpath, "*", partialText);
    }

    public static By getXpath(JSONObject jsonObject) {
        JSONObject k = new JSONObject();
        String parentXpath;
        String childTagName;
        String childTagText;
        String attribute;
        String value;
        StringBuilder sb = new StringBuilder();

        k = jsonObject.getJSONObject("parent");
        parentXpath = k.getString("xpath");
        //System.out.println("parentXpath:"+parentXpath);
        k = jsonObject.getJSONObject("childTag");
        childTagName = k.getString("name");
        //System.out.println("childTagName:"+childTagName);
        childTagText = k.getString("text");
        //System.out.println("childTagText:"+childTagText);
        List<JSONObject> objects2 = new ArrayList<>();
        List<JSONObject> jsonObjects1 = JSON.parseArray(jsonObject.getJSONArray("contains").toJSONString(), JSONObject.class);
        List<JSONObject> jsonObjects2 = JSON.parseArray(jsonObject.getJSONArray("notContains").toJSONString(), JSONObject.class);
        sb.append(parentXpath);
        sb.append("//");
        if (!childTagName.equals("svg")) {
            sb.append(childTagName);
            sb.append("[1=1");
        }

        if (childTagName.equals("svg")) {
            sb.append("*[1=1");
            sb.append(" and name()='svg'");

        }
        if (!childTagText.equals("")) {
            sb.append(" and contains(text(),\"");
            sb.append(childTagText);
            sb.append("\")");
        }
        for (JSONObject j : jsonObjects1) {
            attribute = j.getString("attribute");
            //System.out.println("attribute"+i1+":"+attribute);
            value = j.getString("value");
            //System.out.println("value"+i1+":"+value);
            sb.append(" and contains(@");
            sb.append(attribute);
            sb.append(",\'");
            sb.append(value);
            sb.append("\')");
            i1++;
        }

        for (JSONObject j : jsonObjects2) {
            attribute = j.getString("attribute");
            //System.out.println("attribute"+i1+":"+attribute);
            value = j.getString("value");
            //System.out.println("value"+i1+":"+value);
            if (value != null) {
                sb.append(" and not(contains(@");
                sb.append(attribute);
                sb.append(",\'");
                sb.append(value);
                sb.append("\'))");
            } else if (value == null) {
                sb.append(" and not(@");
                sb.append(attribute);
                sb.append(")");
            }
            i2++;
        }

        sb.append("]");

        String xpath = sb.toString();
        log.info("xpath是:" + xpath);


        //span[contains(text(),'服务产品目录') and  not(contains(@class,'menuitem_span')) ]


        return By.xpath(xpath);
    }


//span[contains(text(),'服务产品目录') and  not(@class='menuitem_span') ]


}



