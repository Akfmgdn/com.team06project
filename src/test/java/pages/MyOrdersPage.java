package pages;

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
    @FindBy(xpath = "(//p[@class='font_14 f_w_400 m-0 lh-base'])[1]")
    public WebElement statusInformation;

    //https://qa.trendlifebuy.com/my-purchase-orders>Order Date
    @FindBy(xpath = "(//p[@class='font_14 f_w_400 m-0 lh-base'])[2]")
    public WebElement orderDate;

    //https://qa.trendlifebuy.com/my-purchase-orders>Order Date
    @FindBy(xpath = "(//p[@class='font_14 f_w_400 m-0 lh-base'])[4]")
    public WebElement orderAmount;
}
