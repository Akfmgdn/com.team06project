package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SupportTicketPage {

    public SupportTicketPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[text()='Support Ticket'])[1]")
    public WebElement mainSupportTicketLink;

    @FindBy(xpath = "(//*[text()='Support Ticket'])[2]")
    public WebElement subSupportTicketLink;

    @FindBy(xpath = "(//div[@class='dropdown CRM_dropdown'])[1]")
    public WebElement selectDropdown;

    @FindBy(xpath = "(//*[text()='Ticket Info'])[1]")
    public WebElement ticketInfoTitle;
}
