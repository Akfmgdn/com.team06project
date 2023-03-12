package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShippingPage {
    public ShippingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //US27
    @FindBy(xpath = "(//*[text()='Continue To Payment'])[1]")
    public WebElement continueToPaymentButton;

    @FindBy(xpath = "(//div[@class='standard_shiping_box'])[2]")
    public WebElement ShippingMethodRadioButton;

}
