package stepdefinitions.faruk;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pages.AdminDashboardPage;
import pages.MyAccountPage;
import pages.MyWalletPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FarukAdminStep {
    MyWalletPage myWalletPage = new MyWalletPage();
    AdminDashboardPage adminDashboardPage=new AdminDashboardPage();
    MyAccountPage myAccountPage = new MyAccountPage();
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
        SoftAssert softAssert =new SoftAssert();
        if (element.equals("chartList")) {
            adminDashboardPage.chartList.forEach(n -> softAssert.assertTrue(n.isDisplayed()));
            softAssert.assertAll();
        }
        if (element.equals("legendsUnderTheGraphs")){
            adminDashboardPage.colorLegendList.forEach(n -> softAssert.assertTrue(n.isDisplayed()));
            adminDashboardPage.dataNameValueLegendList.forEach(n -> softAssert.assertTrue(n.isDisplayed()));
            softAssert.assertAll();
        }
        if (element.equals("cagetories mentioned above")){
            List<String> mainTitles = adminDashboardPage.mainTitleListUnderGraphs.stream().map(WebElement::getText).
                    collect(Collectors.toList());
            String[] arr={"Top 10 Product", "New Customers", "Recently Added Products", "Top Refferers",
                    "Latest Order" , "Latest Search Keyword", "Appealed Disputed", "Top Customers",
                    "Recent Reviews", "Product Reviews"};
            List<String> titleList = new ArrayList<>(Arrays.asList(arr));
            titleList.forEach(x->Assert.assertTrue(mainTitles.contains(x)));
        }
    }
}
