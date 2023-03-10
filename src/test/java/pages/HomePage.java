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

    @FindBy(xpath="//*[text()='Wishlist (']")
    public WebElement wishListLink;

    @FindBy(xpath="(//*[text()='Login'])[1]")
    public WebElement loginLink;


}
