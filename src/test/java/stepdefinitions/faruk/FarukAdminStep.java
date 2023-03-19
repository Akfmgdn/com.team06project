package stepdefinitions.faruk;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;


import org.testng.asserts.SoftAssert;

import pages.AdminDashboardPage;
import pages.AdminReportsPage;
import pages.MyAccountPage;
import pages.MyWalletPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.*;
import java.util.stream.Collectors;

public class FarukAdminStep {
    MyWalletPage myWalletPage = new MyWalletPage();
    AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    AdminReportsPage adminReportsPage=new AdminReportsPage();



    @Given("Go to Admin site")
    public void goToAdminSite() {
        Driver.getDriver().get("https://trendlifebuy.com/admin/login");
    }

    @Then("Pass in the admin credentials and click on the submit button")
    public void passInTheAdminCredentialsAndClickOnTheSubmitButton() {
        myWalletPage.loginEmailBox.sendKeys("admin006@trendlifebuy.com");
        myWalletPage.loginPasswordBox.sendKeys("Trendlife123");
        ReusableMethods.jsClick(myWalletPage.signInButton);

    }

    @And("Verify that {string} is visisble")
    public void verifyThatIsVisisble(String element) {
        SoftAssert softAssert = new SoftAssert();
        if (element.equals("chartList")) {
            adminDashboardPage.chartList.forEach(n -> softAssert.assertTrue(n.isDisplayed()));
            softAssert.assertAll();
        }
        if (element.equals("legendsUnderTheGraphs")) {
            adminDashboardPage.colorLegendList.forEach(n -> softAssert.assertTrue(n.isDisplayed()));
            adminDashboardPage.dataNameValueLegendList.forEach(n -> softAssert.assertTrue(n.isDisplayed()));
            softAssert.assertAll();
        }
        if (element.equals("cagetories mentioned above")) {
            List<String> mainTitles = adminDashboardPage.mainTitleListUnderGraphs.stream().map(WebElement::getText).
                    collect(Collectors.toList());
            String[] arr = {"Top 10 Product" , "New Customers" , "Recently Added Products" , "Top Refferers" ,
                    "Latest Order" , "Latest Search Keyword" , "Appealed Disputed" , "Top Customers" ,
                    "Recent Reviews" , "Product Reviews"};
            List<String> titleList = new ArrayList<>(Arrays.asList(arr));
            titleList.forEach(x -> Assert.assertTrue(mainTitles.contains(x)));
        }

        if (element.equals("Keyword search report")){
            Assert.assertTrue(adminReportsPage.keywordSearchReportTable.isDisplayed());
        }

        if (element.equals("Keyword")){
            Assert.assertTrue(adminReportsPage.keywordsHeader.isDisplayed());
        }
        if (element.equals("Number of time")){
            Assert.assertTrue(adminReportsPage.numberOfTimeHeader.isDisplayed());
        }
    }

    @And("hit the details button in the {string} and verify that they redirect to relevant pages")
    public void hitTheDetailsButtonInTheAndVerifyThatTheyRedirectToRelevantPages(String title) {

        if (title.equals("new customer")){
            adminDashboardPage.plusButtonInsideNewCustomerTable.click();
            ReusableMethods.waitForVisibility(adminDashboardPage.detailsButtonUnderThePlusButton,30);
            adminDashboardPage.detailsButtonUnderThePlusButton.click();

            String mainWindowHandle = Driver.getDriver().getWindowHandle();
            Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

            // Here we will check if child window has other child windows and will fetch the heading of the child window
            for (String ChildWindow : allWindowHandles) {
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                    Driver.getDriver().switchTo().window(ChildWindow);
                    Assert.assertTrue(adminDashboardPage.customerProfileHeader.isDisplayed());
                }

            }
        }
        if (title.equals("latest order")){
            adminDashboardPage.plusButtonInsideTheLatestOrder.click();

            ReusableMethods.waitForVisibility(adminDashboardPage.detailsButtonUnderTheLatestOrder, 30);
            adminDashboardPage.detailsButtonUnderTheLatestOrder.click();
            String mainWindowHandle = Driver.getDriver().getWindowHandle();
            Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

            // Here we will check if child window has other child windows and will fetch the heading of the child window
            for (String ChildWindow : allWindowHandles) {
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                    Driver.getDriver().switchTo().window(ChildWindow);
                }
            }
            Assert.assertEquals("https://trendlifebuy.com/ordermanage/sales-details/356" ,
                    Driver.getDriver().getCurrentUrl());
        }

    }

    @And("Hit the Admin reports link")
    public void hitTheAdminReportsLink() {
        adminReportsPage.adminReportsLink.click();


    }

    @Then("Hit the keywords search link")
    public void hitTheKeywordsSearchLink() {
        adminReportsPage.keywordsSearchLink.click();

    }

    @And("type the mostly searched keyword in Quick Search Textbox and hit enter")
    public void typeTheMostlySearchedKeywordInQuickSearchTextboxAndHitEnter() {
        adminReportsPage.quickSearchBox.sendKeys(adminReportsPage.firstKeywordInTheKeywordSearchTable.getText()
        ,Keys.ENTER);
    }

    @Then("Verify that all the relevant keywords are listed in the search report list")
    public void verifyThatAllTheRelevantKeywordsAreListedInTheSearchReportList() {
        List<String> keywordsSearchList = adminReportsPage.searchResultsTable.stream().map(WebElement::getText).
                collect(Collectors.toList());
        keywordsSearchList.forEach(each ->Assert.assertTrue(each.contains("No matching records found")));

        keywordsSearchList.forEach(each -> Assert.assertTrue(
                each.contains(adminReportsPage.firstKeywordInTheKeywordSearchTable.getText())));
    }

    @And("Click on the page {string} button at the very bottom of the table and verify that page is changed")
    public void clickOnThePageButtonAtTheVeryBottomOfTheTableAndVerifyThatPageIsChanged(String number) {
        String firstKeywordText=adminReportsPage.firstKeywordInTheKeywordSearchTable.getText();
        if (number.equals("2")){
            adminReportsPage.page2Button.click();
            ReusableMethods.bekle(4);
            String firstKeywordOnthePageTwo=adminReportsPage.firstKeywordOnTheSecondPage.getText();
            Assert.assertNotEquals(firstKeywordOnthePageTwo, firstKeywordText);
        }


    }

    @And("Verify that there is a maximum of ten keyword information on each page")
    public void verifyThatThereIsAMaximumOfTenKeywordInformationOnEachPage() {
        Assert.assertTrue(adminReportsPage.keywordList.size()<=10);// The first page is checked here on this line
        for (int i = 2; i <=5 ; i++) {//In this code block,the pages from 2 to 5 are checked
           WebElement pageNum= adminReportsPage.pageLocators(i);
           pageNum.click();
           ReusableMethods.bekle(3);
           Assert.assertTrue(adminReportsPage.keywordList.size()<=10);
        }

    }

    @After
    public void tearDown()  {
        Driver.quitDriver();
    }
}