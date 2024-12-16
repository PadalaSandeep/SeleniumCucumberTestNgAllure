package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utility.Driverholder;

public class HomePage {

    public static WebDriver getDriver() {
        return Driverholder.getDriver();
    }

    public WebDriver driver;

    public static void verifyPageTitle(String pageTitle) {
        Assert.assertEquals(getDriver().getTitle().contains(pageTitle), true);

    }
}
