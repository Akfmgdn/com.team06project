package stepdefinitions.mert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BlogPage;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_25 {

    HomePage homePage = new HomePage();
    BlogPage blogPage = new BlogPage();
    Actions actions = new Actions(Driver.getDriver());
    @Then("Visible logout link on home page")
    public void visible_logout_link_on_home_page() {

        Assert.assertTrue(homePage.logoutLink.isDisplayed());

    }

    @And("Click logout button and verified account logged out")
    public void clickLogoutButtonAndVerifiedAccountLoggedOut() {
        homePage.logoutLink.click();

        ReusableMethods.bekle(3);

        Assert.assertTrue(blogPage.logoutMessage.isDisplayed());


    }

    @And("Click Dashboard link and is visible logout link")
    public void clickDashboardLinkAndIsVisibleLogoutLink() {
        homePage.dashboardLink.click();
        ReusableMethods.bekle(2);

        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(2);

        Assert.assertTrue(blogPage.userDashboardLogoutLink.isDisplayed());
    }

    @And("click dashboard link and then click logout link then verified logged out")
    public void clickDashboardLinkAndThenClickLogoutLinkThenVerifiedLoggedOut() {
        homePage.dashboardLink.click();
        ReusableMethods.bekle(2);

        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(2);

        blogPage.userDashboardLogoutLink.click();
        ReusableMethods.bekle(2);

        Assert.assertTrue(blogPage.logoutMessage.isDisplayed());
    }
}
