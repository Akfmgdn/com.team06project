package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {

    public RegisterPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//h3[@class='m-0']")
    public WebElement singUpText;








}
