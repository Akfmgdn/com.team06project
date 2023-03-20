@smh
Feature: US-36 Prepare, edit or delete gift cards for site users

  Background:
    Given Go to the admin login page
    Then Login with admin "smhAdminEmail" and "smhAdminpassword"
    And Gift Card link is clicked
    And Gift Card List link is clicked


  Scenario: TC-01/TC-02/TC-08 Gift Card List page is accessible / Gift Card List is visible / Print Button is visible

    And verify Gift Card List page is accessible
    And verify Gift Card List text is displayed
    And verify print button is displayed on the giftcard page


  Scenario: TC-03 Gift cards are listed according to Name, SKU, Thumbnail Image, Selling Price, Number of Sale and Status information

    And verify under the name title the name of gift card is displayed
    And verify under the SKU title the SKU of gift card is displayed
    And verify under the Thumbnail Image title the Thumbnail image is displayed
    And verify under the selling price title the price of gift card is displayed
    And verify under the Number of Sale title the selling number of gift card is displayed
    And plus ikon is clicked
    And verify under the status title the Status information checkbox is displayed


  Scenario: TC-04/TC-05 Status can be changed / View, Edit and Delete links are visible

    And plus ikon is clicked
    And Status button clicked
    And verify status changed if it is active or passive
    And Status button clicked
    And verify status changed if it is active or passive
    And select button is clicked
    And verify view link is displayed
    And verify edit link is displayed
    And verify delete link is displayed


  Scenario: TC-06/TC-07 Name and status information is true

    And plus ikon is clicked
    And select button is clicked
    And view link is clicked
    And verify name information is same as selected the gift card name
    And verify status information is same as the gift card status selected


  Scenario: TC-09/TC-10 Edit Gift page accessible / Verify Name, SkU, Image ..etc.

    And plus ikon is clicked
    And select button is clicked
    And edit link is clicked
    And verify Edit Gift Card text is displayed on the page
    And verify Name information same as the relevant gift card's name
    And verify SKU information same as the relevant gift card's SKU
    And verify Thumbnail Image is displayed
    And verify Selling Price information same as the relevant gift card's Selling Price
    And verify Shipping Methods information is displayed
    And verify Galary Image is displayed
    And verify Discount information is displayed
    And verify Discount Type information is displayed
    And verify Status information is displayed
    And verify Discount Period information is displayed
    And verify Tag information is displayed


  Scenario Outline: TC-11 Edit gift card and click the Update button

    And plus ikon is clicked
    And select button is clicked
    And edit link is clicked
    And "<Name>" is send to the name textbox
    And "<SKU>" information is send to the SKU textbox
    And image is sended to the Galary Image
    And image is sended to the Thumbnail Image
    And "<price>" is send to the Selling Price textbox
    And Shipping Methods is selected
    And "<discount>" is send to the Discount textbox
    And percentage discount Type is selected
    And active status is selected from the status checkbox
    And update discount period dates
    And After deleting previous tags, "<tags>" are sended to the Tags textbox
    And "<description>" is send to the Description textbox
    And update button is clicked
    And verify update is successful

    Examples:
      |Name|SKU   |price|discount|tags                         |description                               |
      |ABE |12345 |  10 |25      |gift card, discount card     |you can use this cards for your loved ones|


  Scenario Outline: TC-12/TC-13 gift card can be deleted / Quick search let search

    And plus ikon is clicked
    And select button is clicked
    And delete link is clicked
    And the delete button is clicked from the are you sure window
    And verify deleted gift card name is not displayed from the gift card list page
    And "<search>" is sended to the Quick Search textbox
    And verify including "<search>" is displayed on the list
    And browser is closed

    Examples:
      |search|
      |gift  |


  Scenario: TC-14/TC-15 Create Gift Card page accessible / Name, Sku.. titles are visible

    And Add New button is clicked
    And verify Create Gift Card text is displayed from the page
    And verify Name text is displayed
    And verify SKU text is displayed
    And verify Thumbnail Image text is displayed
    And verify Selling Price text is displayed
    And verify Shipping Methods text is displayed
    And verify Galary Image text is displayed
    And verify Discount text is displayed
    And verify Discount Type text is displayed
    And verify Status text is displayed
    And verify Discount Period text is displayed
    And verify Tag text is displayed


  Scenario Outline: TC-16 New Gift Card has been created

    And Add New button is clicked
    And "<Name>" is sended to the Name text box
    And "<SKU>" text is sended to the SKU text box
    And an image is uploaded to the Thumbnail image
    And "<Price>" is sended to Selling Price text box
    And shipping method selected from the dropdown menu
    And an image is uploaded to the Galary image
    And "<Amount>" is sended to the Discount text box
    And percentage selected from the Discount Type dropdown menu
    And click the Discount Period text box
    And select "20 Mar 2023 and 20 Apr 2023" then click apply button
    And "<tag1>" and "<tag2>" are sended to the tag textbox
    And "<description>" text sended to the description text box
    And active option is selected from status check box
    And Save button is clicked
    And verify "<Name>" named gift card is displayed on the gift card list

    Examples:
      |Name                |SKU   |Price|Amount|tag1      |tag2        |description                            |
      |GiftCardMarch       |198965|125  |10    |gift card |special gift|This is a gift card for your loved ones|















