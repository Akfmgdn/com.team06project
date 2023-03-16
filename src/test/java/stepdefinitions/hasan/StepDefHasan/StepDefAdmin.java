
package stepdefinitions.hasan.StepDefHasan;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class StepDefAdmin {

    pages.AdminDashboardPage AdminDashboardPage = new AdminDashboardPage();
    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();

    String actualAramaSonucu;

    MyOrdersPage myOrdersPage = new MyOrdersPage();
    OrderDetailPage orderDetailPage = new OrderDetailPage();
    Actions action = new Actions(Driver.getDriver());


    @Given("qa.trendlifebuy.com\\/Admin\\/login anasayafaya gider")
    public void qaTrendlifebuyComAdminLoginAnasayafayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
    }

    @Then("Loginle email ve password yazilir")
    public void loginleEmailVePasswordYazilir() {
        ReusableMethods.bekle(10);
        loginPage.emailAdressBox.sendKeys("adminMailhasan");
        loginPage.passwordBox.sendKeys("emailsifre");
        action.sendKeys(Keys.PAGE_DOWN).perform();
        loginPage.signInButton.click();
    }


    @Then("Products menusune clikc yapar")
    public void products_menusune_clikc_yapar() {
        AdminDashboardPage.dashboardtextLink.click();
        action.sendKeys(Keys.PAGE_DOWN);
        AdminDashboardPage.productManageText.click();
    }

    @Then("Product List sayfasina erisir")
    public void product_list_sayfasina_erisir() {
        AdminDashboardPage.productsListLink.click();
        Assert.assertTrue(AdminDashboardPage.productsListLink.isDisplayed());

    }

    @Given("Product List, Alert List")
    public void productListAlertList() {
        AdminDashboardPage.productAlertListLink.click();
        Assert.assertTrue(AdminDashboardPage.productsListLink.isDisplayed());
    }


    @Then("productOutOfStockList click yapar")
    public void productoutofstocklistClickYapar() {
        AdminDashboardPage.productOutOfStockList.click();
        Assert.assertTrue(AdminDashboardPage.productOutOfStockList.isDisplayed());

    }


    @And("productDisabledList click yapar")
    public void productdisabledlistClickYapar() {
        AdminDashboardPage.productDisabledList.click();
        Assert.assertTrue(AdminDashboardPage.productDisabledList.isDisplayed());

    }

    @And("productBySkuList click yapar")
    public void productbyskulistClickYapar() {
        AdminDashboardPage.productBySkuList.click();
       Assert.assertTrue(AdminDashboardPage.productBySkuList.isDisplayed());

    }

    @And("gittigi sayfalar dogrulanir")
    public void gittigiSayfalarDogrulanir() {
        Assert.assertTrue(AdminDashboardPage.productsListLink.isDisplayed());
        Assert.assertTrue(AdminDashboardPage.productAlertListLink.isDisplayed());
        Assert.assertTrue(AdminDashboardPage.productOutOfStockList.isDisplayed());
        Assert.assertTrue(AdminDashboardPage.productDisabledList.isDisplayed());
        Assert.assertTrue(AdminDashboardPage.productBySkuList.isDisplayed());


    }

}







