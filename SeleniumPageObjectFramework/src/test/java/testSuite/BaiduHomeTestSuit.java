package testSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty", "html:target/cucumber/html_report", "json:target/cucumber/json_report/cucumber.json"},
        features={"src/test/java/"},
        glue = {""},
        tags = {"@tag2"}
        
        )


public class BaiduHomeTestSuit {

}
