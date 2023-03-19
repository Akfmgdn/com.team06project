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



}
