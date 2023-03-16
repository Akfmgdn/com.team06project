package stepdefinitions.akif;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US_007_stepdefinitions {
    MyWishlistPage wishlist = new MyWishlistPage();
    HomePage home = new HomePage();
    LoginPage login = new LoginPage();
    ComparePage compare = new ComparePage();
    RegisterPage registerPage=new RegisterPage();

    //TC_01 It should be verified that it is on the Sign Up page.
    @Given("trendlifebuy goes to homepage")
    public void trendlifebuy_goes_to_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("UrlCostomer"));

    }
    @Given("pop up closes")
    public void pop_up() {

        try {
            home.newsletterSubscribeCloseButton.click();
        } catch (Exception e) {
        }
    }

    @Given("Register clicks")
    public void register_click() {
        home.registerLinkk.click();
    }
    @Then("It is tested to be on the sign up page")
    public void it_is_tested_to_be_on_the_sign_up_page() {

        String expectedText="Sign Up";
        String actionText=registerPage.singUpText.getText();

        Assert.assertEquals(expectedText,actionText);

    }
////
    //TC_02 It must be verified that the First Name Text Box is registered with a name of at least 2 letters.

    @Given("It is tested that the First Name Text Box is registered with a name of at least {int} letters.")
    public void it_is_tested_that_the_first_name_text_box_is_registered_with_a_name_of_at_least_letters(Integer int1) {

    }














}
