package stepdefinitions.akif;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import jdk.jfr.consumer.RecordedMethod;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboardPage;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class US_029_stepdefinitions {

    AdminDashboardPage adminDashboardPage=new AdminDashboardPage();
    HomePage homePage=new HomePage();
    SoftAssert softAssert=new SoftAssert();
    HomePage home=new HomePage();

    @Given("Tests the admin page")
    public void tests_the_admin_page() {
        softAssert.assertTrue(adminDashboardPage.adminEmailBox.isDisplayed());
    }


    @And("Tests login to admin Dashboard page when valid admin Username and valid admin Password are entered.")
    public void testsLoginToAdminDashboardPageWhenValidAdminUsernameAndValidAdminPasswordAreEntered() {
        softAssert.assertTrue(adminDashboardPage.dashboardText.isDisplayed());
    }

    @And("It is tested that the Search TextBox is visible at the top of the Dashboard page and that it is possible to search within the site using the Search TextBox.")
    public void itIsTestedThatTheSearchTextBoxIsVisibleAtTheTopOfTheDashboardPageAndThatItIsPossibleToSearchWithinTheSiteUsingTheSearchTextBox() {
        softAssert.assertTrue(adminDashboardPage.adminDashboardSearchBox.isDisplayed());
        adminDashboardPage.adminDashboardSearchBox.sendKeys("support" + Keys.ENTER);
        softAssert.assertFalse(adminDashboardPage.adminDashboardSummaryText.isDisplayed());
        //Burada bug var arama kutusu düzgün çalışmıyor support yazılıp aratıldı ama arama yapmadı
    }

    @And("It is tested that the Dashboard Side Bar narrows and expands when the menu icon is clicked on the Dashboard home page.")
    public void itIsTestedThatTheDashboardSideBarNarrowsAndExpandsWhenTheMenuIconIsClickedOnTheDashboardHomePage() {
        adminDashboardPage.adminDashboardMenuIcon.click();
        softAssert.assertFalse(adminDashboardPage.adminDashboardLink.isDisplayed());
        adminDashboardPage.adminNotificationsIcon.click();
        softAssert.assertTrue(adminDashboardPage.adminDashboardLink.isDisplayed());

    }

    @And("When clicking on the Website bot on the Dashboard home page, it is tested that the site redirects to the user interface.")
    public void whenClickingOnTheWebsiteBotOnTheDashboardHomePageItIsTestedThatTheSiteRedirectsToTheUserInterface() {
        String winHandleStr= Driver.getDriver().getWindowHandle();
        adminDashboardPage.adminDashboardWebSiteLink.click();
        Set<String> wHDSet=Driver.getDriver().getWindowHandles();
        String ikinciWHD="";
        for (String each:wHDSet
             ) {
            if (!each.equals(winHandleStr)){
                ikinciWHD=each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciWHD);
        ReusableMethods.bekle(10);
        try {
            home.newsletterSubscribeCloseButton.click();
        } catch (Exception e) {
        }

        softAssert.assertTrue(homePage.dashboardLink.isDisplayed());


    }

    @And("When the Today, This Week, This Mounth and This Year buttons on the Dashboard main page are clicked, it is tested that the data on the Summary Board changes according to the selected value.")
    public void whenTheTodayThisWeekThisMounthAndThisYearButtonsOnTheDashboardMainPageAreClickedItIsTestedThatTheDataOnTheSummaryBoardChangesAccordingToTheSelectedValue() {
        String visitorText=adminDashboardPage.adminDashboarvisitorText.getText();
        adminDashboardPage.adminDashboardTodaybutton.click();
        String todayVisitorText=adminDashboardPage.adminDashboarvisitorText.getText();
        softAssert.assertTrue(visitorText.equals(todayVisitorText));
        adminDashboardPage.adminDashboardThisWeekbutton.click();
        String weekVisitorText=adminDashboardPage.adminDashboarvisitorText.getText();
        softAssert.assertFalse(visitorText.equals(weekVisitorText));
        adminDashboardPage.adminDashboardThisMonthbutton.click();
        String monthVisitorText=adminDashboardPage.adminDashboarvisitorText.getText();
        softAssert.assertFalse(visitorText.equals(monthVisitorText));
        adminDashboardPage.adminDashboardThisYearbutton.click();
        String yearVisitorText=adminDashboardPage.adminDashboarvisitorText.getText();
        softAssert.assertFalse(visitorText.equals(yearVisitorText));




    }

    @And("It is tested that when the Visitor, Total Order, Total Pending Order, Total Completed Order, Active Customer, Total Subscriber buttons are clicked, they redirect to the relevant pages.")
    public void itIsTestedThatWhenTheVisitorTotalOrderTotalPendingOrderTotalCompletedOrderActiveCustomerTotalSubscriberButtonsAreClickedTheyRedirectToTheRelevantPages() {

        List<WebElement> visitorButtonsList=adminDashboardPage.adminDashboardVisitorbuttons;
        List<String> hepsiList=new ArrayList<>();
        int sayac=0;
        boolean x=false;
        String[] hepsiArr={"Visitor",
                "TotalOrder",
                "TotalPendingOrder",
                "TotalCompletedOrder",
                "TotalSale",
                "TotalReview",
                "TodayRevenue",
                "ActiveCustomer",
                "TotalSubscriber"};
        for (WebElement each:visitorButtonsList
             ) {
            String sayilarStr=each.getText();
            String temizStr=sayilarStr.replaceAll("[^a-zA-Z]", "");
            hepsiList.add(temizStr);
            System.out.println(temizStr);
        }
        for (int i = 0; i < hepsiArr.length; i++) {
            if (hepsiList.contains(hepsiArr[i])){
                sayac++;
            }
        }
        if (sayac==9){
            x=true;
        }
        softAssert.assertTrue(x);

    }
}
/*
{"Visitor",
"TotalOrder",
"TotalPendingOrder",
"TotalCompletedOrder",
"TotalSale",
"TotalReview",
"TodayRevenue",
"ActiveCustomer",
"TotalSubscriber"}
 */