package com.cydeo.runner;

/*
    This class instructs
        -   how & what feature to run
        -   where the definition steps are
        -   whether or not to generate missing step definitions
        -   Whether or not to get a json, HTML report
        -   Whether to filter the test run according to certain tags
 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features",
        publish = false,
        glue = "com/cydeo/step_definitions",
        plugin = {"html:target/test_report.html",
                "json:target/test_report.json", "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target"},
        dryRun = false,
        tags = "@web-ui and @google")
public class TestRunner {

}
