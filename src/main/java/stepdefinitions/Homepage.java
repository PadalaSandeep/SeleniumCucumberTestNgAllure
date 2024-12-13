package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utility.Driverholder;

public class Homepage {

    @Given("When user open url: {string}")
    public void whenUserOpenUrl(String url) {
        Driverholder.getDriver().get(url);
    }

    @Then("validate youtube page is loaded properly")
    public void validateYoutubePageIsLoadedProperly() {
        Assert.assertEquals(Driverholder.getDriver().getTitle().contains("YouTube"), true);
    }
}
