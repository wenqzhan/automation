package com.steps.orgCustSerachTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/features/orgCustListTest.feature"},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber/cucumber.json", "junit:target/junit", "rerun:target/cucumber/rerun.txt"},
        tags = {"@Automation or @CloseDriver or @Preparation"},
        glue = {"com.steps.orgCustSerachTest"})
public class RunOrgCustListTest extends AbstractTestNGCucumberTests{
}
