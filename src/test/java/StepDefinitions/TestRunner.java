package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue="StepDefinitions",
        publish = true,
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)
public class TestRunner {
}
