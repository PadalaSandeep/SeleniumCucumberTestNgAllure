package pagesteps;

import pages.HomePage;

public class HomePageStep {

    HomePage homePage = new HomePage();

    public void searchValue(String searchInput) {
        homePage.searchBox.sendKeys(searchInput);
    }

}
