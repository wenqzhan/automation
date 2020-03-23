package com.unitTest;

import com.alibaba.fastjson.JSONObject;
import com.driver.Xpath;
import com.utils.json.XpathJson;
import org.testng.annotations.Test;

public class XpathTest {


    @Test
    public void teeeee(){

        String parentXpath ="";
        String childTagName ="";
        String childTagText ="";
        String[] containsAttributeValue ={};
        String[] notContainsAttributeValue ={};
        JSONObject jsonObject = XpathJson.fabricateJsonObject(parentXpath,childTagName,childTagText,containsAttributeValue,notContainsAttributeValue);


        //long startTime = System.currentTimeMillis();


        Xpath.getXpath(jsonObject);

//        parentXpath ="/html/body/div[3]/div/div/ul/li[2]/i";
//        childTagName ="svg";
//        childTagText ="";
//        containsAttributeValue =new String[]{};
//        notContainsAttributeValue =new String[]{};
//        jsonObject = XpathJson.fabricateJsonObject(parentXpath,childTagName,childTagText,containsAttributeValue,notContainsAttributeValue);



        //Xpath.getXpath(jsonObject);

        //long endTime = System.currentTimeMillis();
        //System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
    }

}
