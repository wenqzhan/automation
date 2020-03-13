package com.unitTest;

import com.utils.log.LoggerController;

public class TestLog4j {
    final static  LoggerController log = LoggerController.getLogger(TestLog4j.class);

    public static void main(String[] args) {
        testCase();
    }

    public static void testCase(){
     log.info("this is info");
     log.debug("this is debug");
     log.warn("this is warn");
     log.error("this is error");
    }
}
