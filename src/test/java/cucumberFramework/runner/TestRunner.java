package cucumberFramework.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber.*;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/cucumberFramework/featureFiles/"},
        glue = {"cucumberFramework.steps"},
        monochrome = true,
        plugin = {"json:target/cucumber.json"}
)
public class TestRunner {

}
