package stepdefinitions.enver;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.MyWalletPage;
import pages.SupportTicketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_23 {
HomePage homePage=new HomePage();
LoginPage loginPage=new LoginPage();
MyWalletPage myWalletPage=new MyWalletPage();
SupportTicketPage supportTicketPage=new SupportTicketPage();
    @Given("Go to the website")
    public void go_to_the_website() {

        Driver.getDriver().get(ConfigReader.getProperty("enverUrlCostomer"));
        ReusableMethods.waitForVisibility(homePage.newsletterSubscribeCloseButton, 5);
        if(homePage.newsletterSubscribeCloseButton.isDisplayed()) {
            homePage.newsletterSubscribeCloseButton.click();
        }
    }

    @Given("Login to the site as a user")
    public void login_to_the_site_as_a_user(){

       loginPage.loginLinkText.click();
        loginPage.emailAdressBox.sendKeys(ConfigReader.getProperty("enveruseremail"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("enverpassword"));

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN);

        ReusableMethods.clickWithTimeOut(loginPage.signInButton,3);



    }
    @Given("Click on the dashboard button and then click on the support ticket button")
    public void click_on_the_dashboard_button_and_then_click_on_the_support_ticket_button() {

        //userLoginPage.supportTicketButton.click();
    }


    @Given("Test if support ticket page is visible")
    public void test_if_support_ticket_page_is_visible() {

        String expected= "https://qa.trendlifebuy.com/support-ticket";
        String actual= Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(expected.contains(actual));


    }




}
