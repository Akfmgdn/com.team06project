package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CheckoutPage {

    public CheckoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //US27
    @FindBy(xpath = "(//*[text()='Continue To Shipping'])[1]")
    public WebElement continueToShippingButton;


}
