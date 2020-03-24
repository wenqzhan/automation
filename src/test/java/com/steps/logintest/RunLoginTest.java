package com.steps.logintest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = {"src/test/features/login_test.feature"},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber/cucumber.json", "junit:target/junit", "rerun:target/cucumber/rerun.txt"},
        tags = {"@Automation"},
        glue = {"com.steps.logintest"})
public class RunLoginTest extends AbstractTestNGCucumberTests{
}







