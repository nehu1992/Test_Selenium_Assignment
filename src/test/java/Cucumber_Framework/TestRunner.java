package Cucumber_Framework;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Cucumber_Framework/features",
        glue = {"Cucumber_Framework.stepDefinations"})
public class TestRunner {
}
