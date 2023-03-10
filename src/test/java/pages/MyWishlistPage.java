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
    @FindBy(xpath = "//div[@class='nice-select amaz_select4 open']")
    public WebElement listOptionsButton;

    //new-old-lowto high- high to low seceneklerinin hepsinin oldugu bolum
    @FindBy(xpath = "(//ul[@class='list'])[2]")
    public List<WebElement> listOfOptions;

    //sayfada listelenen urun adedinin degistirildigi yer
    @FindBy(xpath = "(//div[@class='nice-select amaz_select4 open'])[1]")
    public WebElement numberOfItemListedButton;

    //su an listeleme yapilacak max numaranin gozuktugu yer
    @FindBy(xpath = "(//span[@class='current'])[1]")
    public WebElement currentNumberofItemBox;

    @FindBy(xpath = "//li[@data-value='16']")
    public WebElement max16ItemDisplayed;

    @FindBy(xpath = "//li[@data-value='32']")
    public WebElement max32ItemDisplayed;




}
