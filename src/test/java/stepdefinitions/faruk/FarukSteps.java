package stepdefinitions.faruk;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MyAccountPage;
import pages.MyWalletPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FarukSteps {
    MyWalletPage myWalletPage = new MyWalletPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    @Given("Go to site")
    public void goToSite() {
        Driver.getDriver().get("https://qa.trendlifebuy.com/");

    }

    @And("Close the newsletter subscription form")
    public void closeTheNewsletterSubscriptionForm() {
        ReusableMethods.waitForVisibility(myWalletPage.newsletterSubscribeCloseButton,30);
        myWalletPage.newsletterSubscribeCloseButton.click();
    }

    @Then("Click on the login button")
    public void clickOnTheLoginButton() {
        myWalletPage.loginButton.click();
    }

    @Then("Pass in the credentials and click on the submit button")
    public void passInTheCredentialsAndClickOnTheSubmitButton() {
        myWalletPage.loginEmailBox.sendKeys("user133@trendlifebuy.com");
        myWalletPage.loginPasswordBox.sendKeys("Trendlife123");
        JavascriptExecutor jse=(JavascriptExecutor)Driver.getDriver();
        jse.executeScript("arguments[0].click();",myWalletPage.signInButton);
    }

    @And("Click on the dashboard button")
    public void clickOnTheDashboardButton() {
        myWalletPage.dashboardLink.click();
    }


    @Then("Hit the My wallet link")
    public void hitTheMyWalletLink() {
       ReusableMethods.jsClick(myWalletPage.myWalletLink);
    }

    @And("verify that the link leads to the My Wallet page")
    public void verifyThatTheLinkLeadsToTheMyWalletPage() {
        ReusableMethods.waitForVisibility(myWalletPage.myWalletHeader,30);
        Assert.assertTrue(myWalletPage.myWalletHeader.isDisplayed());
    }

    @And("Close the site")
    public void closeTheSite() {
        Driver.closeDriver();
    }

    @And("veify that the total balance running balance and Pending balance are visible")
    public void veifyThatTheTotalBalanceRunningBalanceAndPendingBalanceAreVisible() {
        ReusableMethods.scrollDownByPixel(200);
        List<WebElement> elements=new ArrayList<WebElement>();
        elements.add(myWalletPage.totalBalance);
        elements.add(myWalletPage.pendingBalance);
        elements.add(myWalletPage.runningBalance);
        elements.forEach(n->Assert.assertTrue(n.isDisplayed()));



    }

    @And("verify that Recharge wallet button is visible and leads to the Recharge Amount window")
    public void verifyThatRechargeWalletButtonIsVisibleAndLeadsToTheRechargeAmountWindow() {
        ReusableMethods.scrollDownByPixel(350);
        Assert.assertTrue(myWalletPage.rechargeWalletButton.isDisplayed());
        ReusableMethods.jsClick(myWalletPage.rechargeWalletButton);
        ReusableMethods.waitForVisibility(myWalletPage.rechargeAmountWindowHeader,30);
        Assert.assertTrue(myWalletPage.rechargeAmountWindowHeader.isDisplayed());
    }

    @And("Hit the Recharge Amount button")
    public void hitTheRechargeAmountButton() {
        ReusableMethods.scrollDownByPixel(350);
        ReusableMethods.jsClick(myWalletPage.rechargeWalletButton);
    }

    @Then("verify that there is a TextBox for recharging the amount and it is enabled")
    public void verifyThatThereIsATextBoxForRechargingTheAmountAndItIsEnabled() {
        ReusableMethods.waitForVisibility(myWalletPage.enterRechargeAmountBox,30);
        Assert.assertTrue(myWalletPage.enterRechargeAmountBox.isDisplayed());
        Assert.assertTrue(myWalletPage.enterRechargeAmountBox.isEnabled());
    }

    @Then("Verify that he Cancel button is visible and able to cancel the transaction.")
    public void verifyThatHeCancelButtonIsVisibleAndAbleToCancelTheTransaction() {
        ReusableMethods.waitForVisibility(myWalletPage.cancelButton,30);
        Assert.assertTrue(myWalletPage.cancelButton.isDisplayed());
        Assert.assertTrue(myWalletPage.cancelButton.isEnabled());

    }

    @Then("Verify that Add Fund button is visible and redirects to the relevant page.")
    public void verifyThatAddFundButtonIsVisibleAndRedirectsToTheRelevantPage() {
        ReusableMethods.waitForVisibility(myWalletPage.addFundButton,30);
        Assert.assertTrue(myWalletPage.addFundButton.isDisplayed());
        Assert.assertTrue(myWalletPage.addFundButton.isEnabled());
        myWalletPage.enterRechargeAmountBox.sendKeys("300");
        myWalletPage.addFundButton.click();
        ReusableMethods.waitForVisibility(myWalletPage.stripeImage,30);
        Assert.assertTrue(myWalletPage.stripeImage.isDisplayed());
    }

    @And("Verify  Date, Trx Id, Amount, Type, Payment Method, Status columns are visible")
    public void verifyDateTrxIdAmountTypePaymentMethodStatusColumnsAreVisible() {
        ReusableMethods.scrollDownByPixel(350);
        List<WebElement> dataTableHeaders = myWalletPage.rechargeHistoryDataTableHeaders;
        dataTableHeaders.forEach(element -> Assert.assertTrue(element.isDisplayed()));
    }

    @And("Verify that Wallet transactions are visible in the Wallet Recharge History list")
    public void verifyThatWalletTransactionsAreVisibleInTheWalletRechargeHistoryList() {
        ReusableMethods.scrollDownByPixel(350);
        List<WebElement> walletHistory = myWalletPage.walletsHistoryColumnData;
        walletHistory.forEach(element -> Assert.assertTrue(element.isDisplayed()));
    }

    @Then("Click my account link")
    public void clickMyAccountLink() {
        ReusableMethods.jsClick(myAccountPage.myAccountLink);
    }

    @Then("verify that the account page is accessible")
    public void verifyThatTheAccountPageIsAccessible() {
        ReusableMethods.waitForVisibility(myAccountPage.userDescriptionBar,30);
        Assert.assertTrue(myAccountPage.userDescriptionBar.isDisplayed());
    }

    @And("upload the profile picture clicking choose file button")
    public void uploadTheProfilePictureClickingChooseFileButton() {
        ReusableMethods.scrollDownByPixel(500);
        //
        String dosyaYolu= System.getProperty("user.home")+"\\Downloads\\ProfilePic.jpg";
        myAccountPage.chooseFileButton.sendKeys(dosyaYolu);

    }

    @Then("verify that the profile picture is updated")
    public void verifyThatTheProfilePictureIsUpdated() {
        ReusableMethods.waitForVisibility(myAccountPage.nameOfTheFileUploaded, 30);
        Assert.assertTrue(myAccountPage.nameOfTheFileUploaded.isDisplayed());
    }

    @And("verify First Name, Last Name, Email Address, Phone Number, Date of Birth and Description TextBoxes  are visible")
    public void verifyFirstNameLastNameEmailAddressPhoneNumberDateOfBirthAndDescriptionTextBoxesAreVisible() {
        List<WebElement> webElementList = myAccountPage.myAccountElements;
        webElementList.forEach(n->Assert.assertTrue(n.isDisplayed()));
    }


    @And("Verify that the information is the same as the user's information {string} and {string}")
    public void verifyThatTheInformationIsTheSameAsTheUserSInformationAnd(String expectedFirstname, String expectedEmail) {
        Assert.assertEquals(expectedFirstname, myAccountPage.firstNameBox.getAttribute("value"));
        Assert.assertEquals(expectedEmail, myAccountPage.emailAddressBox.getAttribute("value"));
    }

    @And("change the information in the TextBoxes {string}, {string}, {string},{string},{string} and {string}")
    public void changeTheInformationInTheTextBoxesAnd(String firstname, String lastname, String email, String phone, String dateOfBirth, String description) {
        myAccountPage.lastNameBox.clear();
        myAccountPage.lastNameBox.sendKeys(lastname);
        myAccountPage.phoneBox.clear();
        myAccountPage.phoneBox.sendKeys(phone);
        myAccountPage.dateOfBirthBox.clear();
        myAccountPage.dateOfBirthBox.sendKeys(dateOfBirth);
        myAccountPage.descriptionBox.clear();
        myAccountPage.descriptionBox.sendKeys(description);
    }

    @When("click on the update button")
    public void clickOnTheUpdateButton() {
       ReusableMethods.jsClick( myAccountPage.updateNowButton);
       ReusableMethods.waitForVisibility(myAccountPage.successMessage,30);
       Actions actions=new Actions(Driver.getDriver());
       actions.sendKeys(Keys.PAGE_UP).perform();
       actions.sendKeys(Keys.PAGE_UP).perform();
       ReusableMethods.jsClick(myWalletPage.dashboardLink);
       ReusableMethods.jsClick( myAccountPage.myAccountLink);

    }

    @And("verify that the user's information is updated {string}, {string}, {string},{string},{string} and {string}")
    public void verifyThatTheUserSInformationIsUpdatedAnd(String firstname, String lastname, String email, String phone, String dateOfBirth, String Description) {
        Assert.assertEquals(firstname,myAccountPage.firstNameBox.getAttribute("value"));
        Assert.assertEquals(lastname,myAccountPage.lastNameBox.getAttribute("value"));
        Assert.assertEquals(email, myAccountPage.emailAddressBox.getAttribute("value"));
        Assert.assertEquals(phone,myAccountPage.phoneBox.getAttribute("value"));
        Assert.assertEquals(dateOfBirth, myAccountPage.dateOfBirthBox.getAttribute("value"));
        Assert.assertEquals(Description, myAccountPage.descriptionBox.getAttribute("value"));
    }

    @And("hit the change password button")
    public void hitTheChangePasswordButton() {
        myAccountPage.changePasswordButton.click();

    }

    @Then("verify that the Current Password, New Password, Re enter New Password TextBoxes are available")
    public void verifyThatTheCurrentPasswordNewPasswordReEnterNewPasswordTextBoxesAreAvailable() {
        List<WebElement> allTextBoxes =myAccountPage.changePasswordAllTextBoxes;
        allTextBoxes.forEach(element -> {
            ReusableMethods.waitForVisibility(element,30);
            Assert.assertTrue(element.isDisplayed());
        });
    }
}
