package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MyWishlistPage {

    public MyWishlistPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //wishlistte olan urun sayisi
    @FindBy(xpath = "//span[@class='wishlist_count']")
    public WebElement wishListCount;

    //wish listte listelenen urun sayisi
    @FindBy(xpath = "//h5[@class='font_14 f_w_400 flex-fill']")
    public WebElement NumberOfProductlListedResult;

    //new-old-lowto high- high to low seceneklerinden birini gosteren  bolum
    @FindBy(xpath = "(//span[@class='current'])[2]")
    public WebElement listOptionsButton;

    //new-old-lowto high- high to low seceneklerinin hepsinin oldugu bolum
    @FindBy(xpath = "(//ul[@class='list'])[2]")
    public List<WebElement> listOfOptions;

    //sayfada listelenen urun adedinin degistirildigi yer
    @FindBy(xpath = "(//span[@class='current'])[1]")
    public WebElement numberOfItemListedButton;

    //su an listeleme yapilacak max numaranin gozuktugu yer
    @FindBy(xpath = "(//span[@class='current'])[1]")
    public WebElement currentNumberofItemBox;

    @FindBy(xpath = "//a[@href='compare.php']")
    public WebElement adtoComparePopupButton;

    @FindBy(xpath = "(//a[@class='addToCompareFromThumnail'])[1]")
    public WebElement addtoCompareIcon;

    @FindBy(xpath = "(//div[@class='product_thumb_upper'])[1]")
    public WebElement wishListFirstProduct;

    @FindBy(xpath = "//div[@class='product_thumb_upper']")
    public List<WebElement> wishListProducts;

    @FindBy(xpath = "//span[@class='compare_count']")
    public WebElement countOfCompareProduct;

    @FindBy(xpath = "//*[text()='Compare(']")
    public WebElement compareLink;

    @FindBy(xpath = "(//a[@class='quickView'])[1]")
    public WebElement showIcon;

    @FindBy(xpath = "(//a[@class='removeWishlist'])[1]")
    public WebElement deleteIcon;

    @FindBy(xpath = "(//button[@class='close_modal_icon'])[3]")
    public WebElement showCloseIcon;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement popUpDeleteButton;

    @FindBy(xpath = "(//*[text()='Add To Cart'])[1]")
    public WebElement addToCartLink;

    @FindBy(xpath = "//a[@id='add_to_cart_btn_modal' and contains(@class, 'add_to_cart') and contains(@class, 'home10_primary_btn2')]")
    public WebElement addToCartLinkPopup;

    @FindBy(xpath = "//*[text()='View cart']")
    public WebElement addToCartText;

    @FindBy(xpath = "(//*[text()='View cart'])[1]")
    public WebElement viewCart;









}
