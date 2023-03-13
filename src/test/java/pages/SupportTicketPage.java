package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SupportTicketPage {

    public SupportTicketPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //US 41 support ticket main Button
    @FindBy(xpath = "(//*[text()='Support Ticket'])[1]")
    public WebElement mainSupportTicketLink;

    //US 41 support ticket subButton
    @FindBy(xpath = "(//*[text()='Support Ticket'])[2]")
    public WebElement subSupportTicketLink;

    //US 41
    @FindBy(xpath = "(//button[@id='dropdownMenu2'])[2]") //(//div[@class='dropdown CRM_dropdown'])[2]
    public WebElement selectDropdown;

    //US 41
    @FindBy(xpath = "(//*[text()='Ticket Info'])[1]")
    public WebElement ticketInfoTitle;

    //admin sign in button
    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement signInButton;

    // + isareti
    @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
    public WebElement plussign;

    @FindBy(xpath = "//tbody/tr[2]/td/ul/li[2]/span[2]/div/div/a[1]") //(//a[@class='dropdown-item'])[1]
    public WebElement showLink;

    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement noteTextBox;

    @FindBy(xpath = "(//input[@type='file'])[2]")
    public WebElement attachFileUploader;

    @FindBy(xpath = "//div[@class='nice-select primary_select mb-15']")
    public WebElement selectMenu;

    @FindBy(xpath = "(//span[@class='current'])[2]")
    public WebElement statusCurrent;

    @FindBy(xpath = "(//*[text()='Reply Ticket'])[1]")
    public WebElement replyTicketButton;

    @FindBy(xpath = "//p")
    public List<WebElement> writtenMessages;

    @FindBy(xpath = "//li[@data-value='4']")
    public WebElement option4Select;

    @FindBy(xpath = "//li[@data-value='3']")
    public WebElement option3Select;

    @FindBy(xpath = "//div[@class='msg_attach_file_list d-block']")
    public List<WebElement> attachFileNames;
}
