package stepdefinitions.salih;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
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
        Assert.assertTrue(dashboardPage.userNameText.isDisplayed());
        Assert.assertTrue(dashboardPage.userEmailText.isDisplayed());
        System.out.println(dashboardPage.userEmailText.getText());

    }


    @Then("verify that All Order,My Wishlist, Refund Success, Product in Cart Coupon Used, Completed Order boards are visible")
    public void verifyThatAllOrderMyWishlistRefundSuccessProductInCartCouponUsedCompletedOrderBoardsAreVisible() {
        for (int i = 0; i <dashboardPage.allBoards.size() ; i++) {
           Assert.assertTrue(dashboardPage.allBoards.get(i).isDisplayed());
            System.out.println(dashboardPage.allBoards.get(i).getText());
        }
    }


    @And("Click purchase history")
    public void clickPurchaseHistory() {
        //dashboardPage.purchaseHistory.click();
    }

    @And("Verify that the Total Balance amount is displayed")
    public void verifyThatTheTotalBalanceAmountIsDisplayed() {
        Assert.assertTrue(dashboardPage.totalBalanceElementi.isDisplayed());

    }


    @And("Click Recharge Wallet button")
    public void clickRechargeWalletButton() {

        ReusableMethods.waitForVisibility(dashboardPage.rechargeWalletElement,3);
        ReusableMethods.jsClick(dashboardPage.rechargeWalletElement);
    }

    @Then("Verify that the the wallet can be loaded")
    public void verifyThatTheTheWalletCanBeLoaded() {
       //ReusableMethods.waitForVisibility(dashboardPage.rechargeAmountElement,3);
       //ReusableMethods.waitAndClick(dashboardPage.rechargeAmountElement);
       dashboardPage.rechargeAmountElement.sendKeys("120");
       dashboardPage.addFundElement.click();
       ReusableMethods.waitForVisibility(dashboardPage.rechargedAmountElement,3);
       Assert.assertTrue(dashboardPage.rechargedAmountElement.isDisplayed());

    }

    @Given("click the See All button on the Purchase History board")
    public void clickTheSeeAllButtonOnThePurchaseHistoryBoard() {
         dashboardPage.dashboardElement.click();
         ReusableMethods.scrollDownByPixel(450);
        //ReusableMethods.jsClick(dashboardPage.dashboardElement);

        ReusableMethods.waitForVisibility(dashboardPage.seeAllPurchaseElement,3);
        Assert.assertTrue(dashboardPage.seeAllPurchaseElement.isDisplayed());

    }
    @And("check if it  directs the user to the Purchase History page.")
    public void checkIfItDirectsTheUserToThePurchaseHistoryPage() {
        ReusableMethods.jsClick(dashboardPage.seeAllPurchaseElement);

        String expectedUrl = "https://qa.trendlifebuy.com/my-purchase-histories";
        Assert.assertEquals(expectedUrl,Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();
    }

    @And("it should be verified that clicking the See All button on the My Wishlist board BUG!!!")
    public void itShouldBeVerifiedThatClickingTheSeeAllButtonOnTheMyWishlistBoardBUG() {
        Assert.assertTrue(dashboardPage.seeAllMyWishListElement.isDisplayed());


    }
    @Then("Click See All button")
    public void clickSeeAllButton() {
        // There is big bug'
    }
    @And("Verify that it redirects the user to the Recent Order page")
    public void verifyThatItRedirectsTheUserToTheRecentOrderPage() {
        ReusableMethods.scrollIntoViewJS(dashboardPage.seeAllRecentOrderElement);
        //itForVisibility(dashboardPage.seeAllRecentOrderElement,3);
        ReusableMethods.bekle(1);
        Assert.assertTrue(dashboardPage.seeAllRecentOrderElement.isDisplayed());

    }
    @And("Click the See All button on the Product in Cart board")
    public void clickTheSeeAllButtonOnTheProductInCartBoard() {
        ReusableMethods.waitForVisibility(dashboardPage.seeAllProductInChartElement,3);
        dashboardPage.removeCartSidebar.click();

        //dashboardPage.seeAllProductInChartElement.click();



    }
    @Then("verify that it redirects the user to the Cart page.")
    public void verifyThatItRedirectsTheUserToTheCartPage() {
        //ReusableMethods.jsClick(dashboardPage.seeAllProductInChartElement);
        ReusableMethods.bekle(3);
        //dashboardPage.seeAllProductInChartElement.click();
        //String expectedUrl = "https://qa.trendlifebuy.com/my-purchase-orders";
        //Assert.assertEquals(expectedUrl,Driver.getDriver().getCurrentUrl());
        //Driver.getDriver().navigate().back();
    }
    @Given("click on the dashboard link")
    public void clickOnTheDashboardLink() {
        ReusableMethods.waitForVisibility(dashboardPage.dashboardElement,3);
        dashboardPage.dashboardElement.click();
        ReusableMethods.scrollDownByPixel(350);
        ReusableMethods.bekle(2);
    }

    @Given("click Purchase History link")
    public void clickPurchaseHistoryLink() {
        dashboardPage.purchaseHistoryLink.click();
        ReusableMethods.scrollDownByPixel(350);
        ReusableMethods.bekle(2);
    }
    @And("click My Wishlist")
    public void clickMyWishlist() {
        dashboardPage.myWishListLink.click();
        ReusableMethods.scrollDownByPixel(350);
        ReusableMethods.bekle(2);
    }
    @Then("click My Order")
    public void clickMyOrder() {
        dashboardPage.myOrderLink.click();
        ReusableMethods.scrollDownByPixel(350);
        ReusableMethods.bekle(2);

    }
    @And("click Giftcard")
    public void clickGiftcard() {
        ReusableMethods.jsClick(dashboardPage.giftcardLink);
        ReusableMethods.scrollDownByPixel(350);
        ReusableMethods.bekle(2);

    }
    @And("click My Wallet")
    public void clickMyWallet() {
        dashboardPage.myWalletLink.click();
        ReusableMethods.scrollDownByPixel(350);
        ReusableMethods.bekle(2);

    }

    @And("click My Cupons linke")
    public void clickMyCuponsLink() {
        dashboardPage.myCouponsLink.click();
        ReusableMethods.scrollDownByPixel(350);
        ReusableMethods.bekle(2);

    }
    @And("click Refund & Disputee")
    public void clickRefundDispute() {
        dashboardPage.refundAndDisputeLink.click();
        ReusableMethods.scrollDownByPixel(350);
        ReusableMethods.bekle(2);
    }
    @And("click My Accounte")
    public void clickMyAccounte() {
        dashboardPage.myAccountLink.click();
        ReusableMethods.scrollDownByPixel(350);
        ReusableMethods.bekle(2);
    }
    @And("click Digital Productse")
    public void clickDigitalProductse() {
        dashboardPage.digitalProductsLink.click();
        ReusableMethods.scrollDownByPixel(350);
        ReusableMethods.bekle(2);
    }
    @And("click Referrale")
    public void clickReferrale() {
        dashboardPage.referralLink.click();
        ReusableMethods.scrollDownByPixel(350);
        ReusableMethods.bekle(2);
    }
    @And("click Support Tickete")
    public void clickSupportTickete() {
        dashboardPage.supportTicketLink.click();
        ReusableMethods.scrollDownByPixel(350);
        ReusableMethods.bekle(2);
    }

    @And("Verify that it redirects to the relevant page")
    public void verifyThatItRedirectsToTheRelevantPage() {

    }


}




