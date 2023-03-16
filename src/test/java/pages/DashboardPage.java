package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//div[@class='single_cart_box d-flex align-items-center justify-content-center text-center flex-column']" )
    public List<WebElement> allBoards;
        // loop yapılacak

    @FindBy(xpath ="//h4[@class='font_20 f_w_700'] ")
       public WebElement userNameText;

    @FindBy(xpath ="//span[@class='email_text font_14 f_w_400 mute_text position-relative'] ")
        public WebElement userEmailText;

    @FindBy(xpath ="//a[normalize-space()='Purchase History'] ")
        public WebElement purchaseHistory;

    @FindBy(xpath ="//h4[@class='font_30 f_w_700 secondary_text mb_25'] ")
        public WebElement totalBalanceElementi;



    @FindBy(xpath ="//span[@class='font_14 f_w_700 secondary_text text-uppercase'] ")
        public WebElement rechargeWalletElement;

    @FindBy(xpath ="//span[@class='font_14 f_w_700 secondary_text text-uppercase'] ")
        public WebElement rechargeAmountElement;
    @FindBy(xpath ="//span[@class='font_14 f_w_700 secondary_text text-uppercase'] ")
        public WebElement addFundElement;

    @FindBy(xpath ="//h4[@class='font_16 f_w_700 mb_20'] ")
        public WebElement rechargedAmountElement;

    @FindBy(xpath ="//a[@class='amaz_badge_btn2 text-uppercase text-nowrap']")
        public WebElement seeAllPurchaseElement;
    @FindBy(xpath ="(//a[@class='amaz_badge_btn2 text-uppercase'])[1]")
        public WebElement seeAllMyWishListElement;
    @FindBy(xpath ="((//a[@class='amaz_badge_btn2 text-uppercase'])[2]")
        public WebElement seeAllRecentOrderElement;

    @FindBy(xpath ="(//a[@class='amaz_badge_btn2 text-uppercase'])[3]")
        public WebElement seeAllProductInChartElement;







}

