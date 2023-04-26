package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Feature",
        glue="StepDefinition",
        dryRun=false,
        tags="",
        plugin={})
public class SmokeRunner {

}
