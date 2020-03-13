package com.demostration.steps;
import com.driver.$;
import io.cucumber.java.After;



public class Hooks {

    @After
    public void cleanUp() {
        $.quit();
    }

}
