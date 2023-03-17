package stepdefinitions.enver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US_21 {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    CartPage cartPage = new CartPage();
    MyWalletPage myWalletPage = new MyWalletPage();
    RefundDisputePage refundDisputePage = new RefundDisputePage();

    Actions actions = new Actions(Driver.getDriver());



    @Given("Go to  main site")
    public void goToMainSite() {Driver.getDriver().get("https://qa.trendlifebuy.com/");
    }


    @And("Close newsletter subscription form")
    public void closeNewsletterSubscriptionForm() {
        ReusableMethods.waitForVisibility(myWalletPage.newsletterSubscribeCloseButton, 30);
        myWalletPage.newsletterSubscribeCloseButton.click();

    }

    @Then("Click on  login button")
    public void clickOnLoginButton() {
        myWalletPage.loginButton.click();
    }

    @Then("Pass in the credentials and click on submit button")
    public void passInTheCredentialsAndClickOnSubmitButton() {
        myWalletPage.loginEmailBox.sendKeys("user114@trendlifebuy.com");
        myWalletPage.loginPasswordBox.sendKeys("Trendlife114");
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", myWalletPage.signInButton);

    }

    @And("Click the dashboard button")
    public void clickTheDashboardButton() {
        myWalletPage.dashboardLink.click();
    }

    @Then("Click the Refund&Dispute link")
    public void clickTheRefundDisputeLink() {
        ReusableMethods.jsClick(refundDisputePage.refundDisputePagelink);
        Assert.assertTrue(refundDisputePage.refundDisputePagelink.isDisplayed());


    }

    @And("Close browser")
    public void closeBrowser() {
        Driver.getDriver().quit();
    }


    @Then("it should be verified that the products for which the return process has been started are displayed in the RefundList.")
    public void itShouldBeVerifiedThatTheProductsForWhichTheReturnProcessHasBeenStartedAreDisplayedInTheRefundList() {
        Assert.assertTrue(refundDisputePage.iadeUrunText.isDisplayed());
    }


    @Then("Verify that the Order ID,Order Date, Status, Request Sent Date and Order Amount information are visible RefundList.")
    public void verifyThatTheOrderIDOrderDateStatusRequestSentDateAndOrderAmountInformationAreVisibleRefundList()
    {Assert.assertTrue(refundDisputePage.orderIdText.isDisplayed());
        Assert.assertTrue(refundDisputePage.statusText.isDisplayed());
        Assert.assertTrue(refundDisputePage.OrderAmountText.isDisplayed());
        Assert.assertTrue(refundDisputePage.RequestSentdate.isDisplayed());

        }


    @Then("opened page with the View Details button, it should be verified that the current status of the order whose return request is opened can be viewed.")
    public void openedPageWithTheViewDetailsButtonItShouldBeVerifiedThatTheCurrentStatusOfTheOrderWhoseReturnRequestIsOpenedCanBeViewed() {
        ReusableMethods.scrollDownByPixel(350);
        Assert.assertTrue(refundDisputePage.viewDetailButton.isDisplayed());
        ReusableMethods.jsClick(refundDisputePage.viewDetailButton);
        ReusableMethods.bekle(2);
        Assert.assertTrue(refundDisputePage.actualstation.isDisplayed());
    }


    @Then("On the opened details page,it should be verified that at least one of the Start,Processing and Complete states are active.")
    public void onTheOpenedDetailsPageItShouldBeVerifiedThatAtLeastOneOfTheStartProcessingAndCompleteStatesAreActive() {

    }

    @Then("Verify that Texts with explanations of Start,Processing and Complete states are visible")
    public void verifyThatTextsWithExplanationsOfStartProcessingAndCompleteStatesAreVisible() {
        
        Assert.assertTrue(refundDisputePage.StartText.isDisplayed());
        Assert.assertTrue(refundDisputePage.processingtext.isDisplayed());
        Assert.assertTrue(refundDisputePage.completetext.isDisplayed());
    }

    @Then("It should be verified that the Pick Up Info information is displayed on the details page that opens.")
    public void ıtShouldBeVerifiedThatThePickUpInfoInformationIsDisplayedOnTheDetailsPageThatOpens() {
        Assert.assertTrue(refundDisputePage.PickUpInfo.isDisplayed());
    }

}
