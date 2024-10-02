package au.com.carsguide.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", //path of feature
        glue = "au/com/carsguide/steps",// steps source root path
       plugin = {"html:target/cucumber-reports/cucumber.html",
               "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
               "json:target/cucumber-reports/cucumber.json"},
        tags = "@smoke",
        dryRun = true

)
public class RunCukeSmoke extends AbstractTestNGCucumberTests {


}
