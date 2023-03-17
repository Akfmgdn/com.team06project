package stepdefinitions.enver;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_23 {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    MyWalletPage myWalletPage = new MyWalletPage();
    UserSupportTicketPage userSupportTicketPage = new UserSupportTicketPage();

    @Given("Go to the website")
    public void go_to_the_website() {

        Driver.getDriver().get(ConfigReader.getProperty("enverUrlCostomer"));
        ReusableMethods.waitForVisibility(homePage.newsletterSubscribeCloseButton, 5);
        if (homePage.newsletterSubscribeCloseButton.isDisplayed()) {
            homePage.newsletterSubscribeCloseButton.click();
        }
    }

    @Given("Login to the site as a user")
    public void login_to_the_site_as_a_user() {

        loginPage.loginLinkText.click();
        loginPage.emailAdressBox.sendKeys(ConfigReader.getProperty("enveruseremail"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("enverpassword"));

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN);

        ReusableMethods.clickWithTimeOut(loginPage.signInButton, 3);


    }

    @Given("Click on the dashboard button and then click on the support ticket button")
    public void click_on_the_dashboard_button_and_then_click_on_the_support_ticket_button() {

        //userLoginPage.supportTicketButton.click();
        userSupportTicketPage.dashBoardButton.click();
        ReusableMethods.clickWithTimeOut(userSupportTicketPage.supportTicketButton, 2);
    }


    @Given("Test if support ticket page is visible")
    public void test_if_support_ticket_page_is_visible() {

        String expected = "https://qa.trendlifebuy.com/support-ticket";
        String actual = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(expected.contains(actual));


    }

    @Given("Test if Tickets are listed with the Ticket ID, Subject, Priority, Last Update information.")
    public void test_if_tickets_are_listed_with_the_ticket_id_subject_priority_last_update_information() {

        Assert.assertTrue(userSupportTicketPage.listed.get(0).isDisplayed());
        Assert.assertTrue(userSupportTicketPage.listed.get(1).isDisplayed());
        Assert.assertTrue(userSupportTicketPage.listed.get(2).isDisplayed());
        Assert.assertTrue(userSupportTicketPage.listed.get(3).isDisplayed());
        Assert.assertTrue(userSupportTicketPage.listed.get(4).isDisplayed());

        Driver.closeDriver();

    }


    @Given("Click on the View button")
    public void click_on_the_view_button() {
        userSupportTicketPage.viewButton.click();
        ReusableMethods.bekle(2);


    }










}