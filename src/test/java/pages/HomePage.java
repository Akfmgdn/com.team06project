package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;
import java.util.List;

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

    @FindBy(xpath = "//*[text()='/ Logout']")
    public WebElement logoutLink;

    //https://qa.trendlifebuy.com/>dashboard linki
    @FindBy(xpath = "(//a[text()='Dashboard'])[1]")
    public WebElement dashboardLink;

    //https://qa.trendlifebuy.com/profile/dashboard>My Order Linki
    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[3]")
    public WebElement myOrderLink;

    @FindBy(xpath = "//div[@class='product__meta text-center']")
    public List<WebElement> listedProductsonHomepage;

    @FindBy(xpath = "(//*[@src='https://qa.trendlifebuy.com/public/uploads/images/21-12-2022/63a402d28afb4.jpeg'])[1]")
    public WebElement firstProduct;

    @FindBy(xpath = "(//*[@data-product-id='8'])[2]")
    public WebElement addToCartLink;

    @FindBy(xpath = "(//*[text()='Cart ('])[1]")
    public WebElement cartButton;

    @FindBy(xpath = "(//i[@class='ti-close'])[2]")
    public WebElement newsletterSubscribeCloseButton;

    @FindBy(xpath = "(//*[text()='View All'])[1]")
    public WebElement viewAllLink;

    //deneme

    //Anasayfa Register link
    @FindBy(xpath = "//a[normalize-space()='/ Register']")
    public WebElement registerLink;

    //https://qa.trendlifebuy.com/profile/dashboard>My Coupon Linki
    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[5]")
    public WebElement myCouponsLink;

}
