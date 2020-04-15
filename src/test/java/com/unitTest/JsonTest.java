package com.unitTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.utils.json.XpathJson;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonTest {
   static String a = "1";
    static String b = "2";

    @Test
    public void testJson(String aaa,String bbb) {
        JSONObject object = new JSONObject();
        //string
        object.put("string", "string");
        //int
        object.put("int", 2);
        //boolean
        object.put("boolean", true);
        //array
        List<Integer> integers = Arrays.asList(1, 2, 3);
        object.put("list", integers);
        //null
        object.put("null", null);
        System.out.println(object);

    }


    @Test
    public void testJson2() {
        JSONObject object = JSONObject
                .parseObject("{\"boolean\":true,\"string1\":\"string\",\"list\":[1,2,3],\"int\":2}");
        //string
        String s = object.getString("string1");
        System.out.println(s);
        //int
        int i = object.getIntValue("int");
        System.out.println(i);
        //boolean
        boolean b = object.getBooleanValue("boolean");
        System.out.println(b);
        //list
        List<Integer> integers = JSON.parseArray(object.getJSONArray("list").toJSONString(), Integer.class);
        integers.forEach(System.out::println);
        //null
        System.out.println(object.getString("hhhhh"));
        //object.
    }



    @Test
    public void testJson3(){
        JSONObject object = JSONObject.parseObject("{\n" +
                "\t\"parent\": {\n" +
                "\t\t\"xpath\": \"//aaaaaa\"\n" +
                "\t},\n" +
                "\t\"childTag\": {\n" +
                "\t\t\"name\": \"partailText\",\n" +
                "\t\t\"text\": \"partialsdfsdfsdf\"\n" +
                "\t},\n" +
                "\t\"contains\": [{\n" +
                "\t\t\"attribute\": \"class111\",\n" +
                "\t\t\"value\": \"vlaue111\"\n" +
                "\t}, {\n" +
                "\t\t\"attribute\": \"class222\",\n" +
                "\t\t\"value\": \"vlaue222\"\n" +
                "\t}],\n" +
                "\t\"notContains\": [{\n" +
                "\t\t\"attribute\": \"class111\",\n" +
                "\t\t\"value\": \"vlaue111\"\n" +
                "\t}, {\n" +
                "\t\t\"attribute\": \"class222\",\n" +
                "\t\t\"value\": \"vlaue222\"\n" +
                "\t}]\n" +
                "\n" +
                "}");

        System.out.println(object.getString("contains"));

        //ListMisc<Integer> integers = JSON.parseArray(object.getJSONArray("list").toJSONString(), Integer.class);
        List<JSONObject> jsonObjects =JSON.parseArray(object.getJSONArray("contains").toJSONString(),JSONObject.class);
        for(JSONObject j:jsonObjects){
            System.out.println(j.getString("attribute"));
            System.out.println(j.getString("value"));
        }

    }





    @Test
    public static void tteee(){
        String parentXpath ="66666";
        String childTagName ="ccccc";
        String childTagText ="tttttt";
        String[] containsAttributeValue ={"2344234,123123123","11123333,000"};
        String[] notContainsAttributeValue ={"aaaa,bbb"};
        JSONObject k = new JSONObject();
        JSONObject jjj;
        jjj = XpathJson.fabricateJsonObject(parentXpath,childTagName,childTagText,containsAttributeValue,notContainsAttributeValue);
        System.out.println(jjj.toJSONString());

        String a;
        String b;
        String c;
        String d;
        String e;
        k = jjj.getJSONObject("parent");
        a = k.getString("xpath");
        System.out.println(a);
        k = jjj.getJSONObject("childTag");
        b = k.getString("name");
        System.out.println(b);
        c = k.getString("text");
        System.out.println(c);
        List<JSONObject> objects2 = new ArrayList<>();
        List<JSONObject> jsonObjects1 =JSON.parseArray(jjj.getJSONArray("contains").toJSONString(),JSONObject.class);
        for(JSONObject j:jsonObjects1){
            d = j.getString("attribute");
            System.out.println(d);
            e = j.getString("value");
            System.out.println(e);
        }
        List<JSONObject> jsonObjects2 =JSON.parseArray(jjj.getJSONArray("notContains").toJSONString(),JSONObject.class);
        for(JSONObject j:jsonObjects2){
            d = j.getString("attribute");
            System.out.println(d);
            e = j.getString("value");
            System.out.println(e);
        }

    }

    @Test
    public static void tttttt(){
        //String[] sss = {"aaa,111","bbb,222"};
        //System.out.println(getNotContains(new String[]{}).toJSONString());
    }



    @Test
    public static void testttt(){
        JSONObject object1 = new JSONObject();
        object1.put("name1","a11111");
        object1.put("text1","a22222");
        System.out.println(object1.toJSONString());
        JSONObject object2 = new JSONObject();
        object2.put("name2","b11111");
        object2.put("text2","b22222");
        System.out.println(object2.toJSONString());
        List<JSONObject> list =Arrays.asList(object1,object2);
        JSONObject object3 = new JSONObject();
        object3.put("llllssssstttt",list);
        System.out.println(object3.toJSONString());

        String[] sss ={"1","2"};

    }

    //ListMisc<Integer> integers = Arrays.asList(1, 2, 3);
        //object.put("list", integers);


}
