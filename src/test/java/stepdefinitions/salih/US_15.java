package stepdefinitions.salih;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.DashboardPage;
import pages.MyWalletPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_15 {
    MyWalletPage myWalletPage=new MyWalletPage();
    DashboardPage dashboardPage=new DashboardPage();


    @Then("Enter the credentials and click on the submit button")
    public void enter_the_credentials_and_click_on_the_submit_button() {
        myWalletPage.loginEmailBox.sendKeys(ConfigReader.getProperty("userNameSlh"));
        myWalletPage.loginPasswordBox.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.jsClick(myWalletPage.signInButton);

    }

    @Then("verify that the User Name and User E-mail address are displayed")
    public void verifyThatTheUserNameAndUserEMailAddressAreDisplayed() {
        dashboardPage.userNameText.isDisplayed();
        dashboardPage.userEmailText.isDisplayed();

    }


    @Then("verify that All Order,My Wishlist, Refund Success, Product in Cart Coupon Used, Completed Order boards are visible")
    public void verifyThatAllOrderMyWishlistRefundSuccessProductInCartCouponUsedCompletedOrderBoardsAreVisible() {
    }


    @And("Click purchase history")
    public void clickPurchaseHistory() {
        dashboardPage.purchaseHistory.click();
    }

    @And("Verify that the Total Balance amount is displayed")
    public void verifyThatTheTotalBalanceAmountIsDisplayed() {
        dashboardPage.totalBalanceElementi.isDisplayed();

    }


    @And("Click Recharge Wallet button")
    public void clickRechargeWalletButton() {
        dashboardPage.rechargeWalletElement.click();
    }

    @Then("Verify that the the wallet can be loaded")
    public void verifyThatTheTheWalletCanBeLoaded() {
       dashboardPage.rechargeAmountElement.click();
       dashboardPage.rechargeAmountElement.sendKeys("120");
       dashboardPage.addFundElement.click();
       Assert.assertTrue(dashboardPage.rechargedAmountElement.isDisplayed());
    }

    @Given("click the See All button on the Purchase History board")
    public void clickTheSeeAllButtonOnThePurchaseHistoryBoard() {

    }
    @And("check if it  directs the user to the Purchase History page.")
    public void checkIfItDirectsTheUserToThePurchaseHistoryPage() {
    }

    @And("it should be verified that clicking the See All button on the My Wishlist board BUG!!!")
    public void itShouldBeVerifiedThatClickingTheSeeAllButtonOnTheMyWishlistBoardBUG() {
    }
    @Then("Click See All button")
    public void clickSeeAllButton() {

    }
    @And("Verify that it redirects the user to the Recent Order page")
    public void verifyThatItRedirectsTheUserToTheRecentOrderPage() {
    }
    @And("Click the See All button on the Product in Cart board")
    public void clickTheSeeAllButtonOnTheProductInCartBoard() {
    }
    @Then("verify that it redirects the user to the Cart page.")
    public void verifyThatItRedirectsTheUserToTheCartPage() {
    }


    @Given("click Purchase History link")
    public void clickPurchaseHistoryLink() {
    }
    @And("click My Wishlist")
    public void clickMyWishlist() {
    }
    @Then("click My Order")
    public void clickMyOrder() {

    }
    @And("click Giftcard")
    public void clickGiftcard() {
    }
    @And("click My Wallet")
    public void clickMyWallet() {
    }

    @And("click My Cupons linke")
    public void clickMyCuponsLink() {
    }
    @And("click Refund & Disputee")
    public void clickRefundDispute() {
    }
    @And("click My Accounte")
    public void clickMyAccounte() {
    }
    @And("click Digital Productse")
    public void clickDigitalProductse() {
    }
    @And("click Referrale")
    public void clickReferrale() {
    }
    @And("click Support Tickete")
    public void clickSupportTickete() {
    }

    @And("Verify that it redirects to the relevant page")
    public void verifyThatItRedirectsToTheRelevantPage() {
    }

}




