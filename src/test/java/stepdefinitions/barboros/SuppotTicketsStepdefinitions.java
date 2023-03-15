package stepdefinitions.barboros;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
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
            ReusableMethods.bekle(1);
            ReusableMethods.jsClick(ticket.selectDropdown);
            ReusableMethods.bekle(1);
            ticket.showLink.click();
            Assert.assertTrue(ticket.ticketInfoTitle.isDisplayed());
        } catch (Exception e) {
            ReusableMethods.bekle(1);
            ReusableMethods.jsClick(ticket.selectDropdown);
            ReusableMethods.bekle(1);
            ReusableMethods.jsClick(ticket.showLink);
            Assert.assertTrue(ticket.ticketInfoTitle.isDisplayed());
        }
    }

    @Given("verify that it can be sent as an answer after additional files are added to the ticket and its status is changed.")
    public void verify_that_it_can_be_sent_as_an_answer_after_additional_files_are_added_to_the_ticket_and_its_status_is_changed() {

        ReusableMethods.bekle(1);
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

    @Given("go to support ticket page and select edit link")
    public void go_to_support_ticket_page_and_select_edit_link() {

        ReusableMethods.jsClick(ticket.mainSupportTicketLink);
        ReusableMethods.jsClick(ticket.subSupportTicketLink);
        ReusableMethods.waitForPageToLoad(3);

        try {
            ticket.plussign.click();
            ReusableMethods.bekle(1);
            ReusableMethods.jsClick(ticket.selectDropdown);
            ReusableMethods.bekle(1);
            ticket.editLink.click();

        } catch (Exception e) {
            ReusableMethods.bekle(1);
            ReusableMethods.jsClick(ticket.selectDropdown);
            ReusableMethods.bekle(1);
            ReusableMethods.jsClick(ticket.editLink);
        }
    }
    @Given("verify that new category is added")
    public void verify_that_new_category_is_added() {

       ReusableMethods.bekle(1);
       ticket.adNewCategoryLink.click();
       long num = Faker.instance().number().randomNumber();
       ticket.textCategoryBox.sendKeys("new category"+num);
       ticket.saveButtonNewCategory.click();
       ReusableMethods.bekle(1);
       ticket.categoryListDropdown.click();
       ReusableMethods.bekle(1);
       List<WebElement> categories= ticket.listofCategory;
       int count=0;
        for (WebElement each:categories) {

            if (each.getText().contains("new category"+num)){
                count++;
            }
            Assert.assertTrue(count>0);
        }
        ReusableMethods.jsClick(ticket.categoryInstallation);
    }

    @Given("verify that new priority is added")
    public void verify_that_new_priority_is_added() {

        ReusableMethods.bekle(1);
        ticket.addNewPriorityLink.click();
        long num = Faker.instance().number().randomNumber();
        ticket.textPriorityBox.sendKeys("new priority"+num);
        ticket.saveButtonPriority.click();
        ReusableMethods.bekle(1);
        ticket.priorityListDropdown.click();
        ReusableMethods.bekle(1);
        List<WebElement> categories= ticket.listOfPriority;
        int count=0;
        for (WebElement each:categories) {

            if (each.getText().contains("new priority"+num)){
                count++;
            }
            Assert.assertTrue(count>0);
        }
        ReusableMethods.jsClick(ticket.priorityHigh);
    }

    @Given("verify that new status is added")
    public void verify_that_new_status_is_added() {

        ReusableMethods.bekle(1);
        ticket.addNewstatusLink.click();
        long num = Faker.instance().number().randomNumber();
        ticket.textStatusBox.sendKeys("new status"+num);
        ticket.saveButtonStatus.click();
        ReusableMethods.bekle(1);
        ticket.StatusListDropdown.click();
        ReusableMethods.bekle(1);
        List<WebElement> categories= ticket.listOfStatus;
        int count=0;
        for (WebElement each:categories) {

            if (each.getText().contains("new status"+num)){
                count++;
            }
            Assert.assertTrue(count>0);
        }
        ReusableMethods.jsClick(ticket.statusPending);
    }

    @Given("verify that new browser is added")
    public void verify_that_new_browser_is_added() {

        ReusableMethods.bekle(1);
        ReusableMethods.jsClick(ticket.addBrowserButton);
        ReusableMethods.bekle(1);
        Assert.assertTrue(ticket.secondBrowserButton.isDisplayed());
        ReusableMethods.jsClick(ticket.deleteButton);
        ReusableMethods.bekle(1);
        try {
            ticket.secondBrowserButton.click();
        } catch (Exception e) {

            Assert.assertTrue(true);
        }
        ReusableMethods.bekle(1);
        ticket.updateTicketUploadFileBrowser.sendKeys(ConfigReader.getProperty("dosyayolu"));
        ReusableMethods.jsClick(ticket.updateTicketButton);
        ReusableMethods.waitForPageToLoad(3);

        try {
            ticket.plussign.click();
            ReusableMethods.bekle(1);
            ReusableMethods.jsClick(ticket.selectDropdown);
            ReusableMethods.bekle(1);
            ticket.showLink.click();
        } catch (Exception e) {
            ReusableMethods.bekle(1);
            ReusableMethods.jsClick(ticket.selectDropdown);
            ReusableMethods.bekle(1);
            ReusableMethods.jsClick(ticket.showLink);
        }
        Assert.assertTrue(ticket.loadedFile.getText().contains("screen"));
    }

    @Given("verify that delete action is worked")
    public void verify_that_delete_action_is_worked() {

        ReusableMethods.jsClick(ticket.mainSupportTicketLink);
        ReusableMethods.jsClick(ticket.subSupportTicketLink);
        ReusableMethods.waitForPageToLoad(3);

        String firstTicketName=ticket.firstTicket.getText();

        try {
            ticket.plussign.click();
            ReusableMethods.bekle(1);
            ReusableMethods.jsClick(ticket.selectDropdown);
            ReusableMethods.bekle(1);
            ReusableMethods.jsClick(ticket.deleteLink);

        } catch (Exception e) {
            ReusableMethods.bekle(1);
            ReusableMethods.jsClick(ticket.selectDropdown);
            ReusableMethods.bekle(1);
            ReusableMethods.jsClick(ticket.deleteLink);
            ReusableMethods.jsClick(ticket.deleteLink);
        }

        ReusableMethods.bekle(3);
        Assert.assertTrue(!ticket.firstTicket.getText().equals(firstTicketName));
    }

}
