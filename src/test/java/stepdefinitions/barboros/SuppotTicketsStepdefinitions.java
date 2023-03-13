package stepdefinitions.barboros;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
import pages.SupportTicketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class SuppotTicketsStepdefinitions {

    LoginPage login = new LoginPage();
    SupportTicketPage ticket = new SupportTicketPage();


    @Given("Login as an admin and go to support ticket page")
    public void login_as_an_admin_and_go_to_support_ticket_page() {
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        login.emailAdressBox.sendKeys(ConfigReader.getProperty("unameBrnA"));
        login.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        ticket.signInButton.click();
        ReusableMethods.jsClick(ticket.mainSupportTicketLink);
        ReusableMethods.jsClick(ticket.subSupportTicketLink);
    }

    @Given("go to Actions and select show link and verify that the page with the relevant ticket information is displayed")
    public void go_to_actions_and_select_show_link_and_verify_that_the_page_with_the_relevant_ticket_information_is_displayed() {
        ReusableMethods.waitForPageToLoad(3);

        try {
            ticket.plussign.click();
            ReusableMethods.bekle(2);
            ReusableMethods.jsClick(ticket.selectDropdown);
            ReusableMethods.bekle(3);
            //ReusableMethods.jsClick(ticket.showLink);
            ticket.showLink.click();
            Assert.assertTrue(ticket.ticketInfoTitle.isDisplayed());
        } catch (Exception e) {
            ReusableMethods.bekle(2);
            ReusableMethods.jsClick(ticket.selectDropdown);
            ReusableMethods.bekle(3);
            ReusableMethods.jsClick(ticket.showLink);
            Assert.assertTrue(ticket.ticketInfoTitle.isDisplayed());
        }
    }

    @Given("verify that it can be sent as an answer after additional files are added to the ticket and its status is changed.")
    public void verify_that_it_can_be_sent_as_an_answer_after_additional_files_are_added_to_the_ticket_and_its_status_is_changed() {

        Driver.getDriver().get("https://qa.trendlifebuy.com/admin/ticket/tickets/50");
        ReusableMethods.bekle(2);
        String message="brnbrnx";
        ticket.noteTextBox.sendKeys(message);
        ticket.attachFileUploader.sendKeys(ConfigReader.getProperty("dosyayolu"));
        String text = ticket.statusCurrent.getText();
        ReusableMethods.jsClick(ticket.selectMenu);
        ReusableMethods.jsClick(ticket.option3Select);
        if (text.equals(ticket.statusCurrent.getText())) {
            ReusableMethods.jsClick(ticket.selectMenu);
            ReusableMethods.jsClick(ticket.option4Select);
        }
        ReusableMethods.jsClick(ticket.replyTicketButton);
        List<WebElement> messages=ticket.writtenMessages;

        int count=0;
        for (WebElement each: messages) {
            if (each.getText().equals(message)){
                count++;
            }
        }
        Assert.assertTrue(count>0);
        count = 0;
        List<WebElement> attachNames=ticket.attachFileNames;
        for (WebElement each: attachNames) {
            if (each.getText().contains("screenpict")){
                count++;
            }
        }

        Assert.assertTrue(count>0);

    }

}
