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
        Driver.quitDriver();
    }
}
