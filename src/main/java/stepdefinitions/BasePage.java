package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.Driverholder;

import java.io.File;
import java.io.IOException;

public class BasePage {
    public WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Driverholder.setDriver(driver);
    }

    @After
    public void teardown() {
        Driverholder.getDriver().quit();
    }

    @AfterStep
    public void screenshot(Scenario scenario) throws IOException {
        File screenshotAs = ((TakesScreenshot) Driverholder.getDriver()).getScreenshotAs(OutputType.FILE);
        Allure.addAttachment(scenario.getName(), FileUtils.openInputStream(screenshotAs));
    }

}
