package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GiftCardPage {

    public GiftCardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //https://qa.trendlifebuy.com/admin/giftcard>gift card list text - upper side
    @FindBy(xpath = "//h3[text()='Gift Card List']")
    public WebElement giftCardListLabel;

    //https://qa.trendlifebuy.com/admin/giftcard>add new button - upper side
    @FindBy(xpath = "//a[@class='primary-btn radius_30px mr-10 fix-gr-bg']")
    public WebElement addNewButton;

    //https://qa.trendlifebuy.com/admin/giftcard>quick search textbox - upper side
    @FindBy(xpath = "//input[@placeholder='Quick Search']")
    public WebElement quickSearchTextbox;

    //https://qa.trendlifebuy.com/admin/giftcard>print button - upper right side
    @FindBy(xpath = "//i[@class='fa fa-print']")
    public WebElement printButton;

    //https://qa.trendlifebuy.com/admin/giftcard>first number of the list - plus icon
    @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
    public WebElement firstPlusIcon;

    //https://qa.trendlifebuy.com/admin/giftcard>gift card list number column List
    @FindBy(xpath = "//table//tbody//td[@class='sorting_1']")
    public List<WebElement> plusIconColumnList;

    //https://qa.trendlifebuy.com/admin/giftcard>gift card list name column List
    @FindBy(xpath = "//table//tbody//tr//td[2]")
    public List<WebElement> nameColumnList;

    //https://qa.trendlifebuy.com/admin/giftcard>sku column
    @FindBy(xpath = "//table//tbody//tr//td[3]")
    public List<WebElement> skuColumnList;

    //https://qa.trendlifebuy.com/admin/giftcard>thumbnail Image column
    @FindBy(xpath = "//table//tbody//tr//td[4]")
    public List<WebElement> thumbnailImageColumnList;

    //https://qa.trendlifebuy.com/admin/giftcard>selling price column
    @FindBy(xpath = "//table//tbody//tr//td[5]")
    public List<WebElement> sellingPriceColumnList;

    //https://qa.trendlifebuy.com/admin/giftcard>number of sale column
    @FindBy(xpath = "//table//tbody//tr//td[6]")
    public List<WebElement> numberOfSaleColumnList;

    //https://qa.trendlifebuy.com/admin/giftcard>status column
    @FindBy(xpath = "//table//tbody//tr//td[7]")
    public List<WebElement> statusColumnList;


    //https://qa.trendlifebuy.com/admin/giftcard>first status
    @FindBy(xpath = "(//table//tbody//tr//td[7])[1]")
    public WebElement firstStatusButton;

    //https://qa.trendlifebuy.com/admin/giftcard>status button
    @FindBy(xpath = "(//div[@class='slider round'])[2]")
    public WebElement firstStatusButton2;

    //When something changed, a message box appears on the upper right side
    @FindBy(xpath = "//div[text()='Updated successfully!']")
    public WebElement updatedSuccessfullyMessage;

    // x button on message box
    @FindBy(xpath = "//button[@class='toast-close-button']")
    public WebElement messageCloseButton;

    //https://qa.trendlifebuy.com/admin/giftcard> First +icon>action select button
    @FindBy(xpath = "(//button[@id='dropdownMenu2'])[2]")
    public WebElement firstActionSelectButton;

    //https://qa.trendlifebuy.com/admin/giftcard> First +icon>action select>view
    @FindBy(xpath = "(//a[text()='View'])[2]")
    public WebElement firstViewButton;

    //https://qa.trendlifebuy.com/admin/giftcard> First +icon>action select>view> name
    @FindBy(xpath = "//table//tbody//tr[2]")
    public WebElement viewNameInfoLabel;

    //https://qa.trendlifebuy.com/admin/giftcard> First +icon>action select>view> status
    @FindBy(xpath = "//span[@class='badge_1']")
    public WebElement activeViewStatusInfoLabel;

    //https://qa.trendlifebuy.com/admin/giftcard> First +icon>action select>view> status
    @FindBy(xpath = "//span[@class='badge_2']")
    public WebElement inactiveViewStatusInfoLabel;

    //https://qa.trendlifebuy.com/admin/giftcard> First +icon>action select>edit
    @FindBy(xpath = "(//a[text()='Edit'])[2]")
    public WebElement firstEditButton;

    //https://qa.trendlifebuy.com/admin/giftcard> First +icon>action select>delete
    @FindBy(xpath = "(//a[text()='Delete'])[2]")
    public WebElement firstDeleteButton;

    //https://qa.trendlifebuy.com/admin/giftcard> First +icon>action select>delete
    @FindBy(xpath = "//input[@id='dataDeleteBtn']")
    public WebElement areYouSureDelete;

    //https://qa.trendlifebuy.com/admin/giftcard>first gift card name
    @FindBy(xpath = "(//table//tbody//tr//td[2])[1]")
    public WebElement firstGiftCardName;

    //https://qa.trendlifebuy.com/admin/giftcard>first gift card sku name
    @FindBy(xpath = "(//table//tbody//tr//td[3])[1]")
    public WebElement firstSkuName;

    //https://qa.trendlifebuy.com/admin/giftcard>first gift card selling price
    @FindBy(xpath = "(//table//tbody//tr//td[5])[1]")
    public WebElement firstSellingPrice;

    //https://qa.trendlifebuy.com/admin/giftcard>print button>new page>page title on the upper side
    @FindBy(xpath = "//*[text()='Trendlifebuy | Online Shopping | Admin Giftcard']")
    public WebElement printPageTitle;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Edit Gift Card Title
    @FindBy(xpath = "//h3[@class='mb-30']")
    public WebElement editGiftCardLabel;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Name text box
    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameTextBox;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>SKU text box
    @FindBy(xpath = "//input[@id='sku']")
    public WebElement skuTextBox;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Selling Price text box
    @FindBy(xpath = "//input[@id='selling_price']")
    public WebElement sellingPriceTextBox;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Discoount text box
    @FindBy(xpath = "//input[@id='discount']")
    public WebElement discountTextBox;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Date text box
    @FindBy(xpath = "//input[@id='date']")
    public WebElement dateTextBox;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Date>ilk ay 4. week 5. day
    @FindBy(xpath = "(//table//tbody//tr[4]//td[5])[1]")
    public WebElement fourthWeekFifthDay1;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Date> ikinci ay 4. week 5. day
    @FindBy(xpath = "(//table//tbody//tr[4]//td[5])[2]")
    public WebElement fourthWeekFifthDay2;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Date> Apply Button
    @FindBy(xpath = "//button[normalize-space()='Apply']")
    public WebElement dateTextBoxApplyButton;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Discount Type box
    @FindBy(css = "div[class='nice-select primary_select mb-25']")
    public WebElement discountTypeSelectBox;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Amount Discount Type Option
    @FindBy(xpath = "//li[text()='Amount']")
    public WebElement amountDiscTypeOption;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Percentage Discount Type Option
    @FindBy(xpath = "//li[text()='Percentage']")
    public WebElement percentageDiscTypeOption;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Tags text box
    @FindBy(xpath = "(//input[@type='text'])[8]")
    public WebElement tagsTextBox;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Description text box
    @FindBy(xpath = "//div[@class='note-editable card-block']")
    public WebElement descriptionTextBox;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Thumbnail Image Browser Button
    @FindBy(xpath = "//form//button//input[@id='thumbnail_image']")
    public WebElement thumbnailImageBrowseButton;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Thumbnail Image Browser Input 1
    @FindBy(xpath = "//img[@id='ThumbnailImg']")
    public WebElement thumbnailImage;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Galary Image Browser Button
    @FindBy(xpath = "//form//button//input[@id='galary_image']")
    public WebElement galaryImageBrowseButton;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Galary Image
    @FindBy(xpath = "//img[@class='galaryImg']")
    public WebElement galaryImage;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Update Button
    @FindBy(xpath = "//button[@id='submit_btn']")
    public WebElement updateButton;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Shipping Methods
    @FindBy(xpath = "//div[@class='nice-select primary_select mb-25 disabled']")
    public WebElement shippingMethods;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>discount info
    @FindBy(xpath = "//input[@id='discount']")
    public WebElement discountInfo;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>discount type info
    @FindBy(xpath = "//div[@class='nice-select primary_select mb-25']")
    public WebElement discountTypeInfo;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>active radio button
    @FindBy(xpath = "//label[@data-id='bg_option']//span[@class='checkmark']")
    public WebElement activeRadioButton;

    //https://qa.trendlifebuy.com/admin/giftcard/edit/14>Create Gift Card title
    @FindBy(xpath = "//h3[normalize-space()='Create Gift Card']")
    public WebElement createGiftCardTitle;

    //https://qa.trendlifebuy.com/admin/giftcard/create>create gift card name text
    @FindBy(xpath = "//label[@for='name']")
    public WebElement nameTitle;

    //https://qa.trendlifebuy.com/admin/giftcard/create>create gift card SKU text
    @FindBy(xpath = "//label[@for='sku']")
    public WebElement skuTitle;

    //https://qa.trendlifebuy.com/admin/giftcard/create>create gift card selling price text
    @FindBy(xpath = "//label[@for='selling_price']")
    public WebElement sellingPriceTitle;

    //https://qa.trendlifebuy.com/admin/giftcard/create>create gift card shipping Methods text
    @FindBy(xpath = "(//label[@class='primary_input_label'])[4]")
    public WebElement shippingMethodsTitle;

    //https://qa.trendlifebuy.com/admin/giftcard/create>create gift discount text
    @FindBy(xpath = "//label[normalize-space()='Discount']")
    public WebElement discountTitle;

    //https://qa.trendlifebuy.com/admin/giftcard/create>create gift discount period text
    @FindBy(xpath = "//label[normalize-space()='Discount Period']")
    public WebElement discountPeriodTitle;

    //https://qa.trendlifebuy.com/admin/giftcard/create>create gift tags text
    @FindBy(xpath = "//div[contains(@class,'single_field')]//label[1]")
    public WebElement tagsTitle;

    //https://qa.trendlifebuy.com/admin/giftcard/create>create thumbnail image text
    @FindBy(xpath = "(//label[@class='primary_input_label'])[8]")
    public WebElement thumbnailImageTitle;

    //https://qa.trendlifebuy.com/admin/giftcard/create>create galary image text
    @FindBy(xpath = "//label[normalize-space()='Galary Image (400x440)px']")
    public WebElement galaryImageTitle;

    //https://qa.trendlifebuy.com/admin/giftcard/create>create status text
    @FindBy(xpath = "//label[normalize-space()='Status']")
    public WebElement statusTitle;

    //https://qa.trendlifebuy.com/admin/giftcard/create>add gift card save button
    @FindBy(xpath = "//button[@id='submit_btn']")
    public WebElement addGiftCardSaveButton;

    //https://qa.trendlifebuy.com/profile/coupons> print page element
    @FindBy(xpath = "//head//base")
    public WebElement printPageElement;




}
