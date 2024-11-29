package Cucumber_Framework.Options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/API/Cucumber_Framework/features",
        glue = {"API.Cucumber_Framework.stepDefinations",
"API.Cucumber_Framework.stepDefinations.EnumSteps"}, plugin = "json:target/jsonreport.json")
public class TestRunner {
}
