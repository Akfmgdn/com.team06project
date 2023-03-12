package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PaymentPage {
    public PaymentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[text()='Pay Now'])[1]")
    public WebElement payNowButton;

    @FindBy(xpath = "(//span[@class='checkmark mr_10'])[1]")
    public WebElement payMethod;


}
