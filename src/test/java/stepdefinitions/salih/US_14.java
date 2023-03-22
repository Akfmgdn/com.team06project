package stepdefinitions.salih;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AboutUsPage;
import pages.MyWalletPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_14 {

    AboutUsPage aboutUsPage= new AboutUsPage();
    MyWalletPage myWalletPage= new MyWalletPage();
    @Given("Go to homepage and Close the newsletter subscription form")
    public void goToHomepageAndCloseTheNewsletterSubscriptionForm() {
        Driver.getDriver().get(ConfigReader.getProperty("urlCustomer"));
        ReusableMethods.waitForVisibility(myWalletPage.newsletterSubscribeCloseButton,30);
        myWalletPage.newsletterSubscribeCloseButton.click();
    }
    @And("click About us link")
    public void setAboutUsPage() {
        ReusableMethods.waitForVisibility(aboutUsPage.aboutUsLabel,30);
        aboutUsPage.aboutUsLabel.click();
    }
    @Then("verify that the About us page is visible")
    public void verifyThatTheAboutUsPageIsVisible() {
        aboutUsPage.aboutUsLabel.isDisplayed();

    }
    @And("verify that the text Quality and Reasonable Price is visible")
    public void verifyThatTheTextQualityAndReasonablePriceIsVisible() {
        aboutUsPage.QualityAndReasonablePricesLabel.isDisplayed();

    }
    @Then("verify that the Client Worldwide, Successful Project, Work Employed, Planning Services numbers are visible")
    public void verifyThatTheClientWorldwideSuccessfulProjectWorkEmployedPlanningServicesNumbersAreVisible() {
        aboutUsPage.clientWorldwideNumber.isDisplayed();
        aboutUsPage.successfulProjectLabel.isDisplayed();
        aboutUsPage.workEmployedLabel.isDisplayed();
        aboutUsPage.planningServicesLabel.isDisplayed();
    }
    @Then("Verify that the text Online Shopping Easy Cost-Efficient is visible")
    public void verifyThatTheTextOnlineShoppingEasyCostEfficientIsVisible() {
        aboutUsPage.onlineShoppingEasyAndCostEfficientLabel.isDisplayed();
    }
    @Then("verify that Team Member text is visible on the About Us page")
    public void verifyThatTeamMemberTextIsVisibleOnTheAboutUsPage() {
        aboutUsPage.teamMemberLabel.isDisplayed();
    }

    @Then("verify that the characters, statuses and images of Robert Pattison, Johnny Depp, Jason Statham, Bradley Cooper are visible")
    public void verifyThatTheCharactersStatusesAndImagesOfRobertPattisonJohnnyDeppJasonStathamBradleyCooperAreVisible() {
    aboutUsPage.RobertPattinsonCharacteri.isDisplayed();
    aboutUsPage.HarryCooperCharacteri.isDisplayed();
    aboutUsPage.johnnyDeppCharacteri.isDisplayed();
    aboutUsPage.jasonStathamCharacteri.isDisplayed();

    }



}
