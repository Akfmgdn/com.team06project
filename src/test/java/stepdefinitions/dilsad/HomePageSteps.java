package stepdefinitions.dilsad;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.MyWalletPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Given("Go to Url")
    public void go_to_url() {
      Driver.getDriver().get(ConfigReader.getProperty("urlCustomer"));
    }

    @Given("Verifed the Url")
    public void verifed_the_url() {
        String title=Driver.getDriver().getTitle();
        String beklenenKelime="Trendlife";
       Driver.getDriver().getTitle().contains("Trendlife");
       Assert.assertTrue(title.contains(beklenenKelime));
    }
    @Given("Click on the play store link")
    public void click_on_the_play_store_link() {
       homePage.googlePlayLink.isEnabled();
        Assert.assertTrue(homePage.googlePlayLink.isEnabled());
    }
    @Given("Verifed the google play link")
    public void verifed_the_google_play_link() {
        String Url="play.google";

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(Url));
    }
    @Given("Click on the app store link")
    public void click_on_the_app_store_link() {
        homePage.appStoreLink.isEnabled();
        Assert.assertTrue(homePage.appStoreLink.isEnabled());
    }
    @Given("Verifed the app store link")
    public void verifed_the_app_store_link() {

        String url=" apple.com";

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(url));
    }
    @Given("Click on the track your order link")
    public void click_on_the_track_your_order_link() {
        homePage.trackYourOrderLink.isDisplayed();
        Assert.assertTrue(homePage.trackYourOrderLink.isDisplayed());
    }
    @Given("Verifed the track your order link")
    public void verifed_the_track_your_order_link() {
        homePage.trackYourOrderLink.isEnabled();
        Assert.assertTrue(homePage.trackYourOrderLink.isEnabled());
    }
    @Given("Click on the cart button")
    public void click_on_the_cart_button() {
        homePage.cartButton.isDisplayed();
       Assert.assertTrue(homePage.cartButton.isDisplayed());
    }
    @Given("Verifed the cart button")
    public void verifed_the_cart_button() {

        homePage.cartButton.isEnabled();
        Assert.assertTrue(homePage.cartButton.isEnabled());
    }
    @Given("Click on the compare link")
    public void click_on_the_compare_link() {
        homePage.compareLink.isDisplayed();
        Assert.assertTrue(homePage.compareLink.isEnabled());
    }
    @Given("Verifed the compare link")
    public void verifed_the_compare_link() {
        homePage.compareLink.isEnabled();
        Assert.assertTrue(homePage.compareLink.isEnabled());
    }
    @Given("Click on the wishlist link")
    public void click_on_the_wishlist_link() {
        homePage.wishListLink.isDisplayed();
        Assert.assertTrue(homePage.wishListLink.isDisplayed());
    }
    @Given("Verifed the wishlist link")
    public void verifed_the_wishlist_link() {
        homePage.wishListLink.isEnabled();
        Assert.assertTrue(homePage.wishListLink.isEnabled());
    }
    @Given("Click on the logo")
    public void click_on_the_logo() {
        homePage.logoImg.isEnabled();
        Assert.assertTrue(homePage.logoImg.isEnabled());
    }
    @Given("Click on the login link")
    public void click_on_the_login_link() {
       homePage.loginLink.isDisplayed();
       Assert.assertTrue(homePage.loginLink.isDisplayed());
    }
    @Given("Verifed the login link")
    public void verifed_the_login_link() {

        homePage.loginLink.isEnabled();
        Assert.assertTrue(homePage.loginLink.isEnabled());
    }
    @Given("Click on the register link")
    public void click_on_the_register_link() {
        homePage.registerLinkk.isDisplayed();
        Assert.assertTrue(homePage.registerLinkk.isDisplayed());
    }
    @Given("Verifed the register link")
    public void verifed_the_register_link() {
        homePage.registerLinkk.isEnabled();
        Assert.assertTrue(homePage.registerLinkk.isEnabled());

    }
    @Given("Click on the new user zone link")
    public void click_on_the_new_user_zone_link() {
        homePage.newUserZoneLink.isDisplayed();
        Assert.assertTrue(homePage.newUserZoneLink.isDisplayed());

    }
    @Given("Verifed the new user zone link")
    public void verifed_the_new_user_zone_link() {
        homePage.newUserZoneLink.isEnabled();
        Assert.assertTrue(homePage.newUserZoneLink.isEnabled());
    }
    @Given("Click on the home link")
    public void click_on_the_home_link() {
    homePage.homeLink.isDisplayed();
    Assert.assertTrue(homePage.homeLink.isDisplayed());
    }
    @Given("Verifed the home link")
    public void verifed_the_home_link() {
        homePage.homeLink.isEnabled();
        Assert.assertTrue(homePage.homeLink.isEnabled());
    }
    @Given("click on the blog link")
    public void click_on_the_blog_link() {
      homePage.blogLink.isDisplayed();
      Assert.assertTrue(homePage.blogLink.isDisplayed());
    }
    @Given("Verifed the blog link")
    public void verifed_the_blog_link() {
        homePage.blogLink.isEnabled();
        Assert.assertTrue(homePage.blogLink.isEnabled());

    }
    @Given("Click on the about us link")
    public void click_on_the_about_us_link() {
        homePage.aboutUsLink.isDisplayed();
        Assert.assertTrue(homePage.aboutUsLink.isDisplayed());

    }
    @Given("Verifed the about us link")
    public void verifed_the_about_us_link() {
        homePage.aboutUsLink.isEnabled();
        Assert.assertTrue(homePage.aboutUsLink.isEnabled());

    }
    @Given("Click on the contact link")
    public void click_on_the_contact_link() {
        homePage.contactLink.isDisplayed();
        Assert.assertTrue(homePage.contactLink.isDisplayed());
    }
    @Given("Verifed the contact link")
    public void verifed_the_contact_link() {
        homePage.contactLink.isEnabled();
        Assert.assertTrue(homePage.contactLink.isEnabled());
    }

    @Given("Click on the allCategoriesDropdown")
    public void click_on_the_all_categories_dropdown() {
      homePage.allCategoriesDropdown.isDisplayed();
      Assert.assertTrue(homePage.allCategoriesDropdown.isDisplayed());
    }
    @Given("Verifey the drop down is active")
    public void verifey_the_drop_down_is_active() {
       homePage.allCategoriesDropdown.isEnabled();
       Assert.assertTrue(homePage.allCategoriesDropdown.isEnabled());
    }

    @Given("Click on the computer accessories link")
    public void click_on_the_computer_accessories_link() {
        homePage.computerAccessoriesLink.isDisplayed();
        Assert.assertTrue(homePage.computerAccessoriesLink.isEnabled());
    }
    @Given("Verify the computer accessories link is active")
    public void verify_the_computer_accessories_link_is_active() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Click on the electronics devices link")
    public void click_on_the_electronics_devices_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Verify electronics devices link is  active")
    public void verify_electronics_devices_link_is_active() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Click on the watches accessories link")
    public void click_on_the_watches_accessories_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Verify watches accessories  link is active")
    public void verify_watches_accessories_link_is_active() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("click on the fashions link")
    public void click_on_the_fashions_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Verify fashions link is active")
    public void verify_fashions_link_is_active() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Click on the toys kids babies link")
    public void click_on_the_toys_kids_babies_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Verify toys kids babies link is active")
    public void verify_toys_kids_babies_link_is_active() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Click on the bag shoes link")
    public void click_on_the_bag_shoes_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Verify bag shoes link is active")
    public void verify_bag_shoes_link_is_active() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Click on the life style home link")
    public void click_on_the_life_style_home_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Verify life style home link is active")
    public void verify_life_style_home_link_is_active() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Click on the  tv home appliances link")
    public void click_on_the_tv_home_appliances_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Verify tv home appliances link is active")
    public void verify_tv_home_appliances_link_is_active() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Click on the auto mobiles bikes link")
    public void click_on_the_auto_mobiles_bikes_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Verify  auto mobiles bikes link is active")
    public void verify_auto_mobiles_bikes_link_is_active() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }







































}
















































