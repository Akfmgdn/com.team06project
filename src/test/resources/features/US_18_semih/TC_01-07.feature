@hasan
Feature: Order Details Page Test

  Scenario: TC-01 Relevant Order's Detail Page is Accessed.

    Given go to the login page
    Then Login with "smhEmail" and "smhPassword"
    And dashboard link is clicked
    And my order link is clicked
    And my order details button is clicked
    And It is verified that order id and shipped are displayed

  Scenario: TC-02 Order Information Variables are displayed.

    And It is verified that order id is equal to actual order id
    And It is verified that Status is equal to actual status
    And It is verified that Order Date is equal to actual Order date
    And It is verified that Order Amount is equal to actual Order Amount
    And It is verified that Package information is displayed
    And It is verified that Price information is displayed
    And It is verified that Shipping info is Displayed
    And It is verified that Billing info is Displayed
    And It is verified that Payment info is Displayed

  Scenario: TC-03 Order Process Variables are Displayed

    And It is verified that Pending title is displayed
    And It is verified that Processing title is displayed
    And It is verified that Shipped title is displayed
    And It is verified that Received title is displayed
    And It is verified that Delivered title is displayed

  Scenario: TC-04 Descriptions are Displayed

    And Pending description is displayed
    And Processing description is displayed
    And Shipped description is displayed
    And Recieved description is displayed
    And Delivered description is displayed

  Scenario: TC-05 Cancel Order Button and Cancel Reason Window are Displayed

    And Cancel Order Button is displayed
    And Cancel Order button is clicked
    And Cancel Window title is displayed on the opening window

  Scenario: TC-06 Order is Cancelled

    And ra.reason is selected from dropbox
    And send button is clicked
    And Order Cancelled is displayed

  Scenario: TC-07 Shipping info, Billing info, Payment info are Displayed

    And my order details button is clicked
    And It is verified that Shipping info is Displayed
    And It is verified that Billing info is Displayed
    And It is verified that Payment info is Displayed
    And browser is closed





