package stepdefinitions.semih;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.MyCouponsPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US20_StepDefinitions {
    MyCouponsPage myCouponsPage = new MyCouponsPage();
    HomePage homePage = new HomePage();

    Actions action = new Actions(Driver.getDriver());

    ///////////////////////// TC-01 ////////////////////////////////
    @Then("My Coupons link is clicked")
    public void my_coupons_link_is_clicked() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);
        homePage.myCouponsLink.click();
    }
    @Then("verify Collected Coupons title is displayed")
    public void verify_collected_coupons_title_is_displayed() {
        Assert.assertTrue(myCouponsPage.collectedCouponsLabel.isDisplayed());
    }

    ///////////////////////// TC-02 ////////////////////////////////
    @Then("A {string} code sended to the add coupon textbox and Add Coupon button is clicked")
    public void a_code_sended_to_the_add_coupon_textbox_and_Add_Coupon_button_is_clicked(String coupon) {
        myCouponsPage.addCouponTextbox.sendKeys(coupon);
        myCouponsPage.addCouponButton.click();
        ReusableMethods.bekle(1);
        myCouponsPage.addCouponTextbox.clear();
        ReusableMethods.bekle(1);

    }
    @Then("verify coupon code is added to the Collected Coupons")
    public void verify_coupon_code_is_added_to_the_collected_coupons() {
        ReusableMethods.bekle(1);
        action.scrollByAmount(0,350).perform();
        ReusableMethods.waitForVisibility(myCouponsPage.firstCollectedCouponName,5);
        Assert.assertEquals("Coupon102", myCouponsPage.firstCollectedCouponName.getText());
        Assert.assertEquals("Coupon198", myCouponsPage.secondCollectedCouponName.getText());
        Assert.assertEquals("Coupon197", myCouponsPage.thirdCollectedCouponName.getText());

    }

    ///////////////////////// TC-03 ////////////////////////////////
    @Then("verify Coupon Value information is displayed")
    public void verify_coupon_value_information_is_displayed() {
        Assert.assertTrue(myCouponsPage.firstCollectedCouponValue.isDisplayed());
        Assert.assertTrue(myCouponsPage.secondCollectedCouponValue.isDisplayed());
        Assert.assertTrue(myCouponsPage.thirdCollectedCouponValue.isDisplayed());

    }
    @Then("verify Store Name information is displayed")
    public void verify_store_name_information_is_displayed() {
        Assert.assertTrue(myCouponsPage.firstCollectedCouponStorename.isDisplayed());
        Assert.assertTrue(myCouponsPage.secondCollectedCouponStorename.isDisplayed());
        Assert.assertTrue(myCouponsPage.thirdCollectedCouponStorename.isDisplayed());


    }
    @Then("verify Coupon Code information is displayed")
    public void verify_coupon_code_information_is_displayed() {
        Assert.assertTrue(myCouponsPage.firstCollectedCouponName.isDisplayed());
        Assert.assertTrue(myCouponsPage.secondCollectedCouponName.isDisplayed());
        Assert.assertTrue(myCouponsPage.thirdCollectedCouponName.isDisplayed());

    }
    @Then("verify Validity information is displayed")
    public void verify_validity_information_is_displayed() {
        Assert.assertTrue(myCouponsPage.firstCollectedCouponValidity.isDisplayed());
        Assert.assertTrue(myCouponsPage.secondCollectedCouponValidity.isDisplayed());
        Assert.assertTrue(myCouponsPage.thirdCollectedCouponValidity.isDisplayed());

    }
    @Then("verify Action information is displayed")
    public void verify_action_information_is_displayed() {
        Assert.assertTrue(myCouponsPage.firstCollectedCouponAction.isDisplayed());
        Assert.assertTrue(myCouponsPage.secondCollectedCouponAction.isDisplayed());
        Assert.assertTrue(myCouponsPage.thirdCollectedCouponAction.isDisplayed());
    }
    @Given("added coupons are deleted")
    public void added_coupons_are_deleted() {
        int numberOfCoupons = myCouponsPage.numberOfCouponsList.size();
        for (int i = 1; i <= numberOfCoupons; i++) {
            myCouponsPage.firstCollectedCouponDeleteAction.click();
            ReusableMethods.waitForVisibility(myCouponsPage.couponDeleteButton,10);
            myCouponsPage.couponDeleteButton.click();
            ReusableMethods.bekle(2);
        }
        ReusableMethods.bekle(1);
    }
}
