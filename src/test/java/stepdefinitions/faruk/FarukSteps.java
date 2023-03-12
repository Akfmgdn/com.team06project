package stepdefinitions.faruk;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MyWalletPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class FarukSteps {
    MyWalletPage myWalletPage = new MyWalletPage();
    @Given("Go to site")
    public void goToSite() {
        Driver.getDriver().get("https://qa.trendlifebuy.com/");

    }

    @And("Close the newsletter subscription form")
    public void closeTheNewsletterSubscriptionForm() {
        ReusableMethods.waitForVisibility(myWalletPage.newsletterSubscribeCloseButton,30);
        myWalletPage.newsletterSubscribeCloseButton.click();
    }

    @Then("Click on the login button")
    public void clickOnTheLoginButton() {
        myWalletPage.loginButton.click();
    }

    @Then("Pass in the credentials and click on the submit button")
    public void passInTheCredentialsAndClickOnTheSubmitButton() {
        myWalletPage.loginEmailBox.sendKeys("user006@trendlifebuy.com");
        myWalletPage.loginPasswordBox.sendKeys("Trendlife123");
        JavascriptExecutor jse=(JavascriptExecutor)Driver.getDriver();
        jse.executeScript("arguments[0].click();",myWalletPage.signInButton);
    }

    @And("Click on the dashboard button")
    public void clickOnTheDashboardButton() {
        myWalletPage.dashboardLink.click();
    }


    @Then("Hit the My wallet link")
    public void hitTheMyWalletLink() {
       ReusableMethods.jsClick(myWalletPage.myWalletLink);
    }

    @And("verify that the link leads to the My Wallet page")
    public void verifyThatTheLinkLeadsToTheMyWalletPage() {
        ReusableMethods.waitForVisibility(myWalletPage.myWalletHeader,30);
        Assert.assertTrue(myWalletPage.myWalletHeader.isDisplayed());
    }

    @And("Close the site")
    public void closeTheSite() {
        Driver.getDriver().quit();
    }

    @And("veify that the total balance running balance and Pending balance are visible")
    public void veifyThatTheTotalBalanceRunningBalanceAndPendingBalanceAreVisible() {
        ReusableMethods.scrollDownByPixel(200);
        List<WebElement> elements=new ArrayList<WebElement>();
        elements.add(myWalletPage.totalBalance);
        elements.add(myWalletPage.pendingBalance);
        elements.add(myWalletPage.runningBalance);
        elements.forEach(n->Assert.assertTrue(n.isDisplayed()));



    }

    @And("verify that Recharge wallet button is visible and leads to the Recharge Amount window")
    public void verifyThatRechargeWalletButtonIsVisibleAndLeadsToTheRechargeAmountWindow() {
        ReusableMethods.scrollDownByPixel(350);
        Assert.assertTrue(myWalletPage.rechargeWalletButton.isDisplayed());
        ReusableMethods.jsClick(myWalletPage.rechargeWalletButton);
        ReusableMethods.waitForVisibility(myWalletPage.rechargeAmountWindowHeader,30);
        Assert.assertTrue(myWalletPage.rechargeAmountWindowHeader.isDisplayed());
    }

    @And("Hit the Recharge Amount button")
    public void hitTheRechargeAmountButton() {
        ReusableMethods.scrollDownByPixel(350);
        ReusableMethods.jsClick(myWalletPage.rechargeWalletButton);
    }

    @Then("verify that there is a TextBox for recharging the amount and it is enabled")
    public void verifyThatThereIsATextBoxForRechargingTheAmountAndItIsEnabled() {
        ReusableMethods.waitForVisibility(myWalletPage.enterRechargeAmountBox,30);
        Assert.assertTrue(myWalletPage.enterRechargeAmountBox.isDisplayed());
        Assert.assertTrue(myWalletPage.enterRechargeAmountBox.isEnabled());
    }

    @Then("Verify that he Cancel button is visible and able to cancel the transaction.")
    public void verifyThatHeCancelButtonIsVisibleAndAbleToCancelTheTransaction() {
        ReusableMethods.waitForVisibility(myWalletPage.cancelButton,30);
        Assert.assertTrue(myWalletPage.cancelButton.isDisplayed());
        Assert.assertTrue(myWalletPage.cancelButton.isEnabled());

    }

    @Then("Verify that Add Fund button is visible and redirects to the relevant page.")
    public void verifyThatAddFundButtonIsVisibleAndRedirectsToTheRelevantPage() {
        ReusableMethods.waitForVisibility(myWalletPage.addFundButton,30);
        Assert.assertTrue(myWalletPage.addFundButton.isDisplayed());
        Assert.assertTrue(myWalletPage.addFundButton.isEnabled());
        myWalletPage.enterRechargeAmountBox.sendKeys("300");
        myWalletPage.addFundButton.click();
        ReusableMethods.waitForVisibility(myWalletPage.stripeImage,30);
        Assert.assertTrue(myWalletPage.stripeImage.isDisplayed());
    }

    @And("Verify  Date, Trx Id, Amount, Type, Payment Method, Status columns are visible")
    public void verifyDateTrxIdAmountTypePaymentMethodStatusColumnsAreVisible() {
        ReusableMethods.scrollDownByPixel(350);
        List<WebElement> dataTableHeaders = myWalletPage.rechargeHistoryDataTableHeaders;
        dataTableHeaders.forEach(element -> Assert.assertTrue(element.isDisplayed()));
    }

    @And("Verify that Wallet transactions are visible in the Wallet Recharge History list")
    public void verifyThatWalletTransactionsAreVisibleInTheWalletRechargeHistoryList() {
        ReusableMethods.scrollDownByPixel(350);
        List<WebElement> walletHistory = myWalletPage.walletsHistoryColumnData;
        walletHistory.forEach(element -> Assert.assertTrue(element.isDisplayed()));
    }
}
