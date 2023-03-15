package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class MyAccountPage {

    public MyAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    //https://qa.trendlifebuy.com/profile/dashboard
    @FindBy(xpath = "(//ul/li/a[@class='position-relative d-flex align-items-center'])[7]")
    public WebElement myAccountLink;

    @FindBy(xpath = "//h4[text()='Custumer006 ']")
    public WebElement userDescriptionBar;

    @FindBy(xpath = "//input[@id='file']")
    public WebElement chooseFileButton;
    @FindBy(xpath = "//p[@id='file_name_text']")
    public WebElement nameOfTheFileUploaded;

    @FindBy(xpath = "(//div[@class='row'])[6]/div")
    public List<WebElement> myAccountElements;

    //My Account/basic info
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstNameBox;

    @FindBy(xpath="//input[@id='email']")
    public WebElement emailAddressBox;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phoneBox;

    @FindBy(xpath = "//input[@id='start_datepicker']")
    public WebElement dateOfBirthBox;

    @FindBy(xpath = "//textarea[@id='textarea']")
    public WebElement  descriptionBox;

    @FindBy(xpath = "(//button[text()='Update Now'])[1]")
    public WebElement updateNowButton;

    @FindBy(xpath = "//div[text()='Success']")
    public WebElement successMessage;

    //Change Password
    @FindBy(xpath = "//button[text()='Change Password']")
    public WebElement changePasswordButton;

    @FindBy(xpath = "//input[@class='primary_input3 style3']")
    public List<WebElement> changePasswordAllTextBoxes;

    @FindBy(xpath = "//input[@id='currentPassword']")
    public WebElement currentPasswordBox;

    @FindBy(xpath = "//input[@id='newPass']")
    public WebElement newPasswordBox;

    @FindBy(xpath = "//input[@id='rePass']")
    public WebElement rePasswordBox;

    @FindBy(xpath = "(//button[text()='Update Now'])[2]")
    public WebElement updatePasswordButton;

    @FindBy(xpath = "//a[text()='/ Logout']")
    public WebElement logoutButton;

    //Adress button
    @FindBy(xpath = "//button[text()='Address']")
    public WebElement addressButton;

    @FindBy(xpath = "//button[@class='amazy_status_btn edit_address']")
    public WebElement editAddressIcon;

    @FindBy(xpath = "//h3[text()='Update Address']")
    public WebElement updateAddressHeader;
}
