package Runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/Resources",
        glue= "stepDefinitions",
        tags = "@RegressionTest",
        plugin= {"pretty","html:target/Feyzeddin.html"}
)



public class TestRunner {
}
