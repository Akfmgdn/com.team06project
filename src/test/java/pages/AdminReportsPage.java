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

}
