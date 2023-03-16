package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlogPage {

    public BlogPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    // US11

    // US11-TC1101
    @FindBy(xpath = "//ul[@id='mobile-menu']//a[normalize-space()='Blog']")
    public WebElement blogPageLink;

    // US11-TC1102
    @FindBy(xpath = "//a[@class='amazy_readMore_link'][1]")
    public WebElement readmoreLink;

    // US11-TC1103
    @FindBy(xpath = "//input[@placeholder='Search posts']")
    public WebElement searchPostTextBox;

    // US11-TC1104
    @FindBy(xpath = "//li[1]//label[1]//a[1]")
    public WebElement jasperScottLink;

    @FindBy(xpath = "//strong[normalize-space()='No Post Found']")
    public WebElement jasperScottBlog;

    @FindBy(xpath = "(//label[@class='primary_checkbox d-flex'])[2]")
    public WebElement natureLink;

    @FindBy(xpath = "(//label[@class='primary_checkbox d-flex'])[3]")
    public WebElement riverLink;

    @FindBy(xpath = "(//label[@class='primary_checkbox d-flex'])[4]")
    public WebElement carLink;

    @FindBy(xpath = "(//label[@class='primary_checkbox d-flex'])[5]")
    public WebElement technologyLink;

    // US11-TC1105
    @FindBy(xpath = "//a[normalize-space()='programming']")
    public WebElement programmingLink;

    @FindBy(xpath = "//p[@class='font_14 f_w_500 m-0']")
    public WebElement programmingTag;

    @FindBy(xpath = "//a[text()='blog']")
    public WebElement blogLink;

    @FindBy(xpath = "//a[text()='medical']")
    public WebElement medicalLink;

    @FindBy(xpath = "//a[text()='medium']")
    public WebElement mediumLink;

    @FindBy(xpath = "//a[text()='qa']")
    public WebElement qaLink;

    // US11-TC1106
    @FindBy(xpath = "(//h4[text()='Connecting to Care'])[2]")
    public WebElement connectingToCarePopularLink;

    @FindBy(xpath = "//h4[contains(text(),'Nature is a teacher – What happens when you allow.')]")
    public WebElement naturePopularLink;

    @FindBy(xpath = "(//h4[text()='Society – The soil in which we grow'])[2]")
    public WebElement societyPopularLink;

    @FindBy(xpath = "(//h4[text()='Nature Connection Exercise – Perceive and Receive'])[2]")
    public WebElement natureConnectionLink;

    // US25-TC2502

    @FindBy(xpath = "//div[text()='Logout Successfully!']")
    public WebElement logoutMessage;

    // US25-TC2503

    @FindBy(xpath = "//li[15]//a[1]")
    public WebElement userDashboardLogoutLink;
}
