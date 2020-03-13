package com.driver;

import org.openqa.selenium.By;

public class Xpath {

    public static By textXpath(String parentXpath, String text) {

        return textXpath(parentXpath, "*", text);
    }

    public static By textXpath(String parentXpath, String childTag, String text) {
        By by = By.xpath(parentXpath + "//" + childTag + "[text()='" + text + "']");
        return by;
    }

    public static By partialTextXpath(String parentXpath, String childTag, String partialText) {
        return By.xpath(parentXpath + "//" + childTag + "[contains(text(),\"" + partialText + "\")]");

    }

    public static By partialTextXpath(String parentXpath, String partialText) {
        return partialTextXpath(parentXpath, "*", partialText);
    }


}



