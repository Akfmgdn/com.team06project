
Feature: US_10  Cart Page Test

  Background:
    Given Launch browser and Navigate to url
    Then Click on  Login link
    And Enter email address and password
    And Click signIn button
    Then Clicks on the cart link


  Scenario: TC_1001 It should be verified that the texts Shipping charge free from,Order Summary,Subtotal,Shipping Charge,Discount,VAT/TAX/GST and Total are visible.

    And  Is visible Shipping charge free from Order Summary Subtotal Shipping Charge Discount VAT TAX GST and Total
    Then quit the browser


  Scenario: TC_1002 It should be verified that the number of the product to be purchased from the Quantity section can be changed.

    And Presses + in the Quantity section and sees that the product quantity has changed
    Then Press - in the Quantity section and sees that the product quantity has changed.
    Then quit the browser


  Scenario: TC_1003 It should be verified that the Total fee changes according to the number of pieces in the Quantity section.

    Then When you press + in the Quantity section, the total product price changes
    And When he presses - in the Quantity section, the total product price changes
    Then quit the browser

  Scenario: TC_1004 It should be verified that the unit price of the product and the amount of discount, if any, are written in the Price section.

    And Price displays the price written in the Price section, the unit price of the product and the discount amount, if any
    Then quit the browser

  Scenario: TC_1005 When the Proceed to checkout button is clicked, it should be verified that it redirects to the relevant page.

    And Click the proceed to checkout button
    And When he clicks on the button, he sees that he goes to checkout page
    Then quit the browser

  Scenario: TC_1006 When the Continue Shopping button is pressed, it should be verified that it redirects to the homepage.

    And He presses the Continue Shopping button and sees that he goes to the homepage.
    Then quit the browser

  Scenario: TC_1007 When the delete icon in the Remove section is clicked, it should be verified that the product in the basket has been deleted and the total price has changed.

    And Click on the delete icon in the Remove section See that the item in the cart has been deleted.
    And quit the browser
