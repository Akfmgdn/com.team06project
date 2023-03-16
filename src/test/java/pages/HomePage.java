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

    @FindBy(xpath = "(//div[@class='product__meta text-center'])[1]")
    public WebElement firstProduct;

    @FindBy(xpath = "(//*[text()='Add To Cart'])[2]")
    public WebElement addToCartLink;

    @FindBy(xpath = "(//*[text()='Cart ('])[1]")
    public WebElement cartButton;

    @FindBy(xpath = "(//i[@class='ti-close'])[2]")
    public WebElement newsletterSubscribeCloseButton;


    @FindBy(xpath = "(//*[text()='View All'])[1]")
    public WebElement viewAllLink;


    //US-2

    @FindBy(xpath="(//*[text()='Play store'])[1]")
    public WebElement googlePlayLink;

    @FindBy(xpath="(//*[text()='App store'])[1]")
    public WebElement appStoreLink;

    @FindBy(xpath="(//div[@class='logo_img']")
    public WebElement logoImg;

    @FindBy(xpath="(//*[text()='/ Register'])")
    public WebElement registerLink;

    @FindBy(xpath="(//div[@class='main_header_media d-none d-xl-flex dynamic_svg']")
    public WebElement newUserZoneLink;

    @FindBy(xpath="(//*[text()='Home'])[1]")
    public WebElement homeLink;

    @FindBy(xpath="(//*[text()='Blog'])[1]")
    public WebElement blogLink;

    @FindBy(xpath="(//*[text()='About Us´][1]")
    public WebElement aboutUsLink;

    @FindBy(xpath="(//*[text()='Contact'])[2]")
    public WebElement contactLink;

    @FindBy(xpath="(//*[text()='Track Your Order'][1]")
    public WebElement trackYourOrderLink;

    @FindBy(xpath="(//*[text()='Compare('][1]")
    public WebElement compareLink;

    //US-3

    @FindBy(xpath="(//div[@class='dropdown show category_menu']")
    public WebElement allCategoriesDropdown;

    @FindBy(xpath="(//*[text()='Computer & Accessories']")
    public WebElement computerAccessoriesLink;

    @FindBy(xpath="(//*text()='Electronics Devices']")
    public WebElement electronicsDevicesLink;

    @FindBy(xpath="(//*text()='Watches & Accessories']")
    public WebElement watchesAccessoriesLink;

    @FindBy(xpath = "(//*text()='Fashions']")
    public WebElement fashionsLink;

    @FindBy(xpath="(//*[text()='Toys , Kids & Babies']")
    public WebElement toysKidsBabiesLink;

    @FindBy(xpath="(//*[text()='  Bag & Shoes']")
    public WebElement bagShoesLink;

    @FindBy(xpath="(//*8text()='Lifestyle & Home']")
    public WebElement lifeStyleHomeLink;

    @FindBy(xpath="(//*[text()='TV & Home Appliances']")
    public WebElement tvHomeAppliancesLink;

    @FindBy(xpath="(//*[text()='Auto Mobiles & bikes']")
    public WebElement autoMobilesBikesLink;

    //US-4

    @FindBy(xpath="(//*[text()='My Account'][1]")
    public WebElement myAccountLink;

    @FindBy(xpath="(//*[text()='Order Status'][1]")
    public WebElement orderStatusLink;

    @FindBy(xpath="(//*[text()='Referral']]2]")
    public WebElement referralLink;

    @FindBy(xpath="(//*[text()='Coupons'][3]")
    public WebElement couponsLink;

    @FindBy(xpath="(//*[text()='About Us']]2]")
    public WebElement aboutUsButton;

    @FindBy(xpath="(//*[text()='Contact Us'][1]")
    public WebElement contactUsButton;

    @FindBy(xpath="(//*[text()='Career'][2]")
    public WebElement careerButton;

    @FindBy(xpath="(//*[text()='Refund Policy']")
    public WebElement refundPolicyButton;

    @FindBy(xpath="(//*[text()='Terms & Condition'][1]")
    public WebElement termsConditionButton;

    @FindBy(xpath="(//div[@class='fab fa-twitter']")
    public WebElement twitterButton;

    @FindBy(xpath="(//div[@class='fab fa-linkedin']")
    public WebElement linkedinButton;

    @FindBy(xpath="(//div[@class='fab fa-instagram']")
    public WebElement instagramButton;

    @FindBy(xpath="(//div[@class='fab fa-facebook-f']")
    public WebElement facebookButton;

    //US-5

    @FindBy(xpath="(//*[text()='Trending Products']")
    public WebElement trendigProductsText;

    @FindBy(xpath="(//*[text()='Hot  Categories']")
    public WebElement hotCategoriesText;

    @FindBy(xpath="(//*[text()='Recommendation For You']")
    public WebElement recommendationForYouText;

    @FindBy(xpath="(//*[text()='Top Brand'][1]")
    public WebElement topBrandText;

    @FindBy(xpath="(//*[text()='Popular Searches'][2]")
    public WebElement popularSearchesText;

    @FindBy(xpath="(//*[text()='Trendlifebuy | ONLINE SHOPPING'][3]")
    public WebElement trendlifebuyOnlineShoppingText;










}
