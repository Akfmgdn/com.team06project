package stepdefinitions.barboros;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class RegisteredUser {
    HomePage home = new HomePage();
    LoginPage login = new LoginPage();

    @Given("vverify the site,login link and succesfully logging")
    public void vverify_the_site_login_link_and_succesfully_logging() {
        Driver.getDriver().get(ConfigReader.getProperty("urlCustomer"));
        String url = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("trendlifebuy"));
        ReusableMethods.bekle(2);
        Assert.assertTrue(home.loginLink.isDisplayed());
        home.loginLink.click();
        url = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("login"));
        login.emailAdressBox.sendKeys(ConfigReader.getProperty("unameBrnC"));
        login.passwordBox.sendKeys(ConfigReader.getProperty("pwordBrn"));
        login.signInButton.click();
        Assert.assertTrue(home.logoutLink.isDisplayed());
    }

    @Given("verify the products are displayed")
    public void verify_the_products_are_displayed() {
        Assert.assertTrue(home.listedProductsonHomepage.size() > 0);
    }
    @Given("verify the Add to Card functions")
    public void verify_the_add_to_card_functions() {

        ReusableMethods.hover(home.firstProduct);
        home.addToCartLink.click();

    }
}
