package stepdefinitions.semih;


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

public class US_18_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MyOrdersPage myOrdersPage = new MyOrdersPage();
    OrderDetailPage orderDetailPage = new OrderDetailPage();
    Actions action = new Actions(Driver.getDriver());

    String orderId="";
    String status="";
    String orderDate="";
    String orderAmount="";


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
        action.scrollByAmount(0,250).perform();
        ReusableMethods.bekle(1);
        myOrdersPage.orderDetailLink.click();
    }
    @Then("It is verified that order id and shipped are displayed")
    public void it_is_verified_that_order_id_and_shipped_are_displayed() {
        Assert.assertTrue(orderDetailPage.packageLabel.isDisplayed() &
                                orderDetailPage.orderIdLabel.isDisplayed());
    }
    ///////////////// TC-2 ///////////////////////////////////////////////

    @Given("It is verified that order id is equal to actual order id")
    public void it_is_verified_that_order_id_is_equal_to_actual_order_id() {
        Assert.assertTrue(orderDetailPage.orderIdLabel.getText().contains(orderId));
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
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("It is verified that Price information is equal to actual Order Amount")
    public void it_is_verified_that_price_information_is_equal_to_actual_order_amount() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("It is verified that Shipping info is Displayed")
    public void it_is_verified_that_shipping_info_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("It is verified that Billing info is Displayed")
    public void it_is_verified_that_billing_info_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("It is verified that Payment info is Displayed")
    public void it_is_verified_that_payment_info_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
