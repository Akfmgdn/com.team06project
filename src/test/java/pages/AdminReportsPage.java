package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminReportsPage {


    public AdminReportsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Admin dashboard
    @FindBy(xpath = "(//table[@id='userSearchTable']/tbody/tr)[1]/td[2]")
    public WebElement firstKeywordInTheKeywordSearchTable;

    @FindBy(xpath = "(//table[@id='userSearchTable']/tbody/tr)[1]/td[2]")
    public WebElement firstKeywordOnTheSecondPage;

    @FindBy(xpath = "//span[text()='Admin Reports']")
    public WebElement adminReportsLink;

    @FindBy(xpath = "//ul[@class='mm-collapse mm-show']/li[1]")
    public WebElement keywordsSearchLink;

    //Admin reports page

    @FindBy(xpath = "//input[@placeholder='Quick Search']")
    public WebElement quickSearchBox;

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> searchResultsTable;

    @FindBy(xpath = "//table[@id='userSearchTable']")
    public WebElement keywordSearchReportTable;

    @FindBy(xpath = "//th[text()='Keywords']")
    public WebElement keywordsHeader;

    @FindBy(xpath = "//th[text()='Number of time']")
    public WebElement numberOfTimeHeader;

    @FindBy(xpath = "//a[@data-dt-idx='2']")
    public WebElement page2Button;
    public WebElement pageLocators(int pageNum){

        String locator= "//a[@data-dt-idx='"+pageNum+"']";

        return Driver.getDriver().findElement(By.xpath(locator));

    }

    @FindBy(xpath = "//table[@id='userSearchTable']/tbody/tr/td[1]")
    public List<WebElement> keywordList;

    //us 39

    @FindBy(xpath = "//*[text()='Admin Reports']")
    public WebElement AdminReportPage;

    @FindBy(xpath = "//*[text()='Keywords search']")
    public WebElement KeywordsSearchPage;

    @FindBy(xpath = "//input[@placeholder='Quick Search']")
    public WebElement QuickSearchTextBox;

    @FindBy(xpath = "//*[text()='bike']")
    public WebElement bike;

    @FindBy(xpath = "//*[text()='Keyword search report']")
    public WebElement KeywordSearchPage;

    @FindBy(xpath = "//*[text()='Keywords']")
    public WebElement KeywordTitle;

    @FindBy(xpath = "//*[text()='Number of time']")
    public WebElement NumberTitle;

    @FindBy(xpath = "(//*[text()='2'])[2]")
    public WebElement NumberOfPage;

    @FindBy(xpath = "//*[text()='10']")
    public WebElement NumberOnList;

    @FindBy(xpath = "//*[text()='20']")
    public WebElement NumberonList2;

    @FindBy(xpath = "//*[text()='Showing 1 to 10 of 145 entries']")
    public WebElement EntryNumber1;

    @FindBy(xpath = "//*[text()='Showing 11 to 20 of 145 entries']")
    public WebElement EntryNumber2;

    @FindBy(xpath = "//*[text()='Visitor']")
    public WebElement Visitor;
    @FindBy(xpath = "//*[text()='Visitor Report']")
    public WebElement VisitorReportPage;

    @FindBy(xpath = "//input[@placeholder='Quick Search']")
    public WebElement VisitorSearchBox;

    @FindBy(xpath = "//*[text()='Windows 10']")
    public WebElement Windows10;

    @FindBy(xpath = "//*[text()='IP']")
    public WebElement IP;

    @FindBy(xpath = "//*[text()='Agent']")
    public WebElement Agent;

    @FindBy(xpath = "//*[text()='Device']")
    public WebElement Device;

    @FindBy(xpath = "//*[text()='Location']")
    public WebElement Location;

    @FindBy(xpath = "//*[text()='Date']")
    public WebElement Datee;

    @FindBy(xpath = "//div[@id='visitorTable_info']")
    public WebElement EntryNumber3;

    ////*[text()='Showing 1 to 10 of 6,085 entries']
    @FindBy(xpath = "//*[text()='Showing 11 to 20 of 6,085 entries']")
    public WebElement EntryNumber4;

    ////*[text()='Showing 11 to 20 of 6,085 entries']
    @FindBy(xpath = "(//*[text()='2'])[2]")
    public WebElement VisitorPage2;




}
