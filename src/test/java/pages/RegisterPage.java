package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {

    public RegisterPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//h3[@class='m-0']")
    public WebElement singUpText;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement registerFirstNamebox;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement registerLastNamebox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement registerMailbox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement registerPasswordbox1;

    @FindBy(xpath = "//input[@id='password-confirm']")
    public WebElement registerPasswordbox2;

    @FindBy(xpath = "//span[@class='checkmark mr_15']")
    public WebElement registerbycheckbox;

    @FindBy(xpath = "//button[@class='amaz_primary_btn style2 radius_5px  w-100 text-uppercase  text-center mb_25']")
    public WebElement registerSingUpButton;

    @FindBy(xpath = "//a[normalize-space()='Sign In']")
    public WebElement registerSingInLink;

    @FindBy(xpath = "//div[@class='toast-title']")
    public WebElement registerSingUpOkPopUpLink;

    @FindBy(xpath = "//h3[@class='m-0']")
    public WebElement registerSingInText;








}
