package stepdefinitions.akif;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import pages.AdminDashboardPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_030_stepdefinitions {
    AdminDashboardPage adminDashboardPage=new AdminDashboardPage();

    @Given("admin goes to homepage")
    public void admin_goes_to_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("akifAdminUrl"));
    }
    @Given("Enter valid Admin Email address")
    public void enter_valid_admin_email_address() {
        adminDashboardPage.adminEmailBox.sendKeys(ConfigReader.getProperty("akifAdminEmail"));
    }
    @Given("Enter valid Admin password")
    public void enter_valid_admin_password() {
        adminDashboardPage.adminPasswordBox.sendKeys(ConfigReader.getProperty("akifAdminPassword"));
    }
    @Given("clicks the sign in button")
    public void clicks_the_sign_in_button() {
        adminDashboardPage.adminSignInButton.click();
    }
    @Given("Clicks on the Notifications icon")
    public void clicks_on_the_notifications_icon() {
        ReusableMethods.bekle(7);
       adminDashboardPage.adminNotificationsIcon.click();

    }
    @Given("It tests that the Notifications text is visible in the window that opens when the Notifications icon is clicked.")
    public void it_tests_that_the_notifications_text_is_visible_in_the_window_that_opens_when_the_notifications_icon_is_clicked() {
        Assert.assertTrue(adminDashboardPage.adminNotificationBody.isDisplayed());

    }


    @And("Clicks the Notifications Setting button")
    public void clicksTheNotificationsSettingButton() {
        adminDashboardPage.adminNotificationSettingbutton.click();

    }

    @And("When the Notifications icon is clicked, it is tested that it redirects to the user-notification page when the Setting button is clicked in the window that opens.")
    public void whenTheNotificationsIconIsClickedItIsTestedThatItRedirectsToTheUserNotificationPageWhenTheSettingButtonIsClickedInTheWindowThatOpens() {
        Assert.assertTrue(adminDashboardPage.adminPersonaNotificationSettingText.isDisplayed());

    }

    @And("It is tested that the information message type active passive can be changed in the Personal Notification Setting List on the User-Notification page.")
    public void itIsTestedThatTheInformationMessageTypeActivePassiveCanBeChangedInThePersonalNotificationSettingListOnTheUserNotificationPage() {
        adminDashboardPage.adminPersonaNotificationSettingType.click();
        Assert.assertTrue(adminDashboardPage.adminPersonaNotificationSettingTypeActifed.isDisplayed());

    }

    @And("Clicks the Read All button")
    public void clicksTheReadAllButton() {
        //Burada bug var Read All butonu görünmüyor manuel olarak test ederken bir kere gördüğüme eminim
        Assert.assertTrue(false);
    }

    @And("It is tested that the information messages \\(as read) are deleted from the window when the Read All button is clicked on the menu that opens when the Notifications icon is clicked.")
    public void itIsTestedThatTheInformationMessagesAsReadAreDeletedFromTheWindowWhenTheReadAllButtonIsClickedOnTheMenuThatOpensWhenTheNotificationsIconIsClicked() {
        //TC_04 Bug devam sitep
    }

    @And("Clicks the view button")
    public void clicksTheViewButton() {
        //Burada bug var view butonu görünmüyor manuel olarak test ederken bir kere gördüğüme eminim
        Assert.assertTrue(false);
    }

    @And("When the Notifications icon is clicked, it is tested that it redirects to the relevant page when the View button is clicked in the menu that opens.")
    public void whenTheNotificationsIconIsClickedItIsTestedThatItRedirectsToTheRelevantPageWhenTheViewButtonIsClickedInTheMenuThatOpens() {
        //TC_05 Bug devam sitep
    }
}
