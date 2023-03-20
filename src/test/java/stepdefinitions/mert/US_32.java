package stepdefinitions.mert;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdminDashboardPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_32 {

    AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
    @Then("Verify  Dashboard menu title in the Dashboard side bar.")
    public void verify_dashboard_menu_title_in_the_dashboard_side_bar() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminDashboardPage.dashboardText.isDisplayed());
    }

    @Then("Clicks on Dashboard and see goes the relevant page")
    public void clicksOnDashboardAndSeeGoesTheRelevantPage() {

        adminDashboardPage.dashboardTextLink.click();


        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.trendlifebuy.com/admin-dashboard";
        ReusableMethods.bekle(2);
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Then("Can visible User Manages category")
    public void canVisibleUserManagesCategory() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboardPage.userManagerText.isDisplayed());
    }

    @Then("Can visible Customer and Human Resource menu")
    public void canVisibleCustomerAndHumanResourceMenu() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboardPage.customerDropdownMenu.isDisplayed());
        Assert.assertTrue(adminDashboardPage.humanResourceDropdownMenu.isDisplayed());
    }

    @Then("Can visible Order Manages category")
    public void canVisibleOrderManagesCategory() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboardPage.orderManagesText.isDisplayed());
    }

    @Then("Can visible Order Manages dropdown menu")
    public void canVisibleOrderManagesDropdownMenu() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboardPage.orderManagesDropdownMenu.isDisplayed());
    }

    @Then("Can visible Product Manage category")
    public void canVisibleProductManageCategory() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboardPage.productManageText.isDisplayed());
    }

    @Then("Can visible Product Manage dropdown menu")
    public void canVisibleProductManageDropdownMenu() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboardPage.productsDropdownMenu.isDisplayed());
    }

    @Then("Can visible Promotional category")
    public void canVisiblePromotionalCategory() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboardPage.promotionalText.isDisplayed());
    }

    @Then("Can visible Marketing and Gift card pop-ups")
    public void canVisibleMarketingAndGiftCardPopUps() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboardPage.marketingDropdownMenu.isDisplayed());
        Assert.assertTrue(adminDashboardPage.giftCardDropdownMenu.isDisplayed());
    }

    @Then("Can visible Finance category")
    public void canVisibleFinanceCategory() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboardPage.financeText.isDisplayed());
    }

    @Then("Can visible Account pop-up")
    public void canVisibleAccountPopUp() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboardPage.accountDropdownMenu.isDisplayed());
    }

    @Then("Can visible Content category")
    public void canVisibleContentCategory() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboardPage.contentText.isDisplayed());
    }

    @Then("Can visible Admin Reports and Support Ticket pop-ups")
    public void canVisibleAdminReportsAndSupportTicketPopUps() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboardPage.adminReportsDropdownMenu.isDisplayed());
        Assert.assertTrue(adminDashboardPage.supportTicketDropdownMenu.isDisplayed());
    }
}
