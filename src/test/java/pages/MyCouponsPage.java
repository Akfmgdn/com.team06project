package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MyCouponsPage {

    public MyCouponsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //https://qa.trendlifebuy.com/profile/coupons>add coupons Title
    @FindBy(xpath = "//h4[text()='Collected Coupons']")
    public WebElement collectedCouponsLabel;

    //https://qa.trendlifebuy.com/profile/coupons>add coupons textbox
    @FindBy(xpath = "//input[@id='code']")
    public WebElement addCouponTextbox;

    //https://qa.trendlifebuy.com/profile/coupons> add coupon button
    @FindBy(xpath = "//button[text()='Add Coupon']")
    public WebElement addCouponButton;

    //https://qa.trendlifebuy.com/profile/coupons> collected coupons names and validities List
    @FindBy(xpath = "//table[@class='table amazy_table style4 mb-0']//tbody//tr//td[3]")
    public List<WebElement> collectedCouponsNamesElements;

    //https://qa.trendlifebuy.com/profile/coupons> 1. collected coupon name
    @FindBy(xpath = "(//table[@class='table amazy_table style4 mb-0']//tbody//tr//td[3])[1]")
    public WebElement firstCollectedCouponName;

    //https://qa.trendlifebuy.com/profile/coupons> 1. collected coupon value
    @FindBy(xpath = "(//table[@class='table amazy_table style4 mb-0']//tbody//tr//td[1])[1]")
    public WebElement firstCollectedCouponValue;

    //https://qa.trendlifebuy.com/profile/coupons> 1. collected coupon store name
    @FindBy(xpath = "(//table[@class='table amazy_table style4 mb-0']//tbody//tr//td[2])[1]")
    public WebElement firstCollectedCouponStorename;

    //https://qa.trendlifebuy.com/profile/coupons> 1. collected coupon validity
    @FindBy(xpath = "(//table[@class='table amazy_table style4 mb-0']//tbody//tr//td[4])[1]")
    public WebElement firstCollectedCouponValidity;

    //https://qa.trendlifebuy.com/profile/coupons> 1. collected coupon action
    @FindBy(xpath = "(//table[@class='table amazy_table style4 mb-0']//tbody//tr//td[5])[1]")
    public WebElement firstCollectedCouponAction;

    //https://qa.trendlifebuy.com/profile/coupons> 1. coupon delete action
    @FindBy(xpath = "(//*[@class='gj-cursor-pointer coupon_delete_btn'])[1]")
    public WebElement firstCollectedCouponDeleteAction;

    //https://qa.trendlifebuy.com/profile/coupons> 2. collected coupon name
    @FindBy(xpath = "(//table[@class='table amazy_table style4 mb-0']//tbody//tr//td[3])[2]")
    public WebElement secondCollectedCouponName;

    //https://qa.trendlifebuy.com/profile/coupons> 2. collected coupon value
    @FindBy(xpath = "(//table[@class='table amazy_table style4 mb-0']//tbody//tr//td[1])[2]")
    public WebElement secondCollectedCouponValue;

    //https://qa.trendlifebuy.com/profile/coupons> 2. collected coupon store name
    @FindBy(xpath = "(//table[@class='table amazy_table style4 mb-0']//tbody//tr//td[2])[2]")
    public WebElement secondCollectedCouponStorename;

    //https://qa.trendlifebuy.com/profile/coupons> 2. collected coupon validity
    @FindBy(xpath = "(//table[@class='table amazy_table style4 mb-0']//tbody//tr//td[4])[2]")
    public WebElement secondCollectedCouponValidity;

    //https://qa.trendlifebuy.com/profile/coupons> 2. collected coupon action
    @FindBy(xpath = "(//table[@class='table amazy_table style4 mb-0']//tbody//tr//td[5])[2]")
    public WebElement secondCollectedCouponAction;

    //https://qa.trendlifebuy.com/profile/coupons> 2. coupon delete action
    @FindBy(xpath = "(//*[@class='gj-cursor-pointer coupon_delete_btn'])[2]")
    public WebElement secondCollectedCouponDeleteAction;

    //https://qa.trendlifebuy.com/profile/coupons> 3. collected coupon name
    @FindBy(xpath = "(//table[@class='table amazy_table style4 mb-0']//tbody//tr//td[3])[3]")
    public WebElement thirdCollectedCouponName;

    //https://qa.trendlifebuy.com/profile/coupons> 3. collected coupon value
    @FindBy(xpath = "(//table[@class='table amazy_table style4 mb-0']//tbody//tr//td[1])[3]")
    public WebElement thirdCollectedCouponValue;

    //https://qa.trendlifebuy.com/profile/coupons> 3. collected coupon store name
    @FindBy(xpath = "(//table[@class='table amazy_table style4 mb-0']//tbody//tr//td[3])[3]")
    public WebElement thirdCollectedCouponStorename;

    //https://qa.trendlifebuy.com/profile/coupons> 3. collected coupon validity
    @FindBy(xpath = "(//table[@class='table amazy_table style4 mb-0']//tbody//tr//td[4])[3]")
    public WebElement thirdCollectedCouponValidity;

    //https://qa.trendlifebuy.com/profile/coupons> 3. collected coupon action
    @FindBy(xpath = "(//table[@class='table amazy_table style4 mb-0']//tbody//tr//td[5])[3]")
    public WebElement thirdCollectedCouponAction;

    //https://qa.trendlifebuy.com/profile/coupons> 3. coupon delete action
    @FindBy(xpath = "(//*[@class='gj-cursor-pointer coupon_delete_btn'])[3]")
    public WebElement thirdCollectedCouponDeleteAction;

    //https://qa.trendlifebuy.com/profile/coupons>couponDdelete>Delete Button
    @FindBy(xpath = "//button[text()='Delete']")
    public WebElement couponDeleteButton;

    //https://qa.trendlifebuy.com/profile/coupons> coupons number List
    @FindBy(xpath = "//table[@class='table amazy_table style4 mb-0']//tbody//tr//td[5]")
    public List<WebElement> numberOfCouponsList;


}
