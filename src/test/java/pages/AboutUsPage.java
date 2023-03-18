package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AboutUsPage {
    public AboutUsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
   }
    @FindBy(xpath ="(//a[.='About Us'])[1]")
            public WebElement aboutUsLabel;
    @FindBy(xpath ="//span[normalize-space()='Quality and Reasonable Prices']")
            public WebElement QualityAndReasonablePricesLabel;
    @FindBy(xpath ="//h3[normalize-space()='11,000+']")
            public WebElement clientWorldwideNumber;
    @FindBy(xpath ="//h3[normalize-space()='42M+']")
            public WebElement successfulProjectLabel;
    @FindBy(xpath ="//h3[normalize-space()='42M+']")
            public WebElement workEmployedLabel;
    @FindBy(xpath ="//p[normalize-space()='Planning Services']")
            public WebElement planningServicesLabel;
    @FindBy(xpath ="//span[normalize-space()='online shopping easy and cost-efficient']")
            public WebElement onlineShoppingEasyAndCostEfficientLabel;
    @FindBy(xpath ="//span[normalize-space()='Team member']")
            public WebElement teamMemberLabel;
    @FindBy(xpath ="//h4[normalize-space()='Robert Pattinson']")
            public WebElement RobertPattinsonCharacteri;
    @FindBy(xpath ="//h4[normalize-space()='Johnny Depp']")
            public WebElement johnnyDeppCharacteri;
    @FindBy(xpath ="//h4[normalize-space()='Jason Statham']")
            public WebElement jasonStathamCharacteri;
    @FindBy(xpath ="//h4[normalize-space()='Harry Cooper']") //Bradley olmalı ? Bug!
            public WebElement HarryCooperCharacteri;

    // notification links
    @FindBy(xpath ="(//a[@class='position-relative d-flex align-items-center'])[1]")
        public WebElement purchaseHistoryElement;
    @FindBy(xpath ="(//a[@class='position-relative d-flex align-items-center'])[2]")
        public WebElement myWishListElement;
    @FindBy(xpath ="//a[@class='position-relative d-flex align-items-center active']")
        public WebElement myOrderElement;
    @FindBy(xpath ="(//a[@class='position-relative d-flex align-items-center'])[3]")
        public WebElement giftCardElement;
    @FindBy(xpath ="(//a[@class='position-relative d-flex align-items-center'])[4]")
        public WebElement myCouponsElement;
    @FindBy(xpath ="//a[@class='position-relative d-flex align-items-center active']")
    public WebElement myWalletElement;

    @FindBy(xpath ="(//a[@class='position-relative d-flex align-items-center'])[5]")
        public WebElement refundAndDisputeElement;
    @FindBy(xpath ="(//a[@class='position-relative d-flex align-items-center'])[6]")
        public WebElement myAccountElemen;
    @FindBy(xpath ="(//a[@class='position-relative d-flex align-items-center'])[7]")
        public WebElement digitalProductsElement;
    @FindBy(xpath ="(//a[@class='position-relative d-flex align-items-center'])[8]")
        public WebElement referralElement;
    @FindBy(xpath ="//a[normalize-space()='Support Ticket']")
        public WebElement supportTicketElement;






}





