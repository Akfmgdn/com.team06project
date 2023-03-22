

package stepdefinitions.hasan;


import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import static utilities.Driver.getDriver;

public class StepDefAdmin {

    pages.AdminDashboardPage AdminDashboardPage = new AdminDashboardPage();
    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();

    String actualAramaSonucu;

    MyOrdersPage myOrdersPage = new MyOrdersPage();
    OrderDetailPage orderDetailPage = new OrderDetailPage();
    Actions action = new Actions(getDriver());

    JavascriptExecutor js = (JavascriptExecutor) getDriver();



    @Given("trendlifebuy admin anasayfaya git")
    public void trendlifebuy_admin_anasayfaya_git() {
       Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
    }

    @Then("ilk login girisi")
    public void ilk_login_girisi() {
        AdminDashboardPage.loginButonMenu.click();

    }
    @Then("emailbox yazar")
    public void emailbox_yazar() {
        loginPage.emailAdressBox.sendKeys("admin048@trendlifebuy.com");


    }
    @Then("passwordBox yazar")
    public void password_box_yazar() {
        loginPage.passwordBox.sendKeys("Trendlife123");

    }
    @Then("login butonuna gider")
    public void login_butonuna_gider() {
        ReusableMethods.bekle(5);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        loginPage.signInButton.click();

    }

    @Then("Products menusune clikc yapar")
    public void products_menusune_clikc_yapar() {
      // ReusableMethods.jsClick(AdminDashboardPage.dashboardText);
        ReusableMethods.bekle(10);
        AdminDashboardPage.dashboardtextLink.click();
        action.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.bekle(10);
        AdminDashboardPage.productManageText.click();
        AdminDashboardPage.addNewProductDropDownMenu.click();
    }


    @Given("Product List, Alert List")
    public void product_list_alert_list() {
        ReusableMethods.jsClick(AdminDashboardPage.productAlertListLink);
        AdminDashboardPage.productAlertListLink.click();
        Assert.assertTrue(AdminDashboardPage.productsListLink.isDisplayed());
    }


    @Then("productOutOfStockList click yapar")
    public void product_out_of_stock_list_click_yapar() {
        AdminDashboardPage.productOutOfStockList.click();
        Assert.assertTrue(AdminDashboardPage.productOutOfStockList.isDisplayed());

    }


    @Then("productDisabledList click yapar")
    public void product_disabled_list_click_yapar() {
        AdminDashboardPage.productDisabledList.click();
        Assert.assertTrue(AdminDashboardPage.productDisabledList.isDisplayed());

    }

    @Then("productBySkuList click yapar")
    public void product_by_sku_list_click_yapar() {
        AdminDashboardPage.productBySkuList.click();
        Assert.assertTrue(AdminDashboardPage.productBySkuList.isDisplayed());

    }

    @Then("gittigi sayfalar dogrulanir")
    public void gittigi_sayfalar_dogrulanir() {
        Assert.assertTrue(AdminDashboardPage.productsListLink.isDisplayed());
        Assert.assertTrue(AdminDashboardPage.productAlertListLink.isDisplayed());
        Assert.assertTrue(AdminDashboardPage.productOutOfStockList.isDisplayed());
        Assert.assertTrue(AdminDashboardPage.productDisabledList.isDisplayed());
        Assert.assertTrue(AdminDashboardPage.productBySkuList.isDisplayed());

    }

    @Given("SL linkine click yapar")
    public void sl_linkine_click_yapar() {
        AdminDashboardPage.slProductList.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        action.sendKeys(Keys.PAGE_UP).perform();

    }
    @Then("Name linkine click yapar")
    public void name_linkine_click_yapar() {
       AdminDashboardPage.mainProductTableName.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        action.sendKeys(Keys.PAGE_UP).perform();
    }

    @Then("Product linkine Type click yapar")
    public void product_linkine_type_click_yapar() {
       AdminDashboardPage.mainProductTableType.click();
       action.sendKeys(Keys.PAGE_DOWN).perform();
       action.sendKeys(Keys.PAGE_UP).perform();
    }

    @Then("Brand linkine click yapar")
    public void brand_linkine_click_yapar() {
        AdminDashboardPage.mainProductTableBrand.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        action.sendKeys(Keys.PAGE_UP).perform();
    }

    @Then("Image linkine click yapar")
    public void image_linkine_click_yapar() {
        AdminDashboardPage.mainProductTableImage.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        action.sendKeys(Keys.PAGE_UP).perform();
    }

    @Then("Stock linkine click yapar")
    public void stock_linkine_click_yapar() {
      AdminDashboardPage.mainProductTableStock.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        action.sendKeys(Keys.PAGE_UP).perform();
    }

    @Then("status linkine click yapar")
    public void status_linkine_click_yapar() {
        AdminDashboardPage.mainProductTableStatus.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        action.sendKeys(Keys.PAGE_UP).perform();
    }

    @Then("linklerin listelendigini dogrulanir")
    public void linklerin_listelendigini_dogrulanir() {
        Assert.assertTrue(AdminDashboardPage.slProductList.isDisplayed());
        Assert.assertTrue(AdminDashboardPage.mainProductTableName.isDisplayed());
        Assert.assertTrue(AdminDashboardPage.mainProductTableType.isDisplayed());
        Assert.assertTrue(AdminDashboardPage.mainProductTableBrand.isDisplayed());
        Assert.assertTrue(AdminDashboardPage.mainProductTableImage.isDisplayed());
        Assert.assertTrue(AdminDashboardPage.mainProductTableStock.isDisplayed());
        Assert.assertTrue(AdminDashboardPage.mainProductTableStatus.isDisplayed());


    }


    @Given("Product Listi Quick Search arama yapar")
    public void product_listi_quick_search_arama_yapar() {
        AdminDashboardPage.productListQuickearch.sendKeys("Asgardia");

    }
    @Then("quick search click yapar")
    public void quick_search_click_yapar() {
        AdminDashboardPage.productListQuickearch.click();
        Assert.assertTrue(AdminDashboardPage.productListQuickearch.isDisplayed());

    }
    @And("tabindex click yapar")
    public void tabindexClickYapar() {
        AdminDashboardPage.productListTabindex1.click();

    }



    @And("select dropdown click yapar")
    public void selectDropdownClickYapar() {
        AdminDashboardPage.productListDropdownSelectedAction.click();
    }

    @And("View click yapar")
    public void viewClickYapar() {
        AdminDashboardPage.productListSelectedActionView.click();
    }

    @And("urunun gorunurlugu dogrular")
    public void urununGorunurluguDogrular() {
       Assert.assertTrue(AdminDashboardPage.productListSelectedActionView.isDisplayed());

    }


    @And("edit button click yapar")
    public void editButtonClickYapar() {
        AdminDashboardPage.ProductListDropdownSelectedActionEdit.click();

    }

    @And("edit sayfasindaki bilgilerini dogrular")
    public void editSayfasindakiBilgileriniDogrular() {
        Assert.assertTrue(AdminDashboardPage.ProductListDropdownSelectedActionEdit.isDisplayed());

    }

    @And("type dogrular")
    public void typeDogrular() {
        AdminDashboardPage.productInformationType.isDisplayed();


    }

    @Then("mesaji gorunur")
    public void mesajiGorunur() {
        action.sendKeys(Keys.END).perform();
        AdminDashboardPage.productDescription1.isDisplayed();
        AdminDashboardPage.productDescription2.isDisplayed();

    }

    @Given("Related Product click yapilir checkbox click yapar sayfayi kaydeder yapar")
    public void related_product_click_yapilir_checkbox_click_yapar_sayfayi_kaydeder_yapar() {
        AdminDashboardPage.relatedProductText.click();
        AdminDashboardPage.checkboxRelatedProduct.click();
        action.sendKeys(Keys.END).perform();
        AdminDashboardPage.saveRelatedProductButon.click();

    }
    @Then("upsale textine click yapar checkboxlara click yapar sayfayi kaydeder")
    public void upsale_textine_click_yapar_checkboxlara_click_yapar_sayfayi_kaydeder() {
        AdminDashboardPage.upSaleLinkText.click();
        AdminDashboardPage.checkBoxUpSale.click();
        action.sendKeys(Keys.END).perform();
        AdminDashboardPage.saveButonUpSale.click();

    }
    @Then("crossaletextine click yapar checkbox click yapar sayfa save yapilir")
    public void crossaletextine_click_yapar_checkbox_click_yapar_sayfa_save_yapilir() {
        AdminDashboardPage.crossSaleLinkText.click();
        AdminDashboardPage.crossSaleCheckBox.click();
        action.sendKeys(Keys.END).perform();
        AdminDashboardPage.saveButonCrosSale.click();

    }

    @After
    public void teardown (){
        Driver.quitDriver();

        }




}




        // JavascriptExecutor js = (JavascriptExecutor) getDriver();
        //js.executeScript("arguments[0].click();",










