package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MyWalletPage {

    public MyWalletPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //https://qa.trendlifebuy.com/
    @FindBy(xpath = "(//i[@class='ti-close'])[2]")
    public WebElement newsletterSubscribeCloseButton;

    @FindBy(xpath = "(//a[text()='Login'])[1]")
    public WebElement loginButton;

    //https://qa.trendlifebuy.com/login
    @FindBy(xpath = "//*[@placeholder='Email address']")
    public WebElement loginEmailBox;

    @FindBy(xpath = "//*[@*='password']")
    public WebElement loginPasswordBox;

    @FindBy(xpath = "//*[@*='sign_in_btn']")
    public WebElement signInButton;

    //userDashBoard
    @FindBy(xpath = "(//a[text()='Dashboard'])[1]")
    public WebElement dashboardLink;

    //https://qa.trendlifebuy.com/profile/dashboard
    @FindBy(xpath = "(//ul/li/a[@class='position-relative d-flex align-items-center '])[1]")
    public WebElement myWalletLink;

    @FindBy(xpath = "//h4[text()='My Wallet']")
    public WebElement myWalletHeader;

    @FindBy(xpath = "//*[text()='Total Balance']")
    public WebElement totalBalance;

    @FindBy(xpath = "//*[text()='Running Balance']")
    public WebElement runningBalance;

    @FindBy(xpath = "//*[text()='Pending Balance']")
    public WebElement pendingBalance;

    @FindBy(xpath = "//span[text()='Recharge Wallet']")
    public WebElement rechargeWalletButton;

    @FindBy(xpath = "//h3[text()='Recharge Amount']")
    public WebElement rechargeAmountWindowHeader;

    @FindBy(xpath = "//input[@id='recharge_amount']")
    public WebElement enterRechargeAmountBox;

    @FindBy(xpath = "//h5[text()='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//button[text()='Add Fund']")
    public WebElement addFundButton;

    @FindBy(xpath = "//img[@title='Stripe']")
    public WebElement stripeImage;

    @FindBy(xpath = "(//table/thead/tr)[1]/th")
    public List<WebElement> rechargeHistoryDataTableHeaders;

    @FindBy(xpath = "(//table/tbody/tr)[1]/td[6]")
    public List<WebElement> walletsHistoryColumnData;



}
