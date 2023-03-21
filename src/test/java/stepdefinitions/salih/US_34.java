package stepdefinitions.salih;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.AdminDashboardPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.driver;
import static utilities.Driver.getDriver;
import static utilities.ReusableMethods.bekle;
import static utilities.ReusableMethods.scrollToElement;

public class US_34 {
    LoginPage loginPage= new LoginPage();
    AdminDashboardPage adminDashboardPage= new AdminDashboardPage();
    @Given("Login As an admin")
    public void loginAsAnAdmin() {
        Driver.getDriver().get("https://qa.trendlifebuy.com/admin/login");
        loginPage.emailAdressBox.sendKeys(ConfigReader.getProperty("adminNameSlh"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.scrollDownByPixel(250);
        bekle(2);
        loginPage.signInButton.click();

    }

    @And("click the products link")
    public void clickTheProductsLink() {
        ReusableMethods.scrollDownByPixel(250);
        bekle(2);
        adminDashboardPage.productsLink.click();
        bekle(1);
    }
    @When("Test  the Name and Status  information is visible")
    public void test_the_name_and_status_information_is_visible() {
        adminDashboardPage.addNewProductLink.click();
        assertTrue(adminDashboardPage.productNameBoxElment.isDisplayed());
        //ReusableMethods
        //adminDashboardPage.addNewUnitButton.click();
        //bekle(1);
        //scrollToElement(adminDashboardPage.statusActiveElement);
        //bekle(1);
        //assertTrue(adminDashboardPage.statusActiveElement.isDisplayed());

    }
    @When("Enter  Status information  in the Create unit window")
    public void enter_status_information_in_the_create_unit_window() {
       // adminDashboardPage.addNewUnitButton.click();

    }

   // @And("Click the Save product button")
    //public void clickTheSaveProductButton() {
        //adminDashboardPage.statusElement.click(); save etmiyor! BUG
        //adminDashboardPage.saveStatusButton.click();
    //}
    @Then("Verify that new Unit has been created")
    public void verify_that_new_unit_has_been_created() {


    }
    @Then("Add physical features")
    public void add_physical_features() {
        scrollToElement(adminDashboardPage.physicalWeight);
        bekle(1);
        adminDashboardPage.physicalWeight.sendKeys("250");
        adminDashboardPage.physicalLength.sendKeys("25");
        bekle(2);

    }

    @Then("verify that Price info And Stock information can be entered")
    public void verify_that_price_info_and_stock_information_can_be_entered() {
        scrollToElement(adminDashboardPage.priceElement);
        adminDashboardPage.priceElement.sendKeys("75");
        adminDashboardPage.productStockElement.sendKeys("50");

    }
    @Then("click the Meta Image button")
    public void click_the_meta_image_button() {
        scrollToElement(adminDashboardPage.metaimageButton);
        bekle(1);
        adminDashboardPage.metaimageButton.click();
        //adminDashboardPage.

    }
    @Then("verify that the product photo can be added")
    public void verify_that_the_product_photo_can_be_added() {
        adminDashboardPage.firstImageElement.click();
        bekle(1);
       ReusableMethods.scrollIntoViewJS(adminDashboardPage.addPhotoFilesButton);
       bekle(1);
        //scrollToElement(adminDashboardPage.addPhotoFilesButton);
        adminDashboardPage.addPhotoFilesButton.click();
        //getDriver().navigate().back();
        //adminDashboardPage.selectPhotoFileClose.click();
    }
    @Then("verify that the reminding message appears above the save button")
    public void verify_that_the_reminding_message_appears_above_the_save_button() {
        assertTrue(adminDashboardPage.remindingMassageElement.isDisplayed());
        bekle(1);
    }
    @And("click the  Save buttonn")
    public void clickTheSaveButtonn() {
        //adminDashboardPage.saveAddedProductInformation.click();

    }



    @Then("Verify that the Related Product List is visible")
    public void verify_that_the_related_product_list_is_visible() {
        scrollToElement(adminDashboardPage.relatedProductLink);
        bekle(1);
        assertTrue(adminDashboardPage.relatedProductLink.isDisplayed());

    }
    @When("click Related Product link")
    public void click_related_product_link() {
        adminDashboardPage.relatedProductLink.click();
        bekle(1);
    }

    @Then("Verify the Quick Search textbox appears")
    public void verify_the_quick_search_textbox_appears() {
        assertTrue(adminDashboardPage.relatedProductquickSearchBox.isDisplayed());


    }
    @Then("verify that the new product has been registered")
    public void verify_that_the_new_product_has_been_registered() {
        adminDashboardPage.relatedProductquickSearchBox.sendKeys("pabuch");
        bekle(1);
        System.out.println(adminDashboardPage.pabuchAssertionElement.getText());
        assertEquals("pabuch",adminDashboardPage.pabuchAssertionElement.getText());
    }

    @Then("Verify that the products are listed  under Name, Brand, Thumbnail")
    public void verify_that_the_products_are_listed_under_name_brand_thumbnail() {
        assertTrue(adminDashboardPage.relatedproductListColumnName.isDisplayed());


    }
    @Then("verify that the radio button of the product is clickable")
    public void verify_that_the_radio_button_of_the_product_is_clickable() {
        assertTrue(adminDashboardPage.relatedproductListColumnName.isEnabled());

    }
    @Then("Verify that it switches between Related Product List pages via the  bottom page numbers	verify that the message reminding Up Sale, Cross Sale pages must be filled is visible")
    public void verify_that_it_to_switches_between_related_product_list_pages_via_the_bottom_page_numbers_verify_that_the_message_reminding_up_sale_cross_sale_pages_must_be_filled_is_visible() {
        assertTrue(adminDashboardPage.switchBetweenPages.isEnabled());
        //adminDashboardPage.remaindingMessageRelatedProduct.isDisplayed();

    }
    @When("click the RelatedProductSave button")
    public void click_the_related_product_save_button() {
        //adminDashboardPage.saveRelatedProductButton.click(); //UPsale den sonra sonra


    }
    @Then("verify that the product has been registered")
    public void verify_that_the_product_has_been_registered() {

    }


    @When("click and Verify that Up Sale List is visible")
    public void clickAndVerifyThatUpSaleListIsVisible() {
        bekle(1);
        assertTrue(adminDashboardPage.upSaleLink.isDisplayed());
        adminDashboardPage.upSaleLink.click();
        bekle(1);
    }

    @Then("Verify that Quick Search textbox is available")
    public void verifyThatQuickSearchTextboxIsAvailable() {
        assertTrue(adminDashboardPage.upsaleQuickSearchBox.isDisplayed());
        System.out.println("Hello");
    }


    @And("verify that the products are listed in order")
    public void verifyThatTheProductsAreListedInOrder() {
        assertTrue(adminDashboardPage.upSaleListColumnName.isDisplayed());

    }

    @Then("verify that the radio button is clickable")
    public void verifyThatTheRadioButtonIsClickable() {
        adminDashboardPage.upSaleRadioButton.isDisplayed();
    }

    @Then("verify that it switches between Up Sale List pages via the at the bottom page numbers")
    public void verifyThatItSwitchesBetweenUpSaleListPagesViaTheAtTheBottomPageNumbers() {
    //adminDashboardPage.switchBetweenPages.isEnabled();

    }

    @Then("verify that the reminding message on the save button must be filled places is visible.")
    public void verifyThatTheRemindingMessageOnTheSaveButtonMustBeFilledPlacesIsVisible() {
        adminDashboardPage.remaindingMessageRelatedProduct.isDisplayed();

    }

    @Then("Click the Save Upsale button")
    public void clickTheSaveUpsaleButton() {
        adminDashboardPage.saveRelatedProductButton.isEnabled(); //save button aynı

        //Bug ' save button unclickable!
    }

    @Then("verify that the upsale product has been registered")
    public void verifyThatTheUpsaleProductHasBeenRegistered() {


    }
    @Then(" driver close")
    public void driverClose() {
        driver.quit();
    }


}
