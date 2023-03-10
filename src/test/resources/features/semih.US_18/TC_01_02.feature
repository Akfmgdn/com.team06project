@wip
Feature: Order Details Page Test

  Scenario: the relevant order's detail page is accessed.

    Given go to the login page
    Then Login with "smhEmail" and "smhPassword"
    And dashboard link is clicked
    And my order link is clicked
    And my order details button is clicked
    And It is verified that order id and shipped are displayed

  Scenario: Order ID, Status, Order date, Order Amount, Package, Price, Shipping Info,
            Billing Info, Payment Info information is displayed.

    And It is verified that order id is equal to actual order id
    And It is verified that Status is equal to actual status
    And It is verified that Order Date is equal to actual Order date
    And It is verified that Order Amount is equal to actual Order Amount
    And It is verified that Status is equal to actual status
    And It is verified that Package information is displayed
    And It is verified that Price information is equal to actual Order Amount
    And It is verified that Shipping info is Displayed
    And It is verified that Billing info is Displayed
    And It is verified that Payment info is Displayed





