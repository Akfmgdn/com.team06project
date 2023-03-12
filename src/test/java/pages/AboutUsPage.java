package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AboutUsPage {
    public AboutUsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
   }
    @FindBy(xpath ="(//a[.='About Us'])[1]")
            public WebElement aboutUsLabel;

    @FindBy(xpath ="//span[normalize-space()='Quality and Reasonable Prices']")
            public WebElement QualityAndReasonablePricesLabel;

    @FindBy(xpath ="//h3[normalize-space()='11,000+']")
            public WebElement ClientWorldwideNumber;

    @FindBy(xpath ="//h3[normalize-space()='42M+']")
            public WebElement successfulProjectLabel;

    @FindBy(xpath ="//h3[normalize-space()='42M+']")
            public WebElement workEmployedLabel;

    @FindBy(xpath ="//p[normalize-space()='Planning Services']")
            public WebElement planningServicesLabel;

    @FindBy(xpath ="//span[normalize-space()='online shopping easy and cost-efficient']")
            public WebElement onlineShoppingEasyAndCostEfficientLabel;

    @FindBy(xpath ="//span[normalize-space()='Team member']")
            public WebElement teamMemberLabel;

    @FindBy(xpath ="//h4[normalize-space()='Robert Pattinson']")
            public WebElement RobertPattinsonCharacteri;

    @FindBy(xpath ="//h4[normalize-space()='Johnny Depp']")
            public WebElement johnnyDeppCharacteri;

    @FindBy(xpath ="//h4[normalize-space()='Jason Statham']")
            public WebElement jasonStathamCharacteri;

    @FindBy(xpath ="//h4[normalize-space()='Harry Cooper']") //Bradley olmalı ? Bug!
            public WebElement HarryCooperCharacteri;


}





