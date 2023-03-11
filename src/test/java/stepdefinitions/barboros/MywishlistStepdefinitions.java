package stepdefinitions.barboros;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.ComparePage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyWishlistPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Arrays;
import java.util.List;

public class MywishlistStepdefinitions {

    MyWishlistPage wishlist = new MyWishlistPage();
    HomePage home = new HomePage();
    LoginPage login = new LoginPage();
    List<WebElement> options;
    ComparePage compare = new ComparePage();


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

    @Given("click wishlink and take list of the product criteria and numbers")
    public void click_wishlink_and_take_list_of_the_product_criteria_and_numbers() {
        home.wishListLink.click();
        wishlist.listOptionsButton.click();
        options = wishlist.listOfOptions;
    }

    @Given("verify that the products that the user likes are listed as {string}")
    public void verify_that_the_products_that_the_user_likes_are_listed_as(String option) {

        String[] speciality = option.split(",");
        int num = 0;
        while (num < speciality.length) {
            for (WebElement opt : options) {

                if (opt.getText().contains(speciality[num])) {
                    Assert.assertTrue(true);
                    num++;
                } else Assert.assertTrue(false);
            }
        }
    }

    @Given("Verify that the {string} of Items to be displayed on the Wishlist page can be changed")
    public void verify_that_the_of_items_to_be_displayed_on_the_wishlist_page_can_be_changed(String no) throws InterruptedException {

        int count = 0;
        home.wishListLink.click();
        String[] numbers = no.split(",");

        while (count < numbers.length) {
            Thread.sleep(2000);
            wishlist.numberOfItemListedButton.click();
            String locator = "//li[@data-value='" + numbers[count] + "']";
            Driver.getDriver().findElement(By.xpath(locator)).click();
            String number = wishlist.currentNumberofItemBox.getText();
            System.out.println(number);
            System.out.println(numbers[count]);
            if (number.contains(numbers[count])) {
                Assert.assertTrue(true);
            } else Assert.assertTrue(false);
            count++;
        }
    }

    @Given("click wishlink and hover over a product")
    public void click_wishlink_and_hover_over_a_product() {
        home.wishListLink.click();
        ReusableMethods.hover(wishlist.wishListFirstProduct);
        ReusableMethods.bekle(1);
    }

    @Given("hover over a product")
    public void hover_over_a_product() {
        ReusableMethods.hover(wishlist.wishListFirstProduct);
    }

    @Given("click compare icon and verify that the product added to compare page")
    public void click_compare_icon_and_verify_that_the_product_added_to_compare_page() {

        String countCompare = wishlist.countOfCompareProduct.getText();
        int num = Integer.parseInt(countCompare);
        int number;
        wishlist.addtoCompareIcon.click();
        ReusableMethods.bekle(2);

        try {
            if (wishlist.adtoComparePopupButton.isDisplayed()) {
                wishlist.adtoComparePopupButton.click();
                ReusableMethods.bekle(2);
                countCompare = wishlist.countOfCompareProduct.getText();
                number = Integer.parseInt(countCompare);
                Assert.assertTrue(number == num + 1);
                ReusableMethods.bekle(2);
                ReusableMethods.jsClick(wishlist.compareLink);
                compare.resetCompareButton.click();

            }
        } catch (Exception e) {
            ReusableMethods.bekle(2);
            countCompare = wishlist.countOfCompareProduct.getText();
            number = Integer.parseInt(countCompare);
            Assert.assertTrue(number == num + 1);
            ReusableMethods.jsClick(wishlist.compareLink);
            compare.resetCompareButton.click();
        }


    }

    @Given("click show icon and verify that the show window of the relevant product open")
    public void click_show_icon_and_verify_that_the_show_window_of_the_relevant_product_open() {

        wishlist.showIcon.click();
        ReusableMethods.bekle(3);
        Assert.assertTrue(wishlist.showCloseIcon.isDisplayed());
        wishlist.showCloseIcon.click();

    }

    @Given("click delete icon and verify that the  relevant product is deleted")
    public void click_delete_icon_and_verify_that_the_relevant_product_is_deleted() {

        ReusableMethods.bekle(5);
        List<WebElement> products = wishlist.wishListProducts;
        int number = products.size();
        ReusableMethods.hover(wishlist.wishListFirstProduct);
        wishlist.deleteIcon.click();
        ReusableMethods.bekle(2);
        wishlist.popUpDeleteButton.click();
        ReusableMethods.bekle(2);
        products = wishlist.wishListProducts;
        Assert.assertTrue(number == products.size() + 1);
    }


    @Given("click add to Cart icon and verify that the product is added to Card Page")
    public void click_add_to_cart_icon_and_verify_that_the_product_is_added_to_card_page() {

        ReusableMethods.jsClick(wishlist.addToCartLink);
        ReusableMethods.bekle(2);
        wishlist.addToCartLinkPopup.click();
        ReusableMethods.bekle(2);
        try {
            Assert.assertTrue(wishlist.addToCartText.isDisplayed());
        } catch (Exception e) {
            Assert.assertTrue(false);
        }
    }

    @Given("close the browser")
    public void close_the_browser() {

        Driver.closeDriver();
    }
}
