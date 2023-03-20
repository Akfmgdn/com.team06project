package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//*[text()='Login'])[1]")
    public WebElement loginLinkText;

    @FindBy(xpath = "//input[@placeholder='Email address']")
    public WebElement emailAdressBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "(//*[text()='Sign In'])[2]")
    public WebElement signInButton;

    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement adminSignInButton;


}
