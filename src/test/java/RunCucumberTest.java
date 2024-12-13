
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;


//@RunWith(Cucumber.class)
    @CucumberOptions(plugin = { "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
                    monochrome = true,
                    glue = "stepdefinitions",
                    features = "src/test/java/features")
    public class RunCucumberTest extends AbstractTestNGCucumberTests {

        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
            return super.scenarios();
        }

    }
