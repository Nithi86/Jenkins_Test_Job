package org.testrunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"},glue= {"org.baseclass"},plugin= {"pretty","json:src\\main\\java\\report\\Testreport.json"},strict=true,dryRun=false,monochrome=true)

public class TestRunner {


}


	


