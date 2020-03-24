package com.steps.logintest;

import com.driver.$;
import io.cucumber.java.After;


public class Hooks extends $ {

    @After("@Automation")
    public void cleanUp() {
        if (hasException) {
            //$.quit();
            hasException = false;

        }
    }

}
