package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utility.Driverholder;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driverholder.getDriver(), this);
    }

    @FindBy(id = "APjFqb")
    public WebElement searchBox;
}
