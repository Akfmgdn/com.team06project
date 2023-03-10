package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminDashboardPage {
    // US31
    // US31-TC3101
    @FindBy(xpath = "//div[@class='user_avatar_div']")
    public WebElement profileIconLink;

    // US31-TC3102
    @FindBy(xpath = "//h5[text()='Admin050']")
    public WebElement nameInfoText;

    // US31-TC3103
    @FindBy(xpath = "//a[text()='My Profile']")
    public WebElement myProfileLink;

    @FindBy(xpath = "//a[text()='Log out']")
    public WebElement logoutLink;

    // US31-TC3105
    @FindBy(xpath = "//label[text()='First Name ']")
    public WebElement firstNameText;

    @FindBy(xpath = "//label[text()='Last Name']")
    public WebElement lastNameText;

    @FindBy(xpath = "(//label[@class='primary_input_label'])[3]")
    public WebElement emailAdressText;

    @FindBy(xpath = "(//label[@class='primary_input_label'])[4]")
    public WebElement phoneNumberText;

    @FindBy(xpath = "(//label[@class='primary_input_label'])[5]")
    public WebElement dateOfBirthText;

    // US31-TC3106
    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public WebElement adressButton;




    // US31-TC3107
    @FindBy(xpath = "//a[@class='primary-btn radius_30px mr-10 fix-gr-bg add_new_address']")
    public WebElement addNewAdressButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement nameTextBox;

    @FindBy(xpath = "(//input[@placeholder='Email Address'])[2]")
    public WebElement emailAdressTextBox;

    @FindBy(xpath = "(//input[@placeholder='Phone Number'])[2]")
    public WebElement phoneNumberTextBox;

    @FindBy(xpath = "//input[@placeholder='Address']")
    public WebElement adressTextBox;

    @FindBy(xpath = "(//div[@class='nice-select form-control primary_select'])[1]")
    public WebElement countryDropdownLink;

    @FindBy(xpath = "(//input[@placeholder='Search...'])[2]")
    public WebElement countrySearchTextBox;

    @FindBy(xpath = "(//div[@class='nice-select form-control primary_select'])[2]")
    public WebElement stateDropDownLink;

    @FindBy(xpath = "(//input[@placeholder='Search...'])[3]")
    public WebElement stateSearchTextBox;

    @FindBy(xpath = "(//div[@class='nice-select form-control primary_select'])[3]")
    public WebElement cityDropDownLink;

    @FindBy(xpath = "(//input[@placeholder='Search...'])[4]")
    public WebElement citySearchTextBox;

    @FindBy(xpath = "//input[@placeholder='Postal code']")
    public WebElement postalCodeTextBox;

    @FindBy(xpath = "(//button[text()='Save'])[3]")
    public WebElement saveButton;

    @FindBy(xpath = "//tbody/tr[2]/td[2]")
    public WebElement newAddressText;


    // US 32
    // US32-TC3201
    @FindBy(xpath = "(//span[@class='menu_seperator'])[1]")
    public WebElement dashboardText;

    // US32-TC3202
    @FindBy(xpath = "//span[text()='Dashboard']")
    public WebElement dashboardTextLink;

    // US32-TC3203
    @FindBy(xpath = "(//span[@class='menu_seperator'])[2]")
    public WebElement userManagerText;

    // US32-TC3204
    @FindBy(xpath = "//span[text()='Customer']")
    public WebElement customerDropdownMenu;

    @FindBy(xpath = "//span[text()='Human Resource']")
    public WebElement humanResourceDropdownMenu;

    // US32-TC3205
    @FindBy(xpath = "(//span[@class='menu_seperator'])[3]")
    public WebElement orderManagesText;

    // US32-TC3206
    @FindBy(xpath = "//span[text()='Order Manage']")
    public WebElement orderManagesDropdownMenu;

    // US32-TC3207
    @FindBy(xpath = "(//span[@class='menu_seperator'])[4]")
    public WebElement productManageText;

    // US32-TC3208
    @FindBy(xpath = "//span[text()='Products']")
    public WebElement productsDropdownMenu;

    // US32-TC3209
    @FindBy(xpath = "(//span[@class='menu_seperator'])[5]")
    public WebElement promotionalText;

    // US32-TC3210
    @FindBy(xpath = "//span[text()='Marketing']")
    public WebElement marketingDropdownMenu;

    @FindBy(xpath = "//span[text()='Gift Card']")
    public WebElement giftCardDropdownMenu;

    // US32-TC3211
    @FindBy(xpath = "(//span[@class='menu_seperator'])[6]")
    public WebElement financeText;

    // US32-TC3212
    @FindBy(xpath = "//span[text()='Account']")
    public WebElement accountDropdownMenu;

    // US32-TC3213
    @FindBy(xpath = "(//span[@class='menu_seperator'])[7]")
    public WebElement contentText;

    // US32-TC3214
    @FindBy(xpath = "//span[text()='Admin Reports']")
    public WebElement adminReportsDropdownMenu;

    @FindBy(xpath = "//span[text()='Support Ticket']")
    public WebElement supportTicketDropdownMenu;

}
