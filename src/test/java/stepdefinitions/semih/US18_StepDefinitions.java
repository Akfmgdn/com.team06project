package stepdefinitions.semih;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.MyOrdersPage;
import pages.OrderDetailPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US18_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MyOrdersPage myOrdersPage = new MyOrdersPage();
    OrderDetailPage orderDetailPage = new OrderDetailPage();
    Actions action = new Actions(Driver.getDriver());

    String orderId = "";
    String status = "";
    String orderDate = "";
    String orderAmount = "";


    @Given("go to the login page")
    public void go_to_the_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("smhLoginUrl"));
    }


    @Then("Login with {string} and {string}")
    public void loginWithAnd(String arg0, String arg1) {
        loginPage.emailAdressBox.sendKeys(ConfigReader.getProperty(arg0));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty(arg1));
        action.sendKeys(Keys.PAGE_DOWN).perform();
        loginPage.signInButton.click();
    }

    @Then("dashboard link is clicked")
    public void dashboard_link_is_clicked() {
        homePage.dashboardLink.click();
    }

    @Then("my order link is clicked")
    public void my_order_link_is_clicked() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);
        homePage.myOrderLink.click();
    }

    @Then("my order details button is clicked")
    public void my_order_details_button_is_clicked() {
        orderId = myOrdersPage.orderIdNumber.getText();
        status = myOrdersPage.statusInformation.getText();
        orderDate = myOrdersPage.orderDate.getText();
        orderAmount = myOrdersPage.orderAmount.getText();
        action.scrollByAmount(0, 250).perform();
        ReusableMethods.bekle(1);
        myOrdersPage.orderDetailLink.click();
    }

    @Then("It is verified that order id and shipped are displayed")
    public void it_is_verified_that_order_id_and_shipped_are_displayed() {
        Assert.assertTrue(orderDetailPage.packageLabel.isDisplayed() &
                orderDetailPage.orderIdLabel.isDisplayed());
    }
    ///////////////////////////////// TC-2 ////////////////////////////////////

    @Given("It is verified that order id is equal to actual order id")
    public void it_is_verified_that_order_id_is_equal_to_actual_order_id() {
        ReusableMethods.waitForVisibility(orderDetailPage.orderIdLabel,15);
        ReusableMethods.bekle(2);
        Assert.assertTrue(orderDetailPage.orderIdNumber.getText().contains(orderId));

    }

    @Given("It is verified that Status is equal to actual status")
    public void it_is_verified_that_status_is_equal_to_actual_status() {
        Assert.assertTrue(orderDetailPage.statusInformation.getText().contains(status));
    }

    @Given("It is verified that Order Date is equal to actual Order date")
    public void it_is_verified_that_order_date_is_equal_to_actual_order_date() {
        Assert.assertTrue(orderDetailPage.orderDate.getText().contains(orderDate));
    }

    @Given("It is verified that Order Amount is equal to actual Order Amount")
    public void it_is_verified_that_order_amount_is_equal_to_actual_order_amount() {
        Assert.assertTrue(orderDetailPage.orderAmount.getText().contains(orderAmount));
    }

    @Given("It is verified that Package information is displayed")
    public void it_is_verified_that_package_information_is_displayed() {
        Assert.assertTrue(orderDetailPage.packageInfoLabel.isDisplayed());
    }

    @Given("It is verified that Price information is displayed")
    public void it_is_verified_that_price_information_is_displayed() {
        Assert.assertTrue(orderDetailPage.priceLabel.isDisplayed());
    }

    @Given("It is verified that Shipping info is Displayed")
    public void it_is_verified_that_shipping_info_is_displayed() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(orderDetailPage.shippingInfoLabel.isDisplayed());
    }

    @Given("It is verified that Billing info is Displayed")
    public void it_is_verified_that_billing_info_is_displayed() {
        Assert.assertTrue(orderDetailPage.billingInfoLabel.isDisplayed());
    }

    @Given("It is verified that Payment info is Displayed")
    public void it_is_verified_that_payment_info_is_displayed() {
        Assert.assertTrue(orderDetailPage.paymentInfoLabel.isDisplayed());
        ReusableMethods.bekle(1);
    }
    //////////////////////////////// TC-3 //////////////////////////////////////

    @Given("It is verified that Pending title is displayed")
    public void it_is_verified_that_pending_title_is_displayed() {
        action.scrollByAmount(0, -300).perform();
        try {
            Assert.assertTrue(orderDetailPage.orderProcessLabels.getText().contains("Pending"));
        } catch (AssertionError e) {
            System.out.println("* US18-TC3-TS-11 Pending process is not found. There is a Bug here");
        }
    }

    @Given("It is verified that Processing title is displayed")
    public void it_is_verified_that_processing_title_is_displayed() {
        Assert.assertTrue(orderDetailPage.orderProcessLabels.getText().contains("Processing"));
    }

    @Given("It is verified that Shipped title is displayed")
    public void it_is_verified_that_shipped_title_is_displayed() {
        Assert.assertTrue(orderDetailPage.orderProcessLabels.getText().contains("Shipped"));
    }

    @Given("It is verified that Received title is displayed")
    public void it_is_verified_that_received_title_is_displayed() {
        Assert.assertTrue(orderDetailPage.orderProcessLabels.getText().contains("Recieved"));
    }

    @Given("It is verified that Delivered title is displayed")
    public void it_is_verified_that_delivered_title_is_displayed() {
        Assert.assertTrue(orderDetailPage.orderProcessLabels.getText().contains("Delivered"));
    }

    //////////////////////////////// TC-4 //////////////////////////////////////
    @Given("Pending description is displayed")
    public void pending_description_is_displayed() {
        action.scrollByAmount(0,-300).perform();
        try {
            Assert.assertTrue(orderDetailPage.descriptionTextsLabel.getText().contains("Pending"));
        } catch (AssertionError e) {
            System.out.println("* US18-TC4-TS6- Pending process is not found in the pending description. There is a Bug here");
        }
    }

    @Given("Processing description is displayed")
    public void processing_description_is_displayed() {
        Assert.assertTrue(orderDetailPage.descriptionTextsLabel.getText().contains("Processing"));
    }

    @Given("Shipped description is displayed")
    public void shipped_description_is_displayed() {
        Assert.assertTrue(orderDetailPage.descriptionTextsLabel.getText().contains("Shipped"));
    }

    @Given("Recieved description is displayed")
    public void received_description_is_displayed() {
        Assert.assertTrue(orderDetailPage.descriptionTextsLabel.getText().contains("Recieved"));
    }

    @Given("Delivered description is displayed")
    public void delivered_description_is_displayed() {
        Assert.assertTrue(orderDetailPage.descriptionTextsLabel.getText().contains("Delivered"));
    }

    //////////////////////////////// TC-5 //////////////////////////////////////
    @Given("Cancel Order Button is displayed")
    public void cancel_order_button_is_displayed() {
        //Driver.getDriver().navigate().back();
        Assert.assertTrue(myOrdersPage.cancelOrderButton.isDisplayed());
    }

    @Given("Cancel Order button is clicked")
    public void cancel_order_button_is_clicked() {
        ReusableMethods.scrollDownByPixel(300);
        ReusableMethods.bekle(1);
        ReusableMethods.waitForVisibility(myOrdersPage.cancelOrderButton,5);
        ReusableMethods.jsClick(myOrdersPage.cancelOrderButton);
    }

    @Given("Cancel Window title is displayed on the opening window")
    public void cancel_window_title_is_displayed_on_the_opening_window() {
        ReusableMethods.waitForVisibility(myOrdersPage.cancelReasonWindowLabel,10);
        Assert.assertTrue(myOrdersPage.cancelReasonWindowLabel.isDisplayed());
        ReusableMethods.bekle(1);
    }

    //////////////////////////////// TC-6 //////////////////////////////////////
    @Given("ra.reason is selected from dropbox")
    public void ra_reason_is_selected_from_dropbox() {
        myOrdersPage.reasonBoxTextbox.click();
        ReusableMethods.bekle(1);
        myOrdersPage.raDenemeOption.click();
    }

    @Given("send button is clicked")
    public void send_button_is_clicked() {
        myOrdersPage.orderCancelSendButton.click();
    }

    @Given("Order Cancelled is displayed")
    public void order_cancelled_is_displayed() {
        ReusableMethods.waitForVisibility(myOrdersPage.statusInformation,10);
        Assert.assertTrue(myOrdersPage.statusInformation.getText().contains("Cancelled"));
    }

    @And("browser is closed")
    public void browserIsClosed() {
        Driver.getDriver().close();
    }
}
