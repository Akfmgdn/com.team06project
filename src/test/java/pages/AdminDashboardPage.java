package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminDashboardPage {

    public AdminDashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    // US31
    // US31-TC3101

    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement adminSignInButton;

    @FindBy(xpath = "(//*[text()='Products'])[1]")
    public WebElement productsLink;

    @FindBy(xpath = "//*[text()='Product List']")
    public WebElement productsListLink;

    @FindBy(xpath = "(//*[text()='Alert List'])[1]")
    public WebElement productAlertListLink;

    @FindBy(xpath = "//a[@id='product_stock_out_id']")
    public WebElement productOutOfStockList;

    @FindBy(xpath = "(//*[text()='Disabled Product List'])[1]")
    public WebElement productDisabledList;

    @FindBy(xpath = "(//*[text()='Product By SKU'])[1]")
    public WebElement productBySkuList;


    @FindBy(xpath = "((//*[text()='Dashboard'])[2]")
    public WebElement dashboardtextLink;

    @FindBy(xpath = "//*[text()='Action']")
    public WebElement actionLink;

    @FindBy(xpath = "//*[text()='My Order']")
    public WebElement myOrderLink;

    @FindBy(xpath = "//div[@class='nice-select amaz_select5 open']")
    public WebElement lastOrderDropDown;

    @FindBy(xpath = "(//div[@class='nice-select-search-box'])[1]")
    public WebElement searchBoxOrders;

    @FindBy(xpath = "(//*[text()='Last 10 orders'])[2]")
    public WebElement lastOrderDropDownLast10;

    @FindBy(xpath = "(//*[text()='Last 20 orders'])[2]")
    public WebElement lastOrderDropDownLast20;

    @FindBy(xpath = "(//*[text()='Last 40 orders'])[2]")
    public WebElement lastOrderDropDownLast40;


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

    @FindBy(xpath = "//button[@id='update_info']")
    public WebElement updateButton;

    @FindBy(xpath = "//div[text()='Updated successfully!']")
    public WebElement updateMessageText;

    // US31-TC3107
    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public WebElement adressButton;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
    public WebElement addressInformationText;


    // US31-TC3108
    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[1]")
    public WebElement purchase;

    @FindBy(xpath = "//div[@class='nice-select-search-box']")
    public WebElement searchHistory;

    @FindBy(xpath = "(//*[text()='All History'])[3]")
    public WebElement allHistory;

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
























    ////////////////********************* HASAN **********************************

    @FindBy(xpath = "(//*[text()='Login'])[1]")
    public WebElement loginButonMenu;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement adminEmailBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement adminPasswordBox;

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement adminSignInButonBox;;

    @FindBy(xpath = "//div[@class='nice-select amaz_select3']")
    public WebElement purchaseHistoryDropDown;

    @FindBy(xpath = "(//*[text()='Pending Orders'])[2]")
    public WebElement pendingOrders;

    @FindBy(xpath = "(//*[text()='Confirmed Orders'])[2]")
    public WebElement confirmedOrders;

    @FindBy(xpath = "(//*[text()='Completed Orders'])[2]")
    public WebElement completedOrders;

    @FindBy(xpath = "(//*[text()='Refused/Cancelled Orders'])[2]")
    public WebElement refusedCancelledOrders;

    @FindBy(xpath = "//button[@id='home-tab']")
    public WebElement butonAll;

    @FindBy(xpath = "//button[@id='Pay-tab']")
    public WebElement butonToPay;

    @FindBy(xpath = "//button[@id='Ship-tab']")
    public WebElement butonToShip;

    @FindBy(xpath = "//button[@id='Receive-tab']")
    public WebElement butonReveive;

    @FindBy(xpath = "//div[@class='nice-select amaz_select5 open']")
    public WebElement myOrderSelectDropDown;

    @FindBy(xpath = "(//*[text()='Add New Product'])[1]")
    public WebElement addNewProductDropDownMenu;

    @FindBy(xpath = "(//*[text()='SL'])[1]")
    public WebElement slProductList;

    @FindBy(xpath = "(//th[@aria-controls='mainProductTable'])[2]")
    public WebElement mainProductTableName;

    @FindBy(xpath = "(//th[@aria-controls='mainProductTable'])[3]")
    public WebElement mainProductTableType;

    @FindBy(xpath = "(//th[@aria-controls='mainProductTable'])[4]")
    public WebElement mainProductTableBrand;

    @FindBy(xpath = "(//th[@aria-controls='mainProductTable'])[5]")
    public WebElement mainProductTableImage;

    @FindBy(xpath = "(//th[@aria-controls='mainProductTable'])[6]")
    public WebElement mainProductTableStock;

    @FindBy(xpath = "(//th[@aria-controls='mainProductTable'])[7]")
    public WebElement mainProductTableStatus;

    @FindBy(xpath = "(//input[@placeholder='Quick Search'])[1]")
    public WebElement productListQuickearch;

    @FindBy(xpath = "(//td[@tabindex='0'])[1]")
    public WebElement productListTabindex1;

    @FindBy(xpath = "(//button[@id='dropdownMenu2'])[2]")
    public WebElement productListDropdownSelectedAction;

    @FindBy(xpath = "(//*[text()='View'])[2]")
    public WebElement productListSelectedActionView;

    @FindBy(xpath = "(//a[@class='dropdown-item edit_brand'])[3]")
    public WebElement ProductListDropdownSelectedActionEdit;

    @FindBy(xpath = "//*[text()='Type ']")
    public WebElement productInformationType;

    @FindBy(xpath = "(//div[@class='note-editable card-block'])[2]")
    public WebElement productDescription1;

    @FindBy(xpath = "//*[text()='Meta Description']")
    public WebElement productDescription2;


















    //=====================Faruk's locator zone===========================\\


    @FindBy(id="traffic-chartt")
    public WebElement productsChart;

    @FindBy(id="traffic-chart2")
    public WebElement ordersSummaryChart;

    @FindBy(id="traffic-chart4")
    public WebElement guestAuthorizedOrderTodayChart;

    @FindBy(id="traffic-chartt5")
    public WebElement todayOrdersummaryChart;

    @FindBy(xpath = "//div[@class='chart_pie_box']")
    public List<WebElement> chartList;

    @FindBy(xpath = "//div[@class='sales_value_legend']/ul/li/div/span")
    public List<WebElement> dataNameValueLegendList;

    @FindBy(xpath = "//div[@class='sales_value_legend']/ul/li/span")
    public List<WebElement> colorLegendList;

    @FindBy(xpath = "//div[@class='main-title d-md-flex']")
    public List<WebElement> mainTitleListUnderGraphs;






}



