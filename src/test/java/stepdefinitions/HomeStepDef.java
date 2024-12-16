package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pagesteps.HomePageStep;
import utility.Driverholder;

public class HomeStepDef {

    HomePageStep homePageStep = new HomePageStep();

    @Given("When user open url: {string}")
    public void whenUserOpenUrl(String url) {
        Driverholder.getDriver().get(url);
    }

    @Then("validate youtube page is loaded properly")
    public void validateYoutubePageIsLoadedProperly() {
        //HomePage.verifyPageTitle("YouTube");
    }

    @Then("type {string} in search box")
    public void typeInSearchBox(String searchInput) {
        homePageStep.searchValue(searchInput);
    }
}
