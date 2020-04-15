package com.utils.json;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class XpathJson {

    public static JSONObject getParent(String xpath) {
        JSONObject object = new JSONObject();
        object.put("xpath", xpath);
        return object;
    }

    public static JSONObject getChildTag(String name, String text) {
        JSONObject object = new JSONObject();
        object.put("name", name);
        object.put("text", text);
        return object;
    }

    public static List<JSONObject> getContains(String[] attributeValue) {
        //SONObject object1 = new JSONObject();
        List<JSONObject> objects = new ArrayList<>();

        //ListMisc<String> attributeValues = Arrays.asList(attributeValue);
        if (attributeValue != null) {
            for (String s : attributeValue) {
                JSONObject object2 = new JSONObject();
                if (s.contains(",") && !s.startsWith(",")) {
                    String[] strs = s.split(",");
                    object2.put("attribute", strs[0]);
                    try {
                        object2.put("value", strs[1]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        object2.put("value", null);
                    }
                }
                objects.add(object2);
            }
        }

        //object1.put("contains",objects);
        return objects;
    }

    public static List<JSONObject> getNotContains(String[] attributeValue) {

        return getContains(attributeValue);
    }

    public static JSONObject fabricateJsonObject(String parentXpath, String childTagName, String childTagText, String[] containsAttributeValue, String[] notContainsAttributeValue) {
        JSONObject object = new JSONObject();
        object.put("parent", getParent(parentXpath));
        object.put("childTag", getChildTag(childTagName, childTagText));
        object.put("contains", getContains(containsAttributeValue));
        object.put("notContains", getNotContains(notContainsAttributeValue));
        return object;
    }


}
