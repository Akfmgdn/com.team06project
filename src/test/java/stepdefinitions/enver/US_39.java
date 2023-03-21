package stepdefinitions.enver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AdminDashboardPage;
import pages.AdminReportsPage;
import pages.LoginPage;
import pages.MyWalletPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_39 {
    MyWalletPage myWalletPage = new MyWalletPage();
    AdminReportsPage adminReportsPage = new AdminReportsPage();






    @Then("Enter login and click sign in button")
    public void enterLoginAndClickSignInButton() {
            myWalletPage.loginEmailBox.sendKeys("admin114@trendlifebuy.com");
            myWalletPage.loginPasswordBox.sendKeys("Trendlife123");
            ReusableMethods.jsClick(myWalletPage.signInButton);

        }

    @And("Click the Admin Reports")
    public void clickTheAdminReports() {adminReportsPage.adminReportsLink.click();
    }

    @And("Click the Visitor")
    public void clickTheVisitor() {
        adminReportsPage.Visitor.click();

    }

    @And("Verify the Visitor Report List is visible")
    public void verifyTheVisitorReportListIsVisible() {
        adminReportsPage.VisitorReportPage.isDisplayed();

    }

    @And("Verify that it is possible to search the Visitor Report list with Quick Search TextBOx")
    public void verifyThatItIsPossibleToSearchTheVisitorReportListWithQuickSearchTextBOx() {

        adminReportsPage.VisitorSearchBox.sendKeys("Windows 10"+ Keys.ENTER);

        Assert.assertTrue(adminReportsPage.Windows10.isDisplayed());
    }

    @And("Verify the IP, Agent, Device, Location, Date information is visible")
    public void verifyTheIPAgentDeviceLocationDateInformationIsVisible() {


        Assert.assertTrue(adminReportsPage.IP.isDisplayed());
        Assert.assertTrue(adminReportsPage.Agent.isDisplayed());
        Assert.assertTrue(adminReportsPage.Device.isDisplayed());
        Assert.assertTrue(adminReportsPage.Location.isDisplayed());
        Assert.assertTrue(adminReportsPage.Datee.isDisplayed());
    }

    @And("Verify the Page has Change")
    public void verifyThePageHasChange() {
        adminReportsPage.NumberOfPage.click();

        Assert.assertTrue(adminReportsPage.NumberonList2.isDisplayed());

    }

    @And("Verify the First visitor Page")
    public void verifyTheFirstVisitorPage() {

        String actuala=adminReportsPage.EntryNumber3.getText();
        System.out.println(actuala);
        String expecteda="to 10";

        Assert.assertTrue(actuala.contains(expecteda));

    }

    @And("Click the Visitor Second Page")
    public void clickTheVisitorSecondPage() {adminReportsPage.VisitorPage2.click();

    }

    @And("Verify the there is a maximum of {int} keyword information on each Visitor page")
    public void verifyTheThereIsAMaximumOfKeywordInformationOnEachVisitorPage(int arg0) {
        String actualy=adminReportsPage.EntryNumber4.getText();
        String expectedy="to 20";
        Assert.assertTrue(actualy.contains(expectedy));
    }

}