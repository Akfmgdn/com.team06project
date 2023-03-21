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
        public WebElement purchaseHistoryLink;

    @FindBy(xpath ="//h4[@class='font_30 f_w_700 secondary_text mb_25'] ")
        public WebElement totalBalanceElementi;

    @FindBy(xpath ="//span[@class='font_14 f_w_700 secondary_text text-uppercase'] ")
        public WebElement rechargeWalletElement;

    @FindBy(css = "#recharge_amount")
        public WebElement rechargeAmountElement;
    @FindBy(xpath ="//button[.='Add Fund']")
        public WebElement addFundElement;

    @FindBy(xpath ="//h4[@class='font_16 f_w_700 mb_20'] ")
        public WebElement rechargedAmountElement;

    @FindBy(xpath ="//a[@class='amaz_badge_btn2 text-uppercase text-nowrap']")
        public WebElement seeAllPurchaseElement;
    @FindBy(xpath ="(//a[@class='amaz_badge_btn2 text-uppercase'])[1]")
        public WebElement seeAllMyWishListElement;
    @FindBy(xpath ="(//a[@class='amaz_badge_btn2 text-uppercase'])[2]")
        public WebElement seeAllRecentOrderElement;

    @FindBy(xpath ="//span[@id='remove_cart_sidebar']//i[@class='ti-close']")
        public WebElement removeCartSidebar;

    @FindBy(xpath ="//a[@href='https://qa.trendlifebuy.com/cart'][normalize-space()='See All']")
        public WebElement seeAllProductInChartElement;

    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
        public WebElement dashboardElement;
    @FindBy(xpath = "//a[normalize-space()='Purchase History']")
        public WebElement PurchaseHistoryElement;

    @FindBy(xpath = "//a[normalize-space()='My Wishlist']")
        public WebElement myWishListLink;
    @FindBy(css = "div[class='amazy_dashboard_area dashboard_bg section_spacing6'] li:nth-child(2) a:nth-child(1)")
        public WebElement myOrderLink;

    @FindBy(css= "giftcard")
         public WebElement giftcardLink;

    @FindBy(xpath = "//a[normalize-space()='My Wallet']")
            public WebElement myWalletLink;

    @FindBy(xpath = "//a[normalize-space()='My Coupons']")
        public WebElement myCouponsLink;

    @FindBy(xpath = "//a[normalize-space()='Refund & Dispute']")
        public WebElement refundAndDisputeLink;

    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    public WebElement myAccountLink;

    @FindBy(xpath = "//a[normalize-space()='Digital Products']")
    public WebElement digitalProductsLink;

    @FindBy(xpath = "//a[contains(text(),'Referral')]")
    public WebElement referralLink;

    @FindBy(xpath = "//a[normalize-space()='Support Ticket']")
        public WebElement supportTicketLink;







}

