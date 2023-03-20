package stepdefinitions.barboros;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class RegisteredUserStepdefinitions {
    HomePage home = new HomePage();
    LoginPage login = new LoginPage();
    CartPage cart = new CartPage();
    CheckoutPage checkout = new CheckoutPage();
    ShippingPage ship = new ShippingPage();
    PaymentPage payment = new PaymentPage();
    OrderSummaryPage orderSummary = new OrderSummaryPage();
    OrderDetailPage order = new OrderDetailPage();
    MyWishlistPage wishlist = new MyWishlistPage();


    @Given("vverify the site,login link and succesfully logging")
    public void vverify_the_site_login_link_and_succesfully_logging() {

        Driver.getDriver().get(ConfigReader.getProperty("urlCustomer"));
        String url = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("trendlifebuy"));
        try {
            home.newsletterSubscribeCloseButton.click();
            Assert.assertTrue(home.loginLink.isDisplayed());
            home.loginLink.click();
            url = Driver.getDriver().getCurrentUrl();
            Assert.assertTrue(url.contains("login"));
            login.emailAdressBox.sendKeys(ConfigReader.getProperty("unameBrnC"));
            login.passwordBox.sendKeys(ConfigReader.getProperty("pwordBrn"));
            login.signInButton.click();
        } catch (Exception e) {
            Assert.assertTrue(home.loginLink.isDisplayed());
            home.loginLink.click();
            url = Driver.getDriver().getCurrentUrl();
            Assert.assertTrue(url.contains("login"));
            login.emailAdressBox.sendKeys(ConfigReader.getProperty("unameBrnC"));
            login.passwordBox.sendKeys(ConfigReader.getProperty("pwordBrn"));
            login.signInButton.click();
        }

        Assert.assertTrue(home.logoutLink.isDisplayed());
    }

    @Given("verify the products are displayed")
    public void verify_the_products_are_displayed() {
        Assert.assertTrue(home.listedProductsonHomepage.size() > 0);
    }

    @Given("verify the Add to Card functions")
    public void verify_the_add_to_card_functions() {

        ReusableMethods.hover(home.firstProduct);
        ReusableMethods.bekle(3);
        ReusableMethods.jsClick(home.firstProduct);
        ReusableMethods.jsClick(home.addToCartLink);
    }

    @Given("hover over a product and click add to Cart icon and verify that the product is added")
    public void hover_over_a_product_and_click_add_to_cart_icon_and_verify_that_the_product_is_added() {

        ReusableMethods.bekle(3);
        Actions act =new Actions(Driver.getDriver());
        act.sendKeys(Keys.PAGE_DOWN).perform();
        act.moveToElement(home.firstProduct).perform();
        home.addToCartLink.click();
       // ReusableMethods.jsClick(wishlist.addToCartLink);
        try {
            ReusableMethods.bekle(1);
            home.addToCartPopupButton.click();
            ReusableMethods.bekle(1);
            Assert.assertTrue(home.viewCart.isDisplayed());
            home.viewCart.click();
            String url = Driver.getDriver().getCurrentUrl();
            Assert.assertTrue(url.contains("cart"));
        } catch (Exception e) {
            ReusableMethods.bekle(2);
            Assert.assertTrue(home.viewCart.isDisplayed());
            home.viewCart.click();
            String url = Driver.getDriver().getCurrentUrl();
            Assert.assertTrue(url.contains("cart"));
        }
    }


    @Given("check out button and check out page verifications")
    public void check_out_button_and_check_out_page_verifications() {

        //home.cartButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(cart.proceedToCheckoutButton.isDisplayed());
        ReusableMethods.jsClick(cart.proceedToCheckoutButton);
        String url = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("checkout"));
    }

    @Given("shipping button and shipping page verification")
    public void shipping_button_and_shipping_page_verification() {

        Assert.assertTrue(checkout.continueToShippingButton.isDisplayed());
        ReusableMethods.jsClick(checkout.continueToShippingButton);
        String url = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("select_shipping"));
        Assert.assertTrue(ship.continueToPaymentButton.isDisplayed());
    }

    @Given("shipping method and payment page verification")
    public void shipping_method_and_payment_page_verification() {
        ReusableMethods.jsClick(ship.continueToPaymentButton);
        Assert.assertTrue(payment.payNowButton.isDisplayed());
    }

    @Given("payment method order summary and pay now button verification")
    public void payment_method_order_summary_and_pay_now_button_verification() {
        ReusableMethods.jsClick(payment.payMethod);
        ReusableMethods.bekle(1);
        ReusableMethods.jsClick(payment.payNowButton);
        Assert.assertTrue(orderSummary.orderSummaryText.isDisplayed());
    }

    @Given("verification of order summary page")
    public void verification_of_order_summary_page() {
        ReusableMethods.jsClick(orderSummary.viewOrderButton);
        String orderText = order.orderedTextsLabel.getText();
        Assert.assertTrue(orderText.contains("Your order has been received"));
        Assert.assertTrue(order.orderIdLabel.isDisplayed());
    }

}
