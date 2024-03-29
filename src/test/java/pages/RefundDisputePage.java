package pages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import utilities.Driver;

public class RefundDisputePage {
    public RefundDisputePage() {PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//a[@class='position-relative d-flex align-items-center active']")
   public WebElement refundDisputePagelink;

    @FindBy(xpath = "//h4[contains(@class,'font_16 f_w_700 text-nowrap m-0 theme_hover')]")
    public WebElement iadeUrunText;

    @FindBy(xpath = "//h4[normalize-space()='Order ID:']")
    public WebElement orderIdText;

    @FindBy(xpath = "//h4[normalize-space()='Status:']")
    public WebElement statusText;

    @FindBy(xpath = "//h4[contains(text(),'Order amount')]")
    public WebElement OrderAmountText;

    @FindBy(xpath = "//h4[contains(text(),'Request Sent date')]")
    public WebElement RequestSentdate;

    @FindBy(xpath = "//a[contains(@class,'amaz_primary_btn style2 text-nowrap')]")
    public WebElement viewDetailButton;

    @FindBy(xpath = "//div[contains(@class,'d-flex align-items-center flex-wrap gap_5 mb_7')]//p[contains(@class,'font_14 f_w_400 m-0 lh-base')][normalize-space()='Pending']")
    public WebElement actualstation;

    @FindBy(xpath = "//div[@class='order_details_progress style2']//div[1]//div[1]//*[name()='svg']")
    public WebElement startStageVisible;

    @FindBy(xpath = "//p[normalize-space()='Refund Started']")
    public WebElement StartText;

    @FindBy(xpath = "//p[normalize-space()='Refund Processing']")
    public  WebElement processingtext;

    @FindBy(xpath = "//p[normalize-space()='Refund Complete']")
    public  WebElement completetext;

    @FindBy(xpath = "//h4[@class='font_16 f_w_700 text-nowrap m-0 theme_hover']")
    public WebElement PickUpInfo;
}