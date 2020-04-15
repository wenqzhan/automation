package com.steps.loginTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/features/loginTest.feature"},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber/cucumber.json", "junit:target/junit", "rerun:target/cucumber/rerun.txt"},
        tags = {"@Automation1 or @CloseDriver"},
        glue = {"com.steps.loginTest"})
public class RunLoginTest extends AbstractTestNGCucumberTests{
}







