package stepdefinitions.mert;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyWalletPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_10 {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    CartPage cartPage = new CartPage();
    MyWalletPage myWalletPage = new MyWalletPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Launch browser and Navigate to url")
    public void launch_browser_and_navigate_to_url() {
        Driver.getDriver().get("https://qa.trendlifebuy.com/");
    }

    @Then("Click on  Login link")
    public void clickOnLoginLink() {
        homePage.loginLink.click();
    }

    @And("Enter email address and password")
    public void enterEmailAddressAndPassword() {
        loginPage.emailAdressBox.sendKeys(ConfigReader.getProperty("mertCustomerUserName"));
        loginPage.passwordBox.click();
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("mertPassword"));
    }

    @Then("Clicks on the cart link")
    public void clicksOnTheCartLink() {
        homePage.cartButton.click();
    }

    @Then("Is visible Shipping charge free from Order Summary Subtotal Shipping Charge Discount VAT TAX GST and Total")
    public void ıs_visible_shipping_charge_free_from_order_summary_subtotal_shipping_charge_discount_vat_tax_gst_and_total() {
        Assert.assertTrue(cartPage.shippingChargeFreeFromText.isDisplayed());
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Assert.assertTrue(cartPage.orderSummaryText.isDisplayed());
        ReusableMethods.bekle(2);
        Assert.assertTrue(cartPage.subtotalText.isDisplayed());
        ReusableMethods.bekle(2);
        Assert.assertTrue(cartPage.shippingChargeText.isDisplayed());
        ReusableMethods.bekle(2);
        Assert.assertTrue(cartPage.discountText.isDisplayed());
        ReusableMethods.bekle(2);
        Assert.assertTrue(cartPage.vattaxgstText.isDisplayed());
        ReusableMethods.bekle(2);
        Assert.assertTrue(cartPage.totalText.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @Then("quit the browser")
    public void quitTheBrowser() {
        Driver.getDriver().quit();
    }

    @And("Click signIn button")
    public void clickSignInButton() {
        loginPage.signInButton.click();
    }
    @Then("Press - in the Quantity section and sees that the product quantity has changed.")
    public void pressInTheQuantitySectionAndSeesThatTheProductQuantityHasChanged() {
        String actualResult = cartPage.itemNumberText.getText();
        ReusableMethods.bekle(2);
        cartPage.minusButton.click();
        ReusableMethods.bekle(2);
        String expectedResult = cartPage.itemNumberText.getText();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Then("When you press + in the Quantity section, the total product price changes")
    public void whenYouPressInTheQuantitySectionTheTotalProductPriceChanges() {
        String actualResult = cartPage.subtotalPriceText.getText();
        cartPage.plusButton.click();
        String expectedResult =cartPage.subtotalPriceText.getText();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @And("When he presses - in the Quantity section, the total product price changes")
    public void whenHePressesInTheQuantitySectionTheTotalProductPriceChanges() {
        String actualResult = cartPage.subtotalPriceText.getText();
        ReusableMethods.bekle(2);
        cartPage.minusButton.click();
        ReusableMethods.bekle(2);
        String expectedResult =cartPage.subtotalPriceText.getText();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @And("Presses + in the Quantity section and sees that the product quantity has changed")
    public void pressesInTheQuantitySectionAndSeesThatTheProductQuantityHasChanged() {
        String actualResult = cartPage.itemNumberText.getText();
        ReusableMethods.bekle(2);
        cartPage.plusButton.click();
        ReusableMethods.bekle(2);
        String expectedResult =cartPage.itemNumberText.getText();
        ReusableMethods.bekle(2);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @And("Price displays the price written in the Price section, the unit price of the product and the discount amount, if any")
    public void priceDisplaysThePriceWrittenInThePriceSectionTheUnitPriceOfTheProductAndTheDiscountAmountIfAny() {
        Assert.assertTrue(cartPage.priceValueText.isDisplayed());
    }

    @And("Click the proceed to checkout button")
    public void clickTheProceedToCheckoutButton() {
        cartPage.proceedToCheckoutButton.click();
    }

    @And("When he clicks on the button, he sees that he goes to checkout page")
    public void whenHeClicksOnTheButtonHeSeesThatHeGoesToCheckoutPage() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.trendlifebuy.com/checkout";

        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }

    @And("He presses the Continue Shopping button and sees that he goes to the homepage.")
    public void hePressesTheContinueShoppingButtonAndSeesThatHeGoesToTheHomepage() {
        cartPage.continueShoppingButton.click();

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.trendlifebuy.com/";

        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }


    @And("Click on the delete icon in the Remove section See that the item in the cart has been deleted.")
    public void clickOnTheDeleteIconInTheRemoveSectionSeeThatTheItemInTheCartHasBeenDeleted() {
        String actualTotalPrice = cartPage.totalPriceLink.getText();

        cartPage.deleteButton.click();
        ReusableMethods.bekle(2);

        Assert.assertTrue(cartPage.deleteMessage.isDisplayed());

        ReusableMethods.bekle(2);

        String expectedTotalPrice = cartPage.totalPriceLink.getText();
        Assert.assertNotEquals(actualTotalPrice,expectedTotalPrice);


    }
}
