
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

public class StepDefLogin {

    AdminDashboardPage AdminDashboardPage = new AdminDashboardPage();
    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();

    String actualAramaSonucu;

    MyOrdersPage myOrdersPage = new MyOrdersPage();
    OrderDetailPage orderDetailPage = new OrderDetailPage();
    Actions action = new Actions(Driver.getDriver());


    @Given("trendlifebuy anasayfaya gider")
    public void trendlifebuy_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("https://qa.trendlifebuy.com/login"));
    }

    @Then("Loginle email ve password yazar")
    public void loginleEmailVePasswordYazar() throws InterruptedException {
        Thread.sleep(3);
        loginPage.emailAdressBox.sendKeys("hasanemail");
        loginPage.passwordBox.sendKeys("emailsifre");
        action.sendKeys(Keys.PAGE_DOWN).perform();
        loginPage.signInButton.click();
    }


    @Then("dashboard linkine click yapar")
    public void dashboardLinkineClickYapar() {
        AdminDashboardPage.dashboardText.click();

    }

    @And("Purchase History click yapar")
    public void purchaseHistoryClickYapar() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        AdminDashboardPage.purchase.click();

    }

    @And("All history secenekleri dogrulanir")
    public void allHistorySecenekleriDogrulanir() {
        AdminDashboardPage.allHistory.click();
        AdminDashboardPage.allHistory.isSelected();
        Assert.assertTrue(AdminDashboardPage.allHistory.isDisplayed());
    }


    @Given("All historiye click yapar")
    public void allHistoriyeClickYapar() {
        AdminDashboardPage.allHistory.click();

    }

    @Then("secenekler filtre yapilip test edilir")
    public void seceneklerFiltreYapilipTestEdilir() {
        AdminDashboardPage.allHistory.isDisplayed();

    }
    ///*** US_016-- TC001--***

    @Given("my order click yapar")
    public void myOrderClickYapar() throws InterruptedException {
        Thread.sleep(5);
        AdminDashboardPage.myOrderLink.click();

    }

    @Then("anasayfaya gelir")
    public void anasayfayaGelir() {
        homePage.myOrderLink.click();
        Assert.assertTrue(homePage.myOrderLink.isDisplayed());


    }
    // *** US_017-- TC001-- ***

    @Given("my order sayfasina cilick yapar")
    public void myOrderSayfasinaCilickYapar() throws InterruptedException {
        Thread.sleep(5);
        AdminDashboardPage.myProfileLink.click();

    }

    @Then("my order listesindeki urunleri filtreler")
    public void myOrderListesindekiUrunleriFiltreler() throws InterruptedException {
        Thread.sleep(10);
        action.scrollByAmount(0, 250).perform();
        myOrdersPage.butonAll.click();
        Thread.sleep(10);
        myOrdersPage.butonToPay.click();
        Thread.sleep(10);
        myOrdersPage.butonToShip.click();
        Thread.sleep(10);
        myOrdersPage.butonToReceive.click();
        Thread.sleep(10);
        Assert.assertTrue(AdminDashboardPage.myOrderLink.isSelected());

    }

    @Given("My order sayfasina click yapar")
    public void myOrderSayfasinaClickYapar() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        AdminDashboardPage.myOrderLink.click();
    }

    @Then("urun bilgilerinin gorundugunu dogrular")
    public void urun_bilgilerinin_gorundugunu_dogrular() throws InterruptedException {
        Thread.sleep(10);
        AdminDashboardPage.orderManagesDropdownMenu.click();
        Thread.sleep(10);
        Assert.assertTrue(AdminDashboardPage.orderManagesDropdownMenu.isDisplayed());
    }

    @Given("urun adetlerinin kac adet oldugu gurulur")
    public void urun_adetlerinin_kac_adet_oldugu_gurulur() throws InterruptedException {
        ReusableMethods.bekle(10);
        AdminDashboardPage.lastOrderDropDown.click();
        ReusableMethods.bekle(10);
        AdminDashboardPage.lastOrderDropDownLast10.click();
        ReusableMethods.bekle(10);
        AdminDashboardPage.lastOrderDropDownLast20.click();
        ReusableMethods.bekle(10);
        AdminDashboardPage.lastOrderDropDownLast40.click();
        Thread.sleep(10);


    }

    @Then("her urunu secer dogrulamasini yapar")
    public void her_urunu_secer_dogrulamasini_yapar() throws InterruptedException {
        Thread.sleep(10);
        Assert.assertTrue(AdminDashboardPage.dropDownLastSelected.isDisplayed());
        Driver.getDriver().quit();

    }

    @Given("qa.trendlifebuy.com anasayafaya gider")
    public void qa_trendlifebuy_com_anasayafaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("https://qa.trendlifebuy.com/admin-dashboard"));
    }

    @Then("Loginle email ve password yazilir")
    public void loginleEmailVePasswordYazilir() {
        ReusableMethods.bekle(10);
        loginPage.emailAdressBox.sendKeys("admin048@trendlifebuy.com");
        loginPage.passwordBox.sendKeys("Trendlife123");
        action.sendKeys(Keys.PAGE_DOWN).perform();
        loginPage.signInButton.click();
    }


    @Then("Products menusune clikc yapar")
    public void products_menusune_clikc_yapar() {
        action.sendKeys(Keys.PAGE_DOWN);
        AdminDashboardPage.DashboardAdmin.click();
        AdminDashboardPage.productManageText.click();
    }




    }
































































