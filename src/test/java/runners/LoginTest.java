// src/test/java/runner/LoginTest.java
package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/caracteristicas",
    glue = "steps",
    plugin = {"pretty", "html:target/cucumber-report.html"},
    monochrome = true
)
public class LoginTest {
}
