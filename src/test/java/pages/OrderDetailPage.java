package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrderDetailPage {
    public OrderDetailPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //https://qa.trendlifebuy.com/my-purchase-order-details>Order Id Title
    @FindBy(xpath = "//h4[text()='Order ID:  ']")
    public WebElement orderIdLabel;

    //https://qa.trendlifebuy.com/my-purchase-order-details>Package Title
    @FindBy(xpath = "(//h4[@class='font_16 f_w_700 m-0'])[1]")
    public WebElement packageLabel;

    //https://qa.trendlifebuy.com/my-purchase-order-details>Status Information
    @FindBy(xpath = "(//p[@class='font_14 f_w_400 m-0 lh-base'])[3]")
    public WebElement statusInformation;

    //https://qa.trendlifebuy.com/my-purchase-order-details>Order Date
    @FindBy(xpath = "(//p[@class='font_14 f_w_400 m-0 lh-base'])[2]")
    public WebElement orderDate;

    //https://qa.trendlifebuy.com/my-purchase-order-details>Order Amount
    @FindBy(xpath = "(//p[@class='font_14 f_w_400 m-0 lh-base'])[4]")
    public WebElement orderAmount;

    //https://qa.trendlifebuy.com/my-purchase-order-details>package
    @FindBy(xpath = "(//h4[@class='font_16 f_w_700 m-0'])[1]")
    public WebElement packageInfoLabel;

    //https://qa.trendlifebuy.com/my-purchase-order-details>price info
    @FindBy(xpath = "(//h4[@class='font_16 f_w_700 m-0'])[2]")
    public WebElement priceLabel;

    //https://qa.trendlifebuy.com/my-purchase-order-details>price info
    @FindBy(xpath = "//h4[text()='Shipping Info ']")
    public WebElement shippingInfoLabel;

    //https://qa.trendlifebuy.com/my-purchase-order-details>Billing info
    @FindBy(xpath = "//h4[text()='Billing Info ']")
    public WebElement billingInfoLabel;

    //https://qa.trendlifebuy.com/my-purchase-order-details>Payment info
    @FindBy(xpath = "//h4[text()='Payment Info ']")
    public WebElement paymentInfoLabel;

    //https://qa.trendlifebuy.com/my-purchase-order-details>Order Processes
    @FindBy(xpath = "//div[@class='order_details_progress ']")
    public WebElement orderProcessLabels;

    //https://qa.trendlifebuy.com/my-purchase-order-details>descriptions - right side
    @FindBy(xpath = "//div[@class='col-xl-4 col-lg-4']")
    public WebElement descriptionTextsLabel;

    //US27
    @FindBy(xpath = "(//div[@class='dashboard_white_box_body'])[1]")
    public WebElement orderedTextsLabel;



}
