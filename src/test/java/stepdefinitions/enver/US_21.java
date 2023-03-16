package stepdefinitions.enver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyWalletPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_21 {
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    CartPage cartPage = new CartPage();
    MyWalletPage myWalletPage = new MyWalletPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("Go to  main site")
    public void goToMainSite() {Driver.getDriver().get("https://qa.trendlifebuy.com/");}


    @And("Close newsletter subscription form")
    public void closeNewsletterSubscriptionForm() {
        ReusableMethods.waitForVisibility(myWalletPage.newsletterSubscribeCloseButton,30);
        myWalletPage.newsletterSubscribeCloseButton.click();

    }

    @Then("Click on  login button")
    public void clickOnLoginButton() {myWalletPage.loginButton.click();}

    @Then("Pass in the credentials and click on submit button")
    public void passInTheCredentialsAndClickOnSubmitButton() {myWalletPage.loginEmailBox.sendKeys("user133@trendlifebuy.com");
        myWalletPage.loginPasswordBox.sendKeys("Trendlife114");
        JavascriptExecutor jse=(JavascriptExecutor)Driver.getDriver();
        jse.executeScript("arguments[0].click();",myWalletPage.signInButton);

    }

    @And("Click the dashboard button")
    public void clickTheDashboardButton() {myWalletPage.dashboardLink.click();}
}

