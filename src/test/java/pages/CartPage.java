package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    // US-10

    // US10-TC1001
    @FindBy(xpath = "//div[@class='free_shipping_message']")
    public WebElement shippingChargeFreeFromText;

    @FindBy(xpath = "//h3[text()='Order Summary']")
    public WebElement orderSummaryText;

    @FindBy(xpath = "//div[@class='single_total_list d-flex align-items-center']")
    public WebElement subtotalText;

    @FindBy(xpath = "//h4[text()='Shipping Charge']")
    public WebElement shippingChargeText;

    @FindBy(xpath = "//h4[text()='Discount']")
    public WebElement discountText;

    @FindBy(xpath = "//h4[text()='VAT/TAX/GST']")
    public WebElement vattaxgstText;


    @FindBy(xpath = "//div[@class='total_amount d-flex align-items-center flex-wrap']")
    public WebElement totalText;

    // US10-TC1002
    @FindBy(xpath = "//h4[text()='Quantity']")
    public WebElement quantityText;

    @FindBy(xpath = "//i[@class='ti-plus']")
    public WebElement plusButton;

    @FindBy(xpath = "//button[@class='count_single_item inumber_decrement change_qty']")
    public WebElement minusButton;

    @FindBy(xpath = "//input[@class='count_single_item input-number qty']")
    public WebElement itemNumberText;

    // US10-TC1003
    @FindBy(xpath = "//h4[@class='font_16 f_w_700 m-0 lh-1']")
    public WebElement subtotalPriceText;

    // US10-TC1004
    @FindBy(xpath = "//h4[text()='Price']")
    public WebElement priceText;

    @FindBy(xpath = "//h4[@class='font_16 f_w_700 m-0 text-nowrap set_base_price968']")
    public WebElement priceValueText;

    // US10-1005
    @FindBy(xpath = "//a[text()='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;

    //US10-TC1006
    @FindBy(xpath = "//a[text()='Continue Shopping']")
    public WebElement continueShoppingButton;

    // US10-TC1007
    @FindBy(xpath = "//div[@class='col-lg-auto col-6 order-5 order-lg-0 text-end']")
    public WebElement deleteButton;

}
