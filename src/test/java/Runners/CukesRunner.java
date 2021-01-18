package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/html_reports",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue="StepDefinitions",
        dryRun = false,
        tags = "@wip"

)
public class CukesRunner {
}
