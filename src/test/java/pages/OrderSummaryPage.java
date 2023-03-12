package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrderSummaryPage {
    public OrderSummaryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[text()='Order summary'])[1]")
    public WebElement orderSummaryText;

    @FindBy(xpath = "(//*[text()='View Order'] )[1]")
    public WebElement viewOrderButton;
}
