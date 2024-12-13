package utility;

import org.openqa.selenium.WebDriver;

public class Driverholder {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(WebDriver driver) {
        Driverholder.driver.set(driver);
    }
}
