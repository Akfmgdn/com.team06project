package stepdefinitions.barboros;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;
import pages.MyWishlistPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class MywishlistStepdefinitions {
    MyWishlistPage wishlist = new MyWishlistPage();
    HomePage home = new HomePage();
    LoginPage login = new LoginPage();


    @Given("login to the website")
    public void login_to_the_website() {
        Driver.getDriver().get(ConfigReader.getProperty("urlCustomer"));
        home.loginLink.click();
        login.emailAdressBox.sendKeys(ConfigReader.getProperty("unameBrnC"));
        login.passwordBox.sendKeys(ConfigReader.getProperty("pwordBrn"));
        login.signInButton.click();
    }

    @Given("click wishlist link verify that the link leads to the MywishlistPage")
    public void click_wishlist_link_verify_that_the_link_leads_to_the_mywishlist_page() {
        home.wishListLink.click();
        String wishlistUrl = Driver.getDriver().getCurrentUrl();
        String expectedData = "wishlist";
        Assert.assertTrue(wishlistUrl.contains(expectedData));
    }

    @Given("verify that the hat the products that the user likes are listed on the My Wishlist page.")
    public void verify_that_the_hat_the_products_that_the_user_likes_are_listed_on_the_my_wishlist_page() {

        Assert.assertTrue(wishlist.NumberOfProductlListedResult.getText().contains(wishlist.wishListCount.getText()));
    }

    @Given("click wishlist link and verify that the products that the user likes are listed as {string}")
    public void click_wishlist_link_and_verify_that_the_products_that_the_user_likes_are_listed_as(String option) {
        wishlist.listOptionsButton.click();
        List<WebElement> options = wishlist.listOfOptions;
        for (WebElement opt : options) {
            Assert.assertTrue(opt.getText().contains(option));
        }

    }

    @Given("Verify that the {string} of Items to be displayed on the Wishlist page can be changed")
    public void verify_that_the_of_items_to_be_displayed_on_the_wishlist_page_can_be_changed(String no) {
        wishlist.numberOfItemListedButton.click();
        wishlist.max16ItemDisplayed.click();
        String number=wishlist.currentNumberofItemBox.getText();
        Assert.assertTrue(number.contains(no));
    }



}
