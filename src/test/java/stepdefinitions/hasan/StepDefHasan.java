package stepdefinitions.hasan;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ISelect;
import pages.AdminDashboardPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;

public class StepDefHasan {

    AdminDashboardPage AdminDashboardPage = new AdminDashboardPage();
    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();

    String actualAramaSonucu;


    @Given("trendlifebuy anasayfaya gider")
    public void trendlifebuy_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("UrlCostomer"));
    }

    @Then("login linkine click yapar")
    public void login_linkine_click_yapar() {
        loginPage.loginLinkText.click();
    }


    @Then("Email adresbox")
    public void emailAdresbox() {
        loginPage.emailAdressBox.sendKeys("user048@trendlifebuy.com");

    }

    @Then("e mail password yazar")
    public void e_mail_password_yazar() {
        loginPage.passwordBox.sendKeys("Trendlife123");
    }

    @Then("login butonuna click yapar")
    public void login_butonuna_click_yapar() {
        loginPage.signInButton.click();
        ReusableMethods.bekle(7);
    }

    @Then("Dasboard sayfasinana click yapar")
    public void dasboardSayfasinanaClickYapar() {
        AdminDashboardPage.dashboardtextLink.click();
        ReusableMethods.bekle(20);

    }

    @Then("puschhase history gittigi gorunur")
    public void puschhaseHistoryGittigiGorunur() {

        Assert.assertTrue(AdminDashboardPage.purchase.isDisplayed());

    }

    @Given("Purchase History filtreler")
    public void purchaseHistoryFiltreler() {
        AdminDashboardPage.searchHistory.isDisplayed();


    }


    @Then("All History acilir penceresinde All History, Pending Orders, Confirmed Orders, Completed Orders,  Refused&Cancelled Orders")
    public void all_history_acilir_penceresinde_all_history_pending_orders_confirmed_orders_completed_orders_refused_cancelled_orders() {
        AdminDashboardPage.purchase.click();
    }


    @Then("All History acilir penceresinde seceneklerine gore filtrelendigi dogrulanir")
    public void allHistoryAcilirPenceresindeSeceneklerineGoreFiltrelendigiDogrulanir() {
        Assert.assertTrue(AdminDashboardPage.allHistory.isDisplayed());

    }

    @Given("siparis ozetleri goruntulenir")
    public void siparis_ozetleri_goruntulenir() {
        Assert.assertTrue(AdminDashboardPage.actionLink.isDisplayed());

    }

    @Then("siparis faturasinin indirilebildigi gorontulenir")
    public void siparis_faturasinin_indirilebildigi_gorontulenir() {
        Assert.assertTrue(AdminDashboardPage.actionLink.isDisplayed());


    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.getDriver().quit();
    }

  // hasanother

}















