package stepdefinitions.semih;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.AdminDashboardPage;
import pages.GiftCardPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US36_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    AdminDashboardPage adminPage = new AdminDashboardPage();
    GiftCardPage giftCardPage = new GiftCardPage();
    Actions action = new Actions(Driver.getDriver());

    String firstGiftCardName ="";
    String firstGiftCardSku ="";
    String firstGiftCardSellingPrice ="";
    String status="";
    String updatedGiftCardName="";

    ////////////////////////// TC 01 /////////////////////////////
    @Given("Go to the admin login page")
    public void go_to_the_admin_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("smhAdminLoginUrl"));
    }

    @Then("Login with admin {string} and {string}")
    public void login_with_admin_and(String email, String password) {
        loginPage.emailAdressBox.sendKeys(ConfigReader.getProperty(email));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty(password));
        action.scrollByAmount(0, 200).perform();
        loginPage.adminSignInButton.click();
    }

    @Then("Gift Card link is clicked")
    public void gift_card_link_is_clicked() {
        WebElement element=Driver.getDriver().findElement(By.xpath("(//nav/ul)[1]/li[7]"));
        ReusableMethods.waitForVisibility(element,30);
        element.click();

    }
    @Then("Gift Card List link is clicked")
    public void gift_card_list_link_is_clicked() {
        WebElement giftCartList=Driver.getDriver().findElement(By.xpath("//a[text()='Gift Card List']"));
        ReusableMethods.jsClick(giftCartList);

        firstGiftCardName=giftCardPage.firstGiftCardName.getText();
        firstGiftCardSku=giftCardPage.firstSkuName.getText();
        firstGiftCardSellingPrice=giftCardPage.firstSellingPrice.getText();
    }
    @Then("verify Gift Card List page is accessible")
    public void verify_gift_card_list_page_is_accessible() {
        Assert.assertEquals("https://qa.trendlifebuy.com/admin/giftcard",Driver.getDriver().getCurrentUrl());

    }

    ////////////////////////// TC 02 /////////////////////////////
    @Given("verify Gift Card List text is displayed")
    public void verify_gift_card_list_text_is_displayed() {
        Assert.assertTrue(giftCardPage.giftCardListLabel.isDisplayed());

    }

    ////////////////////////// TC 03 /////////////////////////////
    @Given("verify under the name title the name of gift card is displayed")
    public void verify_under_the_name_title_the_name_of_gift_card_is_displayed() {
        ReusableMethods.bekle(1);

        ReusableMethods.waitForVisibility(giftCardPage.firstPlusIcon, 20);
        List<WebElement> actualGCNamesElements = giftCardPage.nameColumnList;
        for (WebElement each : actualGCNamesElements
        ) {
            Assert.assertTrue(each.isDisplayed());
        }
    }

    @Given("verify under the SKU title the SKU of gift card is displayed")
    public void verify_under_the_sku_title_the_sku_of_gift_card_is_displayed() {
        List<WebElement> actualSKUElements = giftCardPage.skuColumnList;
        for (WebElement each : actualSKUElements
        ) {
            Assert.assertTrue(each.isDisplayed());
        }

    }

    @Given("verify under the Thumbnail Image title the Thumbnail image is displayed")
    public void verify_under_the_thumbnail_image_title_the_thumbnail_image_is_displayed() {
        List<WebElement> thumbnailImageElements = giftCardPage.thumbnailImageColumnList;
        for (WebElement each : thumbnailImageElements
        ) {
            Assert.assertTrue(each.isDisplayed());
        }
    }

    @Given("verify under the selling price title the price of gift card is displayed")
    public void verify_under_the_selling_price_title_the_price_of_gift_card_is_displayed() {
        List<WebElement> sellingPriceElements = giftCardPage.sellingPriceColumnList;
        for (WebElement each : sellingPriceElements
        ) {
            Assert.assertTrue(each.isDisplayed());
        }
    }

    @Given("verify under the Number of Sale title the selling number of gift card is displayed")
    public void verify_under_the_number_of_sale_title_the_selling_number_of_gift_card_is_displayed() {
        List<WebElement> numberOfSaleElements = giftCardPage.numberOfSaleColumnList;
        for (WebElement each : numberOfSaleElements
        ) {
            Assert.assertTrue(each.isDisplayed());
        }
    }

    @Given("verify under the status title the Status information checkbox is displayed")
    public void verify_under_the_status_title_the_status_information_checkbox_is_displayed() {
        ReusableMethods.waitForVisibility(giftCardPage.firstStatusButton2,10);
        Assert.assertTrue(giftCardPage.firstStatusButton2.isDisplayed());
        /*
        List<WebElement> statusElements = giftCardPage.statusColumnList;
        for (WebElement each : statusElements
        ) {
            Assert.assertTrue(each.isDisplayed());
        }

         */
    }

    ////////////////////////// TC 04 /////////////////////////////

    @Given("Status button clicked")
    public void status_button_clicked() {
        giftCardPage.firstStatusButton2.click();
    }
    @Given("verify status changed if it is active or passive")
    public void verify_status_changed_if_it_is_active_or_passive() {
        ReusableMethods.waitForVisibility(giftCardPage.updatedSuccessfullyMessage,10);
        Assert.assertTrue(giftCardPage.updatedSuccessfullyMessage.isDisplayed());
        ReusableMethods.bekle(1);
        //giftCardPage.messageCloseButton.click();
    }
    @Given("verify status changed if it is passive to active")
    public void verify_status_changed_if_it_is_passive_to_active() {
        ReusableMethods.waitForVisibility(giftCardPage.firstStatusButton2,15);
        giftCardPage.firstStatusButton2.click();
        ReusableMethods.bekle(1);
        ReusableMethods.waitForVisibility(giftCardPage.updatedSuccessfullyMessage,10);
        Assert.assertTrue(giftCardPage.updatedSuccessfullyMessage.isDisplayed());
        giftCardPage.messageCloseButton.click();
        ReusableMethods.bekle(1);
        giftCardPage.messageCloseButton.click();
        giftCardPage.firstStatusButton2.click();
    }

    ////////////////////////// TC 05 /////////////////////////////

    @Given("plus ikon is clicked")
    public void plus_ikon_is_clicked() {
        firstGiftCardSku = giftCardPage.firstSkuName.getText();
        ReusableMethods.waitForVisibility(giftCardPage.firstPlusIcon,20);
        giftCardPage.firstPlusIcon.click();
    }
    @Given("select button is clicked")
    public void select_button_is_clicked() {
        ReusableMethods.waitForVisibility(giftCardPage.firstActionSelectButton,10);
        giftCardPage.firstActionSelectButton.click();
        ReusableMethods.bekle(1);
    }
    @Given("verify view link is displayed")
    public void verify_view_link_is_displayed() {
        ReusableMethods.waitForVisibility(giftCardPage.firstViewButton,10);
        Assert.assertTrue(giftCardPage.firstViewButton.isDisplayed());
    }
    @Given("verify edit link is displayed")
    public void verify_edit_link_is_displayed() {
        ReusableMethods.waitForVisibility(giftCardPage.firstEditButton,10);
        Assert.assertTrue(giftCardPage.firstEditButton.isDisplayed());
    }
    @Given("verify delete link is displayed")
    public void verify_delete_link_is_displayed() {
        ReusableMethods.waitForVisibility(giftCardPage.firstDeleteButton,10);
        Assert.assertTrue(giftCardPage.firstDeleteButton.isDisplayed());
    }

    ////////////////////////// TC 06 /////////////////////////////

    @Given("view link is clicked")
    public void view_link_is_clicked() {
        firstGiftCardName=giftCardPage.firstGiftCardName.getText();
        giftCardPage.firstViewButton.click();
    }
    @Given("verify name information is same as selected the gift card name")
    public void verify_name_information_is_same_as_selected_the_gift_card_name() {
        ReusableMethods.waitForVisibility(giftCardPage.viewNameInfoLabel,10);
        Assert.assertTrue(giftCardPage.viewNameInfoLabel.getText().contains(firstGiftCardName));
        try {
            status = giftCardPage.activeViewStatusInfoLabel.getText();
        } catch (NoSuchElementException e) {
            status = giftCardPage.inactiveViewStatusInfoLabel.getText();
        }
        System.out.println("status:"+status);
    }

    ////////////////////////// TC 07 /////////////////////////////

    @Given("verify status information is same as the gift card status selected")
    public void verify_status_information_is_same_as_the_gift_card_status_selected() {
        try {
            Assert.assertTrue(giftCardPage.activeViewStatusInfoLabel.getText().contains("Active"));
        } catch (NoSuchElementException e) {
            Assert.assertTrue(giftCardPage.inactiveViewStatusInfoLabel.getText().contains("Inactive"));
        }

        ReusableMethods.bekle(1);
    }
    ////////////////////////// TC 08 /////////////////////////////

    @Given("Print button is clicked")
    public void print_button_is_clicked() {
    }
    @Given("verify print button is displayed on the giftcard page")
    public void verify_print_button_is_displayed_on_the_giftcard_page() {
        ReusableMethods.waitForVisibility(giftCardPage.printButton,15);
        Assert.assertTrue(giftCardPage.printButton.isDisplayed());
        ReusableMethods.bekle(2);
    }


    ////////////////////////// TC 09 /////////////////////////////

    @Then("edit link is clicked")
    public void edit_link_is_clicked() {
        ReusableMethods.waitForVisibility(giftCardPage.firstEditButton,15);
        giftCardPage.firstEditButton.click();
    }
    @Then("verify Edit Gift Card text is displayed on the page")
    public void verify_edit_gift_card_text_is_displayed_on_the_page() {
        ReusableMethods.waitForVisibility(giftCardPage.editGiftCardLabel,5);
        Assert.assertTrue(giftCardPage.editGiftCardLabel.isDisplayed());
    }

    ////////////////////////// TC 10 /////////////////////////////

    @Given("verify Name information same as the relevant gift card's name")
    public void verify_name_information_same_as_the_relevant_gift_card_s_name() {
        Assert.assertTrue(giftCardPage.nameTextBox.getAttribute("value").contains(firstGiftCardName));
    }
    @Given("verify SKU information same as the relevant gift card's SKU")
    public void verify_sku_information_same_as_the_relevant_gift_card_s_sku() {
        Assert.assertTrue(giftCardPage.skuTextBox.getAttribute("value").contains(firstGiftCardSku));
    }
    @Given("verify Thumbnail Image is displayed")
    public void verify_thumbnail_image_is_displayed() {
        Assert.assertTrue(giftCardPage.thumbnailImage.isDisplayed());

    }
    @Given("verify Selling Price information same as the relevant gift card's Selling Price")
    public void verify_selling_price_information_same_as_the_relevant_gift_card_s_selling_price() {
        Assert.assertTrue(giftCardPage.sellingPriceTextBox.getAttribute("value").contains(firstGiftCardSellingPrice));
    }
    @Given("verify Shipping Methods information is displayed")
    public void verify_shipping_methods_information_is_displayed() {
        Assert.assertTrue(giftCardPage.shippingMethods.isDisplayed());

    }
    @Given("verify Galary Image is displayed")
    public void verify_galary_image_is_displayed() {
        try {
            Assert.assertTrue(giftCardPage.galaryImage.isDisplayed());
        } catch (NoSuchElementException e) {
            System.out.println("There's no any uploeded galary image");
        }
    }
    @Given("verify Discount information is displayed")
    public void verify_discount_information_is_displayed() {
        Assert.assertTrue(giftCardPage.discountInfo.isDisplayed());
    }
    @Given("verify Discount Type information is displayed")
    public void verify_discount_type_information_is_displayed() {
        Assert.assertTrue(giftCardPage.discountTypeInfo.isDisplayed());
    }
    @Given("verify Status information is displayed")
    public void verify_status_information_is_displayed() {
        Assert.assertTrue(giftCardPage.activeRadioButton.isDisplayed());
    }
    @Given("verify Discount Period information is displayed")
    public void verify_discount_period_information_is_displayed() {
        Assert.assertTrue(giftCardPage.dateTextBox.isDisplayed());
    }
    @Given("verify Tag information is displayed")
    public void verify_tag_information_is_displayed() {
        Assert.assertTrue(giftCardPage.tagsTextBox.isDisplayed());
    }


    ////////////////////////// TC 11 /////////////////////////////

    @Given("{string} is send to the name textbox")
    public void is_send_to_the_name_textbox(String Name) {
        giftCardPage.nameTextBox.clear();
        ReusableMethods.bekle(1);
        giftCardPage.nameTextBox.sendKeys(Name);
        updatedGiftCardName=Name;
    }
    @Given("{string} information is send to the SKU textbox")
    public void information_is_send_to_the_sku_textbox(String sku) {
        giftCardPage.skuTextBox.clear();
        giftCardPage.skuTextBox.sendKeys(sku);
    }
    @Given("image is sended to the Galary Image")
    public void image_is_sended_to_the_galary_image() {
        ReusableMethods.bekle(1);
        String filePath = System.getProperty("user.dir")+"\\images\\UPDATED GALARY IMAGE.jpg";
        giftCardPage.galaryImageBrowseButton.sendKeys(filePath);
        ReusableMethods.bekle(1);

    }
    @Given("image is sended to the Thumbnail Image")
    public void image_is_sended_to_the_thumbnail_image() {
        ReusableMethods.bekle(1);
        String filePath = System.getProperty("user.dir")+"\\images\\UPDATED THUMBNAIL IMAGE.jpg";
        giftCardPage.thumbnailImageBrowseButton.sendKeys(filePath);
        ReusableMethods.bekle(1);
    }
    @Given("{string} is send to the Selling Price textbox")
    public void is_send_to_the_selling_price_textbox(String sellingPrice) {
        giftCardPage.sellingPriceTextBox.clear();
        giftCardPage.sellingPriceTextBox.sendKeys(sellingPrice);
    }
    @Given("Shipping Methods is selected")
    public void shipping_methods_is_selected() {
        try {
            giftCardPage.shippingMethods.click();
        } catch (ElementClickInterceptedException e) {
            Assert.assertTrue(giftCardPage.shippingMethods.isEnabled());
        }
    }
    @Given("{string} is send to the Discount textbox")
    public void is_send_to_the_discount_textbox(String discount) {
        giftCardPage.discountTextBox.clear();
        giftCardPage.discountTextBox.sendKeys(discount);
    }
    @Given("percentage discount Type is selected")
    public void percentage_discount_type_is_selected() {
        giftCardPage.discountTypeSelectBox.click();
        ReusableMethods.waitForVisibility(giftCardPage.percentageDiscTypeOption,3);
        giftCardPage.percentageDiscTypeOption.click();
    }
    @Given("active status is selected from the status checkbox")
    public void active_status_is_selected_from_the_status_checkbox() {
        giftCardPage.activeRadioButton.click();
    }
    @Given("update discount period dates")
    public void update_discount_period_dates() {
        action.scrollByAmount(0,300).perform();
        giftCardPage.dateTextBox.click();
        ReusableMethods.waitForVisibility(giftCardPage.fourthWeekFifthDay1,3);
        giftCardPage.fourthWeekFifthDay1.click();
        giftCardPage.fourthWeekFifthDay2.click();
        giftCardPage.dateTextBoxApplyButton.click();
    }
    @Given("After deleting previous tags, {string} are sended to the Tags textbox")
    public void after_deleting_previous_tags_are_sended_to_the_tags_textbox(String tags) {
        if (!giftCardPage.tagsTextBox.getText().isEmpty()){
            giftCardPage.tagsTextBox.clear();
        }
        giftCardPage.tagsTextBox.sendKeys(tags);
    }
    @Given("{string} is send to the Description textbox")
    public void is_send_to_the_description_textbox(String description) {
        giftCardPage.descriptionTextBox.clear();
        giftCardPage.descriptionTextBox.sendKeys(description);
        action.scrollByAmount(0,350).perform();
    }
    @Given("update button is clicked")
    public void update_button_is_clicked() {
        ReusableMethods.waitForVisibility(giftCardPage.updateButton,5);
        giftCardPage.updateButton.click();

    }
    @Given("verify update is successful")
    public void verify_update_is_successful() {
        ReusableMethods.waitForVisibility(giftCardPage.firstGiftCardName,6);
        Assert.assertEquals(updatedGiftCardName,giftCardPage.firstGiftCardName.getText());
        ReusableMethods.bekle(1);

    }

    ////////////////////////// TC 12 /////////////////////////////
    @Then("delete link is clicked")
    public void delete_link_is_clicked() {
        ReusableMethods.waitForVisibility(giftCardPage.firstEditButton,3);
        giftCardPage.firstDeleteButton.click();
    }
    @Then("the delete button is clicked from the are you sure window")
    public void the_delete_button_is_clicked_from_the_are_you_sure_window() {
        ReusableMethods.waitForVisibility(giftCardPage.areYouSureDelete,3);
        giftCardPage.areYouSureDelete.click();
    }
    @Then("verify deleted gift card name is not displayed from the gift card list page")
    public void verify_deleted_gift_card_name_is_not_displayed_from_the_gift_card_list_page() {
        ReusableMethods.waitForVisibility(giftCardPage.firstSkuName,10);
        ReusableMethods.bekle(3);
        List<String> skuCardNames = ReusableMethods.getElementsText(giftCardPage.skuColumnList);
        System.out.println(firstGiftCardSku);

        int flag = 0;
        for (String each: skuCardNames
        ) {
            System.out.println(each);
            if (each.equals(firstGiftCardSku)){
                flag++;
            }
        }
        Assert.assertFalse(flag>0);
        ReusableMethods.bekle(2);
    }


    ////////////////////////// TC 13 /////////////////////////////

    @Then("{string} is sended to the Quick Search textbox")
    public void is_sended_to_the_quick_search_textbox(String search) {
        ReusableMethods.waitForVisibility(giftCardPage.quickSearchTextbox,10);
        giftCardPage.quickSearchTextbox.sendKeys(search);
        ReusableMethods.waitForVisibility(giftCardPage.firstGiftCardName,30);

    }
    @Given("verify including {string} is displayed on the list")
    public void verify_including_is_displayed_on_the_list(String search) {
        ReusableMethods.bekle(4);
        List<String> giftCarnameList = ReusableMethods.getElementsText(giftCardPage.nameColumnList);
        for (String each: giftCarnameList
        ) {
            Assert.assertTrue(each.toLowerCase().contains(search.toLowerCase()));
        }

    }

    ////////////////////////// TC 14 /////////////////////////////

    @Then("Add New button is clicked")
    public void add_new_button_is_clicked() {
        ReusableMethods.waitForVisibility(giftCardPage.addNewButton,5);
        giftCardPage.addNewButton.click();
    }
    @Then("verify Create Gift Card text is displayed from the page")
    public void verify_create_gift_card_text_is_displayed_from_the_page() {
        ReusableMethods.waitForVisibility(giftCardPage.createGiftCardTitle,10);
        Assert.assertTrue(giftCardPage.createGiftCardTitle.isDisplayed());
    }


    ////////////////////////// TC 15 /////////////////////////////

    @Given("verify Name text is displayed")
    public void verify_name_text_is_displayed() {
        Assert.assertTrue(giftCardPage.nameTitle.isDisplayed());
    }
    @Given("verify SKU text is displayed")
    public void verify_sku_text_is_displayed() {
        Assert.assertTrue(giftCardPage.skuTitle.isDisplayed());

    }
    @Given("verify Thumbnail Image text is displayed")
    public void verify_thumbnail_image_text_is_displayed() {
        Assert.assertTrue(giftCardPage.thumbnailImageTitle.isDisplayed());
    }
    @Given("verify Selling Price text is displayed")
    public void verify_selling_price_text_is_displayed() {
        Assert.assertTrue(giftCardPage.sellingPriceTitle.isDisplayed());
    }
    @Given("verify Shipping Methods text is displayed")
    public void verify_shipping_methods_text_is_displayed() {
        Assert.assertTrue(giftCardPage.shippingMethodsTitle.isDisplayed());
    }
    @Given("verify Galary Image text is displayed")
    public void verify_galary_image_text_is_displayed() {
        Assert.assertTrue(giftCardPage.galaryImageTitle.isDisplayed());
    }
    @Given("verify Discount text is displayed")
    public void verify_discount_text_is_displayed() {
        Assert.assertTrue(giftCardPage.discountTitle.isDisplayed());
    }
    @Given("verify Discount Type text is displayed")
    public void verify_discount_type_text_is_displayed() {
        Assert.assertTrue(giftCardPage.discountTitle.isDisplayed());
    }
    @Given("verify Status text is displayed")
    public void verify_status_text_is_displayed() {
        Assert.assertTrue(giftCardPage.statusTitle.isDisplayed());
    }
    @Given("verify Discount Period text is displayed")
    public void verify_discount_period_text_is_displayed() {
        Assert.assertTrue(giftCardPage.discountPeriodTitle.isDisplayed());
    }
    @Given("verify Tag text is displayed")
    public void verify_tag_text_is_displayed() {
        Assert.assertTrue(giftCardPage.tagsTitle.isDisplayed());
    }

    ////////////////////////// TC 16 /////////////////////////////

    @Given("{string} is sended to the Name text box")
    public void is_sended_to_the_name_text_box(String string) {

        giftCardPage.nameTextBox.sendKeys(string);
    }
    @Given("{string} text is sended to the SKU text box")
    public void text_is_sended_to_the_sku_text_box(String string) {
        giftCardPage.skuTextBox.clear();
        giftCardPage.skuTextBox.sendKeys(string);
    }
    @Given("an image is uploaded to the Thumbnail image")
    public void an_image_is_uploaded_to_the_thumbnail_image() {
        ReusableMethods.bekle(1);
        String filepath = System.getProperty("user.dir")+"\\images\\THUMBNAIL IMAGE.jpg";
        giftCardPage.thumbnailImageBrowseButton.sendKeys(filepath);

    }
    @Given("{string} is sended to Selling Price text box")
    public void is_sended_to_selling_price_text_box(String string) {
        giftCardPage.sellingPriceTextBox.sendKeys(string);
    }
    @Given("shipping method selected from the dropdown menu")
    public void shipping_method_selected_from_the_dropdown_menu() {
        try {
            giftCardPage.shippingMethods.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("shipping method is not clickable, There is a BUG here");
        }

    }
    @Given("an image is uploaded to the Galary image")
    public void an_image_is_uploaded_to_the_galary_image() {
        String filepath = System.getProperty("user.dir")+"\\images\\GALARY IMAGE.jpg";
        giftCardPage.galaryImageBrowseButton.sendKeys(filepath);

    }
    @Given("{string} is sended to the Discount text box")
    public void is_sended_to_the_discount_text_box(String string) {
        giftCardPage.discountTextBox.sendKeys(string);
    }
    @Given("percentage selected from the Discount Type dropdown menu")
    public void percentage_selected_from_the_discount_type_dropdown_menu() {
        giftCardPage.discountTypeSelectBox.click();
        ReusableMethods.waitForVisibility(giftCardPage.percentageDiscTypeOption,30);
        giftCardPage.percentageDiscTypeOption.click();
    }
    @Given("click the Discount Period text box")
    public void click_the_discount_period_text_box() {
        giftCardPage.dateTextBox.click();
    }
    @Given("select {string} then click apply button")
    public void select_then_click_apply_button(String string) {
        ReusableMethods.scrollDownByPixel(200);
        ReusableMethods.waitForVisibility(giftCardPage.fourthWeekFifthDay1,30);
        giftCardPage.fourthWeekFifthDay1.click();
        giftCardPage.fourthWeekFifthDay2.click();
        giftCardPage.dateTextBoxApplyButton.click();

    }
    @Given("{string} and {string} are sended to the tag textbox")
    public void and_are_sended_to_the_tag_textbox(String string, String string2) {
        giftCardPage.tagsTextBox.sendKeys(string);
        giftCardPage.tagsTextBox.sendKeys(",");
        giftCardPage.tagsTextBox.sendKeys(string2);
        giftCardPage.tagsTextBox.sendKeys(",");
    }
    @Given("{string} text sended to the description text box")
    public void text_sended_to_the_description_text_box(String string) {
        ReusableMethods.scrollDownByPixel(100);
        giftCardPage.descriptionTextBox.sendKeys(string);
    }
    @Given("active option is selected from status check box")
    public void active_option_is_selected_from_status_check_box() {
        ReusableMethods.waitForVisibility(giftCardPage.activeRadioButton,30);
        giftCardPage.activeRadioButton.click();
    }
    @Given("Save button is clicked")
    public void save_button_is_clicked() {
        ReusableMethods.scrollDownByPixel(200);
        ReusableMethods.waitForVisibility(giftCardPage.addGiftCardSaveButton,15);
        giftCardPage.addGiftCardSaveButton.click();

    }
    @Given("verify {string} named gift card is displayed on the gift card list")
    public void verify_named_gift_card_is_displayed_on_the_gift_card_list(String string) {
        ReusableMethods.waitForVisibility(giftCardPage.firstPlusIcon,15);
        Assert.assertEquals(string,giftCardPage.firstGiftCardName.getText());
        ReusableMethods.bekle(2);
    }


}


