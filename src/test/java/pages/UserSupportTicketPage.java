package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UserSupportTicketPage {


public UserSupportTicketPage () {PageFactory.initElements(Driver.getDriver(),this);

}

    @FindBy(xpath = "(//a[text()='Dashboard'])[1]")
    public WebElement dashBoardButton;

    @FindBy(xpath ="(//*[@class='position-relative d-flex align-items-center '])[2]")
    public WebElement supportTicketButton;

    @FindBy(xpath = "//*[@class='checkmark mr_15']")
    public WebElement checkbox;

    @FindBy(xpath = "//*[@id='dataShow']")
    public WebElement allSubmittedTicketList;

    @FindBy(xpath = "//*[@scope='col']")
    public List<WebElement> listed;

    @FindBy(xpath = "//*[text()='View']")
    public WebElement viewButton;

    @FindBy(xpath = "//*[@class='dashboard_white_box style5 bg-white mb_25']")
    public WebElement ticketsData;

    @FindBy(xpath = "//*[@class='dashboard_white_box style5 bg-white mb_25']")
    public WebElement statusPriorityCategory;

    @FindBy(xpath = "//*[text()='hey']")
    public WebElement returnTickets;

    @FindBy(xpath = "//*[@id='replay_box_toggler']")
    public WebElement replyButton;

    @FindBy (xpath = "//*[@class='note-editing-area']")
    public WebElement description;

    @FindBy (xpath = "//*[@class='nice-select amaz_select4 style2']")
    public WebElement allTickets;

    @FindBy (xpath = "(//*[text()='Pending'])[2]")
    public WebElement pendings;

    @FindBy (xpath = "//*[text()='+ Add New']")
    public WebElement addNewButton;

    @FindBy (xpath = "//*[text()='Create new ticket ']")
    public WebElement createNewTicketsText;

    @FindBy (xpath = "(//*[text()='On Going'])[2]")
    public WebElement onGoing;

    @FindBy (xpath = "//*[@id='subject']")
    public WebElement subjectBox;

    @FindBy (xpath = "(//*[text()='Select from options'])[2]")
    public WebElement categoryBox;

    @FindBy (xpath = "(//*[@class='nice-select-search'])[1]")
    public WebElement search;

    @FindBy(xpath = "(//*[text()='New Category'])[2]")
    public WebElement newCategory;

    @FindBy(xpath = "(//*[text()='Technical'])[2]")
    public WebElement techinal;

    @FindBy (xpath = "(//*[text()='Select from options'])[5]")
    public WebElement priorityBox;

    @FindBy(xpath = "(//*[@class='nice-select-search'])[2]")
    public WebElement prioritysearch;

    @FindBy(xpath = "(//*[text()='High'])[2]")
    public WebElement high;

    @FindBy (xpath = "//*[text()='Description']")
    public WebElement descriptionBox;

    @FindBy (xpath = "//*[text()='+ Create Now']")
    public WebElement creatNowButton;

    @FindBy(xpath = "//*[text()='/ Logout']")
    public WebElement logOutLink;

    @FindBy(xpath = "//*[@id='user-octagon']")
    public WebElement siteBarLogoutLink;




}
