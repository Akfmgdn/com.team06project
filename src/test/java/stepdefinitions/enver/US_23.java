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

    @Given("Test if tickets data are visible")
    public void test_if_tickets_data_are_visible() {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(userSupportTicketPage.ticketsData.isDisplayed());

    }


    @Given("Test if Status, Priority, Category information is displayed")
    public void test_if_status_priority_category_information_is_displayed() {

        Actions actions= new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        userSupportTicketPage.statusPriorityCategory.isDisplayed();
    }

    @Given("Test if the response returned to the Ticket opened on the Show page is displayed")
    public void test_if_the_response_returned_to_the_ticket_opened_on_the_show_page_is_displayed() {

        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",userSupportTicketPage.returnTickets);
        Assert.assertTrue(userSupportTicketPage.returnTickets.isDisplayed());
    }
    @Given("Click on the Reply button")
    public void click_on_the_reply_button() {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        userSupportTicketPage.replyButton.click();
    }
    @Given("Fill in the descriptions")
    public void fill_in_the_descriptions() {

        userSupportTicketPage.description.sendKeys("selamdostlar");
    }

    @Given("Click on the Reply Now button and Test if answered with the Reply button on the Show page.")
    public void click_on_the_reply_now_button_and_test_if_answered_with_the_reply_button_on_the_show_page() {
    }
    @Given("Test if tickets are filtered.")
    public void test_if_tickets_are_filtered() {
       userSupportTicketPage.allTickets.click();
        ReusableMethods.bekle(2);
        userSupportTicketPage.pendings.click();
        ReusableMethods.bekle(2);
        userSupportTicketPage.allTickets.click();
        ReusableMethods.bekle(2);
        userSupportTicketPage.onGoing.click();

    }
    @Given("Click on the Add New Button")
    public void click_on_the_add_new_button() {

        userSupportTicketPage.addNewButton.click();
    }

    @Given("Test if Create new ticket page is accessed with the Add New button.")
    public void test_if_create_new_ticket_page_is_accessed_with_the_add_new_button() {

        Assert.assertTrue(userSupportTicketPage.createNewTicketsText.isDisplayed());
    }
    @Given("Test if entering  {string}, Category, Priority and {string},")
    public void test_if_entering_and(String Glass, String cantBuy) {

        userSupportTicketPage.subjectBox.sendKeys(Glass);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        userSupportTicketPage.categoryBox.click();
        ReusableMethods.bekle(2);
        userSupportTicketPage.search.sendKeys("Technical");
        ReusableMethods.bekle(1);
        userSupportTicketPage.techinal.click();
        ReusableMethods.bekle(1);
        userSupportTicketPage.priorityBox.click();
        ReusableMethods.bekle(2);
        userSupportTicketPage.prioritysearch.sendKeys("High");
        ReusableMethods.bekle(1);
        userSupportTicketPage.high.click();
        userSupportTicketPage.descriptionBox.sendKeys(cantBuy);
        userSupportTicketPage.creatNowButton.click();
    }






    @Given("Test if new ticket is opened with the Create new button.")
    public void test_if_new_ticket_is_opened_with_the_create_new_button() {

        userSupportTicketPage.creatNowButton.click();

    }



}