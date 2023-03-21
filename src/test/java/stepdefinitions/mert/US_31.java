package stepdefinitions.mert;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminDashboardPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_31 {
    LoginPage loginPage = new LoginPage();
    AdminDashboardPage adminDashboardPage = new AdminDashboardPage();

    Actions actions = new Actions(Driver.getDriver());

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("Login as an admin")
    public void loginasanadmin(){

        Driver.getDriver().get("https://qa.trendlifebuy.com/admin/login");
        loginPage.emailAdressBox.sendKeys(ConfigReader.getProperty("mertAdminName"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("mertPassword"));
        adminDashboardPage.adminSignInButton.click();

    }

    @And("Is visible profile icon")
    public void isVisibleProfileIcon() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboardPage.profileIconLink.isDisplayed());
    }

    @And("Click the profile icon")
    public void clickTheProfileIcon() {
        ReusableMethods.bekle(3);
        adminDashboardPage.profileIconLink.click();
    }

    @Then("Verify name of account visible")
    public void verifyNameOfAccountVisible() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboardPage.nameInfoText.isDisplayed());
    }

    @Then("Verify My profile and Log out links are visible")
    public void verifyMyProfileAndLogOutLinksAreVisible() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboardPage.myProfileLink.isDisplayed());
        Assert.assertTrue(adminDashboardPage.logoutLink.isDisplayed());
    }

    @Then("Click the my profile page and verify to go relevant page")
    public void clickTheMyProfilePageAndVerifyToGoRelevantPage() {
        adminDashboardPage.myProfileLink.click();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.trendlifebuy.com/profile";

        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Then("Click the my profile page")
    public void clickTheMyProfilePage() {
        adminDashboardPage.myProfileLink.click();
    }

    @And("Verify is visible First Name, Last Name, E-mail Address, Phone Number, Date of Bird information")
    public void verifyIsVisibleFirstNameLastNameEMailAddressPhoneNumberDateOfBirdInformation() {
        Assert.assertTrue(adminDashboardPage.firstNameText.isDisplayed());
        Assert.assertTrue(adminDashboardPage.lastNameText.isDisplayed());
        Assert.assertTrue(adminDashboardPage.emailAdressText.isDisplayed());
        Assert.assertTrue(adminDashboardPage.phoneNumberText.isDisplayed());
        Assert.assertTrue(adminDashboardPage.dateOfBirthText.isDisplayed());
    }

    @And("Click the update button and see updated successfully message")
    public void clickTheUpdateButtonAndSeeUpdatedSuccessfullyMessage() {
        adminDashboardPage.updateButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboardPage.updateMessageText.isDisplayed());

    }

    @And("Click the address button")
    public void clickTheAddressButton() {
        adminDashboardPage.adressButton.click();

    }

    @Then("verify that is visible addrees information")
    public void verifyThatIsVisibleAddreesInformation() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboardPage.addressInformationText.isDisplayed());

    }

    @And("Clicks the Add new address button and adds new address information by entering the required fields on the page that opens")
    public void clicksTheAddNewAddressButtonAndAddsNewAddressInformationByEnteringTheRequiredFieldsOnThePageThatOpens() {
        adminDashboardPage.addNewAdressButton.click();
        adminDashboardPage.nameTextBox.sendKeys("abc");
        adminDashboardPage.emailAdressTextBox.sendKeys("adsff@gmail.com");
        adminDashboardPage.phoneNumberTextBox.sendKeys("111111111");
        adminDashboardPage.adressTextBox.sendKeys("sfsgsgddb");
        adminDashboardPage.cityDropDownLink.click();
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.bekle(1);
        WebElement city = adminDashboardPage.citySelectedLink;
        js.executeScript("arguments[0].click();", city);
        adminDashboardPage.postalCodeTextBox.sendKeys("34567");

    }

    @Then("presses the save button and sees that the address it just added has been added.")
    public void pressesTheSaveButtonAndSeesThatTheAddressItJustAddedHasBeenAdded() {
        adminDashboardPage.saveButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboardPage.newAddressText.isDisplayed());
    }
}
