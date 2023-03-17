package stepdefinitions.akif;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Random;

public class US_007_stepdefinitions {
    MyWishlistPage wishlist = new MyWishlistPage();
    HomePage home = new HomePage();
    LoginPage login = new LoginPage();
    ComparePage compare = new ComparePage();
    RegisterPage registerPage=new RegisterPage();

    //TC_01 It should be verified that it is on the Sign Up page.
    @Given("trendlifebuy goes to homepage")
    public void trendlifebuy_goes_to_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("UrlCostomer"));

    }
    @Given("pop up closes")
    public void pop_up() {

        try {
            home.newsletterSubscribeCloseButton.click();
        } catch (Exception e) {
        }
    }

    @Given("Register clicks")
    public void register_click() {
        home.registerLinkk.click();
    }
    @Then("It is tested to be on the sign up page")
    public void it_is_tested_to_be_on_the_sign_up_page() {

        String expectedText="Sign Up";
        String actionText=registerPage.singUpText.getText();

        Assert.assertEquals(expectedText,actionText);

    }
    //TC_02 It must be verified that the First Name Text Box is registered with a name of at least 2 letters.

    @Given("Enters valid First Name")
    public void enters_valid_first_name() {
        registerPage.registerFirstNamebox.sendKeys("aa");

    }
    @Given("Enters valid Last Name")
    public void enters_valid_last_name() {
        registerPage.registerLastNamebox.sendKeys("aa");
    }
    @Given("writes valid e-mail address")
    public void writes_valid_e_mail_address() {
        Random rand = new Random();
        int randNum = rand.nextInt(10001);
        registerPage.registerMailbox.sendKeys(""+randNum+"bugHunter@gmail.com");
    }
    @Given("writes valid Password")
    public void writes_valid_password() {
        registerPage.registerPasswordbox1.sendKeys("Aa123456");
    }
    @Given("Writes valid Confirm password")
    public void writes_valid_confirm_password() {
        registerPage.registerPasswordbox2.sendKeys("Aa123456");
    }
    @Given("By signing up, you agree to Terms of Service and Privacy Policy checks that it is checked")
    public void by_signing_up_you_agree_to_terms_of_service_and_privacy_policy_checks_that_it_is_checked() {
        if (registerPage.registerbycheckbox.isSelected()){
            registerPage.registerbycheckbox.click();
        }
    }
    @Given("sign up button clicks")
    public void sign_up_button_clicks() {

        ReusableMethods.jsClick(registerPage.registerSingUpButton);

    }


    @And("It is tested that the First Name Text Box is registered with a name of at least {int} letters.")
    public void itIsTestedThatTheFirstNameTextBoxIsRegisteredWithANameOfAtLeastLetters(int arg0) {
        Assert.assertTrue(registerPage.registerSingUpOkPopUpLink.isDisplayed());

    }

    @And("It is tested that the Last Name Text Box is registered with a name of at least {int} letters.")
    public void itIsTestedThatTheLastNameTextBoxIsRegisteredWithANameOfAtLeastLetters(int arg0) {
        Assert.assertTrue(registerPage.registerSingUpOkPopUpLink.isDisplayed());

    }

    @And("It is tested that it is possible to register with the e-mail address entered in accordance with the criteria.")
    public void itIsTestedThatItIsPossibleToRegisterWithTheEMailAddressEnteredInAccordanceWithTheCriteria() {
        Assert.assertTrue(registerPage.registerSingUpOkPopUpLink.isDisplayed());

    }

    @And("It is tested that it is possible to register with a password that meets the specified criteria.")
    public void itIsTestedThatItIsPossibleToRegisterWithAPasswordThatMeetsTheSpecifiedCriteria() {
        Assert.assertTrue(registerPage.registerSingUpOkPopUpLink.isDisplayed());

    }

    @And("By signing up, you agree to Terms of Service and Privacy Policy CheckBox is checked if it is not possible to register without ticking")
    public void bySigningUpYouAgreeToTermsOfServiceAndPrivacyPolicyCheckBoxIsCheckedIfItIsNotPossibleToRegisterWithoutTicking() {
        Assert.assertTrue(registerPage.registerSingUpOkPopUpLink.isDisplayed());

    }

    @And("When the information suitable for the criteria is entered, the registration process is tested when the Sign Up button is clicked.")
    public void whenTheInformationSuitableForTheCriteriaIsEnteredTheRegistrationProcessIsTestedWhenTheSignUpButtonIsClicked() {
        Assert.assertTrue(registerPage.registerSingUpOkPopUpLink.isDisplayed());

    }

    @And("Clicks the Sign In link")
    public void clicksTheSignInLink() {
        ReusableMethods.jsClick(registerPage.registerSingInLink);

    }

    @And("Already have an Account? It is tested that the Sign In link next to the text leads to the relevant page.")
    public void alreadyHaveAnAccountItIsTestedThatTheSignInLinkNextToTheTextLeadsToTheRelevantPage() {
        Assert.assertTrue(registerPage.registerSingInText.isDisplayed());

    }
}
