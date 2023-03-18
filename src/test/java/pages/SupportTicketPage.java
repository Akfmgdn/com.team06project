package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SupportTicketPage {

    public SupportTicketPage(){PageFactory.initElements(Driver.getDriver(),this);
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

    @FindBy(xpath = "(//div[@class='dropdown-menu dropdown-menu-right show'])/a[1]") //(//a[@class='dropdown-item'])[1]
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

    @FindBy(xpath = "(//div[@class='dropdown-menu dropdown-menu-right show'])/a[2]")
    public WebElement editLink;

    @FindBy(xpath = "(//div[@tabindex='0'])[2]")
    public WebElement categoryListDropdown;

    @FindBy(xpath = "(//ul[@class='list'])[2]")
    public List<WebElement> listofCategory;

    @FindBy(xpath = "(//a[@id='add_new_category'])[1]")
    public WebElement adNewCategoryLink;

    @FindBy(xpath = "(//input[@name='name'])[2]")
    public WebElement textCategoryBox;

    @FindBy(xpath = "(//button[@type='submit'])[4]")
    public WebElement saveButtonNewCategory;

    @FindBy(xpath = "(//li[@data-value='1'])[1]")
    public WebElement categoryInstallation;

    @FindBy(xpath = "//a[@id='add_new_priority']")
    public WebElement addNewPriorityLink;

    @FindBy(xpath = "(//input[@class='primary_input_field name'])[1]")
    public WebElement textPriorityBox;

    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement saveButtonPriority;

    @FindBy(xpath = "(//div[@tabindex='0'])[3]")
    public WebElement priorityListDropdown;

    @FindBy(xpath = "(//ul[@class='list'])[3]")
    public List<WebElement> listOfPriority;

    @FindBy(xpath = "(//li[@data-value='1'])[2]")
    public WebElement priorityHigh;

    @FindBy(xpath = "//a[@id='add_new_status']")
    public WebElement addNewstatusLink;

    @FindBy(xpath = "(//input[@class='primary_input_field name'])[3]")
    public WebElement textStatusBox;

    @FindBy(xpath = "(//button[@type='submit'])[5]")
    public WebElement saveButtonStatus;

    @FindBy(xpath = "(//div[@tabindex='0'])[5]")
    public WebElement StatusListDropdown;

    @FindBy(xpath = "(//ul[@class='list'])[5]")
    public List<WebElement> listOfStatus;

    @FindBy(xpath = "(//li[@data-value='1'])[3]")
    public WebElement statusPending;

    @FindBy(xpath = "(//button/input[@type='file'])[1]")
    public WebElement updateTicketUploadFileBrowser;

    @FindBy(xpath = "(//*[text()='Update Ticket'])[2]")
    public WebElement updateTicketButton;

    @FindBy(xpath = "(//label[@class='primary-btn small fix-gr-bg'])[2]")
    public WebElement secondBrowserButton;

    @FindBy(xpath = "//i[@class='fa fa-trash']")
    public WebElement deleteButton;

    @FindBy(xpath = "(//button[@class='primary-btn small fix-gr-bg custom_plus_btn'])")
    public WebElement addBrowserButton;

    @FindBy(xpath = "//div[@class='primary_input mb-25']")
    public List<WebElement> loadedFile;

    @FindBy(xpath = "(//div[@class='dropdown-menu dropdown-menu-right show'])/a[3]")
    public WebElement deleteLink;

    @FindBy(xpath = "(//a[@target='_blank'])[1]")
    public WebElement firstTicket;

    @FindBy(xpath = "(//input[@value='Delete'])[1]")
    public WebElement deletePupupButton;



}
