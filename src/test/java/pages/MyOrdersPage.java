package pages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyOrdersPage {
    public MyOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //https://qa.trendlifebuy.com/my-purchase-orders>Order Details Linki
    @FindBy(xpath = "(//a[text()='Order Details'])[1]")
    public WebElement orderDetailLink;

    //https://qa.trendlifebuy.com/my-purchase-orders>Dashboard Linki
    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center '])[1]")
    public WebElement dashboardLink;

    //https://qa.trendlifebuy.com/my-purchase-orders>Order Id Number
    @FindBy(xpath = "(//p[@class='font_14 f_w_400 m-0 lh-base'])[1]")
    public WebElement orderIdNumber;

    //https://qa.trendlifebuy.com/my-purchase-orders>Status Information
    @FindBy(xpath = "(//p[@class='font_14 f_w_400 m-0 lh-base'])[3]")
    public WebElement statusInformation;

    //https://qa.trendlifebuy.com/my-purchase-orders>Order Date
    @FindBy(xpath = "(//p[@class='font_14 f_w_400 m-0 lh-base'])[2]")
    public WebElement orderDate;

    //https://qa.trendlifebuy.com/my-purchase-orders>Order Date
    @FindBy(xpath = "(//p[@class='font_14 f_w_400 m-0 lh-base'])[4]")
    public WebElement orderAmount;

    //https://qa.trendlifebuy.com/my-purchase-orders>Cancel order Button
    @FindBy(xpath = "//a[text()='Cancel Order']")
    public WebElement cancelOrderButton;

    //https://qa.trendlifebuy.com/my-purchase-orders>Cancel reason window title
    @FindBy()
    public WebElement cancelReasonWindowLabel;

    //https://qa.trendlifebuy.com/my-purchase-orders>Reason Box
    @FindBy(xpath = "(//div[@tabindex='0'])[2]")
    public WebElement reasonBoxTextbox;

    //https://qa.trendlifebuy.com/my-purchase-orders>ra.deneme option
    @FindBy(xpath = "//li[@data-value='3']")
    public WebElement raDenemeOption;

    @FindBy(xpath = "//button[text()='Send']")
    public WebElement orderCancelSendButton;

    //https://qa.trendlifebuy.com/my-purchase-orders

    @FindBy(xpath = "//button[@id='home-tab']")
    public WebElement butonAll;

    @FindBy(xpath = "//button[@id='Pay-tab']")
    public WebElement butonToPay;

    @FindBy(xpath = "//button[@id='Ship-tab']")
    public WebElement butonToShip;

    @FindBy(xpath = "//*[text()='To Recieve']")
    public WebElement butonToReceive;




}
