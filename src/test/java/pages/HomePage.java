package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@placeholder='Enter email address'])[1]")
    public WebElement cokiesMail;

    @FindBy(xpath = "//button[@id='modalSubscribeBtn']")
    public WebElement cokiesButon;

    @FindBy(xpath="//*[text()='Wishlist (']")
    public WebElement wishListLink;

    @FindBy(xpath="(//*[text()='Login'])[1]")
    public WebElement loginLink;

    //https://qa.trendlifebuy.com/>dashboard linki
    @FindBy(xpath = "(//a[text()='Dashboard'])[1]")
    public WebElement dashboardLink;

    //https://qa.trendlifebuy.com/profile/dashboard>My Order Linki
    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[3]")
    public WebElement myOrderLink;


}
