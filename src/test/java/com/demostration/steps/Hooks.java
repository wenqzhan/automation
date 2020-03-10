package com.demostration.steps;
import com.seleniumModified.action.$;
import io.cucumber.java.After;



public class Hooks {

    @After
    public void cleanUp() {
        $.quit();
    }

}
