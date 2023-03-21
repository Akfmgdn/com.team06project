
package stepdefinitions.hasan;

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

    String orderId = "";
    String status = "";
    String orderDate = "";
    String orderAmount = "";


    @Given("trendlifebuy anasayfaya gider")
    public void trendlifebuy_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("UrlCostomer"));
    }

    @Given("login linkine click yapar")
    public void login_linkine_click_yapar() {
        homePage.loginLink.click();

    }
    @Then("Email adresbox")
    public void email_adresbox() {
        loginPage.emailAdressBox.sendKeys("user048@trendlifebuy.com");

    }
    @Then("e mail password yazar")
    public void e_mail_password_yazar() {
        loginPage.passwordBox.sendKeys("Trendlife123");

    }
    @Then("login butonuna click yapar")
    public void login_butonuna_click_yapar() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
       loginPage.signInButton.click();

    }


    @Then("Dasboard sayfasinana click yapar")
    public void dasboard_sayfasinana_click_yapar() {
        ReusableMethods.bekle(10);
        AdminDashboardPage.dashboardText.click();

    }
    @Then("puschhase history click yapar")
    public void puschhase_history_click_yapar() {
        AdminDashboardPage.purchase.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
    }


    @Given("Purchase History filtreler")
    public void purchase_history_filtreler() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        AdminDashboardPage.allHistory.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        AdminDashboardPage.pendingOrders.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        AdminDashboardPage.confirmedOrders.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        AdminDashboardPage.refusedCancelledOrders.click();


    }
    @Then("All History acilir penceresinde seceneklerine gore filtrelendigi dogrulanir")
    public void all_history_acilir_penceresinde_seceneklerine_gore_filtrelendigi_dogrulanir() {
        Assert.assertTrue(AdminDashboardPage.purchase.isDisplayed());


    }

    @Given("siparis ozetleri goruntulenir")
    public void siparis_ozetleri_goruntulenir() {

    }
    @Then("siparis faturasinin indirilebildigi gorontulenir")
    public void siparis_faturasinin_indirilebildigi_gorontulenir() {



    }

    @Given("dasboard texte gidilir")
    public void dasboard_texte_gidilir() {
        AdminDashboardPage.dashboardText.click();
    }

    @Then("my order linkinin order sayfasina click yapar")
    public void my_order_linkinin_order_sayfasina_click_yapar() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        myOrdersPage.orderDate.click();

    }

    @Given("My Order sayfasinda My Order listesindeki urunler All,To Pay, To Ship, To Recieve butonlari yardimi ile filtreleme yapildigi dogrulanir")
    public void my_order_sayfasinda_my_order_listesindeki_urunler_all_to_pay_to_ship_to_recieve_butonlari_yardimi_ile_filtreleme_yapildigi_dogrulanir() {
        AdminDashboardPage.butonAll.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        AdminDashboardPage.butonToPay.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        AdminDashboardPage.butonToShip.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        AdminDashboardPage.butonAll.click();
    }
    @Then("All butonuna click yapar")
    public void all_butonuna_click_yapar() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        AdminDashboardPage.butonAll.click();


    }
    @Then("To Pay butonuna click yapar")
    public void to_pay_butonuna_click_yapar() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        AdminDashboardPage.butonToPay.click();

    }
    @Then("To Recieve butonuna click yapar")
    public void to_recieve_butonuna_click_yapar() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        AdminDashboardPage.butonReveive.click();

    }
    @Then("filtreleme dogrulanir")
    public void filtreleme_dogrulanir() {
        Assert.assertTrue(myOrdersPage.butonAll.isDisplayed());
        Assert.assertTrue(myOrdersPage.butonToPay.isDisplayed());
        Assert.assertTrue(myOrdersPage.butonToShip.isDisplayed());
        Assert.assertTrue(myOrdersPage.butonToReceive.isDisplayed());


    }


    @Then("my order linkide click yapar")
    public void my_order_linkide_click_yapar() {
        myOrdersPage.orderDate.click();

    }
    @Then("urunlerin Order ID, Status, Order date, Order Amount ve Paid By gorunur")
    public void urunlerin_order_id_status_order_date_order_amount_ve_paid_by_gorunur() {
        //orderId = myOrdersPage.orderIdNumber.getText();
        //status = myOrdersPage.statusInformation.getText();
        //orderDate = myOrdersPage.orderDate.getText();
        //orderAmount = myOrdersPage.orderAmount.getText();
        //action.scrollByAmount(0, 250).perform();
        //ReusableMethods.bekle(1);


    }



    @Then("ast bes orders, last on orders, last yirmi orders, last kirk orders) belirlenebildigi gorulur")
    public void astBesOrdersLastOnOrdersLastYirmiOrdersLastKirkOrdersBelirlenebildigiGorulur() {
        AdminDashboardPage.lastOrderDropDownLast10.getText();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        AdminDashboardPage.lastOrderDropDownLast20.getText();
        AdminDashboardPage.lastOrderDropDownLast40.getText();
    }

    @Given("sayfalardaki urunler tek tek dogrulanir")
    public void sayfalardakiUrunlerTekTekDogrulanir() {
        Assert.assertTrue(AdminDashboardPage.lastOrderDropDown.isDisplayed());
    }



}




































































