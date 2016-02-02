package fundtransfer.test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by tcbinh on 12/29/2015.
 */


@CucumberOptions(format = {"pretty", "html:target/cucumber-html-report", "pretty:target/cucumber-report.json"})
public class RunCukesTest extends AbstractTestNGCucumberTests{
}
