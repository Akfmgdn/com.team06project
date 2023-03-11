package stepdefinitions.barboros;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class RegisteredUser {
    HomePage home= new HomePage();
    LoginPage login= new LoginPage();

    @Given("verify the site and login button, and verify the login is succesful")
    public void verify_the_site_and_login_button_and_verify_the_login_is_succesful() {

        Driver.getDriver().get(ConfigReader.getProperty("urlCustomer"));
        String url= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("trendlifebuy"));
        ReusableMethods.bekle(2);
        Assert.assertTrue(home.loginLink.isDisplayed());
        home.loginLink.click();
        url= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("login"));
        login.emailAdressBox.sendKeys(ConfigReader.getProperty("unameBrnC"));
        login.passwordBox.sendKeys(ConfigReader.getProperty("pwordBrn"));
        login.signInButton.click();
        Assert.assertTrue(home.logoutLink.isDisplayed());

    }



}
