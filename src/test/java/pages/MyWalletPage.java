package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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



}
