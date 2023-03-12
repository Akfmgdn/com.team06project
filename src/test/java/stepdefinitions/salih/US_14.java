package stepdefinitions.salih;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AboutUsPage;

public class US_14 {

    AboutUsPage aboutUsPage= new AboutUsPage();

    @And("click About us link")
    public void clickAboutUsLink() {
        aboutUsPage.aboutUsLabel.click();
    }

    @Then("verify that the About us page is visible")
    public void verifyThatTheAboutUsPageIsVisible() {
    }

    @And("verify that the text Quality and Reasonable Price is visible")
    public void verifyThatTheTextQualityAndReasonablePriceIsVisible() {
    }

    @Then("verify that the Client Worldwide, Successful Project, Work Employed, Planning Services numbers are visible")
    public void verifyThatTheClientWorldwideSuccessfulProjectWorkEmployedPlanningServicesNumbersAreVisible() {
    }

    @Then("Verify that the text Online Shopping Easy Cost-Efficient is visible")
    public void verifyThatTheTextOnlineShoppingEasyCostEfficientIsVisible() {
    }

    @Then("verify that Team Member text is visible on the About Us page")
    public void verifyThatTeamMemberTextIsVisibleOnTheAboutUsPage() {
    }

    @Then("verify that the characters, statuses and images of Robert Pattison, Johnny Depp, Jason Statham, Bradley Cooper are visible")
    public void verifyThatTheCharactersStatusesAndImagesOfRobertPattisonJohnnyDeppJasonStathamBradleyCooperAreVisible() {
    }
}
