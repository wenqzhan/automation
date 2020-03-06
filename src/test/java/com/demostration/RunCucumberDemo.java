package com.demostration;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/features/demo.feature"},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber/cucumber.json", "junit:target/junit", "rerun:target/cucumber/rerun.txt"},
        tags = {"@Automation"},
        glue = {"com.demostration.steps"})
public class RunCucumberDemo extends AbstractTestNGCucumberTests {
    // tags = {"~@Automation"},
}
