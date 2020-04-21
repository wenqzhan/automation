package com.unitTest;

import com.alibaba.fastjson.JSONObject;
import com.driver.Xpath;
import com.pageObject.commonObject.CommonObject;
import com.pageObject.matrix.orgCust.AssignCust;
import com.pageObject.matrix.orgCust.customerRelationshipFundAccount.DetailsPage;
import com.utils.json.XpathJson;
import org.testng.annotations.Test;

public class XpathTest {


    @Test
    public void ffgfgf(){
        System.out.println(AssignCust.getJson(AssignCust.dd1Pdd3));
//        String a = AssignCust.xx5t;
//        System.out.println(a);
    }




    @Test

    public void teeeee(){

        String parentXpath ="";
        String childTagName ="input";
        String childTagText ="";
        String[] containsAttributeValue ={"placeholder,输入用户名查询..."};
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
